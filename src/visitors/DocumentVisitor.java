package visitors;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import SemanticCh.Errorscheck;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;

import misc.HTMLParser.ArrayLoopRawContext;
import misc.HTMLParser.AttributeNodeContext;
import misc.HTMLParser.BodyContext;
import misc.HTMLParser.CommentContext;
import misc.HTMLParser.CommentNodeContext;
import misc.HTMLParser.ConditionalCommentContext;
import misc.HTMLParser.DefaultDirectiveContext;
import misc.HTMLParser.DocumentContext;
import misc.HTMLParser.ElementAttributesContext;
import misc.HTMLParser.ElementContentContext;
import misc.HTMLParser.ExpDirectiveContext;
import misc.HTMLParser.FilterExpressionContext;
import misc.HTMLParser.HalfElementContext;
import misc.HTMLParser.HeaderContext;
import misc.HTMLParser.IndexedArrayLoopContext;
import misc.HTMLParser.LoopStatementContext;
import misc.HTMLParser.MustacheContext;
import misc.HTMLParser.NodeContext;
import misc.HTMLParser.NormalElementContext;
import misc.HTMLParser.ParametrizedFilterContext;
import misc.HTMLParser.RawFilterContext;
import misc.HTMLParser.RawObjectLoopContext;
import misc.HTMLParser.ScriptContext;
import misc.HTMLParser.ScriptletOrSeaWsContext;
import misc.HTMLParser.SelfClosedElementContext;
import misc.HTMLParser.StmtDirectiveContext;
import misc.HTMLParser.StyleContext;
import misc.HTMLParser.TextNodeContext;
import models.*;
import models.directive.*;
import models.documents.*;
import models.enums.CommentType;
import models.expression.Expression;
import models.expression.ValueExpression;
import models.nodes.*;
import models.statements.*;
public class DocumentVisitor extends Visitor<AbstractASTNode>{ 
	
	protected static Stack<Boolean> switchExists;
	protected static Stack<Boolean> srcImage = new Stack<Boolean>();
    protected static Stack<Boolean> hrefA = new Stack<Boolean>();
	protected   static Stack<Scope> scopes=new Stack<>();
    protected   static Stack<String> indexFor=new Stack<String>();
	protected   static Stack<String> KeyFor=new Stack<String>();
	protected static  Stack<String> referExists =new Stack<String>();
	protected   static Stack<String> htmlidrepet =new Stack<String>();
	int html=0;
    static Stack<Boolean>  checklist=new Stack<Boolean>();
	static int check =0;
	public DocumentVisitor() {
		if (switchExists == null)
			switchExists = new Stack<Boolean>();
		   symbolTable=new SymbolTable();

	}
	@Override
	public AbstractASTNode visitScript(ScriptContext ctx) {
		return new ScriptNode(ctx.getText());
	}

	@Override
	public AbstractASTNode visitStyle(StyleContext ctx) {
		return new StyleNode(ctx.getText());
	}

	@Override
	public AbstractASTNode visitDocument(DocumentContext ctx) {
		DocumentHeader header = (DocumentHeader) visit(ctx.getChild(0));
		DocumentBody body = (DocumentBody) visit(ctx.getChild(1));
		return new Document(header, body);
	}

	@Override
	public AbstractASTNode visitHeader(HeaderContext ctx) {
		List<DocumentNode> headers = new ArrayList<DocumentNode>();
		DocumentHeader header = new DocumentHeader(headers);
		for (int index = 0; index < ctx.getChildCount(); index++) {
			if (ctx.getChild(index) instanceof CommentNodeContext)
				headers.add((DocumentNode) visit(ctx.getChild(index)));
			else
				headers.add(new TextNode(ctx.getChild(index).getText()));
		}
		return header;
	}

	@Override
	public AbstractASTNode visitComment(CommentContext ctx) {
		return new CommentNode(ctx.HTML_COMMENT().getText(), CommentType.Normal);
	}

	@Override
	public AbstractASTNode visitConditionalComment(ConditionalCommentContext ctx) {
		return new CommentNode(ctx.HTML_CONDITIONAL_COMMENT().getText(), CommentType.Conditional);
	}

