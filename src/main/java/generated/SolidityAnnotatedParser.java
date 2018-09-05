// Generated from SolidityAnnotated.g4 by ANTLR 4.7
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityAnnotatedParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, AnnotationStart=94, 
		AnnotationKind=95, LINE_COMMENT=96, WS=97, Int=98, Uint=99, Byte=100, 
		Fixed=101, Ufixed=102, VersionLiteral=103, BooleanLiteral=104, DecimalNumber=105, 
		HexNumber=106, NumberUnit=107, HexLiteral=108, ReservedKeyword=109, AnonymousKeyword=110, 
		BreakKeyword=111, ConstantKeyword=112, ContinueKeyword=113, ExternalKeyword=114, 
		IndexedKeyword=115, InternalKeyword=116, PayableKeyword=117, PrivateKeyword=118, 
		PublicKeyword=119, PureKeyword=120, ViewKeyword=121, Identifier=122, StringLiteral=123, 
		COMMENT=124;
	public static final int
		RULE_contractPart = 0, RULE_annotationDefinition = 1, RULE_annotationExpression = 2, 
		RULE_primaryAnnotationExpression = 3, RULE_booleanOp = 4, RULE_compareOp = 5, 
		RULE_integerOpBoolean = 6, RULE_integerOpInteger = 7, RULE_sourceUnit = 8, 
		RULE_pragmaDirective = 9, RULE_pragmaName = 10, RULE_pragmaValue = 11, 
		RULE_version = 12, RULE_versionOperator = 13, RULE_versionConstraint = 14, 
		RULE_importDeclaration = 15, RULE_importDirective = 16, RULE_contractDefinition = 17, 
		RULE_inheritanceSpecifier = 18, RULE_stateVariableDeclaration = 19, RULE_usingForDeclaration = 20, 
		RULE_structDefinition = 21, RULE_constructorDefinition = 22, RULE_modifierDefinition = 23, 
		RULE_modifierInvocation = 24, RULE_functionDefinition = 25, RULE_returnParameters = 26, 
		RULE_modifierList = 27, RULE_eventDefinition = 28, RULE_enumValue = 29, 
		RULE_enumDefinition = 30, RULE_parameterList = 31, RULE_parameter = 32, 
		RULE_eventParameterList = 33, RULE_eventParameter = 34, RULE_functionTypeParameterList = 35, 
		RULE_functionTypeParameter = 36, RULE_variableDeclaration = 37, RULE_typeName = 38, 
		RULE_userDefinedTypeName = 39, RULE_mapping = 40, RULE_functionTypeName = 41, 
		RULE_storageLocation = 42, RULE_stateMutability = 43, RULE_block = 44, 
		RULE_statement = 45, RULE_expressionStatement = 46, RULE_ifStatement = 47, 
		RULE_whileStatement = 48, RULE_simpleStatement = 49, RULE_forStatement = 50, 
		RULE_inlineAssemblyStatement = 51, RULE_doWhileStatement = 52, RULE_continueStatement = 53, 
		RULE_breakStatement = 54, RULE_returnStatement = 55, RULE_throwStatement = 56, 
		RULE_emitStatement = 57, RULE_variableDeclarationStatement = 58, RULE_identifierList = 59, 
		RULE_elementaryTypeName = 60, RULE_expression = 61, RULE_primaryExpression = 62, 
		RULE_expressionList = 63, RULE_nameValueList = 64, RULE_nameValue = 65, 
		RULE_functionCallArguments = 66, RULE_functionCall = 67, RULE_assemblyBlock = 68, 
		RULE_assemblyItem = 69, RULE_assemblyExpression = 70, RULE_assemblyCall = 71, 
		RULE_assemblyLocalDefinition = 72, RULE_assemblyAssignment = 73, RULE_assemblyIdentifierOrList = 74, 
		RULE_assemblyIdentifierList = 75, RULE_assemblyStackAssignment = 76, RULE_labelDefinition = 77, 
		RULE_assemblySwitch = 78, RULE_assemblyCase = 79, RULE_assemblyFunctionDefinition = 80, 
		RULE_assemblyFunctionReturns = 81, RULE_assemblyFor = 82, RULE_assemblyIf = 83, 
		RULE_assemblyLiteral = 84, RULE_subAssembly = 85, RULE_tupleExpression = 86, 
		RULE_elementaryTypeNameExpression = 87, RULE_numberLiteral = 88, RULE_identifier = 89;
	public static final String[] ruleNames = {
		"contractPart", "annotationDefinition", "annotationExpression", "primaryAnnotationExpression", 
		"booleanOp", "compareOp", "integerOpBoolean", "integerOpInteger", "sourceUnit", 
		"pragmaDirective", "pragmaName", "pragmaValue", "version", "versionOperator", 
		"versionConstraint", "importDeclaration", "importDirective", "contractDefinition", 
		"inheritanceSpecifier", "stateVariableDeclaration", "usingForDeclaration", 
		"structDefinition", "constructorDefinition", "modifierDefinition", "modifierInvocation", 
		"functionDefinition", "returnParameters", "modifierList", "eventDefinition", 
		"enumValue", "enumDefinition", "parameterList", "parameter", "eventParameterList", 
		"eventParameter", "functionTypeParameterList", "functionTypeParameter", 
		"variableDeclaration", "typeName", "userDefinedTypeName", "mapping", "functionTypeName", 
		"storageLocation", "stateMutability", "block", "statement", "expressionStatement", 
		"ifStatement", "whileStatement", "simpleStatement", "forStatement", "inlineAssemblyStatement", 
		"doWhileStatement", "continueStatement", "breakStatement", "returnStatement", 
		"throwStatement", "emitStatement", "variableDeclarationStatement", "identifierList", 
		"elementaryTypeName", "expression", "primaryExpression", "expressionList", 
		"nameValueList", "nameValue", "functionCallArguments", "functionCall", 
		"assemblyBlock", "assemblyItem", "assemblyExpression", "assemblyCall", 
		"assemblyLocalDefinition", "assemblyAssignment", "assemblyIdentifierOrList", 
		"assemblyIdentifierList", "assemblyStackAssignment", "labelDefinition", 
		"assemblySwitch", "assemblyCase", "assemblyFunctionDefinition", "assemblyFunctionReturns", 
		"assemblyFor", "assemblyIf", "assemblyLiteral", "subAssembly", "tupleExpression", 
		"elementaryTypeNameExpression", "numberLiteral", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'!'", "'\\forall'", "'\\exists'", "'in'", "':'", 
		"'.'", "'['", "']'", "'\\old'", "'&&'", "'||'", "'->'", "'=='", "'!='", 
		"'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'pragma'", "';'", "'^'", 
		"'~'", "'='", "'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", 
		"'contract'", "'interface'", "'library'", "'is'", "'using'", "'for'", 
		"'struct'", "'constructor'", "'modifier'", "'function'", "'returns'", 
		"'event'", "'enum'", "'mapping'", "'=>'", "'memory'", "'storage'", "'if'", 
		"'else'", "'while'", "'assembly'", "'do'", "'return'", "'throw'", "'emit'", 
		"'var'", "'address'", "'bool'", "'string'", "'byte'", "'++'", "'--'", 
		"'new'", "'after'", "'delete'", "'**'", "'/'", "'%'", "'<<'", "'>>'", 
		"'&'", "'|'", "'?'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'let'", "':='", "'=:'", "'switch'", "'case'", 
		"'default'", "'//@'", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'anonymous'", "'break'", "'constant'", 
		"'continue'", "'external'", "'indexed'", "'internal'", "'payable'", "'private'", 
		"'public'", "'pure'", "'view'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "AnnotationStart", 
		"AnnotationKind", "LINE_COMMENT", "WS", "Int", "Uint", "Byte", "Fixed", 
		"Ufixed", "VersionLiteral", "BooleanLiteral", "DecimalNumber", "HexNumber", 
		"NumberUnit", "HexLiteral", "ReservedKeyword", "AnonymousKeyword", "BreakKeyword", 
		"ConstantKeyword", "ContinueKeyword", "ExternalKeyword", "IndexedKeyword", 
		"InternalKeyword", "PayableKeyword", "PrivateKeyword", "PublicKeyword", 
		"PureKeyword", "ViewKeyword", "Identifier", "StringLiteral", "COMMENT"
	};
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

	@Override
	public String getGrammarFileName() { return "SolidityAnnotated.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityAnnotatedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ContractPartContext extends ParserRuleContext {
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public AnnotationDefinitionContext annotationDefinition() {
			return getRuleContext(AnnotationDefinitionContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterContractPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitContractPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitContractPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_contractPart);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(186);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(187);
				enumDefinition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				annotationDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationDefinitionContext extends ParserRuleContext {
		public TerminalNode AnnotationStart() { return getToken(SolidityAnnotatedParser.AnnotationStart, 0); }
		public TerminalNode AnnotationKind() { return getToken(SolidityAnnotatedParser.AnnotationKind, 0); }
		public AnnotationExpressionContext annotationExpression() {
			return getRuleContext(AnnotationExpressionContext.class,0);
		}
		public AnnotationDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAnnotationDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAnnotationDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAnnotationDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationDefinitionContext annotationDefinition() throws RecognitionException {
		AnnotationDefinitionContext _localctx = new AnnotationDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_annotationDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(AnnotationStart);
			setState(192);
			match(AnnotationKind);
			setState(193);
			annotationExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationExpressionContext extends ParserRuleContext {
		public List<AnnotationExpressionContext> annotationExpression() {
			return getRuleContexts(AnnotationExpressionContext.class);
		}
		public AnnotationExpressionContext annotationExpression(int i) {
			return getRuleContext(AnnotationExpressionContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PrimaryAnnotationExpressionContext primaryAnnotationExpression() {
			return getRuleContext(PrimaryAnnotationExpressionContext.class,0);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public BooleanOpContext booleanOp() {
			return getRuleContext(BooleanOpContext.class,0);
		}
		public IntegerOpBooleanContext integerOpBoolean() {
			return getRuleContext(IntegerOpBooleanContext.class,0);
		}
		public IntegerOpIntegerContext integerOpInteger() {
			return getRuleContext(IntegerOpIntegerContext.class,0);
		}
		public AnnotationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAnnotationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAnnotationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAnnotationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationExpressionContext annotationExpression() throws RecognitionException {
		return annotationExpression(0);
	}

	private AnnotationExpressionContext annotationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AnnotationExpressionContext _localctx = new AnnotationExpressionContext(_ctx, _parentState);
		AnnotationExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_annotationExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(196);
				match(T__0);
				setState(197);
				annotationExpression(0);
				setState(198);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(200);
				match(T__2);
				setState(201);
				annotationExpression(3);
				}
				break;
			case 3:
				{
				setState(202);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(203);
				match(T__0);
				setState(204);
				identifier();
				setState(205);
				match(T__5);
				setState(206);
				identifier();
				setState(207);
				match(T__6);
				setState(208);
				annotationExpression(0);
				setState(209);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(211);
				primaryAnnotationExpression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(214);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(215);
						compareOp();
						setState(216);
						annotationExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(218);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(219);
						booleanOp();
						setState(220);
						annotationExpression(7);
						}
						break;
					case 3:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(222);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(223);
						integerOpBoolean();
						setState(224);
						annotationExpression(6);
						}
						break;
					case 4:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(226);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(227);
						integerOpInteger();
						setState(228);
						annotationExpression(5);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryAnnotationExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimaryAnnotationExpressionContext primaryAnnotationExpression() {
			return getRuleContext(PrimaryAnnotationExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrimaryAnnotationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryAnnotationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterPrimaryAnnotationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitPrimaryAnnotationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitPrimaryAnnotationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryAnnotationExpressionContext primaryAnnotationExpression() throws RecognitionException {
		return primaryAnnotationExpression(0);
	}

	private PrimaryAnnotationExpressionContext primaryAnnotationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryAnnotationExpressionContext _localctx = new PrimaryAnnotationExpressionContext(_ctx, _parentState);
		PrimaryAnnotationExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_primaryAnnotationExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__8:
			case T__30:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(236);
				primaryExpression();
				}
				break;
			case T__10:
				{
				setState(237);
				match(T__10);
				setState(238);
				match(T__0);
				setState(239);
				primaryAnnotationExpression(0);
				setState(240);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryAnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryAnnotationExpression);
						setState(244);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(245);
						match(T__7);
						setState(246);
						identifier();
						}
						break;
					case 2:
						{
						_localctx = new PrimaryAnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryAnnotationExpression);
						setState(247);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(248);
						match(T__8);
						setState(249);
						primaryExpression();
						setState(250);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BooleanOpContext extends ParserRuleContext {
		public BooleanOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterBooleanOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitBooleanOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitBooleanOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOpContext booleanOp() throws RecognitionException {
		BooleanOpContext _localctx = new BooleanOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_booleanOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareOpContext extends ParserRuleContext {
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitCompareOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerOpBooleanContext extends ParserRuleContext {
		public IntegerOpBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerOpBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterIntegerOpBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitIntegerOpBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitIntegerOpBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerOpBooleanContext integerOpBoolean() throws RecognitionException {
		IntegerOpBooleanContext _localctx = new IntegerOpBooleanContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integerOpBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerOpIntegerContext extends ParserRuleContext {
		public IntegerOpIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerOpInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterIntegerOpInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitIntegerOpInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitIntegerOpInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerOpIntegerContext integerOpInteger() throws RecognitionException {
		IntegerOpIntegerContext _localctx = new IntegerOpIntegerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integerOpInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityAnnotatedParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitSourceUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitSourceUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__28) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(268);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(265);
					pragmaDirective();
					}
					break;
				case T__28:
					{
					setState(266);
					importDirective();
					}
					break;
				case T__34:
				case T__35:
				case T__36:
					{
					setState(267);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaValueContext pragmaValue() {
			return getRuleContext(PragmaValueContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitPragmaDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitPragmaDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__22);
			setState(276);
			pragmaName();
			setState(277);
			pragmaValue();
			setState(278);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterPragmaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitPragmaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitPragmaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaValueContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PragmaValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterPragmaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitPragmaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitPragmaValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaValueContext pragmaValue() throws RecognitionException {
		PragmaValueContext _localctx = new PragmaValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pragmaValue);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionContext extends ParserRuleContext {
		public List<VersionConstraintContext> versionConstraint() {
			return getRuleContexts(VersionConstraintContext.class);
		}
		public VersionConstraintContext versionConstraint(int i) {
			return getRuleContext(VersionConstraintContext.class,i);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			versionConstraint();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0) || _la==VersionLiteral) {
				{
				setState(287);
				versionConstraint();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionOperatorContext extends ParserRuleContext {
		public VersionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterVersionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitVersionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitVersionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityAnnotatedParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterVersionConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitVersionConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitVersionConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_versionConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) {
				{
				setState(292);
				versionOperator();
				}
			}

			setState(295);
			match(VersionLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			identifier();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(298);
				match(T__27);
				setState(299);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDirectiveContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityAnnotatedParser.StringLiteral, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitImportDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitImportDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_importDirective);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T__28);
				setState(303);
				match(StringLiteral);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(304);
					match(T__27);
					setState(305);
					identifier();
					}
				}

				setState(308);
				match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(T__28);
				setState(312);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(310);
					match(T__29);
					}
					break;
				case T__30:
				case Identifier:
					{
					setState(311);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(314);
					match(T__27);
					setState(315);
					identifier();
					}
				}

				setState(318);
				match(T__30);
				setState(319);
				match(StringLiteral);
				setState(320);
				match(T__23);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(T__28);
				setState(322);
				match(T__31);
				setState(323);
				importDeclaration();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(324);
					match(T__32);
					setState(325);
					importDeclaration();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331);
				match(T__33);
				setState(332);
				match(T__30);
				setState(333);
				match(StringLiteral);
				setState(334);
				match(T__23);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitContractDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitContractDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(339);
			identifier();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(340);
				match(T__37);
				setState(341);
				inheritanceSpecifier();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(342);
					match(T__32);
					setState(343);
					inheritanceSpecifier();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(351);
			match(T__31);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (AnnotationStart - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(352);
				contractPart();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(T__33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitInheritanceSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitInheritanceSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			userDefinedTypeName();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(361);
				match(T__0);
				setState(362);
				expression(0);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(363);
					match(T__32);
					setState(364);
					expression(0);
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityAnnotatedParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityAnnotatedParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityAnnotatedParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityAnnotatedParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityAnnotatedParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityAnnotatedParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityAnnotatedParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityAnnotatedParser.ConstantKeyword, i);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitStateVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitStateVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			typeName(0);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (ConstantKeyword - 112)) | (1L << (InternalKeyword - 112)) | (1L << (PrivateKeyword - 112)) | (1L << (PublicKeyword - 112)))) != 0)) {
				{
				{
				setState(375);
				_la = _input.LA(1);
				if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (ConstantKeyword - 112)) | (1L << (InternalKeyword - 112)) | (1L << (PrivateKeyword - 112)) | (1L << (PublicKeyword - 112)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
			identifier();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(382);
				match(T__26);
				setState(383);
				expression(0);
				}
			}

			setState(386);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingForDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitUsingForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitUsingForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(T__38);
			setState(389);
			identifier();
			setState(390);
			match(T__39);
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				{
				setState(391);
				match(T__29);
				}
				break;
			case T__30:
			case T__43:
			case T__47:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(392);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(395);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__40);
			setState(398);
			identifier();
			setState(399);
			match(T__31);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__43) | (1L << T__47) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(400);
				variableDeclaration();
				setState(401);
				match(T__23);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__43) | (1L << T__47) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					{
					setState(402);
					variableDeclaration();
					setState(403);
					match(T__23);
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(412);
			match(T__33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterConstructorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitConstructorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitConstructorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__41);
			setState(415);
			parameterList();
			setState(416);
			modifierList();
			setState(417);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitModifierDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitModifierDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__42);
			setState(420);
			identifier();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(421);
				parameterList();
				}
			}

			setState(424);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitModifierInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitModifierInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			identifier();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(427);
				match(T__0);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__30) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(428);
					expressionList();
					}
				}

				setState(431);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__43);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==Identifier) {
				{
				setState(435);
				identifier();
				}
			}

			setState(438);
			parameterList();
			setState(439);
			modifierList();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(440);
				returnParameters();
				}
			}

			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(443);
				match(T__23);
				}
				break;
			case T__31:
				{
				setState(444);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterReturnParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitReturnParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitReturnParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__44);
			setState(448);
			parameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierListContext extends ParserRuleContext {
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityAnnotatedParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityAnnotatedParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityAnnotatedParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityAnnotatedParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityAnnotatedParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityAnnotatedParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityAnnotatedParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityAnnotatedParser.PrivateKeyword, i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30 || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (ConstantKeyword - 112)) | (1L << (ExternalKeyword - 112)) | (1L << (InternalKeyword - 112)) | (1L << (PayableKeyword - 112)) | (1L << (PrivateKeyword - 112)) | (1L << (PublicKeyword - 112)) | (1L << (PureKeyword - 112)) | (1L << (ViewKeyword - 112)) | (1L << (Identifier - 112)))) != 0)) {
				{
				setState(456);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__30:
				case Identifier:
					{
					setState(450);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(451);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(452);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(453);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(454);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(455);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityAnnotatedParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitEventDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitEventDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__45);
			setState(462);
			identifier();
			setState(463);
			eventParameterList();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(464);
				match(AnonymousKeyword);
				}
			}

			setState(467);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitEnumDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitEnumDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__46);
			setState(472);
			identifier();
			setState(473);
			match(T__31);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==Identifier) {
				{
				setState(474);
				enumValue();
				}
			}

			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(477);
				match(T__32);
				setState(478);
				enumValue();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
			match(T__33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__0);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__43) | (1L << T__47) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(487);
				parameter();
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(488);
					match(T__32);
					setState(489);
					parameter();
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(497);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			typeName(0);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__49 || _la==T__50) {
				{
				setState(500);
				storageLocation();
				}
			}

			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==Identifier) {
				{
				setState(503);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterEventParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitEventParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitEventParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(T__0);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__43) | (1L << T__47) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(507);
				eventParameter();
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(508);
					match(T__32);
					setState(509);
					eventParameter();
					}
					}
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(517);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityAnnotatedParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitEventParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitEventParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			typeName(0);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(520);
				match(IndexedKeyword);
				}
			}

			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==Identifier) {
				{
				setState(523);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeParameterListContext extends ParserRuleContext {
		public List<FunctionTypeParameterContext> functionTypeParameter() {
			return getRuleContexts(FunctionTypeParameterContext.class);
		}
		public FunctionTypeParameterContext functionTypeParameter(int i) {
			return getRuleContext(FunctionTypeParameterContext.class,i);
		}
		public FunctionTypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterFunctionTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitFunctionTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitFunctionTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(T__0);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__43) | (1L << T__47) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(527);
				functionTypeParameter();
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(528);
					match(T__32);
					setState(529);
					functionTypeParameter();
					}
					}
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(537);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public FunctionTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterFunctionTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitFunctionTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitFunctionTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			typeName(0);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__49 || _la==T__50) {
				{
				setState(540);
				storageLocation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			typeName(0);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__49 || _la==T__50) {
				{
				setState(544);
				storageLocation();
				}
			}

			setState(547);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				{
				setState(550);
				elementaryTypeName();
				}
				break;
			case T__30:
			case Identifier:
				{
				setState(551);
				userDefinedTypeName();
				}
				break;
			case T__47:
				{
				setState(552);
				mapping();
				}
				break;
			case T__43:
				{
				setState(553);
				functionTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(556);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(557);
					match(T__8);
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__30) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
						{
						setState(558);
						expression(0);
						}
					}

					setState(561);
					match(T__9);
					}
					} 
				}
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterUserDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitUserDefinedTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitUserDefinedTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			identifier();
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(568);
					match(T__7);
					setState(569);
					identifier();
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitMapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitMapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(T__47);
			setState(576);
			match(T__0);
			setState(577);
			elementaryTypeName();
			setState(578);
			match(T__48);
			setState(579);
			typeName(0);
			setState(580);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityAnnotatedParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityAnnotatedParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityAnnotatedParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityAnnotatedParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitFunctionTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitFunctionTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(T__43);
			setState(583);
			functionTypeParameterList();
			setState(589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(587);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(584);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(585);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(586);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(592);
				match(T__44);
				setState(593);
				functionTypeParameterList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterStorageLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitStorageLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitStorageLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_la = _input.LA(1);
			if ( !(_la==T__49 || _la==T__50) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityAnnotatedParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityAnnotatedParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityAnnotatedParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityAnnotatedParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitStateMutability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitStateMutability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (ConstantKeyword - 112)) | (1L << (PayableKeyword - 112)) | (1L << (PureKeyword - 112)) | (1L << (ViewKeyword - 112)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(T__31);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__30) | (1L << T__31) | (1L << T__39) | (1L << T__43) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (BreakKeyword - 64)) | (1L << (ContinueKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(601);
				statement();
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			match(T__33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_statement);
		try {
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				ifStatement();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				whileStatement();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				forStatement();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(612);
				block();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 5);
				{
				setState(613);
				inlineAssemblyStatement();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 6);
				{
				setState(614);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(615);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(616);
				breakStatement();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 9);
				{
				setState(617);
				returnStatement();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 10);
				{
				setState(618);
				throwStatement();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 11);
				{
				setState(619);
				emitStatement();
				}
				break;
			case T__0:
			case T__2:
			case T__8:
			case T__20:
			case T__21:
			case T__25:
			case T__30:
			case T__43:
			case T__47:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 12);
				{
				setState(620);
				simpleStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			expression(0);
			setState(624);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__51);
			setState(627);
			match(T__0);
			setState(628);
			expression(0);
			setState(629);
			match(T__1);
			setState(630);
			statement();
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(631);
				match(T__52);
				setState(632);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(T__53);
			setState(636);
			match(T__0);
			setState(637);
			expression(0);
			setState(638);
			match(T__1);
			setState(639);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(641);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(642);
				expressionStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(T__39);
			setState(646);
			match(T__0);
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__8:
			case T__20:
			case T__21:
			case T__25:
			case T__30:
			case T__43:
			case T__47:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(647);
				simpleStatement();
				}
				break;
			case T__23:
				{
				setState(648);
				match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__30) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(651);
				expression(0);
				}
			}

			setState(654);
			match(T__23);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__30) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(655);
				expression(0);
				}
			}

			setState(658);
			match(T__1);
			setState(659);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityAnnotatedParser.StringLiteral, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterInlineAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitInlineAssemblyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitInlineAssemblyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(T__54);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(662);
				match(StringLiteral);
				}
			}

			setState(665);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(T__55);
			setState(668);
			statement();
			setState(669);
			match(T__53);
			setState(670);
			match(T__0);
			setState(671);
			expression(0);
			setState(672);
			match(T__1);
			setState(673);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(ContinueKeyword);
			setState(676);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(BreakKeyword);
			setState(679);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(T__56);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__30) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(682);
				expression(0);
				}
			}

			setState(685);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(T__57);
			setState(688);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitEmitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitEmitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(T__58);
			setState(691);
			functionCall();
			setState(692);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(694);
				match(T__59);
				setState(695);
				identifierList();
				}
				break;
			case 2:
				{
				setState(696);
				variableDeclaration();
				}
				break;
			}
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(699);
				match(T__26);
				setState(700);
				expression(0);
				}
			}

			setState(703);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(T__0);
			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__30 || _la==Identifier) {
						{
						setState(706);
						identifier();
						}
					}

					setState(709);
					match(T__32);
					}
					} 
				}
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==Identifier) {
				{
				setState(715);
				identifier();
				}
			}

			setState(718);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityAnnotatedParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityAnnotatedParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityAnnotatedParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityAnnotatedParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityAnnotatedParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitElementaryTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitElementaryTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__60 - 60)) | (1L << (T__61 - 60)) | (1L << (T__62 - 60)) | (1L << (T__63 - 60)) | (1L << (Int - 60)) | (1L << (Uint - 60)) | (1L << (Byte - 60)) | (1L << (Fixed - 60)) | (1L << (Ufixed - 60)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(723);
				match(T__66);
				setState(724);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(725);
				match(T__0);
				setState(726);
				expression(0);
				setState(727);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(729);
				_la = _input.LA(1);
				if ( !(_la==T__64 || _la==T__65) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(730);
				expression(19);
				}
				break;
			case 4:
				{
				setState(731);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(732);
				expression(18);
				}
				break;
			case 5:
				{
				setState(733);
				_la = _input.LA(1);
				if ( !(_la==T__67 || _la==T__68) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(734);
				expression(17);
				}
				break;
			case 6:
				{
				setState(735);
				match(T__2);
				setState(736);
				expression(16);
				}
				break;
			case 7:
				{
				setState(737);
				match(T__25);
				setState(738);
				expression(15);
				}
				break;
			case 8:
				{
				setState(739);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(801);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(799);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(742);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(743);
						match(T__69);
						setState(744);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(746);
						_la = _input.LA(1);
						if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (T__29 - 30)) | (1L << (T__70 - 30)) | (1L << (T__71 - 30)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(747);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(748);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(749);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(750);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(751);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(752);
						_la = _input.LA(1);
						if ( !(_la==T__72 || _la==T__73) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(753);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(754);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(755);
						match(T__74);
						setState(756);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(757);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(758);
						match(T__24);
						setState(759);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(760);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(761);
						match(T__75);
						setState(762);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(763);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(764);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(765);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(766);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(767);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(768);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(769);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(770);
						match(T__11);
						setState(771);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(772);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(773);
						match(T__12);
						setState(774);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(775);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(776);
						match(T__76);
						setState(777);
						expression(0);
						setState(778);
						match(T__6);
						setState(779);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(781);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(782);
						_la = _input.LA(1);
						if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__77 - 27)) | (1L << (T__78 - 27)) | (1L << (T__79 - 27)) | (1L << (T__80 - 27)) | (1L << (T__81 - 27)) | (1L << (T__82 - 27)) | (1L << (T__83 - 27)) | (1L << (T__84 - 27)) | (1L << (T__85 - 27)) | (1L << (T__86 - 27)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(783);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(784);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(785);
						_la = _input.LA(1);
						if ( !(_la==T__64 || _la==T__65) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(786);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(787);
						match(T__8);
						setState(788);
						expression(0);
						setState(789);
						match(T__9);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(791);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(792);
						match(T__0);
						setState(793);
						functionCallArguments();
						setState(794);
						match(T__1);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(796);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(797);
						match(T__7);
						setState(798);
						identifier();
						}
						break;
					}
					} 
				}
				setState(803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SolidityAnnotatedParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(SolidityAnnotatedParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityAnnotatedParser.StringLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public ElementaryTypeNameExpressionContext elementaryTypeNameExpression() {
			return getRuleContext(ElementaryTypeNameExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_primaryExpression);
		try {
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(BooleanLiteral);
				}
				break;
			case DecimalNumber:
			case HexNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				numberLiteral();
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				match(HexLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				match(StringLiteral);
				}
				break;
			case T__30:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(808);
				identifier();
				}
				break;
			case T__0:
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(809);
				tupleExpression();
				}
				break;
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 7);
				{
				setState(810);
				elementaryTypeNameExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			expression(0);
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(814);
				match(T__32);
				setState(815);
				expression(0);
				}
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterNameValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitNameValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitNameValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			nameValue();
			setState(826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(822);
					match(T__32);
					setState(823);
					nameValue();
					}
					} 
				}
				setState(828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(829);
				match(T__32);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			identifier();
			setState(833);
			match(T__6);
			setState(834);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_functionCallArguments);
		int _la;
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				match(T__31);
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__30 || _la==Identifier) {
					{
					setState(837);
					nameValueList();
					}
				}

				setState(840);
				match(T__33);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__8:
			case T__20:
			case T__21:
			case T__25:
			case T__30:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__30) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(841);
					expressionList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			expression(0);
			setState(847);
			match(T__0);
			setState(848);
			functionCallArguments();
			setState(849);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(T__31);
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << T__31) | (1L << T__39) | (1L << T__43) | (1L << T__51) | (1L << T__54) | (1L << T__56) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__87 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (BreakKeyword - 64)) | (1L << (ContinueKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(852);
				assemblyItem();
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(858);
			match(T__33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityAnnotatedParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SolidityAnnotatedParser.ContinueKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityAnnotatedParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityAnnotatedParser.HexLiteral, 0); }
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assemblyItem);
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(862);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(863);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(864);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(865);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(866);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(867);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(868);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(869);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(870);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(871);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(872);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(873);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(874);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(875);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(876);
				match(HexLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assemblyExpression);
		try {
			setState(881);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__56:
			case T__60:
			case T__63:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				assemblyLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__56:
				{
				setState(883);
				match(T__56);
				}
				break;
			case T__60:
				{
				setState(884);
				match(T__60);
				}
				break;
			case T__63:
				{
				setState(885);
				match(T__63);
				}
				break;
			case T__30:
			case Identifier:
				{
				setState(886);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(889);
				match(T__0);
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__56) | (1L << T__60))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(890);
					assemblyExpression();
					}
				}

				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(893);
					match(T__32);
					setState(894);
					assemblyExpression();
					}
					}
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(900);
				match(T__1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyLocalDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyLocalDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyLocalDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(T__87);
			setState(904);
			assemblyIdentifierOrList();
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__88) {
				{
				setState(905);
				match(T__88);
				setState(906);
				assemblyExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			assemblyIdentifierOrList();
			setState(910);
			match(T__88);
			setState(911);
			assemblyExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIdentifierOrListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyIdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierOrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyIdentifierOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyIdentifierOrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyIdentifierOrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assemblyIdentifierOrList);
		try {
			setState(918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(913);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(914);
				match(T__0);
				setState(915);
				assemblyIdentifierList();
				setState(916);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			identifier();
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(921);
				match(T__32);
				setState(922);
				identifier();
				}
				}
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyStackAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyStackAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyStackAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(T__89);
			setState(929);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			identifier();
			setState(932);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblySwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblySwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblySwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(T__90);
			setState(935);
			assemblyExpression();
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__91 || _la==T__92) {
				{
				{
				setState(936);
				assemblyCase();
				}
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assemblyCase);
		try {
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__91:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				match(T__91);
				setState(943);
				assemblyLiteral();
				setState(944);
				assemblyBlock();
				}
				break;
			case T__92:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				match(T__92);
				setState(947);
				assemblyBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(T__43);
			setState(951);
			identifier();
			setState(952);
			match(T__0);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==Identifier) {
				{
				setState(953);
				assemblyIdentifierList();
				}
			}

			setState(956);
			match(T__1);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(957);
				assemblyFunctionReturns();
				}
			}

			setState(960);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyFunctionReturns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyFunctionReturns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(962);
			match(T__13);
			setState(963);
			assemblyIdentifierList();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyForContext extends ParserRuleContext {
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(T__39);
			setState(968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				{
				setState(966);
				assemblyBlock();
				}
				break;
			case T__30:
			case T__56:
			case T__60:
			case T__63:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(967);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(970);
			assemblyExpression();
			setState(973);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				{
				setState(971);
				assemblyBlock();
				}
				break;
			case T__30:
			case T__56:
			case T__60:
			case T__63:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(972);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(975);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(T__51);
			setState(978);
			assemblyExpression();
			setState(979);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityAnnotatedParser.StringLiteral, 0); }
		public TerminalNode DecimalNumber() { return getToken(SolidityAnnotatedParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityAnnotatedParser.HexNumber, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityAnnotatedParser.HexLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterAssemblyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitAssemblyLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitAssemblyLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (DecimalNumber - 105)) | (1L << (HexNumber - 105)) | (1L << (HexLiteral - 105)) | (1L << (StringLiteral - 105)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubAssemblyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public SubAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAssembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterSubAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitSubAssembly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitSubAssembly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(T__54);
			setState(984);
			identifier();
			setState(985);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_tupleExpression);
		int _la;
		try {
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				match(T__0);
				{
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__30) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(988);
					expression(0);
					}
				}

				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(991);
					match(T__32);
					setState(993);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__30) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
						{
						setState(992);
						expression(0);
						}
					}

					}
					}
					setState(999);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1000);
				match(T__1);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				match(T__8);
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__30) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1002);
					expression(0);
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__32) {
						{
						{
						setState(1003);
						match(T__32);
						setState(1004);
						expression(0);
						}
						}
						setState(1009);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1012);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementaryTypeNameExpressionContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public ElementaryTypeNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeNameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterElementaryTypeNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitElementaryTypeNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitElementaryTypeNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementaryTypeNameExpressionContext elementaryTypeNameExpression() throws RecognitionException {
		ElementaryTypeNameExpressionContext _localctx = new ElementaryTypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_elementaryTypeNameExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			elementaryTypeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityAnnotatedParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityAnnotatedParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityAnnotatedParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1018);
				match(NumberUnit);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityAnnotatedParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityAnnotatedListener ) ((SolidityAnnotatedListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityAnnotatedVisitor ) return ((SolidityAnnotatedVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return annotationExpression_sempred((AnnotationExpressionContext)_localctx, predIndex);
		case 3:
			return primaryAnnotationExpression_sempred((PrimaryAnnotationExpressionContext)_localctx, predIndex);
		case 38:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 61:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean annotationExpression_sempred(AnnotationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean primaryAnnotationExpression_sempred(PrimaryAnnotationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 6);
		case 16:
			return precpred(_ctx, 5);
		case 17:
			return precpred(_ctx, 4);
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 25);
		case 21:
			return precpred(_ctx, 23);
		case 22:
			return precpred(_ctx, 22);
		case 23:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3~\u0402\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\u00c0\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d7\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00e9\n\4\f\4\16\4\u00ec"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f5\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5\u00ff\n\5\f\5\16\5\u0102\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\7\n\u010f\n\n\f\n\16\n\u0112\13\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\5\r\u011f\n\r\3\16\3\16\5\16\u0123\n\16"+
		"\3\17\3\17\3\20\5\20\u0128\n\20\3\20\3\20\3\21\3\21\3\21\5\21\u012f\n"+
		"\21\3\22\3\22\3\22\3\22\5\22\u0135\n\22\3\22\3\22\3\22\3\22\5\22\u013b"+
		"\n\22\3\22\3\22\5\22\u013f\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0149\n\22\f\22\16\22\u014c\13\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0153\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u015b\n\23\f\23\16\23\u015e"+
		"\13\23\5\23\u0160\n\23\3\23\3\23\7\23\u0164\n\23\f\23\16\23\u0167\13\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0170\n\24\f\24\16\24\u0173\13"+
		"\24\3\24\3\24\5\24\u0177\n\24\3\25\3\25\7\25\u017b\n\25\f\25\16\25\u017e"+
		"\13\25\3\25\3\25\3\25\5\25\u0183\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u018c\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u0198\n\27\f\27\16\27\u019b\13\27\5\27\u019d\n\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u01a9\n\31\3\31\3\31\3\32\3\32"+
		"\3\32\5\32\u01b0\n\32\3\32\5\32\u01b3\n\32\3\33\3\33\5\33\u01b7\n\33\3"+
		"\33\3\33\3\33\5\33\u01bc\n\33\3\33\3\33\5\33\u01c0\n\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01cb\n\35\f\35\16\35\u01ce\13\35"+
		"\3\36\3\36\3\36\3\36\5\36\u01d4\n\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \5"+
		" \u01de\n \3 \3 \7 \u01e2\n \f \16 \u01e5\13 \3 \3 \3!\3!\3!\3!\7!\u01ed"+
		"\n!\f!\16!\u01f0\13!\5!\u01f2\n!\3!\3!\3\"\3\"\5\"\u01f8\n\"\3\"\5\"\u01fb"+
		"\n\"\3#\3#\3#\3#\7#\u0201\n#\f#\16#\u0204\13#\5#\u0206\n#\3#\3#\3$\3$"+
		"\5$\u020c\n$\3$\5$\u020f\n$\3%\3%\3%\3%\7%\u0215\n%\f%\16%\u0218\13%\5"+
		"%\u021a\n%\3%\3%\3&\3&\5&\u0220\n&\3\'\3\'\5\'\u0224\n\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\5(\u022d\n(\3(\3(\3(\5(\u0232\n(\3(\7(\u0235\n(\f(\16(\u0238"+
		"\13(\3)\3)\3)\7)\u023d\n)\f)\16)\u0240\13)\3*\3*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\7+\u024e\n+\f+\16+\u0251\13+\3+\3+\5+\u0255\n+\3,\3,\3-\3-\3"+
		".\3.\7.\u025d\n.\f.\16.\u0260\13.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\5/\u0270\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5"+
		"\61\u027c\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\5\63\u0286\n\63"+
		"\3\64\3\64\3\64\3\64\5\64\u028c\n\64\3\64\5\64\u028f\n\64\3\64\3\64\5"+
		"\64\u0293\n\64\3\64\3\64\3\64\3\65\3\65\5\65\u029a\n\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\59\u02ae"+
		"\n9\39\39\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\5<\u02bc\n<\3<\3<\5<\u02c0\n<"+
		"\3<\3<\3=\3=\5=\u02c6\n=\3=\7=\u02c9\n=\f=\16=\u02cc\13=\3=\5=\u02cf\n"+
		"=\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5"+
		"?\u02e7\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u0322\n?\f?\16?\u0325\13"+
		"?\3@\3@\3@\3@\3@\3@\3@\5@\u032e\n@\3A\3A\3A\7A\u0333\nA\fA\16A\u0336\13"+
		"A\3B\3B\3B\7B\u033b\nB\fB\16B\u033e\13B\3B\5B\u0341\nB\3C\3C\3C\3C\3D"+
		"\3D\5D\u0349\nD\3D\3D\5D\u034d\nD\5D\u034f\nD\3E\3E\3E\3E\3E\3F\3F\7F"+
		"\u0358\nF\fF\16F\u035b\13F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\5G\u0370\nG\3H\3H\5H\u0374\nH\3I\3I\3I\3I\5I\u037a\nI\3"+
		"I\3I\5I\u037e\nI\3I\3I\7I\u0382\nI\fI\16I\u0385\13I\3I\5I\u0388\nI\3J"+
		"\3J\3J\3J\5J\u038e\nJ\3K\3K\3K\3K\3L\3L\3L\3L\3L\5L\u0399\nL\3M\3M\3M"+
		"\7M\u039e\nM\fM\16M\u03a1\13M\3N\3N\3N\3O\3O\3O\3P\3P\3P\7P\u03ac\nP\f"+
		"P\16P\u03af\13P\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u03b7\nQ\3R\3R\3R\3R\5R\u03bd\nR"+
		"\3R\3R\5R\u03c1\nR\3R\3R\3S\3S\3S\3T\3T\3T\5T\u03cb\nT\3T\3T\3T\5T\u03d0"+
		"\nT\3T\3T\3U\3U\3U\3U\3V\3V\3W\3W\3W\3W\3X\3X\5X\u03e0\nX\3X\3X\5X\u03e4"+
		"\nX\7X\u03e6\nX\fX\16X\u03e9\13X\3X\3X\3X\3X\3X\7X\u03f0\nX\fX\16X\u03f3"+
		"\13X\5X\u03f5\nX\3X\5X\u03f8\nX\3Y\3Y\3Z\3Z\5Z\u03fe\nZ\3[\3[\3[\2\6\6"+
		"\bN|\\\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\2\25\3\2\6\7\3"+
		"\2\16\20\3\2\21\22\3\2\23\26\3\2\27\30\4\2\23\26\33\35\3\2%\'\5\2rrvv"+
		"xy\3\2\64\65\5\2rrwwz{\4\2>Bdh\3\2CD\3\2FG\4\2  IJ\3\2KL\4\2\35\35PY\5"+
		"\2klnn}}\3\2kl\4\2!!||\2\u0459\2\u00bf\3\2\2\2\4\u00c1\3\2\2\2\6\u00d6"+
		"\3\2\2\2\b\u00f4\3\2\2\2\n\u0103\3\2\2\2\f\u0105\3\2\2\2\16\u0107\3\2"+
		"\2\2\20\u0109\3\2\2\2\22\u0110\3\2\2\2\24\u0115\3\2\2\2\26\u011a\3\2\2"+
		"\2\30\u011e\3\2\2\2\32\u0120\3\2\2\2\34\u0124\3\2\2\2\36\u0127\3\2\2\2"+
		" \u012b\3\2\2\2\"\u0152\3\2\2\2$\u0154\3\2\2\2&\u016a\3\2\2\2(\u0178\3"+
		"\2\2\2*\u0186\3\2\2\2,\u018f\3\2\2\2.\u01a0\3\2\2\2\60\u01a5\3\2\2\2\62"+
		"\u01ac\3\2\2\2\64\u01b4\3\2\2\2\66\u01c1\3\2\2\28\u01cc\3\2\2\2:\u01cf"+
		"\3\2\2\2<\u01d7\3\2\2\2>\u01d9\3\2\2\2@\u01e8\3\2\2\2B\u01f5\3\2\2\2D"+
		"\u01fc\3\2\2\2F\u0209\3\2\2\2H\u0210\3\2\2\2J\u021d\3\2\2\2L\u0221\3\2"+
		"\2\2N\u022c\3\2\2\2P\u0239\3\2\2\2R\u0241\3\2\2\2T\u0248\3\2\2\2V\u0256"+
		"\3\2\2\2X\u0258\3\2\2\2Z\u025a\3\2\2\2\\\u026f\3\2\2\2^\u0271\3\2\2\2"+
		"`\u0274\3\2\2\2b\u027d\3\2\2\2d\u0285\3\2\2\2f\u0287\3\2\2\2h\u0297\3"+
		"\2\2\2j\u029d\3\2\2\2l\u02a5\3\2\2\2n\u02a8\3\2\2\2p\u02ab\3\2\2\2r\u02b1"+
		"\3\2\2\2t\u02b4\3\2\2\2v\u02bb\3\2\2\2x\u02c3\3\2\2\2z\u02d2\3\2\2\2|"+
		"\u02e6\3\2\2\2~\u032d\3\2\2\2\u0080\u032f\3\2\2\2\u0082\u0337\3\2\2\2"+
		"\u0084\u0342\3\2\2\2\u0086\u034e\3\2\2\2\u0088\u0350\3\2\2\2\u008a\u0355"+
		"\3\2\2\2\u008c\u036f\3\2\2\2\u008e\u0373\3\2\2\2\u0090\u0379\3\2\2\2\u0092"+
		"\u0389\3\2\2\2\u0094\u038f\3\2\2\2\u0096\u0398\3\2\2\2\u0098\u039a\3\2"+
		"\2\2\u009a\u03a2\3\2\2\2\u009c\u03a5\3\2\2\2\u009e\u03a8\3\2\2\2\u00a0"+
		"\u03b6\3\2\2\2\u00a2\u03b8\3\2\2\2\u00a4\u03c4\3\2\2\2\u00a6\u03c7\3\2"+
		"\2\2\u00a8\u03d3\3\2\2\2\u00aa\u03d7\3\2\2\2\u00ac\u03d9\3\2\2\2\u00ae"+
		"\u03f7\3\2\2\2\u00b0\u03f9\3\2\2\2\u00b2\u03fb\3\2\2\2\u00b4\u03ff\3\2"+
		"\2\2\u00b6\u00c0\5(\25\2\u00b7\u00c0\5*\26\2\u00b8\u00c0\5,\27\2\u00b9"+
		"\u00c0\5.\30\2\u00ba\u00c0\5\60\31\2\u00bb\u00c0\5\64\33\2\u00bc\u00c0"+
		"\5:\36\2\u00bd\u00c0\5> \2\u00be\u00c0\5\4\3\2\u00bf\u00b6\3\2\2\2\u00bf"+
		"\u00b7\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba\3\2"+
		"\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\3\3\2\2\2\u00c1\u00c2\7`\2\2\u00c2\u00c3\7a\2\2\u00c3"+
		"\u00c4\5\6\4\2\u00c4\5\3\2\2\2\u00c5\u00c6\b\4\1\2\u00c6\u00c7\7\3\2\2"+
		"\u00c7\u00c8\5\6\4\2\u00c8\u00c9\7\4\2\2\u00c9\u00d7\3\2\2\2\u00ca\u00cb"+
		"\7\5\2\2\u00cb\u00d7\5\6\4\5\u00cc\u00cd\t\2\2\2\u00cd\u00ce\7\3\2\2\u00ce"+
		"\u00cf\5\u00b4[\2\u00cf\u00d0\7\b\2\2\u00d0\u00d1\5\u00b4[\2\u00d1\u00d2"+
		"\7\t\2\2\u00d2\u00d3\5\6\4\2\u00d3\u00d4\7\4\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d7\5\b\5\2\u00d6\u00c5\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00cc\3\2"+
		"\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00ea\3\2\2\2\u00d8\u00d9\f\t\2\2\u00d9"+
		"\u00da\5\f\7\2\u00da\u00db\5\6\4\n\u00db\u00e9\3\2\2\2\u00dc\u00dd\f\b"+
		"\2\2\u00dd\u00de\5\n\6\2\u00de\u00df\5\6\4\t\u00df\u00e9\3\2\2\2\u00e0"+
		"\u00e1\f\7\2\2\u00e1\u00e2\5\16\b\2\u00e2\u00e3\5\6\4\b\u00e3\u00e9\3"+
		"\2\2\2\u00e4\u00e5\f\6\2\2\u00e5\u00e6\5\20\t\2\u00e6\u00e7\5\6\4\7\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00d8\3\2\2\2\u00e8\u00dc\3\2\2\2\u00e8\u00e0\3\2"+
		"\2\2\u00e8\u00e4\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\7\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\b\5\1\2"+
		"\u00ee\u00f5\5~@\2\u00ef\u00f0\7\r\2\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2"+
		"\5\b\5\2\u00f2\u00f3\7\4\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4"+
		"\u00ef\3\2\2\2\u00f5\u0100\3\2\2\2\u00f6\u00f7\f\5\2\2\u00f7\u00f8\7\n"+
		"\2\2\u00f8\u00ff\5\u00b4[\2\u00f9\u00fa\f\4\2\2\u00fa\u00fb\7\13\2\2\u00fb"+
		"\u00fc\5~@\2\u00fc\u00fd\7\f\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f6\3\2\2"+
		"\2\u00fe\u00f9\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\t\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\t\3\2\2\u0104"+
		"\13\3\2\2\2\u0105\u0106\t\4\2\2\u0106\r\3\2\2\2\u0107\u0108\t\5\2\2\u0108"+
		"\17\3\2\2\2\u0109\u010a\t\6\2\2\u010a\21\3\2\2\2\u010b\u010f\5\24\13\2"+
		"\u010c\u010f\5\"\22\2\u010d\u010f\5$\23\2\u010e\u010b\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\2"+
		"\2\3\u0114\23\3\2\2\2\u0115\u0116\7\31\2\2\u0116\u0117\5\26\f\2\u0117"+
		"\u0118\5\30\r\2\u0118\u0119\7\32\2\2\u0119\25\3\2\2\2\u011a\u011b\5\u00b4"+
		"[\2\u011b\27\3\2\2\2\u011c\u011f\5\32\16\2\u011d\u011f\5|?\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011d\3\2\2\2\u011f\31\3\2\2\2\u0120\u0122\5\36\20\2\u0121"+
		"\u0123\5\36\20\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\33\3\2"+
		"\2\2\u0124\u0125\t\7\2\2\u0125\35\3\2\2\2\u0126\u0128\5\34\17\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7i"+
		"\2\2\u012a\37\3\2\2\2\u012b\u012e\5\u00b4[\2\u012c\u012d\7\36\2\2\u012d"+
		"\u012f\5\u00b4[\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f!\3\2\2"+
		"\2\u0130\u0131\7\37\2\2\u0131\u0134\7}\2\2\u0132\u0133\7\36\2\2\u0133"+
		"\u0135\5\u00b4[\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0153\7\32\2\2\u0137\u013a\7\37\2\2\u0138\u013b\7 \2\2"+
		"\u0139\u013b\5\u00b4[\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013d\7\36\2\2\u013d\u013f\5\u00b4[\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7!\2\2\u0141"+
		"\u0142\7}\2\2\u0142\u0153\7\32\2\2\u0143\u0144\7\37\2\2\u0144\u0145\7"+
		"\"\2\2\u0145\u014a\5 \21\2\u0146\u0147\7#\2\2\u0147\u0149\5 \21\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7$\2\2\u014e"+
		"\u014f\7!\2\2\u014f\u0150\7}\2\2\u0150\u0151\7\32\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0130\3\2\2\2\u0152\u0137\3\2\2\2\u0152\u0143\3\2\2\2\u0153"+
		"#\3\2\2\2\u0154\u0155\t\b\2\2\u0155\u015f\5\u00b4[\2\u0156\u0157\7(\2"+
		"\2\u0157\u015c\5&\24\2\u0158\u0159\7#\2\2\u0159\u015b\5&\24\2\u015a\u0158"+
		"\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0165\7\"\2\2\u0162\u0164\5\2\2\2\u0163"+
		"\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7$\2\2\u0169"+
		"%\3\2\2\2\u016a\u0176\5P)\2\u016b\u016c\7\3\2\2\u016c\u0171\5|?\2\u016d"+
		"\u016e\7#\2\2\u016e\u0170\5|?\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2\2"+
		"\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0175\7\4\2\2\u0175\u0177\3\2\2\2\u0176\u016b\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\'\3\2\2\2\u0178\u017c\5N(\2\u0179\u017b\t\t\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0182\5\u00b4[\2\u0180"+
		"\u0181\7\35\2\2\u0181\u0183\5|?\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\32\2\2\u0185)\3\2\2\2\u0186\u0187"+
		"\7)\2\2\u0187\u0188\5\u00b4[\2\u0188\u018b\7*\2\2\u0189\u018c\7 \2\2\u018a"+
		"\u018c\5N(\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2"+
		"\2\u018d\u018e\7\32\2\2\u018e+\3\2\2\2\u018f\u0190\7+\2\2\u0190\u0191"+
		"\5\u00b4[\2\u0191\u019c\7\"\2\2\u0192\u0193\5L\'\2\u0193\u0199\7\32\2"+
		"\2\u0194\u0195\5L\'\2\u0195\u0196\7\32\2\2\u0196\u0198\3\2\2\2\u0197\u0194"+
		"\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u0192\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7$\2\2\u019f-\3\2\2\2\u01a0\u01a1"+
		"\7,\2\2\u01a1\u01a2\5@!\2\u01a2\u01a3\58\35\2\u01a3\u01a4\5Z.\2\u01a4"+
		"/\3\2\2\2\u01a5\u01a6\7-\2\2\u01a6\u01a8\5\u00b4[\2\u01a7\u01a9\5@!\2"+
		"\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab"+
		"\5Z.\2\u01ab\61\3\2\2\2\u01ac\u01b2\5\u00b4[\2\u01ad\u01af\7\3\2\2\u01ae"+
		"\u01b0\5\u0080A\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b3\7\4\2\2\u01b2\u01ad\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\63\3\2\2\2\u01b4\u01b6\7.\2\2\u01b5\u01b7\5\u00b4[\2\u01b6\u01b5\3\2"+
		"\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\5@!\2\u01b9\u01bb"+
		"\58\35\2\u01ba\u01bc\5\66\34\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2"+
		"\u01bc\u01bf\3\2\2\2\u01bd\u01c0\7\32\2\2\u01be\u01c0\5Z.\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\65\3\2\2\2\u01c1\u01c2\7/\2\2\u01c2"+
		"\u01c3\5@!\2\u01c3\67\3\2\2\2\u01c4\u01cb\5\62\32\2\u01c5\u01cb\5X-\2"+
		"\u01c6\u01cb\7t\2\2\u01c7\u01cb\7y\2\2\u01c8\u01cb\7v\2\2\u01c9\u01cb"+
		"\7x\2\2\u01ca\u01c4\3\2\2\2\u01ca\u01c5\3\2\2\2\u01ca\u01c6\3\2\2\2\u01ca"+
		"\u01c7\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd9\3\2\2\2\u01ce\u01cc"+
		"\3\2\2\2\u01cf\u01d0\7\60\2\2\u01d0\u01d1\5\u00b4[\2\u01d1\u01d3\5D#\2"+
		"\u01d2\u01d4\7p\2\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d6\7\32\2\2\u01d6;\3\2\2\2\u01d7\u01d8\5\u00b4[\2\u01d8"+
		"=\3\2\2\2\u01d9\u01da\7\61\2\2\u01da\u01db\5\u00b4[\2\u01db\u01dd\7\""+
		"\2\2\u01dc\u01de\5<\37\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01e3\3\2\2\2\u01df\u01e0\7#\2\2\u01e0\u01e2\5<\37\2\u01e1\u01df\3\2"+
		"\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\7$\2\2\u01e7?\3\2\2\2\u01e8"+
		"\u01f1\7\3\2\2\u01e9\u01ee\5B\"\2\u01ea\u01eb\7#\2\2\u01eb\u01ed\5B\""+
		"\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01e9\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7\4\2\2\u01f4A\3\2\2\2"+
		"\u01f5\u01f7\5N(\2\u01f6\u01f8\5V,\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3"+
		"\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01fb\5\u00b4[\2\u01fa\u01f9\3\2\2\2"+
		"\u01fa\u01fb\3\2\2\2\u01fbC\3\2\2\2\u01fc\u0205\7\3\2\2\u01fd\u0202\5"+
		"F$\2\u01fe\u01ff\7#\2\2\u01ff\u0201\5F$\2\u0200\u01fe\3\2\2\2\u0201\u0204"+
		"\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0205\u01fd\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0208\7\4\2\2\u0208E\3\2\2\2\u0209\u020b\5N(\2\u020a\u020c"+
		"\7u\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d"+
		"\u020f\5\u00b4[\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020fG\3\2\2"+
		"\2\u0210\u0219\7\3\2\2\u0211\u0216\5J&\2\u0212\u0213\7#\2\2\u0213\u0215"+
		"\5J&\2\u0214\u0212\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u0211\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\7\4\2\2\u021c"+
		"I\3\2\2\2\u021d\u021f\5N(\2\u021e\u0220\5V,\2\u021f\u021e\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220K\3\2\2\2\u0221\u0223\5N(\2\u0222\u0224\5V,\2\u0223"+
		"\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\5\u00b4"+
		"[\2\u0226M\3\2\2\2\u0227\u0228\b(\1\2\u0228\u022d\5z>\2\u0229\u022d\5"+
		"P)\2\u022a\u022d\5R*\2\u022b\u022d\5T+\2\u022c\u0227\3\2\2\2\u022c\u0229"+
		"\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022d\u0236\3\2\2\2\u022e"+
		"\u022f\f\4\2\2\u022f\u0231\7\13\2\2\u0230\u0232\5|?\2\u0231\u0230\3\2"+
		"\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\7\f\2\2\u0234"+
		"\u022e\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2"+
		"\2\2\u0237O\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023e\5\u00b4[\2\u023a\u023b"+
		"\7\n\2\2\u023b\u023d\5\u00b4[\2\u023c\u023a\3\2\2\2\u023d\u0240\3\2\2"+
		"\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023fQ\3\2\2\2\u0240\u023e"+
		"\3\2\2\2\u0241\u0242\7\62\2\2\u0242\u0243\7\3\2\2\u0243\u0244\5z>\2\u0244"+
		"\u0245\7\63\2\2\u0245\u0246\5N(\2\u0246\u0247\7\4\2\2\u0247S\3\2\2\2\u0248"+
		"\u0249\7.\2\2\u0249\u024f\5H%\2\u024a\u024e\7v\2\2\u024b\u024e\7t\2\2"+
		"\u024c\u024e\5X-\2\u024d\u024a\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024c"+
		"\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0254\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0253\7/\2\2\u0253\u0255\5H%"+
		"\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255U\3\2\2\2\u0256\u0257"+
		"\t\n\2\2\u0257W\3\2\2\2\u0258\u0259\t\13\2\2\u0259Y\3\2\2\2\u025a\u025e"+
		"\7\"\2\2\u025b\u025d\5\\/\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e"+
		"\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u025e\3\2"+
		"\2\2\u0261\u0262\7$\2\2\u0262[\3\2\2\2\u0263\u0270\5`\61\2\u0264\u0270"+
		"\5b\62\2\u0265\u0270\5f\64\2\u0266\u0270\5Z.\2\u0267\u0270\5h\65\2\u0268"+
		"\u0270\5j\66\2\u0269\u0270\5l\67\2\u026a\u0270\5n8\2\u026b\u0270\5p9\2"+
		"\u026c\u0270\5r:\2\u026d\u0270\5t;\2\u026e\u0270\5d\63\2\u026f\u0263\3"+
		"\2\2\2\u026f\u0264\3\2\2\2\u026f\u0265\3\2\2\2\u026f\u0266\3\2\2\2\u026f"+
		"\u0267\3\2\2\2\u026f\u0268\3\2\2\2\u026f\u0269\3\2\2\2\u026f\u026a\3\2"+
		"\2\2\u026f\u026b\3\2\2\2\u026f\u026c\3\2\2\2\u026f\u026d\3\2\2\2\u026f"+
		"\u026e\3\2\2\2\u0270]\3\2\2\2\u0271\u0272\5|?\2\u0272\u0273\7\32\2\2\u0273"+
		"_\3\2\2\2\u0274\u0275\7\66\2\2\u0275\u0276\7\3\2\2\u0276\u0277\5|?\2\u0277"+
		"\u0278\7\4\2\2\u0278\u027b\5\\/\2\u0279\u027a\7\67\2\2\u027a\u027c\5\\"+
		"/\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027ca\3\2\2\2\u027d\u027e"+
		"\78\2\2\u027e\u027f\7\3\2\2\u027f\u0280\5|?\2\u0280\u0281\7\4\2\2\u0281"+
		"\u0282\5\\/\2\u0282c\3\2\2\2\u0283\u0286\5v<\2\u0284\u0286\5^\60\2\u0285"+
		"\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286e\3\2\2\2\u0287\u0288\7*\2\2\u0288"+
		"\u028b\7\3\2\2\u0289\u028c\5d\63\2\u028a\u028c\7\32\2\2\u028b\u0289\3"+
		"\2\2\2\u028b\u028a\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028f\5|?\2\u028e"+
		"\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\7\32"+
		"\2\2\u0291\u0293\5|?\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0295\7\4\2\2\u0295\u0296\5\\/\2\u0296g\3\2\2\2\u0297\u0299"+
		"\79\2\2\u0298\u029a\7}\2\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029c\5\u008aF\2\u029ci\3\2\2\2\u029d\u029e\7:\2"+
		"\2\u029e\u029f\5\\/\2\u029f\u02a0\78\2\2\u02a0\u02a1\7\3\2\2\u02a1\u02a2"+
		"\5|?\2\u02a2\u02a3\7\4\2\2\u02a3\u02a4\7\32\2\2\u02a4k\3\2\2\2\u02a5\u02a6"+
		"\7s\2\2\u02a6\u02a7\7\32\2\2\u02a7m\3\2\2\2\u02a8\u02a9\7q\2\2\u02a9\u02aa"+
		"\7\32\2\2\u02aao\3\2\2\2\u02ab\u02ad\7;\2\2\u02ac\u02ae\5|?\2\u02ad\u02ac"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\7\32\2\2"+
		"\u02b0q\3\2\2\2\u02b1\u02b2\7<\2\2\u02b2\u02b3\7\32\2\2\u02b3s\3\2\2\2"+
		"\u02b4\u02b5\7=\2\2\u02b5\u02b6\5\u0088E\2\u02b6\u02b7\7\32\2\2\u02b7"+
		"u\3\2\2\2\u02b8\u02b9\7>\2\2\u02b9\u02bc\5x=\2\u02ba\u02bc\5L\'\2\u02bb"+
		"\u02b8\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02be\7\35"+
		"\2\2\u02be\u02c0\5|?\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02c2\7\32\2\2\u02c2w\3\2\2\2\u02c3\u02ca\7\3\2\2\u02c4"+
		"\u02c6\5\u00b4[\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7\u02c9\7#\2\2\u02c8\u02c5\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca"+
		"\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2"+
		"\2\2\u02cd\u02cf\5\u00b4[\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0\u02d1\7\4\2\2\u02d1y\3\2\2\2\u02d2\u02d3\t\f\2\2"+
		"\u02d3{\3\2\2\2\u02d4\u02d5\b?\1\2\u02d5\u02d6\7E\2\2\u02d6\u02e7\5N("+
		"\2\u02d7\u02d8\7\3\2\2\u02d8\u02d9\5|?\2\u02d9\u02da\7\4\2\2\u02da\u02e7"+
		"\3\2\2\2\u02db\u02dc\t\r\2\2\u02dc\u02e7\5|?\25\u02dd\u02de\t\6\2\2\u02de"+
		"\u02e7\5|?\24\u02df\u02e0\t\16\2\2\u02e0\u02e7\5|?\23\u02e1\u02e2\7\5"+
		"\2\2\u02e2\u02e7\5|?\22\u02e3\u02e4\7\34\2\2\u02e4\u02e7\5|?\21\u02e5"+
		"\u02e7\5~@\2\u02e6\u02d4\3\2\2\2\u02e6\u02d7\3\2\2\2\u02e6\u02db\3\2\2"+
		"\2\u02e6\u02dd\3\2\2\2\u02e6\u02df\3\2\2\2\u02e6\u02e1\3\2\2\2\u02e6\u02e3"+
		"\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7\u0323\3\2\2\2\u02e8\u02e9\f\20\2\2"+
		"\u02e9\u02ea\7H\2\2\u02ea\u0322\5|?\21\u02eb\u02ec\f\17\2\2\u02ec\u02ed"+
		"\t\17\2\2\u02ed\u0322\5|?\20\u02ee\u02ef\f\16\2\2\u02ef\u02f0\t\6\2\2"+
		"\u02f0\u0322\5|?\17\u02f1\u02f2\f\r\2\2\u02f2\u02f3\t\20\2\2\u02f3\u0322"+
		"\5|?\16\u02f4\u02f5\f\f\2\2\u02f5\u02f6\7M\2\2\u02f6\u0322\5|?\r\u02f7"+
		"\u02f8\f\13\2\2\u02f8\u02f9\7\33\2\2\u02f9\u0322\5|?\f\u02fa\u02fb\f\n"+
		"\2\2\u02fb\u02fc\7N\2\2\u02fc\u0322\5|?\13\u02fd\u02fe\f\t\2\2\u02fe\u02ff"+
		"\t\5\2\2\u02ff\u0322\5|?\n\u0300\u0301\f\b\2\2\u0301\u0302\t\4\2\2\u0302"+
		"\u0322\5|?\t\u0303\u0304\f\7\2\2\u0304\u0305\7\16\2\2\u0305\u0322\5|?"+
		"\b\u0306\u0307\f\6\2\2\u0307\u0308\7\17\2\2\u0308\u0322\5|?\7\u0309\u030a"+
		"\f\5\2\2\u030a\u030b\7O\2\2\u030b\u030c\5|?\2\u030c\u030d\7\t\2\2\u030d"+
		"\u030e\5|?\6\u030e\u0322\3\2\2\2\u030f\u0310\f\4\2\2\u0310\u0311\t\21"+
		"\2\2\u0311\u0322\5|?\5\u0312\u0313\f\33\2\2\u0313\u0322\t\r\2\2\u0314"+
		"\u0315\f\31\2\2\u0315\u0316\7\13\2\2\u0316\u0317\5|?\2\u0317\u0318\7\f"+
		"\2\2\u0318\u0322\3\2\2\2\u0319\u031a\f\30\2\2\u031a\u031b\7\3\2\2\u031b"+
		"\u031c\5\u0086D\2\u031c\u031d\7\4\2\2\u031d\u0322\3\2\2\2\u031e\u031f"+
		"\f\27\2\2\u031f\u0320\7\n\2\2\u0320\u0322\5\u00b4[\2\u0321\u02e8\3\2\2"+
		"\2\u0321\u02eb\3\2\2\2\u0321\u02ee\3\2\2\2\u0321\u02f1\3\2\2\2\u0321\u02f4"+
		"\3\2\2\2\u0321\u02f7\3\2\2\2\u0321\u02fa\3\2\2\2\u0321\u02fd\3\2\2\2\u0321"+
		"\u0300\3\2\2\2\u0321\u0303\3\2\2\2\u0321\u0306\3\2\2\2\u0321\u0309\3\2"+
		"\2\2\u0321\u030f\3\2\2\2\u0321\u0312\3\2\2\2\u0321\u0314\3\2\2\2\u0321"+
		"\u0319\3\2\2\2\u0321\u031e\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2"+
		"\2\2\u0323\u0324\3\2\2\2\u0324}\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u032e"+
		"\7j\2\2\u0327\u032e\5\u00b2Z\2\u0328\u032e\7n\2\2\u0329\u032e\7}\2\2\u032a"+
		"\u032e\5\u00b4[\2\u032b\u032e\5\u00aeX\2\u032c\u032e\5\u00b0Y\2\u032d"+
		"\u0326\3\2\2\2\u032d\u0327\3\2\2\2\u032d\u0328\3\2\2\2\u032d\u0329\3\2"+
		"\2\2\u032d\u032a\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032c\3\2\2\2\u032e"+
		"\177\3\2\2\2\u032f\u0334\5|?\2\u0330\u0331\7#\2\2\u0331\u0333\5|?\2\u0332"+
		"\u0330\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2"+
		"\2\2\u0335\u0081\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u033c\5\u0084C\2\u0338"+
		"\u0339\7#\2\2\u0339\u033b\5\u0084C\2\u033a\u0338\3\2\2\2\u033b\u033e\3"+
		"\2\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0340\3\2\2\2\u033e"+
		"\u033c\3\2\2\2\u033f\u0341\7#\2\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2"+
		"\2\2\u0341\u0083\3\2\2\2\u0342\u0343\5\u00b4[\2\u0343\u0344\7\t\2\2\u0344"+
		"\u0345\5|?\2\u0345\u0085\3\2\2\2\u0346\u0348\7\"\2\2\u0347\u0349\5\u0082"+
		"B\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034f\7$\2\2\u034b\u034d\5\u0080A\2\u034c\u034b\3\2\2\2\u034c\u034d\3"+
		"\2\2\2\u034d\u034f\3\2\2\2\u034e\u0346\3\2\2\2\u034e\u034c\3\2\2\2\u034f"+
		"\u0087\3\2\2\2\u0350\u0351\5|?\2\u0351\u0352\7\3\2\2\u0352\u0353\5\u0086"+
		"D\2\u0353\u0354\7\4\2\2\u0354\u0089\3\2\2\2\u0355\u0359\7\"\2\2\u0356"+
		"\u0358\5\u008cG\2\u0357\u0356\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357"+
		"\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u0359\3\2\2\2\u035c"+
		"\u035d\7$\2\2\u035d\u008b\3\2\2\2\u035e\u0370\5\u00b4[\2\u035f\u0370\5"+
		"\u008aF\2\u0360\u0370\5\u008eH\2\u0361\u0370\5\u0092J\2\u0362\u0370\5"+
		"\u0094K\2\u0363\u0370\5\u009aN\2\u0364\u0370\5\u009cO\2\u0365\u0370\5"+
		"\u009eP\2\u0366\u0370\5\u00a2R\2\u0367\u0370\5\u00a6T\2\u0368\u0370\5"+
		"\u00a8U\2\u0369\u0370\7q\2\2\u036a\u0370\7s\2\2\u036b\u0370\5\u00acW\2"+
		"\u036c\u0370\5\u00b2Z\2\u036d\u0370\7}\2\2\u036e\u0370\7n\2\2\u036f\u035e"+
		"\3\2\2\2\u036f\u035f\3\2\2\2\u036f\u0360\3\2\2\2\u036f\u0361\3\2\2\2\u036f"+
		"\u0362\3\2\2\2\u036f\u0363\3\2\2\2\u036f\u0364\3\2\2\2\u036f\u0365\3\2"+
		"\2\2\u036f\u0366\3\2\2\2\u036f\u0367\3\2\2\2\u036f\u0368\3\2\2\2\u036f"+
		"\u0369\3\2\2\2\u036f\u036a\3\2\2\2\u036f\u036b\3\2\2\2\u036f\u036c\3\2"+
		"\2\2\u036f\u036d\3\2\2\2\u036f\u036e\3\2\2\2\u0370\u008d\3\2\2\2\u0371"+
		"\u0374\5\u0090I\2\u0372\u0374\5\u00aaV\2\u0373\u0371\3\2\2\2\u0373\u0372"+
		"\3\2\2\2\u0374\u008f\3\2\2\2\u0375\u037a\7;\2\2\u0376\u037a\7?\2\2\u0377"+
		"\u037a\7B\2\2\u0378\u037a\5\u00b4[\2\u0379\u0375\3\2\2\2\u0379\u0376\3"+
		"\2\2\2\u0379\u0377\3\2\2\2\u0379\u0378\3\2\2\2\u037a\u0387\3\2\2\2\u037b"+
		"\u037d\7\3\2\2\u037c\u037e\5\u008eH\2\u037d\u037c\3\2\2\2\u037d\u037e"+
		"\3\2\2\2\u037e\u0383\3\2\2\2\u037f\u0380\7#\2\2\u0380\u0382\5\u008eH\2"+
		"\u0381\u037f\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384"+
		"\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0383\3\2\2\2\u0386\u0388\7\4\2\2\u0387"+
		"\u037b\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0091\3\2\2\2\u0389\u038a\7Z"+
		"\2\2\u038a\u038d\5\u0096L\2\u038b\u038c\7[\2\2\u038c\u038e\5\u008eH\2"+
		"\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0093\3\2\2\2\u038f\u0390"+
		"\5\u0096L\2\u0390\u0391\7[\2\2\u0391\u0392\5\u008eH\2\u0392\u0095\3\2"+
		"\2\2\u0393\u0399\5\u00b4[\2\u0394\u0395\7\3\2\2\u0395\u0396\5\u0098M\2"+
		"\u0396\u0397\7\4\2\2\u0397\u0399\3\2\2\2\u0398\u0393\3\2\2\2\u0398\u0394"+
		"\3\2\2\2\u0399\u0097\3\2\2\2\u039a\u039f\5\u00b4[\2\u039b\u039c\7#\2\2"+
		"\u039c\u039e\5\u00b4[\2\u039d\u039b\3\2\2\2\u039e\u03a1\3\2\2\2\u039f"+
		"\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u0099\3\2\2\2\u03a1\u039f\3\2"+
		"\2\2\u03a2\u03a3\7\\\2\2\u03a3\u03a4\5\u00b4[\2\u03a4\u009b\3\2\2\2\u03a5"+
		"\u03a6\5\u00b4[\2\u03a6\u03a7\7\t\2\2\u03a7\u009d\3\2\2\2\u03a8\u03a9"+
		"\7]\2\2\u03a9\u03ad\5\u008eH\2\u03aa\u03ac\5\u00a0Q\2\u03ab\u03aa\3\2"+
		"\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u009f\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b1\7^\2\2\u03b1\u03b2\5\u00aa"+
		"V\2\u03b2\u03b3\5\u008aF\2\u03b3\u03b7\3\2\2\2\u03b4\u03b5\7_\2\2\u03b5"+
		"\u03b7\5\u008aF\2\u03b6\u03b0\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u00a1"+
		"\3\2\2\2\u03b8\u03b9\7.\2\2\u03b9\u03ba\5\u00b4[\2\u03ba\u03bc\7\3\2\2"+
		"\u03bb\u03bd\5\u0098M\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u03c0\7\4\2\2\u03bf\u03c1\5\u00a4S\2\u03c0\u03bf"+
		"\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\5\u008aF"+
		"\2\u03c3\u00a3\3\2\2\2\u03c4\u03c5\7\20\2\2\u03c5\u03c6\5\u0098M\2\u03c6"+
		"\u00a5\3\2\2\2\u03c7\u03ca\7*\2\2\u03c8\u03cb\5\u008aF\2\u03c9\u03cb\5"+
		"\u008eH\2\u03ca\u03c8\3\2\2\2\u03ca\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2"+
		"\u03cc\u03cf\5\u008eH\2\u03cd\u03d0\5\u008aF\2\u03ce\u03d0\5\u008eH\2"+
		"\u03cf\u03cd\3\2\2\2\u03cf\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2"+
		"\5\u008aF\2\u03d2\u00a7\3\2\2\2\u03d3\u03d4\7\66\2\2\u03d4\u03d5\5\u008e"+
		"H\2\u03d5\u03d6\5\u008aF\2\u03d6\u00a9\3\2\2\2\u03d7\u03d8\t\22\2\2\u03d8"+
		"\u00ab\3\2\2\2\u03d9\u03da\79\2\2\u03da\u03db\5\u00b4[\2\u03db\u03dc\5"+
		"\u008aF\2\u03dc\u00ad\3\2\2\2\u03dd\u03df\7\3\2\2\u03de\u03e0\5|?\2\u03df"+
		"\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e7\3\2\2\2\u03e1\u03e3\7#"+
		"\2\2\u03e2\u03e4\5|?\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e6"+
		"\3\2\2\2\u03e5\u03e1\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7"+
		"\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03f8\7\4"+
		"\2\2\u03eb\u03f4\7\13\2\2\u03ec\u03f1\5|?\2\u03ed\u03ee\7#\2\2\u03ee\u03f0"+
		"\5|?\2\u03ef\u03ed\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1"+
		"\u03f2\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03ec\3\2"+
		"\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f8\7\f\2\2\u03f7"+
		"\u03dd\3\2\2\2\u03f7\u03eb\3\2\2\2\u03f8\u00af\3\2\2\2\u03f9\u03fa\5z"+
		">\2\u03fa\u00b1\3\2\2\2\u03fb\u03fd\t\23\2\2\u03fc\u03fe\7m\2\2\u03fd"+
		"\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u00b3\3\2\2\2\u03ff\u0400\t\24"+
		"\2\2\u0400\u00b5\3\2\2\2k\u00bf\u00d6\u00e8\u00ea\u00f4\u00fe\u0100\u010e"+
		"\u0110\u011e\u0122\u0127\u012e\u0134\u013a\u013e\u014a\u0152\u015c\u015f"+
		"\u0165\u0171\u0176\u017c\u0182\u018b\u0199\u019c\u01a8\u01af\u01b2\u01b6"+
		"\u01bb\u01bf\u01ca\u01cc\u01d3\u01dd\u01e3\u01ee\u01f1\u01f7\u01fa\u0202"+
		"\u0205\u020b\u020e\u0216\u0219\u021f\u0223\u022c\u0231\u0236\u023e\u024d"+
		"\u024f\u0254\u025e\u026f\u027b\u0285\u028b\u028e\u0292\u0299\u02ad\u02bb"+
		"\u02bf\u02c5\u02ca\u02ce\u02e6\u0321\u0323\u032d\u0334\u033c\u0340\u0348"+
		"\u034c\u034e\u0359\u036f\u0373\u0379\u037d\u0383\u0387\u038d\u0398\u039f"+
		"\u03ad\u03b6\u03bc\u03c0\u03ca\u03cf\u03df\u03e3\u03e7\u03f1\u03f4\u03f7"+
		"\u03fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}