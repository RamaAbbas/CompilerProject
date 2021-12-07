import java.io.FileWriter;
import java.io.IOException;

import SemanticCh.Errorscheck;
import SymbolTable.SymbolTable;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;

import misc.HTMLLexer;
import misc.HTMLParser;
import models.AbstractASTNode;
import visitors.DocumentVisitor;
import visitors.Visitor;


public class Compiler {

	static String filePath = "C:\\Users\\HP\\Desktop\\Compiler\\index.html";
	static String ASTPath = "C:\\Users\\HP\\Desktop\\Compiler\\AST.txt";
	
	protected static void showGUI(ParseTree pt, HTMLParser parser) {
		Trees.inspect(pt, parser);
	}

	public static void main(String[] argv) {

		CharStream cs;
		try {
			Errorscheck err=new Errorscheck();
			cs = CharStreams.fromFileName(filePath);
			HTMLLexer lexer = new HTMLLexer(cs);
			CommonTokenStream cts = new CommonTokenStream(lexer);
			HTMLParser parser = new HTMLParser(cts);
			ParseTree pt = parser.document();
		    //showGUI(pt, parser);
			DocumentVisitor visitor = new DocumentVisitor();
			AbstractASTNode document = visitor.visit(pt);
			FileWriter resultFile = new FileWriter(ASTPath);
			resultFile.write(document.toString());
			resultFile.close();
			//SymbolTable symbolTable = Visitor.symbolTable;
		//	symbolTable.PrintSymtable();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