	@Override
	public AbstractASTNode visitBody(BodyContext ctx) {
		List<DocumentNode> contents = new ArrayList<DocumentNode>();
		DocumentBody body = new DocumentBody(contents);
		for (int index = 0; index < ctx.getChildCount(); index++)
			contents.add((DocumentNode) visit(ctx.getChild(index)));
		return body;
	}

	@Override
	public AbstractASTNode visitExpDirective(ExpDirectiveContext ctx) {
		AbstractASTNode value = expressionVisitor.visit(ctx.getChild(3));
		return new Directive(ctx.getChild(0).getText(), value);
	}

	@Override
	public AbstractASTNode visitStmtDirective(StmtDirectiveContext ctx) {
		AbstractASTNode value = visit(ctx.getChild(3));
		return new Directive(ctx.getChild(0).getText(), value);
	}

	@Override
	public AbstractASTNode visitLoopStatement(LoopStatementContext ctx) {
		return visit(ctx.getChild(0));
	}
// update code
	@Override
	public AbstractASTNode visitArrayLoopRaw(ArrayLoopRawContext ctx) {
		AbstractASTNode arrayToLoopOn = expressionVisitor.visit(ctx.getChild(2));
		String loopVariable = ctx.getChild(0).getText();
		Symbol symbol = new Symbol();
		symbol.setName("loopVariable: " +loopVariable);
		symbol.setScope(scopes.peek());
		scopes.peek().addSymbol(symbol);

		return new ArrayLoopStatement(loopVariable, (ValueExpression) arrayToLoopOn);
	}
// end

	//update code // order 2 iterator check
	@Override
	public AbstractASTNode visitIndexedArrayLoop(IndexedArrayLoopContext ctx) {
		AbstractASTNode arrayToLoopOn = expressionVisitor.visit(ctx.getChild(2));
		String loopVariable = ctx.getChild(0).getText();
		String indexVariable = ctx.getChild(4).getText();
		Symbol symbol1 = new Symbol();
		symbol1.setName("loopVariable: "+loopVariable);
		symbol1.setScope(scopes.peek());
		scopes.peek().addSymbol(symbol1);
		Symbol symbol2 = new Symbol();
		symbol2.setName("indexVariable: " +indexVariable);
		symbol2.setScope(scopes.peek());
		scopes.peek().addSymbol(symbol2);
		indexFor.push(indexVariable);
		KeyFor.push(loopVariable);
		if(!testIndexFor(indexFor,indexVariable) || !testkeyFor(KeyFor,loopVariable))
        {
           System.out.println(Errorscheck.Errorscheck.get(1) + " Line : " + ctx.getStart().getLine());
        }

		return new ArrayLoopStatement(loopVariable, indexVariable, (ValueExpression) arrayToLoopOn);
	}
//end
	@Override
	public AbstractASTNode visitDefaultDirective(DefaultDirectiveContext ctx) {
		return new Directive(ctx.getChild(0).getText());
	}

	@Override
	public AbstractASTNode visitScriptletOrSeaWs(ScriptletOrSeaWsContext ctx) {
		return new TextNode(ctx.getText());
	}
// update  the code
	@Override
	public AbstractASTNode visitRawObjectLoop(RawObjectLoopContext ctx) {
		AbstractASTNode objectToLoopOn = expressionVisitor.visit(ctx.getChild(4));
		String KeyVariable = ctx.getChild(0).getText();
		String valueVariable = ctx.getChild(2).getText();
		Symbol symbol1 = new Symbol();
		symbol1.setName("KeyVariable: " +KeyVariable);
		symbol1.setScope(scopes.peek());
		scopes.peek().addSymbol(symbol1);
		Symbol symbol2 = new Symbol();
		symbol2.setName("valueVariable: "+valueVariable);
		symbol2.setScope(scopes.peek());
		scopes.peek().addSymbol(symbol2);
		return new ObjectLoopStatement(KeyVariable, valueVariable, (ValueExpression) objectToLoopOn);
	}
//end
	@Override
	public AbstractASTNode visitFilterExpression(FilterExpressionContext ctx) {
		Expression oprand = expressionVisitor.visit(ctx.getChild(0));
		int length=ctx.getChild(0).getText().replace(" ","").length();
		String filterName=ctx.children.get(1).getChild(1).getText();
        ///check order 9
		FilterStatement filter = (FilterStatement) visit(ctx.getChild(1));
		filter.setOprand(oprand);
		if(testName(filterName,"currency") && filter.parameters==null)
		{
			System.out.println(Errorscheck.Errorscheck.get(8) + " Line: " + ctx.getStart().getLine());
		}
		return filter;
	}

