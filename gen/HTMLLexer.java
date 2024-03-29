// Generated from C:/Users/Hussein/Desktop/compiler/Compiler/Grammar\HTMLLexer.g4 by ANTLR 4.7.2

package misc;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_SLASH_OPEN=10, TAG_OPEN=11, 
		MUSTACHE_OPEN=12, HTML_TEXT=13, TAG_NAME=14, TAG_CLOSE=15, TAG_SLASH_CLOSE=16, 
		CP_APP=17, CP_SHOW=18, CP_HIDE=19, CP_IF=20, CP_FOR=21, CP_MODEL=22, CP_SWITCH=23, 
		CP_SWITCH_CASE=24, CP_SWITCH_DEFAULT=25, EVENT=26, ATT_NAME=27, TAG_EQUALS=28, 
		WHITESPACE_AM=29, ATT_VALUE=30, WHITESPACE_AVM=31, MUSTACHe_OPEN=32, MUSTACHE_CLOSE=33, 
		TERMINAL=34, QUOT=35, APO=36, INCREMENT=37, DECREMENT=38, MULT=39, DIVIDE=40, 
		MINUS=41, MOD=42, SUM=43, NUMBER=44, BOOLEAN=45, IN=46, INDEX=47, ASSIGN=48, 
		OPEN_PAR=49, CLOSE_PAR=50, OPEN_SQUARE=51, CLOSE_SQUARE=52, OPEN_BRACKET=53, 
		CLOSE_BRACKET=54, LESS_THAN=55, MORE_THAN=56, EQUAL=57, NOT_EQUAL=58, 
		MORE_EQUAL_THAN=59, LESS_EQUAL_THAN=60, PIPE=61, COMMA=62, DOT=63, SEMICOLON=64, 
		AND=65, OR=66, EXC=67, QUESTION_MARK=68, COLON=69, IDENTIFIRE=70, WHITESPACE_EAVM=71, 
		STRING_WITH_APO=72, STRING_WITH_QUOT=73, SCRIPT_BODY=74, SCRIPT_SHORT_BODY=75, 
		STYLE_BODY=76, STYLE_SHORT_BODY=77;
	public static final int
		NAME_MODE=1, REST_OF_TAG_MODE=2, ATTRIBUTE_VALUE_MODE=3, DIRECTIVE_MODE=4, 
		STRING_VALUE_INSIDE_QUOT=5, STRING_VALUE_INSIDE_APO=6, SCRIPT=7, STYLE=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "NAME_MODE", "REST_OF_TAG_MODE", "ATTRIBUTE_VALUE_MODE", 
		"DIRECTIVE_MODE", "STRING_VALUE_INSIDE_QUOT", "STRING_VALUE_INSIDE_APO", 
		"SCRIPT", "STYLE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", "SCRIPTLET", 
			"SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_SLASH_OPEN", "TAG_OPEN", 
			"MUSTACHE_OPEN", "HTML_TEXT", "TAG_NAME", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"CP_APP", "CP_SHOW", "CP_HIDE", "CP_IF", "CP_FOR", "CP_MODEL", "CP_SWITCH", 
			"CP_SWITCH_CASE", "CP_SWITCH_DEFAULT", "EVENT", "ATT_NAME", "TAG_EQUALS", 
			"WHITESPACE_AM", "ATT_VALUE", "WHITESPACE_AVM", "MUSTACHe_OPEN", "MUSTACHE_CLOSE", 
			"TERMINAL", "QUOT", "APO", "INCREMENT", "DECREMENT", "MULT", "DIVIDE", 
			"MINUS", "MOD", "SUM", "NUMBER", "BOOLEAN", "IN", "INDEX", "ASSIGN", 
			"OPEN_PAR", "CLOSE_PAR", "OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "LESS_THAN", "MORE_THAN", "EQUAL", "NOT_EQUAL", "MORE_EQUAL_THAN", 
			"LESS_EQUAL_THAN", "PIPE", "COMMA", "DOT", "SEMICOLON", "AND", "OR", 
			"EXC", "QUESTION_MARK", "COLON", "IDENTIFIRE", "WHITESPACE_EAVM", "QUOT_COPY", 
			"STRING_WITH_APO", "APO_COPY", "STRING_WITH_QUOT", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", 
			"STYLE_BODY", "STYLE_SHORT_BODY", "ATTCHARS", "ATTCHAR", "HEXCHARS", 
			"DECCHARS", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", "HEXDIGIT", 
			"DIGIT", "TAG_NameChar", "TAG_NameStartChar", "WHITESPACE", "ATTRIBUTE", 
			"EVENT_NAME", "LETTER", "UNDER_SCORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'cp-app'", "'cp-show'", "'cp-hide'", "'cp-if'", 
			"'cp-for'", "'cp-model'", "'cp-switch'", "'cp-switch-case'", "'cp-switchDefault'", 
			null, null, null, null, null, null, null, null, null, null, null, "'++'", 
			"'--'", "'*'", "'/'", "'-'", "'%'", "'+'", null, null, "'in'", "'index'", 
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", null, "'=='", 
			"'!='", "'>='", "'<='", "'|'", "','", "'.'", "';'", "'&&'", "'||'", "'!'", 
			"'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_SLASH_OPEN", 
			"TAG_OPEN", "MUSTACHE_OPEN", "HTML_TEXT", "TAG_NAME", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"CP_APP", "CP_SHOW", "CP_HIDE", "CP_IF", "CP_FOR", "CP_MODEL", "CP_SWITCH", 
			"CP_SWITCH_CASE", "CP_SWITCH_DEFAULT", "EVENT", "ATT_NAME", "TAG_EQUALS", 
			"WHITESPACE_AM", "ATT_VALUE", "WHITESPACE_AVM", "MUSTACHe_OPEN", "MUSTACHE_CLOSE", 
			"TERMINAL", "QUOT", "APO", "INCREMENT", "DECREMENT", "MULT", "DIVIDE", 
			"MINUS", "MOD", "SUM", "NUMBER", "BOOLEAN", "IN", "INDEX", "ASSIGN", 
			"OPEN_PAR", "CLOSE_PAR", "OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "LESS_THAN", "MORE_THAN", "EQUAL", "NOT_EQUAL", "MORE_EQUAL_THAN", 
			"LESS_EQUAL_THAN", "PIPE", "COMMA", "DOT", "SEMICOLON", "AND", "OR", 
			"EXC", "QUESTION_MARK", "COLON", "IDENTIFIRE", "WHITESPACE_EAVM", "STRING_WITH_APO", 
			"STRING_WITH_QUOT", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", 
			"STYLE_SHORT_BODY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	boolean insideDirective;
	boolean insideMustache;
	boolean hasStartTerminal;
	char terminal;
	void foo(char symbol, int nextMode) {
		if (insideMustache) {
			pushMode(nextMode);
		} else if (! hasStartTerminal) {
			terminal = symbol;
			hasStartTerminal = true;
			setType(TERMINAL);
		} else if (hasStartTerminal && terminal == symbol) { 
			hasStartTerminal = false;
			popMode();
			setType(TERMINAL);
		} else
			pushMode(nextMode);
	}


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11:
			MUSTACHE_OPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			CP_APP_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			CP_SHOW_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			CP_HIDE_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			CP_IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			CP_FOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			CP_MODEL_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			CP_SWITCH_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			CP_SWITCH_CASE_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			CP_SWITCH_DEFAULT_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			EVENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			ATT_NAME_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			TAG_EQUALS_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			MUSTACHe_OPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			MUSTACHE_CLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			QUOT_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			APO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void MUSTACHE_OPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			insideMustache = true; pushMode(DIRECTIVE_MODE);
			break;
		}
	}
	private void CP_APP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			insideDirective = true;
			break;
		}
	}
	private void CP_SHOW_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			insideDirective = true;
			break;
		}
	}
	private void CP_HIDE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			insideDirective = true;
			break;
		}
	}
	private void CP_IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			insideDirective = true;
			break;
		}
	}
	private void CP_FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			insideDirective = true;
			break;
		}
	}
	private void CP_MODEL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			insideDirective = true;
			break;
		}
	}
	private void CP_SWITCH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			insideDirective = true;
			break;
		}
	}
	private void CP_SWITCH_CASE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			insideDirective = true;
			break;
		}
	}
	private void CP_SWITCH_DEFAULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			insideDirective = true;
			break;
		}
	}
	private void EVENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			insideDirective = true;
			break;
		}
	}
	private void ATT_NAME_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			insideDirective = false;
			break;
		}
	}
	private void TAG_EQUALS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			if (! insideDirective) pushMode(ATTRIBUTE_VALUE_MODE);
			    	   else pushMode(DIRECTIVE_MODE);
			break;
		}
	}
	private void MUSTACHe_OPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			insideMustache = true; pushMode(DIRECTIVE_MODE); setType(MUSTACHE_OPEN);
			break;
		}
	}
	private void MUSTACHE_CLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			insideMustache = false; popMode();
			break;
		}
	}
	private void QUOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			foo('"', STRING_VALUE_INSIDE_QUOT);
			break;
		}
	}
	private void APO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			foo('\'', STRING_VALUE_INSIDE_APO);
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2O\u0376\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7"+
		"\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17"+
		"\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26"+
		"\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35"+
		"\t\35\4\36\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&"+
		"\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61"+
		"\t\61\4\62\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t"+
		"8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4"+
		"D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\t"+
		"O\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4"+
		"[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00ce\n\2\f"+
		"\2\16\2\u00d1\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\u00dc\n\3\f"+
		"\3\16\3\u00df\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00eb\n"+
		"\4\f\4\16\4\u00ee\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5\u00fd\n\5\f\5\16\5\u0100\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\7\6\u010a\n\6\f\6\16\6\u010d\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u0115\n"+
		"\7\f\7\16\7\u0118\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0120\n\7\f\7\16\7"+
		"\u0123\13\7\3\7\3\7\5\7\u0127\n\7\3\b\3\b\5\b\u012b\n\b\3\b\6\b\u012e"+
		"\n\b\r\b\16\b\u012f\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u013b\n\t"+
		"\f\t\16\t\u013e\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\n\u014c\n\n\f\n\16\n\u014f\13\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13\u0157"+
		"\n\13\f\13\16\13\u015a\13\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u0162\n\f"+
		"\f\f\16\f\u0165\13\f\3\f\3\f\3\r\3\r\7\r\u016b\n\r\f\r\16\r\u016e\13\r"+
		"\3\r\3\r\3\r\3\16\7\16\u0174\n\16\f\16\16\16\u0177\13\16\3\17\3\17\7\17"+
		"\u017b\n\17\f\17\16\17\u017e\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\7\21\u0188\n\21\f\21\16\21\u018b\13\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u0200"+
		"\n\34\f\34\16\34\u0203\13\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#"+
		"\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,"+
		"\3,\3-\6-\u0238\n-\r-\16-\u0239\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0245\n"+
		".\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3"+
		";\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3"+
		"E\3E\3F\3F\3G\3G\5G\u0284\nG\3G\3G\3G\7G\u0289\nG\fG\16G\u028c\13G\3H"+
		"\3H\3H\3H\3I\3I\3I\3I\3I\3J\6J\u0298\nJ\rJ\16J\u0299\3K\3K\3K\3K\3K\3"+
		"L\6L\u02a2\nL\rL\16L\u02a3\3M\7M\u02a7\nM\fM\16M\u02aa\13M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3N\7N\u02b9\nN\fN\16N\u02bc\13N\3N\3N\3N\3N"+
		"\3N\3N\3O\7O\u02c5\nO\fO\16O\u02c8\13O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"O\3P\7P\u02d6\nP\fP\16P\u02d9\13P\3P\3P\3P\3P\3P\3P\3Q\6Q\u02e2\nQ\rQ"+
		"\16Q\u02e3\3Q\5Q\u02e7\nQ\3R\5R\u02ea\nR\3S\3S\6S\u02ee\nS\rS\16S\u02ef"+
		"\3T\6T\u02f3\nT\rT\16T\u02f4\3T\5T\u02f8\nT\3U\3U\7U\u02fc\nU\fU\16U\u02ff"+
		"\13U\3U\3U\3V\3V\7V\u0305\nV\fV\16V\u0308\13V\3V\3V\3W\3W\3X\3X\3Y\3Y"+
		"\3Y\3Y\5Y\u0314\nY\3Z\5Z\u0317\nZ\3[\3[\3\\\3\\\3\\\3\\\3\\\5\\\u0320"+
		"\n\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0371\n]\3^\3^\3_\3_\17\u00cf\u00dd"+
		"\u00ec\u00fe\u010b\u0116\u0121\u013c\u014d\u02a8\u02ba\u02c6\u02d7\2`"+
		"\13\3\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'"+
		"\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E "+
		"G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61i\62k\63m\64o\65q\66s\67u8w9y"+
		":{;}<\177=\u0081>\u0083?\u0085@\u0087A\u0089B\u008bC\u008dD\u008fE\u0091"+
		"F\u0093G\u0095H\u0097I\u0099\2\u009bJ\u009d\2\u009fK\u00a1L\u00a3M\u00a5"+
		"N\u00a7O\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7"+
		"\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\13\2\3\4\5"+
		"\6\7\b\t\n\20\4\2\13\13\"\"\4\2>>}}\3\2$$\3\2))\t\2%%-=??AAC\\aac|\5\2"+
		"\62;CHch\3\2\62;\4\2$$>>\4\2))>>\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371"+
		"\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1"+
		"\ufdf2\uffff\5\2\13\f\17\17\"\"\4\2C\\c|\2\u0396\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\3%\3\2\2\2\4\'\3\2\2\2\4)\3\2\2\2\4+\3\2\2\2\4-\3\2\2\2\4/\3\2\2"+
		"\2\4\61\3\2\2\2\4\63\3\2\2\2\4\65\3\2\2\2\4\67\3\2\2\2\49\3\2\2\2\4;\3"+
		"\2\2\2\4=\3\2\2\2\4?\3\2\2\2\4A\3\2\2\2\4C\3\2\2\2\5E\3\2\2\2\5G\3\2\2"+
		"\2\6I\3\2\2\2\6K\3\2\2\2\6M\3\2\2\2\6O\3\2\2\2\6Q\3\2\2\2\6S\3\2\2\2\6"+
		"U\3\2\2\2\6W\3\2\2\2\6Y\3\2\2\2\6[\3\2\2\2\6]\3\2\2\2\6_\3\2\2\2\6a\3"+
		"\2\2\2\6c\3\2\2\2\6e\3\2\2\2\6g\3\2\2\2\6i\3\2\2\2\6k\3\2\2\2\6m\3\2\2"+
		"\2\6o\3\2\2\2\6q\3\2\2\2\6s\3\2\2\2\6u\3\2\2\2\6w\3\2\2\2\6y\3\2\2\2\6"+
		"{\3\2\2\2\6}\3\2\2\2\6\177\3\2\2\2\6\u0081\3\2\2\2\6\u0083\3\2\2\2\6\u0085"+
		"\3\2\2\2\6\u0087\3\2\2\2\6\u0089\3\2\2\2\6\u008b\3\2\2\2\6\u008d\3\2\2"+
		"\2\6\u008f\3\2\2\2\6\u0091\3\2\2\2\6\u0093\3\2\2\2\6\u0095\3\2\2\2\6\u0097"+
		"\3\2\2\2\7\u0099\3\2\2\2\7\u009b\3\2\2\2\b\u009d\3\2\2\2\b\u009f\3\2\2"+
		"\2\t\u00a1\3\2\2\2\t\u00a3\3\2\2\2\n\u00a5\3\2\2\2\n\u00a7\3\2\2\2\13"+
		"\u00c7\3\2\2\2\r\u00d6\3\2\2\2\17\u00e3\3\2\2\2\21\u00f1\3\2\2\2\23\u0105"+
		"\3\2\2\2\25\u0126\3\2\2\2\27\u012d\3\2\2\2\31\u0131\3\2\2\2\33\u0143\3"+
		"\2\2\2\35\u0154\3\2\2\2\37\u015f\3\2\2\2!\u0168\3\2\2\2#\u0175\3\2\2\2"+
		"%\u0178\3\2\2\2\'\u0181\3\2\2\2)\u0185\3\2\2\2+\u0190\3\2\2\2-\u0199\3"+
		"\2\2\2/\u01a3\3\2\2\2\61\u01ad\3\2\2\2\63\u01b5\3\2\2\2\65\u01be\3\2\2"+
		"\2\67\u01c9\3\2\2\29\u01d5\3\2\2\2;\u01e6\3\2\2\2=\u01f9\3\2\2\2?\u01fd"+
		"\3\2\2\2A\u0206\3\2\2\2C\u0209\3\2\2\2E\u020d\3\2\2\2G\u0211\3\2\2\2I"+
		"\u0215\3\2\2\2K\u0219\3\2\2\2M\u021d\3\2\2\2O\u0220\3\2\2\2Q\u0223\3\2"+
		"\2\2S\u0226\3\2\2\2U\u0229\3\2\2\2W\u022c\3\2\2\2Y\u022e\3\2\2\2[\u0230"+
		"\3\2\2\2]\u0232\3\2\2\2_\u0234\3\2\2\2a\u0237\3\2\2\2c\u0244\3\2\2\2e"+
		"\u0246\3\2\2\2g\u0249\3\2\2\2i\u024f\3\2\2\2k\u0251\3\2\2\2m\u0253\3\2"+
		"\2\2o\u0255\3\2\2\2q\u0257\3\2\2\2s\u0259\3\2\2\2u\u025b\3\2\2\2w\u025d"+
		"\3\2\2\2y\u025f\3\2\2\2{\u0261\3\2\2\2}\u0264\3\2\2\2\177\u0267\3\2\2"+
		"\2\u0081\u026a\3\2\2\2\u0083\u026d\3\2\2\2\u0085\u026f\3\2\2\2\u0087\u0271"+
		"\3\2\2\2\u0089\u0273\3\2\2\2\u008b\u0275\3\2\2\2\u008d\u0278\3\2\2\2\u008f"+
		"\u027b\3\2\2\2\u0091\u027d\3\2\2\2\u0093\u027f\3\2\2\2\u0095\u0283\3\2"+
		"\2\2\u0097\u028d\3\2\2\2\u0099\u0291\3\2\2\2\u009b\u0297\3\2\2\2\u009d"+
		"\u029b\3\2\2\2\u009f\u02a1\3\2\2\2\u00a1\u02a8\3\2\2\2\u00a3\u02ba\3\2"+
		"\2\2\u00a5\u02c6\3\2\2\2\u00a7\u02d7\3\2\2\2\u00a9\u02e1\3\2\2\2\u00ab"+
		"\u02e9\3\2\2\2\u00ad\u02eb\3\2\2\2\u00af\u02f2\3\2\2\2\u00b1\u02f9\3\2"+
		"\2\2\u00b3\u0302\3\2\2\2\u00b5\u030b\3\2\2\2\u00b7\u030d\3\2\2\2\u00b9"+
		"\u0313\3\2\2\2\u00bb\u0316\3\2\2\2\u00bd\u0318\3\2\2\2\u00bf\u031f\3\2"+
		"\2\2\u00c1\u0370\3\2\2\2\u00c3\u0372\3\2\2\2\u00c5\u0374\3\2\2\2\u00c7"+
		"\u00c8\7>\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7/\2\2\u00ca\u00cb\7/\2\2"+
		"\u00cb\u00cf\3\2\2\2\u00cc\u00ce\13\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3\u00d4\7/\2\2\u00d4\u00d5\7@\2"+
		"\2\u00d5\f\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9\7"+
		"]\2\2\u00d9\u00dd\3\2\2\2\u00da\u00dc\13\2\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7_\2\2\u00e1\u00e2\7@\2\2\u00e2\16"+
		"\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4\u00e5\7A\2\2\u00e5\u00e6\7z\2\2\u00e6"+
		"\u00e7\7o\2\2\u00e7\u00e8\7n\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb\13\2"+
		"\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7@"+
		"\2\2\u00f0\20\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\7#\2\2\u00f3\u00f4"+
		"\7]\2\2\u00f4\u00f5\7E\2\2\u00f5\u00f6\7F\2\2\u00f6\u00f7\7C\2\2\u00f7"+
		"\u00f8\7V\2\2\u00f8\u00f9\7C\2\2\u00f9\u00fa\7]\2\2\u00fa\u00fe\3\2\2"+
		"\2\u00fb\u00fd\13\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0102\7_\2\2\u0102\u0103\7_\2\2\u0103\u0104\7@\2\2\u0104\22"+
		"\3\2\2\2\u0105\u0106\7>\2\2\u0106\u0107\7#\2\2\u0107\u010b\3\2\2\2\u0108"+
		"\u010a\13\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u010c\3"+
		"\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\7@\2\2\u010f\24\3\2\2\2\u0110\u0111\7>\2\2\u0111\u0112\7A\2\2\u0112"+
		"\u0116\3\2\2\2\u0113\u0115\13\2\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3"+
		"\2\2\2\u0116\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011a\7A\2\2\u011a\u0127\7@\2\2\u011b\u011c\7>\2"+
		"\2\u011c\u011d\7\'\2\2\u011d\u0121\3\2\2\2\u011e\u0120\13\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\'\2\2\u0125"+
		"\u0127\7@\2\2\u0126\u0110\3\2\2\2\u0126\u011b\3\2\2\2\u0127\26\3\2\2\2"+
		"\u0128\u012e\t\2\2\2\u0129\u012b\7\17\2\2\u012a\u0129\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\7\f\2\2\u012d\u0128\3\2\2\2\u012d"+
		"\u012a\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\30\3\2\2\2\u0131\u0132\7>\2\2\u0132\u0133\7u\2\2\u0133\u0134"+
		"\7e\2\2\u0134\u0135\7t\2\2\u0135\u0136\7k\2\2\u0136\u0137\7r\2\2\u0137"+
		"\u0138\7v\2\2\u0138\u013c\3\2\2\2\u0139\u013b\13\2\2\2\u013a\u0139\3\2"+
		"\2\2\u013b\u013e\3\2\2\2\u013c\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7@\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0142\b\t\2\2\u0142\32\3\2\2\2\u0143\u0144\7>\2\2\u0144\u0145"+
		"\7u\2\2\u0145\u0146\7v\2\2\u0146\u0147\7{\2\2\u0147\u0148\7n\2\2\u0148"+
		"\u0149\7g\2\2\u0149\u014d\3\2\2\2\u014a\u014c\13\2\2\2\u014b\u014a\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7@\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\b\n\3\2\u0153\34\3\2\2\2\u0154\u0158\7>\2\2\u0155\u0157"+
		"\5\u00bd[\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c"+
		"\7\61\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b\13\4\2\u015e\36\3\2\2\2\u015f"+
		"\u0163\7>\2\2\u0160\u0162\5\u00bd[\2\u0161\u0160\3\2\2\2\u0162\u0165\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0167\b\f\4\2\u0167 \3\2\2\2\u0168\u016c\7}\2\2\u0169"+
		"\u016b\5\u00bd[\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0170\7}\2\2\u0170\u0171\b\r\5\2\u0171\"\3\2\2\2\u0172\u0174\n\3\2\2"+
		"\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176$\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017c\5\u00bbZ\2\u0179"+
		"\u017b\5\u00b9Y\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0180\b\17\6\2\u0180&\3\2\2\2\u0181\u0182\7@\2\2\u0182\u0183\3\2\2\2"+
		"\u0183\u0184\b\20\7\2\u0184(\3\2\2\2\u0185\u0189\7\61\2\2\u0186\u0188"+
		"\5\u00bd[\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2"+
		"\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d"+
		"\7@\2\2\u018d\u018e\3\2\2\2\u018e\u018f\b\21\7\2\u018f*\3\2\2\2\u0190"+
		"\u0191\7e\2\2\u0191\u0192\7r\2\2\u0192\u0193\7/\2\2\u0193\u0194\7c\2\2"+
		"\u0194\u0195\7r\2\2\u0195\u0196\7r\2\2\u0196\u0197\3\2\2\2\u0197\u0198"+
		"\b\22\b\2\u0198,\3\2\2\2\u0199\u019a\7e\2\2\u019a\u019b\7r\2\2\u019b\u019c"+
		"\7/\2\2\u019c\u019d\7u\2\2\u019d\u019e\7j\2\2\u019e\u019f\7q\2\2\u019f"+
		"\u01a0\7y\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\b\23\t\2\u01a2.\3\2\2\2"+
		"\u01a3\u01a4\7e\2\2\u01a4\u01a5\7r\2\2\u01a5\u01a6\7/\2\2\u01a6\u01a7"+
		"\7j\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7f\2\2\u01a9\u01aa\7g\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ac\b\24\n\2\u01ac\60\3\2\2\2\u01ad\u01ae\7e\2"+
		"\2\u01ae\u01af\7r\2\2\u01af\u01b0\7/\2\2\u01b0\u01b1\7k\2\2\u01b1\u01b2"+
		"\7h\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\b\25\13\2\u01b4\62\3\2\2\2\u01b5"+
		"\u01b6\7e\2\2\u01b6\u01b7\7r\2\2\u01b7\u01b8\7/\2\2\u01b8\u01b9\7h\2\2"+
		"\u01b9\u01ba\7q\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd"+
		"\b\26\f\2\u01bd\64\3\2\2\2\u01be\u01bf\7e\2\2\u01bf\u01c0\7r\2\2\u01c0"+
		"\u01c1\7/\2\2\u01c1\u01c2\7o\2\2\u01c2\u01c3\7q\2\2\u01c3\u01c4\7f\2\2"+
		"\u01c4\u01c5\7g\2\2\u01c5\u01c6\7n\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8"+
		"\b\27\r\2\u01c8\66\3\2\2\2\u01c9\u01ca\7e\2\2\u01ca\u01cb\7r\2\2\u01cb"+
		"\u01cc\7/\2\2\u01cc\u01cd\7u\2\2\u01cd\u01ce\7y\2\2\u01ce\u01cf\7k\2\2"+
		"\u01cf\u01d0\7v\2\2\u01d0\u01d1\7e\2\2\u01d1\u01d2\7j\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d4\b\30\16\2\u01d48\3\2\2\2\u01d5\u01d6\7e\2\2\u01d6"+
		"\u01d7\7r\2\2\u01d7\u01d8\7/\2\2\u01d8\u01d9\7u\2\2\u01d9\u01da\7y\2\2"+
		"\u01da\u01db\7k\2\2\u01db\u01dc\7v\2\2\u01dc\u01dd\7e\2\2\u01dd\u01de"+
		"\7j\2\2\u01de\u01df\7/\2\2\u01df\u01e0\7e\2\2\u01e0\u01e1\7c\2\2\u01e1"+
		"\u01e2\7u\2\2\u01e2\u01e3\7g\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\b\31"+
		"\17\2\u01e5:\3\2\2\2\u01e6\u01e7\7e\2\2\u01e7\u01e8\7r\2\2\u01e8\u01e9"+
		"\7/\2\2\u01e9\u01ea\7u\2\2\u01ea\u01eb\7y\2\2\u01eb\u01ec\7k\2\2\u01ec"+
		"\u01ed\7v\2\2\u01ed\u01ee\7e\2\2\u01ee\u01ef\7j\2\2\u01ef\u01f0\7F\2\2"+
		"\u01f0\u01f1\7g\2\2\u01f1\u01f2\7h\2\2\u01f2\u01f3\7c\2\2\u01f3\u01f4"+
		"\7w\2\2\u01f4\u01f5\7n\2\2\u01f5\u01f6\7v\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f8\b\32\20\2\u01f8<\3\2\2\2\u01f9\u01fa\7B\2\2\u01fa\u01fb\5\u00c1"+
		"]\2\u01fb\u01fc\b\33\21\2\u01fc>\3\2\2\2\u01fd\u0201\5\u00bbZ\2\u01fe"+
		"\u0200\5\u00b9Y\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0205\b\34\22\2\u0205@\3\2\2\2\u0206\u0207\7?\2\2\u0207\u0208\b\35\23"+
		"\2\u0208B\3\2\2\2\u0209\u020a\5\u00bd[\2\u020a\u020b\3\2\2\2\u020b\u020c"+
		"\b\36\24\2\u020cD\3\2\2\2\u020d\u020e\5\u00bf\\\2\u020e\u020f\3\2\2\2"+
		"\u020f\u0210\b\37\7\2\u0210F\3\2\2\2\u0211\u0212\5\u00bd[\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0214\b \24\2\u0214H\3\2\2\2\u0215\u0216\7}\2\2\u0216\u0217"+
		"\7}\2\2\u0217\u0218\b!\25\2\u0218J\3\2\2\2\u0219\u021a\7\177\2\2\u021a"+
		"\u021b\7\177\2\2\u021b\u021c\b\"\26\2\u021cL\3\2\2\2\u021d\u021e\7\177"+
		"\2\2\u021e\u021f\7\177\2\2\u021fN\3\2\2\2\u0220\u0221\7$\2\2\u0221\u0222"+
		"\b$\27\2\u0222P\3\2\2\2\u0223\u0224\7)\2\2\u0224\u0225\b%\30\2\u0225R"+
		"\3\2\2\2\u0226\u0227\7-\2\2\u0227\u0228\7-\2\2\u0228T\3\2\2\2\u0229\u022a"+
		"\7/\2\2\u022a\u022b\7/\2\2\u022bV\3\2\2\2\u022c\u022d\7,\2\2\u022dX\3"+
		"\2\2\2\u022e\u022f\7\61\2\2\u022fZ\3\2\2\2\u0230\u0231\7/\2\2\u0231\\"+
		"\3\2\2\2\u0232\u0233\7\'\2\2\u0233^\3\2\2\2\u0234\u0235\7-\2\2\u0235`"+
		"\3\2\2\2\u0236\u0238\5\u00b7X\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2\2"+
		"\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023ab\3\2\2\2\u023b\u023c"+
		"\7v\2\2\u023c\u023d\7t\2\2\u023d\u023e\7w\2\2\u023e\u0245\7g\2\2\u023f"+
		"\u0240\7h\2\2\u0240\u0241\7c\2\2\u0241\u0242\7n\2\2\u0242\u0243\7u\2\2"+
		"\u0243\u0245\7g\2\2\u0244\u023b\3\2\2\2\u0244\u023f\3\2\2\2\u0245d\3\2"+
		"\2\2\u0246\u0247\7k\2\2\u0247\u0248\7p\2\2\u0248f\3\2\2\2\u0249\u024a"+
		"\7k\2\2\u024a\u024b\7p\2\2\u024b\u024c\7f\2\2\u024c\u024d\7g\2\2\u024d"+
		"\u024e\7z\2\2\u024eh\3\2\2\2\u024f\u0250\7?\2\2\u0250j\3\2\2\2\u0251\u0252"+
		"\7*\2\2\u0252l\3\2\2\2\u0253\u0254\7+\2\2\u0254n\3\2\2\2\u0255\u0256\7"+
		"]\2\2\u0256p\3\2\2\2\u0257\u0258\7_\2\2\u0258r\3\2\2\2\u0259\u025a\7}"+
		"\2\2\u025at\3\2\2\2\u025b\u025c\7\177\2\2\u025cv\3\2\2\2\u025d\u025e\7"+
		">\2\2\u025ex\3\2\2\2\u025f\u0260\7@\2\2\u0260z\3\2\2\2\u0261\u0262\7?"+
		"\2\2\u0262\u0263\7?\2\2\u0263|\3\2\2\2\u0264\u0265\7#\2\2\u0265\u0266"+
		"\7?\2\2\u0266~\3\2\2\2\u0267\u0268\7@\2\2\u0268\u0269\7?\2\2\u0269\u0080"+
		"\3\2\2\2\u026a\u026b\7>\2\2\u026b\u026c\7?\2\2\u026c\u0082\3\2\2\2\u026d"+
		"\u026e\7~\2\2\u026e\u0084\3\2\2\2\u026f\u0270\7.\2\2\u0270\u0086\3\2\2"+
		"\2\u0271\u0272\7\60\2\2\u0272\u0088\3\2\2\2\u0273\u0274\7=\2\2\u0274\u008a"+
		"\3\2\2\2\u0275\u0276\7(\2\2\u0276\u0277\7(\2\2\u0277\u008c\3\2\2\2\u0278"+
		"\u0279\7~\2\2\u0279\u027a\7~\2\2\u027a\u008e\3\2\2\2\u027b\u027c\7#\2"+
		"\2\u027c\u0090\3\2\2\2\u027d\u027e\7A\2\2\u027e\u0092\3\2\2\2\u027f\u0280"+
		"\7<\2\2\u0280\u0094\3\2\2\2\u0281\u0284\5\u00c3^\2\u0282\u0284\5\u00c5"+
		"_\2\u0283\u0281\3\2\2\2\u0283\u0282\3\2\2\2\u0284\u028a\3\2\2\2\u0285"+
		"\u0289\5\u00c3^\2\u0286\u0289\5\u00b7X\2\u0287\u0289\5\u00c5_\2\u0288"+
		"\u0285\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0287\3\2\2\2\u0289\u028c\3\2"+
		"\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0096\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028d\u028e\5\u00bd[\2\u028e\u028f\3\2\2\2\u028f\u0290"+
		"\bH\24\2\u0290\u0098\3\2\2\2\u0291\u0292\7$\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0294\bI\31\2\u0294\u0295\bI\7\2\u0295\u009a\3\2\2\2\u0296\u0298\n\4"+
		"\2\2\u0297\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u009c\3\2\2\2\u029b\u029c\7)\2\2\u029c\u029d\3\2"+
		"\2\2\u029d\u029e\bK\32\2\u029e\u029f\bK\7\2\u029f\u009e\3\2\2\2\u02a0"+
		"\u02a2\n\5\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a1\3\2"+
		"\2\2\u02a3\u02a4\3\2\2\2\u02a4\u00a0\3\2\2\2\u02a5\u02a7\13\2\2\2\u02a6"+
		"\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a8\u02a6\3\2"+
		"\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ac\7>\2\2\u02ac"+
		"\u02ad\7\61\2\2\u02ad\u02ae\7u\2\2\u02ae\u02af\7e\2\2\u02af\u02b0\7t\2"+
		"\2\u02b0\u02b1\7k\2\2\u02b1\u02b2\7r\2\2\u02b2\u02b3\7v\2\2\u02b3\u02b4"+
		"\7@\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\bM\7\2\u02b6\u00a2\3\2\2\2\u02b7"+
		"\u02b9\13\2\2\2\u02b8\u02b7\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02bb\3"+
		"\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd"+
		"\u02be\7>\2\2\u02be\u02bf\7\61\2\2\u02bf\u02c0\7@\2\2\u02c0\u02c1\3\2"+
		"\2\2\u02c1\u02c2\bN\7\2\u02c2\u00a4\3\2\2\2\u02c3\u02c5\13\2\2\2\u02c4"+
		"\u02c3\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c6\u02c4\3\2"+
		"\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ca\7>\2\2\u02ca"+
		"\u02cb\7\61\2\2\u02cb\u02cc\7u\2\2\u02cc\u02cd\7v\2\2\u02cd\u02ce\7{\2"+
		"\2\u02ce\u02cf\7n\2\2\u02cf\u02d0\7g\2\2\u02d0\u02d1\7@\2\2\u02d1\u02d2"+
		"\3\2\2\2\u02d2\u02d3\bO\7\2\u02d3\u00a6\3\2\2\2\u02d4\u02d6\13\2\2\2\u02d5"+
		"\u02d4\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d7\u02d5\3\2"+
		"\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\7>\2\2\u02db"+
		"\u02dc\7\61\2\2\u02dc\u02dd\7@\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\bP"+
		"\7\2\u02df\u00a8\3\2\2\2\u02e0\u02e2\5\u00abR\2\u02e1\u02e0\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\3\2"+
		"\2\2\u02e5\u02e7\7\"\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u00aa\3\2\2\2\u02e8\u02ea\t\6\2\2\u02e9\u02e8\3\2\2\2\u02ea\u00ac\3\2"+
		"\2\2\u02eb\u02ed\7%\2\2\u02ec\u02ee\t\7\2\2\u02ed\u02ec\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u00ae\3\2"+
		"\2\2\u02f1\u02f3\t\b\2\2\u02f2\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f8\7\'"+
		"\2\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u00b0\3\2\2\2\u02f9"+
		"\u02fd\7$\2\2\u02fa\u02fc\n\t\2\2\u02fb\u02fa\3\2\2\2\u02fc\u02ff\3\2"+
		"\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0300\3\2\2\2\u02ff"+
		"\u02fd\3\2\2\2\u0300\u0301\7$\2\2\u0301\u00b2\3\2\2\2\u0302\u0306\7)\2"+
		"\2\u0303\u0305\n\n\2\2\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304"+
		"\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u0306\3\2\2\2\u0309"+
		"\u030a\7)\2\2\u030a\u00b4\3\2\2\2\u030b\u030c\t\7\2\2\u030c\u00b6\3\2"+
		"\2\2\u030d\u030e\t\b\2\2\u030e\u00b8\3\2\2\2\u030f\u0314\5\u00bbZ\2\u0310"+
		"\u0314\t\13\2\2\u0311\u0314\5\u00b7X\2\u0312\u0314\t\f\2\2\u0313\u030f"+
		"\3\2\2\2\u0313\u0310\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0312\3\2\2\2\u0314"+
		"\u00ba\3\2\2\2\u0315\u0317\t\r\2\2\u0316\u0315\3\2\2\2\u0317\u00bc\3\2"+
		"\2\2\u0318\u0319\t\16\2\2\u0319\u00be\3\2\2\2\u031a\u0320\5\u00b1U\2\u031b"+
		"\u0320\5\u00b3V\2\u031c\u0320\5\u00a9Q\2\u031d\u0320\5\u00adS\2\u031e"+
		"\u0320\5\u00afT\2\u031f\u031a\3\2\2\2\u031f\u031b\3\2\2\2\u031f\u031c"+
		"\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u031e\3\2\2\2\u0320\u00c0\3\2\2\2\u0321"+
		"\u0322\7e\2\2\u0322\u0323\7n\2\2\u0323\u0324\7k\2\2\u0324\u0325\7e\2\2"+
		"\u0325\u0371\7m\2\2\u0326\u0327\7o\2\2\u0327\u0328\7q\2\2\u0328\u0329"+
		"\7w\2\2\u0329\u032a\7u\2\2\u032a\u032b\7g\2\2\u032b\u032c\7q\2\2\u032c"+
		"\u032d\7x\2\2\u032d\u032e\7g\2\2\u032e\u0371\7t\2\2\u032f\u0330\7o\2\2"+
		"\u0330\u0331\7q\2\2\u0331\u0332\7w\2\2\u0332\u0333\7u\2\2\u0333\u0334"+
		"\7g\2\2\u0334\u0335\7k\2\2\u0335\u0371\7p\2\2\u0336\u0337\7o\2\2\u0337"+
		"\u0338\7q\2\2\u0338\u0339\7w\2\2\u0339\u033a\7u\2\2\u033a\u033b\7g\2\2"+
		"\u033b\u033c\7q\2\2\u033c\u033d\7w\2\2\u033d\u0371\7v\2\2\u033e\u033f"+
		"\7h\2\2\u033f\u0340\7q\2\2\u0340\u0341\7e\2\2\u0341\u0342\7w\2\2\u0342"+
		"\u0371\7u\2\2\u0343\u0344\7w\2\2\u0344\u0345\7p\2\2\u0345\u0346\7h\2\2"+
		"\u0346\u0347\7q\2\2\u0347\u0348\7e\2\2\u0348\u0349\7w\2\2\u0349\u0371"+
		"\7u\2\2\u034a\u034b\7u\2\2\u034b\u034c\7w\2\2\u034c\u034d\7d\2\2\u034d"+
		"\u034e\7o\2\2\u034e\u034f\7k\2\2\u034f\u0371\7v\2\2\u0350\u0351\7o\2\2"+
		"\u0351\u0352\7q\2\2\u0352\u0353\7w\2\2\u0353\u0354\7u\2\2\u0354\u0355"+
		"\7g\2\2\u0355\u0356\7r\2\2\u0356\u0357\7t\2\2\u0357\u0358\7g\2\2\u0358"+
		"\u0359\7u\2\2\u0359\u0371\7u\2\2\u035a\u035b\7o\2\2\u035b\u035c\7q\2\2"+
		"\u035c\u035d\7w\2\2\u035d\u035e\7u\2\2\u035e\u035f\7g\2\2\u035f\u0360"+
		"\7f\2\2\u0360\u0361\7q\2\2\u0361\u0362\7y\2\2\u0362\u0371\7p\2\2\u0363"+
		"\u0364\7o\2\2\u0364\u0365\7q\2\2\u0365\u0366\7w\2\2\u0366\u0367\7u\2\2"+
		"\u0367\u0368\7g\2\2\u0368\u0369\7w\2\2\u0369\u0371\7r\2\2\u036a\u036b"+
		"\7e\2\2\u036b\u036c\7j\2\2\u036c\u036d\7c\2\2\u036d\u036e\7p\2\2\u036e"+
		"\u036f\7i\2\2\u036f\u0371\7g\2\2\u0370\u0321\3\2\2\2\u0370\u0326\3\2\2"+
		"\2\u0370\u032f\3\2\2\2\u0370\u0336\3\2\2\2\u0370\u033e\3\2\2\2\u0370\u0343"+
		"\3\2\2\2\u0370\u034a\3\2\2\2\u0370\u0350\3\2\2\2\u0370\u035a\3\2\2\2\u0370"+
		"\u0363\3\2\2\2\u0370\u036a\3\2\2\2\u0371\u00c2\3\2\2\2\u0372\u0373\t\17"+
		"\2\2\u0373\u00c4\3\2\2\2\u0374\u0375\7a\2\2\u0375\u00c6\3\2\2\2\66\2\3"+
		"\4\5\6\7\b\t\n\u00cf\u00dd\u00ec\u00fe\u010b\u0116\u0121\u0126\u012a\u012d"+
		"\u012f\u013c\u014d\u0158\u0163\u016c\u0175\u017c\u0189\u0201\u0239\u0244"+
		"\u0283\u0288\u028a\u0299\u02a3\u02a8\u02ba\u02c6\u02d7\u02e3\u02e6\u02e9"+
		"\u02ef\u02f4\u02f7\u02fd\u0306\u0313\u0316\u031f\u0370\33\7\t\2\7\n\2"+
		"\7\3\2\3\r\2\4\4\2\6\2\2\3\22\3\3\23\4\3\24\5\3\25\6\3\26\7\3\27\b\3\30"+
		"\t\3\31\n\3\32\13\3\33\f\3\34\r\3\35\16\2\3\2\3!\17\3\"\20\3$\21\3%\22"+
		"\t%\2\t&\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}