	@Override
	public AbstractASTNode visitRawFilter(RawFilterContext ctx) {
		AbstractASTNode filter = expressionVisitor.visit(ctx.getChild(1));
		return new FilterStatement((Expression) filter);
	}

	@Override
	public AbstractASTNode visitParametrizedFilter(ParametrizedFilterContext ctx) {
		AbstractASTNode filter = expressionVisitor.visit(ctx.getChild(1));
		List<Expression> parameters = new ArrayList<Expression>();
		for (int index = 0; index < ctx.getChild(3).getChildCount(); index += 2 ) {
			parameters.add(expressionVisitor.visit(ctx.getChild(3).getChild(index)));
		}
		String filterName=ctx.getChild(1).getText();
		int parametersCount=parameters.size();
		String parameterName=ctx.getChild(3).getText().replace("\"","");
		int length=parameterName.length();
		//System.out.println(length);
		// order 10 (uppercase / lowercase)
		 if(testName(filterName,"currency") && parametersCount >1)
		{

			System.out.println(Errorscheck.Errorscheck.get(8) + "Line " + ctx.getStart().getLine());

		}
		if(testName(filterName,"currency") &&  length>1)
		{

			System.out.println(Errorscheck.Errorscheck.get(8) + "Line " + ctx.getStart().getLine());

		}
		if(testName(filterName,"lowercase") ||testName(filterName,"uppercase"))
		{

			System.out.println(Errorscheck.Errorscheck.get(9) + "Line " + ctx.getStart().getLine());

		}
		 //order 8 Date
		else if(testName(filterName,"date") && parametersCount >1)
		{
           System.out.println(Errorscheck.Errorscheck.get(7) + " Line: " + ctx.getStart().getLine());
		}
		else if(testName(filterName,"date") && !testFormatDate(parameterName))
		{
			System.out.println(Errorscheck.Errorscheck.get(7) + " Line: " + ctx.getStart().getLine());
		}
		else { }
		return new FilterStatement((Expression) filter, parameters);
	}

	@Override
	public AbstractASTNode visitNode(NodeContext ctx) {
		return visit(ctx.getChild(0));
	}

	public List<AbstractASTNode> getContent(ElementContentContext ctx) {
		List<AbstractASTNode> contents = new ArrayList<AbstractASTNode>();
		for (int index = 0; index < ctx.getChildCount(); index++) {
			if (ctx.getChild(index) instanceof NodeContext || ctx.getChild(index) instanceof MustacheContext)
				contents.add(visit(ctx.getChild(index)));
			else 
				contents.add(new TextNode(ctx.getChild(index).getText()));
		}
		return contents;
	}

	@Override
	public AbstractASTNode visitHalfElement(HalfElementContext ctx) {
		String tagName = ctx.getChild(1).getText();
		List<AbstractASTNode> attributes = new ArrayList<AbstractASTNode>();
		
		if (ctx.getChild(2) instanceof ElementAttributesContext)
			attributes = getAttributes((ElementAttributesContext) ctx.getChild(2));
		
		ElementNode element = new ElementNode(tagName, attributes.toArray(new DocumentNode[attributes.size()]));
		return element;
	}

	@Override
	public AbstractASTNode visitNormalElement(NormalElementContext ctx) {
		String tagName = ctx.getChild(1).getText();
		String tagClose;
		int StructuralAtt=0;
		boolean testScope = false;
		// semantic check order 1 (html)
		if (testName(tagName, "html")) {
			html++;
		}
		if (html > 1) {
			System.out.println(Errorscheck.Errorscheck.get(0) + " Line: " + ctx.getStart().getLine());
			html=0;
		}
		// end order 1
		// semantic check order 3 (li) ul/ol
		boolean listElement = false; //check list ul/ol
		if (testName(tagName, "ul") || testName(tagName, "ol")) {
			checklist.push(true);
			listElement = true;
		}
		//end order 3

		if (ctx.getChild(2) instanceof ElementAttributesContext) {
			tagClose = ctx.getChild(6).getText();
		} else
			tagClose = ctx.getChild(5).getText();
		if (!testName(tagName, tagClose))
			System.err.println("name does not match!");
		List<AbstractASTNode> attributes = new ArrayList<AbstractASTNode>();
		List<AbstractASTNode> contents = new ArrayList<AbstractASTNode>();

		if (ctx.getChild(2) instanceof ElementAttributesContext)
			attributes = getAttributes((ElementAttributesContext) ctx.getChild(2));
		boolean switchElement = false;
		boolean imgCheck=false;
		boolean anchorCheck=false;
		for (AbstractASTNode node : attributes) {

			if (node instanceof Directive && testName(((Directive) node).getName(), "cp-switch")) {
				switchExists.push(true);
				switchElement = true;
			}
			// order 6 img with src
			else if(testName(tagName,"img") && testName(((AttributeNode) node).getAttribute(), "src"))
			{

              srcImage.push(true);
				imgCheck=true;
			}
			else if(node instanceof AttributeNode && testName(((AttributeNode) node).getAttribute(), "id"))
			{

              htmlidrepet.push(((AttributeNode) node).getValue());
              if(!testHtmlid(htmlidrepet,((AttributeNode) node).getValue()))
			  {
				  System.out.println(Errorscheck.Errorscheck.get(0) + " Line: " + ctx.getStart().getLine());
			  }
			}
			// order 7  <a> with href
            else if(testName(tagName,"a") && testName(((AttributeNode) node).getAttribute(), "href"))
            {

                hrefA.push(true);
                anchorCheck=true;
            }
            else if (node instanceof Directive && testName(((Directive) node).getName(), "cp-app"))
			{
				referExists.pop();
			}
			else if (node instanceof Directive && testName(((Directive) node).getName(), "cp-show"))
			{
				StructuralAtt++;
			}
			else if (node instanceof Directive && testName(((Directive) node).getName(), "cp-hide"))
			{
				StructuralAtt++;
			}
			else if (node instanceof Directive && testName(((Directive) node).getName(), "cp-switch-case"))
			{
				StructuralAtt++;
			}
			else if (node instanceof Directive && testName(((Directive) node).getName(), "cp-if"))
			{
				referExists.pop();
				StructuralAtt++;
			}
			else if (node instanceof Directive && testName(((Directive) node).getName(), "cp-for"))
			{
				referExists.pop();
				StructuralAtt++;
			}
			else{}
	}
		for (AbstractASTNode node: attributes){
			if (node instanceof Directive && (testName(((Directive) node).getName(), "cp-switch-case")||testName(((Directive) node).getName(), "cp-switchDefault")))
				if (switchExists.isEmpty())
					System.err.println("Invalid switch");
		}
		if(StructuralAtt>1)
		{
			System.out.println(Errorscheck.Errorscheck.get(4) + " Line: " + ctx.getStart().getLine());
		}
		if(testName(tagName,"li"))
		{
			if(checklist.isEmpty())
				System.out.println(Errorscheck.Errorscheck.get(2) + " Line: " + ctx.getStart().getLine());

		}
		// order 6 img
		if(testName(tagName,"img") && srcImage.isEmpty())
		{
			System.out.println(Errorscheck.Errorscheck.get(5) + " Line: " + ctx.getStart().getLine());
		}
        // order 7 <a> with href
        if(testName(tagName,"a") && hrefA.isEmpty())
        {
            System.out.println(Errorscheck.Errorscheck.get(6) + " Line: " + ctx.getStart().getLine());
        }
		if (ctx.getChild(3) instanceof ElementContentContext)
			contents = getContent((ElementContentContext) ctx.getChild(3));
		if (ctx.getChild(4) instanceof ElementContentContext)
			contents = getContent((ElementContentContext) ctx.getChild(4));
		if (switchElement)
			switchExists.pop();
		//order 6
		if(imgCheck)
			srcImage.pop();
        if(anchorCheck)
            hrefA.pop();
		//ul/ol
		if(listElement)
		{
			checklist.pop();
		}
		//end ul/ol
		//System.out.println(tagName + " " + testScope);

		for (AbstractASTNode node: attributes) {

			if (node instanceof Directive && testName(((Directive) node).getName(), "cp-app")) {
				check =0;
				scopes.pop();
			}
			else if (node instanceof Directive && testName(((Directive) node).getName(), "cp-if")) {
				scopes.pop();
			}
			else if (node instanceof Directive && testName(((Directive) node).getName(), "cp-for")) {
				scopes.pop();
				if(!indexFor.isEmpty())
				indexFor.pop();
			}
			else if (node instanceof Directive && testName(((Directive) node).getName(), "cp-switch-case")) {
				scopes.pop();
			}
			else
			{

			}
		}
		ElementNode element = new ElementNode(tagName, attributes.toArray(new DocumentNode[attributes.size()]), contents.toArray(new DocumentNode[contents.size()]));
		return element;
	}

	@Override
	public AbstractASTNode visitSelfClosedElement(SelfClosedElementContext ctx) {
		String tagName = ctx.getChild(1).getText();
		List<AbstractASTNode> attributes = new ArrayList<AbstractASTNode>();
		
		if (ctx.getChild(2) instanceof ElementAttributesContext)
			attributes = getAttributes((ElementAttributesContext) ctx.getChild(2));
		
		ElementNode element = new ElementNode(tagName, attributes.toArray(new DocumentNode[attributes.size()]));
		return element;
	}

	@Override
	public AbstractASTNode visitTextNode(TextNodeContext ctx) {
		return new TextNode(ctx.getText());
	}

	public List<AbstractASTNode> getAttributes(ElementAttributesContext ctx) {
		List<AbstractASTNode> attributes = new ArrayList<AbstractASTNode>();
		for (int index = 0; index < ctx.getChildCount(); index++) {
            //System.out.println(ctx.getChild(index).getChild(0).getText());
            if (testName(ctx.getChild(index).getChild(0).getText(), "cp-app")) {
                referExists.push("cp-app");
				check++;
				if(check >1)
				{
					System.out.println(Errorscheck.Errorscheck.get(3) + " Line: " + ctx.getStart().getLine());
				}
				Scope scope=new Scope();
				scope.setName(ctx.getChild(index).getChild(0).getText());
				scope.setParent(null);
				scopes.push(scope);
				symbolTable.addScope(scopes.peek());
				//System.out.println(((Directive) node).getName());

			}
			else if (testName(ctx.getChild(index).getChild(0).getText(), "cp-if")) {
				referExists.push("cp-if");
				Scope scope=new Scope();
				scope.setName(ctx.getChild(index).getChild(0).getText());
				if(scopes.isEmpty())
				{
					scope.setParent(null);
				}
				else
					scope.setParent(scopes.peek());
				scopes.peek().addChildren(scope);
				scopes.push(scope);
				//symbolTable.addScope(scopes.peek());
				//System.out.println(((Directive) node).getName());
			}
			else if (testName(ctx.getChild(index).getChild(0).getText(), "cp-for")) {
				referExists.push("cp-for");
				Scope scope=new Scope();
				scope.setName(ctx.getChild(index).getChild(0).getText());
				if(scopes.isEmpty())
				{
					scope.setParent(null);
				}
				else
					scope.setParent(scopes.peek());
				scopes.peek().addChildren(scope);
				scopes.push(scope);
				//symbolTable.addScope(scopes.peek());
				//System.out.println(((Directive) node).getName());
			}
			else if (testName(ctx.getChild(index).getChild(0).getText(), "cp-switch-case")) {
				Scope scope=new Scope();
				scope.setName(ctx.getChild(index).getChild(0).getText());
				if(scopes.isEmpty())
				{
					scope.setParent(null);
				}
				else
					scope.setParent(scopes.peek());
				scopes.peek().addChildren(scope);
				scopes.push(scope);
				//symbolTable.addScope(scopes.peek());
			//	System.out.println(((Directive) node).getName());
			}
			else if(ctx.getChild(index) instanceof ExpDirectiveContext)
            {
                if(!scopes.isEmpty()) {
					Symbol symbol = new Symbol();
					symbol.setName(ctx.getChild(index).getChild(0).getText());
					symbol.setScope(scopes.peek());
					scopes.peek().addSymbol(symbol);
				}
            }
			else
			{
				if(!scopes.isEmpty()) {
					Symbol symbol = new Symbol();
					symbol.setName(ctx.getChild(index).getChild(2).toString());
					symbol.setScope(scopes.peek());
					scopes.peek().addSymbol(symbol);
				}


		}

		attributes.add(visit(ctx.getChild(index)));
		}

		return attributes;
	}

	@Override
	public AbstractASTNode visitAttributeNode(AttributeNodeContext ctx) {
		String name = ctx.getChild(0).getText();
		String value = null;
		if (ctx.getChildCount() > 1)
			value = ctx.getChild(2).getText();
		return new AttributeNode(name, value);
	}

	@Override
	public AbstractASTNode visitMustache(MustacheContext ctx) {
		MustachNode mustache;
		if (ctx.getChildCount() > 2) {
			mustache = new MustachNode(expressionVisitor.visit(ctx.getChild(1)));
//			Symbol symbol = new Symbol();
//			symbol.setName(loopVariable);
//			symbol.setScope(scopes.peek());
//			scopes.peek().addSymbol(symbol1);
		}
		else
			mustache = new MustachNode();
		return mustache;
	}
	
	protected boolean testName(String openTag, String closeTag) {
		return openTag.compareToIgnoreCase(closeTag) == 0;
	}
   public boolean testIndexFor(Stack<String> inFor,String ind)
   {
       int count=0;
       if(inFor.isEmpty())
           return true;
       for(int i=0;i<inFor.size();i++)
       {
           if(testName(inFor.get(i),ind))
               count++;
       }
       if(count>1)
           return false;
       return true;
   }
	public boolean testkeyFor(Stack<String> keyFor,String kfor)
	{
		int count=0;
		if(keyFor.isEmpty())
			return true;
		for(int i=0;i<keyFor.size();i++)
		{
			if(testName(keyFor.get(i),kfor))
				count++;
		}
		if(count>1)
			return false;
		return true;
	}
   public boolean testFormatDate(String format)
   {
	    ArrayList<String> formatList=new ArrayList<String>();
	   formatList.add("dd/mm/yyyy h:m:s"); //1
	   formatList.add("dd/mm/yyyy h:m");
	   formatList.add("mm/dd/yyyy h:m:s"); //2
	   formatList.add("mm/dd/yyyy h:m");
	   formatList.add("dd-mm-yyyy h:m:s"); //3
	   formatList.add("dd-mm-yyyy h:m");
	   formatList.add("mm-dd-yyyy h:m:s"); //4
	   formatList.add("mm-dd-yyyy h:m");
	   formatList.add("mm-yyyy");     //5
	   formatList.add("mm-yy"); //6
	   for(int i=0;i<formatList.size();i++)
	   {
	   	if(testName(format,formatList.get(i)))
	   		return true;
	   }
	    return false;
   }
	public boolean testHtmlid(Stack<String> idHtml,String id)
	{
		int count=0;
		if(idHtml.isEmpty())
			return true;
		for(int i=0;i<idHtml.size();i++)
		{
			if(testName(idHtml.get(i),id))
				count++;
		}
		if(count>1)
			return false;
		return true;
	}
}