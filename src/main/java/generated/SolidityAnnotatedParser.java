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
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, AnnotationStart=93, 
		AnnotationKind=94, LINE_COMMENT=95, WS=96, Int=97, Uint=98, Byte=99, Fixed=100, 
		Ufixed=101, VersionLiteral=102, BooleanLiteral=103, DecimalNumber=104, 
		HexNumber=105, NumberUnit=106, HexLiteral=107, ReservedKeyword=108, AnonymousKeyword=109, 
		BreakKeyword=110, ConstantKeyword=111, ContinueKeyword=112, ExternalKeyword=113, 
		IndexedKeyword=114, InternalKeyword=115, PayableKeyword=116, PrivateKeyword=117, 
		PublicKeyword=118, PureKeyword=119, ViewKeyword=120, Identifier=121, StringLiteral=122, 
		COMMENT=123;
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
		null, "'('", "')'", "'!'", "'\\forall'", "'\\exists'", "':'", "'.'", "'['", 
		"']'", "'\\old'", "'&&'", "'||'", "'->'", "'=='", "'!='", "'>'", "'>='", 
		"'<'", "'<='", "'+'", "'-'", "'pragma'", "';'", "'^'", "'~'", "'='", "'as'", 
		"'import'", "'*'", "'from'", "'{'", "','", "'}'", "'contract'", "'interface'", 
		"'library'", "'is'", "'using'", "'for'", "'struct'", "'constructor'", 
		"'modifier'", "'function'", "'returns'", "'event'", "'enum'", "'mapping'", 
		"'=>'", "'memory'", "'storage'", "'if'", "'else'", "'while'", "'assembly'", 
		"'do'", "'return'", "'throw'", "'emit'", "'var'", "'address'", "'bool'", 
		"'string'", "'byte'", "'++'", "'--'", "'new'", "'after'", "'delete'", 
		"'**'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'?'", "'|='", "'^='", 
		"'&='", "'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'let'", 
		"':='", "'=:'", "'switch'", "'case'", "'default'", "'//@'", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'anonymous'", "'break'", "'constant'", "'continue'", "'external'", 
		"'indexed'", "'internal'", "'payable'", "'private'", "'public'", "'pure'", 
		"'view'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "AnnotationStart", 
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
				elementaryTypeName();
				setState(206);
				match(T__5);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__29) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (Int - 97)) | (1L << (Uint - 97)) | (1L << (Byte - 97)) | (1L << (Fixed - 97)) | (1L << (Ufixed - 97)) | (1L << (BooleanLiteral - 97)) | (1L << (DecimalNumber - 97)) | (1L << (HexNumber - 97)) | (1L << (HexLiteral - 97)) | (1L << (Identifier - 97)) | (1L << (StringLiteral - 97)))) != 0)) {
					{
					setState(207);
					annotationExpression(0);
					}
				}

				setState(210);
				match(T__5);
				setState(211);
				annotationExpression(0);
				setState(212);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(214);
				primaryAnnotationExpression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(217);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(218);
						compareOp();
						setState(219);
						annotationExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(221);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(222);
						booleanOp();
						setState(223);
						annotationExpression(7);
						}
						break;
					case 3:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(225);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(226);
						integerOpBoolean();
						setState(227);
						annotationExpression(6);
						}
						break;
					case 4:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(229);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(230);
						integerOpInteger();
						setState(231);
						annotationExpression(5);
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__7:
			case T__29:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
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
				setState(239);
				primaryExpression();
				}
				break;
			case T__9:
				{
				setState(240);
				match(T__9);
				setState(241);
				match(T__0);
				setState(242);
				primaryAnnotationExpression(0);
				setState(243);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryAnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryAnnotationExpression);
						setState(247);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(248);
						match(T__6);
						setState(249);
						identifier();
						}
						break;
					case 2:
						{
						_localctx = new PrimaryAnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryAnnotationExpression);
						setState(250);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(251);
						match(T__7);
						setState(252);
						primaryExpression();
						setState(253);
						match(T__8);
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
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
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__27) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				setState(271);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(268);
					pragmaDirective();
					}
					break;
				case T__27:
					{
					setState(269);
					importDirective();
					}
					break;
				case T__33:
				case T__34:
				case T__35:
					{
					setState(270);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
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
			setState(278);
			match(T__21);
			setState(279);
			pragmaName();
			setState(280);
			pragmaValue();
			setState(281);
			match(T__22);
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
			setState(283);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
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
			setState(289);
			versionConstraint();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0) || _la==VersionLiteral) {
				{
				setState(290);
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
			setState(293);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				setState(295);
				versionOperator();
				}
			}

			setState(298);
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
			setState(300);
			identifier();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(301);
				match(T__26);
				setState(302);
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
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__27);
				setState(306);
				match(StringLiteral);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(307);
					match(T__26);
					setState(308);
					identifier();
					}
				}

				setState(311);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(T__27);
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
					{
					setState(313);
					match(T__28);
					}
					break;
				case T__29:
				case Identifier:
					{
					setState(314);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(317);
					match(T__26);
					setState(318);
					identifier();
					}
				}

				setState(321);
				match(T__29);
				setState(322);
				match(StringLiteral);
				setState(323);
				match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(T__27);
				setState(325);
				match(T__30);
				setState(326);
				importDeclaration();
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(327);
					match(T__31);
					setState(328);
					importDeclaration();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				match(T__32);
				setState(335);
				match(T__29);
				setState(336);
				match(StringLiteral);
				setState(337);
				match(T__22);
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
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(342);
			identifier();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(343);
				match(T__36);
				setState(344);
				inheritanceSpecifier();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(345);
					match(T__31);
					setState(346);
					inheritanceSpecifier();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(354);
			match(T__30);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__37) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (AnnotationStart - 93)) | (1L << (Int - 93)) | (1L << (Uint - 93)) | (1L << (Byte - 93)) | (1L << (Fixed - 93)) | (1L << (Ufixed - 93)) | (1L << (Identifier - 93)))) != 0)) {
				{
				{
				setState(355);
				contractPart();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(T__32);
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
			setState(363);
			userDefinedTypeName();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(364);
				match(T__0);
				setState(365);
				expression(0);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(366);
					match(T__31);
					setState(367);
					expression(0);
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(373);
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
			setState(377);
			typeName(0);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (ConstantKeyword - 111)) | (1L << (InternalKeyword - 111)) | (1L << (PrivateKeyword - 111)) | (1L << (PublicKeyword - 111)))) != 0)) {
				{
				{
				setState(378);
				_la = _input.LA(1);
				if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (ConstantKeyword - 111)) | (1L << (InternalKeyword - 111)) | (1L << (PrivateKeyword - 111)) | (1L << (PublicKeyword - 111)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			identifier();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(385);
				match(T__25);
				setState(386);
				expression(0);
				}
			}

			setState(389);
			match(T__22);
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
			setState(391);
			match(T__37);
			setState(392);
			identifier();
			setState(393);
			match(T__38);
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				{
				setState(394);
				match(T__28);
				}
				break;
			case T__29:
			case T__42:
			case T__46:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(395);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(398);
			match(T__22);
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
			setState(400);
			match(T__39);
			setState(401);
			identifier();
			setState(402);
			match(T__30);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__42) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (Int - 97)) | (1L << (Uint - 97)) | (1L << (Byte - 97)) | (1L << (Fixed - 97)) | (1L << (Ufixed - 97)) | (1L << (Identifier - 97)))) != 0)) {
				{
				setState(403);
				variableDeclaration();
				setState(404);
				match(T__22);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__42) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (Int - 97)) | (1L << (Uint - 97)) | (1L << (Byte - 97)) | (1L << (Fixed - 97)) | (1L << (Ufixed - 97)) | (1L << (Identifier - 97)))) != 0)) {
					{
					{
					setState(405);
					variableDeclaration();
					setState(406);
					match(T__22);
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(415);
			match(T__32);
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
			setState(417);
			match(T__40);
			setState(418);
			parameterList();
			setState(419);
			modifierList();
			setState(420);
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
			setState(422);
			match(T__41);
			setState(423);
			identifier();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(424);
				parameterList();
				}
			}

			setState(427);
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
			setState(429);
			identifier();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(430);
				match(T__0);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__29) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(431);
					expressionList();
					}
				}

				setState(434);
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
			setState(437);
			match(T__42);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29 || _la==Identifier) {
				{
				setState(438);
				identifier();
				}
			}

			setState(441);
			parameterList();
			setState(442);
			modifierList();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(443);
				returnParameters();
				}
			}

			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				{
				setState(446);
				match(T__22);
				}
				break;
			case T__30:
				{
				setState(447);
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
			setState(450);
			match(T__43);
			setState(451);
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
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (ConstantKeyword - 111)) | (1L << (ExternalKeyword - 111)) | (1L << (InternalKeyword - 111)) | (1L << (PayableKeyword - 111)) | (1L << (PrivateKeyword - 111)) | (1L << (PublicKeyword - 111)) | (1L << (PureKeyword - 111)) | (1L << (ViewKeyword - 111)) | (1L << (Identifier - 111)))) != 0)) {
				{
				setState(459);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
				case Identifier:
					{
					setState(453);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(454);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(455);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(456);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(457);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(458);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(463);
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
			setState(464);
			match(T__44);
			setState(465);
			identifier();
			setState(466);
			eventParameterList();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(467);
				match(AnonymousKeyword);
				}
			}

			setState(470);
			match(T__22);
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
			setState(472);
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
			setState(474);
			match(T__45);
			setState(475);
			identifier();
			setState(476);
			match(T__30);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29 || _la==Identifier) {
				{
				setState(477);
				enumValue();
				}
			}

			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(480);
				match(T__31);
				setState(481);
				enumValue();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487);
			match(T__32);
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
			setState(489);
			match(T__0);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__42) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (Int - 97)) | (1L << (Uint - 97)) | (1L << (Byte - 97)) | (1L << (Fixed - 97)) | (1L << (Ufixed - 97)) | (1L << (Identifier - 97)))) != 0)) {
				{
				setState(490);
				parameter();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(491);
					match(T__31);
					setState(492);
					parameter();
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(500);
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
			setState(502);
			typeName(0);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48 || _la==T__49) {
				{
				setState(503);
				storageLocation();
				}
			}

			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29 || _la==Identifier) {
				{
				setState(506);
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
			setState(509);
			match(T__0);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__42) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (Int - 97)) | (1L << (Uint - 97)) | (1L << (Byte - 97)) | (1L << (Fixed - 97)) | (1L << (Ufixed - 97)) | (1L << (Identifier - 97)))) != 0)) {
				{
				setState(510);
				eventParameter();
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(511);
					match(T__31);
					setState(512);
					eventParameter();
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(520);
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
			setState(522);
			typeName(0);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(523);
				match(IndexedKeyword);
				}
			}

			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29 || _la==Identifier) {
				{
				setState(526);
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
			setState(529);
			match(T__0);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__42) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (Int - 97)) | (1L << (Uint - 97)) | (1L << (Byte - 97)) | (1L << (Fixed - 97)) | (1L << (Ufixed - 97)) | (1L << (Identifier - 97)))) != 0)) {
				{
				setState(530);
				functionTypeParameter();
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(531);
					match(T__31);
					setState(532);
					functionTypeParameter();
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(540);
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
			setState(542);
			typeName(0);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48 || _la==T__49) {
				{
				setState(543);
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
			setState(546);
			typeName(0);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48 || _la==T__49) {
				{
				setState(547);
				storageLocation();
				}
			}

			setState(550);
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
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				{
				setState(553);
				elementaryTypeName();
				}
				break;
			case T__29:
			case Identifier:
				{
				setState(554);
				userDefinedTypeName();
				}
				break;
			case T__46:
				{
				setState(555);
				mapping();
				}
				break;
			case T__42:
				{
				setState(556);
				functionTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(559);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(560);
					match(T__7);
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__29) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
						{
						setState(561);
						expression(0);
						}
					}

					setState(564);
					match(T__8);
					}
					} 
				}
				setState(569);
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
			setState(570);
			identifier();
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(571);
					match(T__6);
					setState(572);
					identifier();
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
			setState(578);
			match(T__46);
			setState(579);
			match(T__0);
			setState(580);
			elementaryTypeName();
			setState(581);
			match(T__47);
			setState(582);
			typeName(0);
			setState(583);
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
			setState(585);
			match(T__42);
			setState(586);
			functionTypeParameterList();
			setState(592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(590);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(587);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(588);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(589);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(595);
				match(T__43);
				setState(596);
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
			setState(599);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__49) ) {
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
			setState(601);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (ConstantKeyword - 111)) | (1L << (PayableKeyword - 111)) | (1L << (PureKeyword - 111)) | (1L << (ViewKeyword - 111)))) != 0)) ) {
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
			setState(603);
			match(T__30);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__42) | (1L << T__46) | (1L << T__50) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (BreakKeyword - 64)) | (1L << (ContinueKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(604);
				statement();
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
			match(T__32);
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
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				ifStatement();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				whileStatement();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				forStatement();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(615);
				block();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 5);
				{
				setState(616);
				inlineAssemblyStatement();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 6);
				{
				setState(617);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(618);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(619);
				breakStatement();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 9);
				{
				setState(620);
				returnStatement();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 10);
				{
				setState(621);
				throwStatement();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 11);
				{
				setState(622);
				emitStatement();
				}
				break;
			case T__0:
			case T__2:
			case T__7:
			case T__19:
			case T__20:
			case T__24:
			case T__29:
			case T__42:
			case T__46:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
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
				setState(623);
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
			setState(626);
			expression(0);
			setState(627);
			match(T__22);
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
			setState(629);
			match(T__50);
			setState(630);
			match(T__0);
			setState(631);
			expression(0);
			setState(632);
			match(T__1);
			setState(633);
			statement();
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(634);
				match(T__51);
				setState(635);
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
			setState(638);
			match(T__52);
			setState(639);
			match(T__0);
			setState(640);
			expression(0);
			setState(641);
			match(T__1);
			setState(642);
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
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(644);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(645);
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
			setState(648);
			match(T__38);
			setState(649);
			match(T__0);
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__7:
			case T__19:
			case T__20:
			case T__24:
			case T__29:
			case T__42:
			case T__46:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
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
				setState(650);
				simpleStatement();
				}
				break;
			case T__22:
				{
				setState(651);
				match(T__22);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__29) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(654);
				expression(0);
				}
			}

			setState(657);
			match(T__22);
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__29) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(658);
				expression(0);
				}
			}

			setState(661);
			match(T__1);
			setState(662);
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
			setState(664);
			match(T__53);
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(665);
				match(StringLiteral);
				}
			}

			setState(668);
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
			setState(670);
			match(T__54);
			setState(671);
			statement();
			setState(672);
			match(T__52);
			setState(673);
			match(T__0);
			setState(674);
			expression(0);
			setState(675);
			match(T__1);
			setState(676);
			match(T__22);
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
			setState(678);
			match(ContinueKeyword);
			setState(679);
			match(T__22);
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
			setState(681);
			match(BreakKeyword);
			setState(682);
			match(T__22);
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
			setState(684);
			match(T__55);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__29) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(685);
				expression(0);
				}
			}

			setState(688);
			match(T__22);
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
			setState(690);
			match(T__56);
			setState(691);
			match(T__22);
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
			setState(693);
			match(T__57);
			setState(694);
			functionCall();
			setState(695);
			match(T__22);
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
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(697);
				match(T__58);
				setState(698);
				identifierList();
				}
				break;
			case 2:
				{
				setState(699);
				variableDeclaration();
				}
				break;
			}
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(702);
				match(T__25);
				setState(703);
				expression(0);
				}
			}

			setState(706);
			match(T__22);
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
			setState(708);
			match(T__0);
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__29 || _la==Identifier) {
						{
						setState(709);
						identifier();
						}
					}

					setState(712);
					match(T__31);
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29 || _la==Identifier) {
				{
				setState(718);
				identifier();
				}
			}

			setState(721);
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
			setState(723);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__59 - 59)) | (1L << (T__60 - 59)) | (1L << (T__61 - 59)) | (1L << (T__62 - 59)) | (1L << (Int - 59)) | (1L << (Uint - 59)) | (1L << (Byte - 59)) | (1L << (Fixed - 59)) | (1L << (Ufixed - 59)))) != 0)) ) {
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
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(726);
				match(T__65);
				setState(727);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(728);
				match(T__0);
				setState(729);
				expression(0);
				setState(730);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(732);
				_la = _input.LA(1);
				if ( !(_la==T__63 || _la==T__64) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(733);
				expression(19);
				}
				break;
			case 4:
				{
				setState(734);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(735);
				expression(18);
				}
				break;
			case 5:
				{
				setState(736);
				_la = _input.LA(1);
				if ( !(_la==T__66 || _la==T__67) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(737);
				expression(17);
				}
				break;
			case 6:
				{
				setState(738);
				match(T__2);
				setState(739);
				expression(16);
				}
				break;
			case 7:
				{
				setState(740);
				match(T__24);
				setState(741);
				expression(15);
				}
				break;
			case 8:
				{
				setState(742);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(802);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(746);
						match(T__68);
						setState(747);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(748);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(749);
						_la = _input.LA(1);
						if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (T__28 - 29)) | (1L << (T__69 - 29)) | (1L << (T__70 - 29)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(750);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(751);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(752);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(753);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(754);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(755);
						_la = _input.LA(1);
						if ( !(_la==T__71 || _la==T__72) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(756);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(757);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(758);
						match(T__73);
						setState(759);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(760);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(761);
						match(T__23);
						setState(762);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(763);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(764);
						match(T__74);
						setState(765);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(766);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(767);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(768);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(769);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(770);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(771);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(772);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(773);
						match(T__10);
						setState(774);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(775);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(776);
						match(T__11);
						setState(777);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(778);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(779);
						match(T__75);
						setState(780);
						expression(0);
						setState(781);
						match(T__5);
						setState(782);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(784);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(785);
						_la = _input.LA(1);
						if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (T__25 - 26)) | (1L << (T__76 - 26)) | (1L << (T__77 - 26)) | (1L << (T__78 - 26)) | (1L << (T__79 - 26)) | (1L << (T__80 - 26)) | (1L << (T__81 - 26)) | (1L << (T__82 - 26)) | (1L << (T__83 - 26)) | (1L << (T__84 - 26)) | (1L << (T__85 - 26)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(786);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(787);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(788);
						_la = _input.LA(1);
						if ( !(_la==T__63 || _la==T__64) ) {
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
						setState(789);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(790);
						match(T__7);
						setState(791);
						expression(0);
						setState(792);
						match(T__8);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(794);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(795);
						match(T__0);
						setState(796);
						functionCallArguments();
						setState(797);
						match(T__1);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(799);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(800);
						match(T__6);
						setState(801);
						identifier();
						}
						break;
					}
					} 
				}
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				match(BooleanLiteral);
				}
				break;
			case DecimalNumber:
			case HexNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				numberLiteral();
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
				match(HexLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(810);
				match(StringLiteral);
				}
				break;
			case T__29:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(811);
				identifier();
				}
				break;
			case T__0:
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(812);
				tupleExpression();
				}
				break;
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 7);
				{
				setState(813);
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
			setState(816);
			expression(0);
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(817);
				match(T__31);
				setState(818);
				expression(0);
				}
				}
				setState(823);
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
			setState(824);
			nameValue();
			setState(829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(825);
					match(T__31);
					setState(826);
					nameValue();
					}
					} 
				}
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(832);
				match(T__31);
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
			setState(835);
			identifier();
			setState(836);
			match(T__5);
			setState(837);
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
			setState(847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				match(T__30);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29 || _la==Identifier) {
					{
					setState(840);
					nameValueList();
					}
				}

				setState(843);
				match(T__32);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__7:
			case T__19:
			case T__20:
			case T__24:
			case T__29:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
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
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__29) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(844);
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
			setState(849);
			expression(0);
			setState(850);
			match(T__0);
			setState(851);
			functionCallArguments();
			setState(852);
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
			setState(854);
			match(T__30);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__42) | (1L << T__50) | (1L << T__53) | (1L << T__55) | (1L << T__59) | (1L << T__62))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__88 - 87)) | (1L << (T__89 - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (BreakKeyword - 87)) | (1L << (ContinueKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				{
				setState(855);
				assemblyItem();
				}
				}
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(861);
			match(T__32);
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
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(864);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(865);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(866);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(867);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(868);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(869);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(870);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(871);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(872);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(873);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(874);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(875);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(876);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(877);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(878);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(879);
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
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__55:
			case T__59:
			case T__62:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
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
			setState(890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				{
				setState(886);
				match(T__55);
				}
				break;
			case T__59:
				{
				setState(887);
				match(T__59);
				}
				break;
			case T__62:
				{
				setState(888);
				match(T__62);
				}
				break;
			case T__29:
			case Identifier:
				{
				setState(889);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(892);
				match(T__0);
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__55) | (1L << T__59) | (1L << T__62))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (DecimalNumber - 104)) | (1L << (HexNumber - 104)) | (1L << (HexLiteral - 104)) | (1L << (Identifier - 104)) | (1L << (StringLiteral - 104)))) != 0)) {
					{
					setState(893);
					assemblyExpression();
					}
				}

				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(896);
					match(T__31);
					setState(897);
					assemblyExpression();
					}
					}
					setState(902);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(903);
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
			setState(906);
			match(T__86);
			setState(907);
			assemblyIdentifierOrList();
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__87) {
				{
				setState(908);
				match(T__87);
				setState(909);
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
			setState(912);
			assemblyIdentifierOrList();
			setState(913);
			match(T__87);
			setState(914);
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
			setState(921);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				match(T__0);
				setState(918);
				assemblyIdentifierList();
				setState(919);
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
			setState(923);
			identifier();
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(924);
				match(T__31);
				setState(925);
				identifier();
				}
				}
				setState(930);
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
			setState(931);
			match(T__88);
			setState(932);
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
			setState(934);
			identifier();
			setState(935);
			match(T__5);
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
			setState(937);
			match(T__89);
			setState(938);
			assemblyExpression();
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__90 || _la==T__91) {
				{
				{
				setState(939);
				assemblyCase();
				}
				}
				setState(944);
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
			setState(951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__90:
				enterOuterAlt(_localctx, 1);
				{
				setState(945);
				match(T__90);
				setState(946);
				assemblyLiteral();
				setState(947);
				assemblyBlock();
				}
				break;
			case T__91:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				match(T__91);
				setState(950);
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
			setState(953);
			match(T__42);
			setState(954);
			identifier();
			setState(955);
			match(T__0);
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29 || _la==Identifier) {
				{
				setState(956);
				assemblyIdentifierList();
				}
			}

			setState(959);
			match(T__1);
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(960);
				assemblyFunctionReturns();
				}
			}

			setState(963);
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
			setState(965);
			match(T__12);
			setState(966);
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
			setState(968);
			match(T__38);
			setState(971);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				{
				setState(969);
				assemblyBlock();
				}
				break;
			case T__29:
			case T__55:
			case T__59:
			case T__62:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(970);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(973);
			assemblyExpression();
			setState(976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				{
				setState(974);
				assemblyBlock();
				}
				break;
			case T__29:
			case T__55:
			case T__59:
			case T__62:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(975);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(978);
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
			setState(980);
			match(T__50);
			setState(981);
			assemblyExpression();
			setState(982);
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
			setState(984);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (DecimalNumber - 104)) | (1L << (HexNumber - 104)) | (1L << (HexLiteral - 104)) | (1L << (StringLiteral - 104)))) != 0)) ) {
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
			setState(986);
			match(T__53);
			setState(987);
			identifier();
			setState(988);
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
			setState(1016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				match(T__0);
				{
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__29) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(991);
					expression(0);
					}
				}

				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(994);
					match(T__31);
					setState(996);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__29) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
						{
						setState(995);
						expression(0);
						}
					}

					}
					}
					setState(1002);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1003);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				match(T__7);
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__29) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1005);
					expression(0);
					setState(1010);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__31) {
						{
						{
						setState(1006);
						match(T__31);
						setState(1007);
						expression(0);
						}
						}
						setState(1012);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1015);
				match(T__8);
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
			setState(1018);
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
			setState(1020);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1021);
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
			setState(1024);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==Identifier) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3}\u0405\4\2\t\2\4"+
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
		"\3\4\3\4\3\4\3\4\3\4\5\4\u00d3\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u00da\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00ec"+
		"\n\4\f\4\16\4\u00ef\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f8\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0102\n\5\f\5\16\5\u0105\13\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n\u0112\n\n\f\n\16\n\u0115\13\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\5\r\u0122\n\r\3\16\3"+
		"\16\5\16\u0126\n\16\3\17\3\17\3\20\5\20\u012b\n\20\3\20\3\20\3\21\3\21"+
		"\3\21\5\21\u0132\n\21\3\22\3\22\3\22\3\22\5\22\u0138\n\22\3\22\3\22\3"+
		"\22\3\22\5\22\u013e\n\22\3\22\3\22\5\22\u0142\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u014c\n\22\f\22\16\22\u014f\13\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0156\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u015e"+
		"\n\23\f\23\16\23\u0161\13\23\5\23\u0163\n\23\3\23\3\23\7\23\u0167\n\23"+
		"\f\23\16\23\u016a\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0173"+
		"\n\24\f\24\16\24\u0176\13\24\3\24\3\24\5\24\u017a\n\24\3\25\3\25\7\25"+
		"\u017e\n\25\f\25\16\25\u0181\13\25\3\25\3\25\3\25\5\25\u0186\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u018f\n\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u019b\n\27\f\27\16\27\u019e\13\27\5\27"+
		"\u01a0\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u01ac"+
		"\n\31\3\31\3\31\3\32\3\32\3\32\5\32\u01b3\n\32\3\32\5\32\u01b6\n\32\3"+
		"\33\3\33\5\33\u01ba\n\33\3\33\3\33\3\33\5\33\u01bf\n\33\3\33\3\33\5\33"+
		"\u01c3\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01ce\n"+
		"\35\f\35\16\35\u01d1\13\35\3\36\3\36\3\36\3\36\5\36\u01d7\n\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3 \3 \5 \u01e1\n \3 \3 \7 \u01e5\n \f \16 \u01e8\13"+
		" \3 \3 \3!\3!\3!\3!\7!\u01f0\n!\f!\16!\u01f3\13!\5!\u01f5\n!\3!\3!\3\""+
		"\3\"\5\"\u01fb\n\"\3\"\5\"\u01fe\n\"\3#\3#\3#\3#\7#\u0204\n#\f#\16#\u0207"+
		"\13#\5#\u0209\n#\3#\3#\3$\3$\5$\u020f\n$\3$\5$\u0212\n$\3%\3%\3%\3%\7"+
		"%\u0218\n%\f%\16%\u021b\13%\5%\u021d\n%\3%\3%\3&\3&\5&\u0223\n&\3\'\3"+
		"\'\5\'\u0227\n\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0230\n(\3(\3(\3(\5(\u0235"+
		"\n(\3(\7(\u0238\n(\f(\16(\u023b\13(\3)\3)\3)\7)\u0240\n)\f)\16)\u0243"+
		"\13)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\7+\u0251\n+\f+\16+\u0254\13+"+
		"\3+\3+\5+\u0258\n+\3,\3,\3-\3-\3.\3.\7.\u0260\n.\f.\16.\u0263\13.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0273\n/\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u027f\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\5\63\u0289\n\63\3\64\3\64\3\64\3\64\5\64\u028f\n\64\3"+
		"\64\5\64\u0292\n\64\3\64\3\64\5\64\u0296\n\64\3\64\3\64\3\64\3\65\3\65"+
		"\5\65\u029d\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\38\38\38\39\39\59\u02b1\n9\39\39\3:\3:\3:\3;\3;\3;\3;\3<\3"+
		"<\3<\5<\u02bf\n<\3<\3<\5<\u02c3\n<\3<\3<\3=\3=\5=\u02c9\n=\3=\7=\u02cc"+
		"\n=\f=\16=\u02cf\13=\3=\5=\u02d2\n=\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u02ea\n?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\7?\u0325\n?\f?\16?\u0328\13?\3@\3@\3@\3@\3@\3@\3@\5@\u0331\n@"+
		"\3A\3A\3A\7A\u0336\nA\fA\16A\u0339\13A\3B\3B\3B\7B\u033e\nB\fB\16B\u0341"+
		"\13B\3B\5B\u0344\nB\3C\3C\3C\3C\3D\3D\5D\u034c\nD\3D\3D\5D\u0350\nD\5"+
		"D\u0352\nD\3E\3E\3E\3E\3E\3F\3F\7F\u035b\nF\fF\16F\u035e\13F\3F\3F\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0373\nG\3H\3H\5H"+
		"\u0377\nH\3I\3I\3I\3I\5I\u037d\nI\3I\3I\5I\u0381\nI\3I\3I\7I\u0385\nI"+
		"\fI\16I\u0388\13I\3I\5I\u038b\nI\3J\3J\3J\3J\5J\u0391\nJ\3K\3K\3K\3K\3"+
		"L\3L\3L\3L\3L\5L\u039c\nL\3M\3M\3M\7M\u03a1\nM\fM\16M\u03a4\13M\3N\3N"+
		"\3N\3O\3O\3O\3P\3P\3P\7P\u03af\nP\fP\16P\u03b2\13P\3Q\3Q\3Q\3Q\3Q\3Q\5"+
		"Q\u03ba\nQ\3R\3R\3R\3R\5R\u03c0\nR\3R\3R\5R\u03c4\nR\3R\3R\3S\3S\3S\3"+
		"T\3T\3T\5T\u03ce\nT\3T\3T\3T\5T\u03d3\nT\3T\3T\3U\3U\3U\3U\3V\3V\3W\3"+
		"W\3W\3W\3X\3X\5X\u03e3\nX\3X\3X\5X\u03e7\nX\7X\u03e9\nX\fX\16X\u03ec\13"+
		"X\3X\3X\3X\3X\3X\7X\u03f3\nX\fX\16X\u03f6\13X\5X\u03f8\nX\3X\5X\u03fb"+
		"\nX\3Y\3Y\3Z\3Z\5Z\u0401\nZ\3[\3[\3[\2\6\6\bN|\\\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\2\25\3\2\6\7\3\2\r\17\3\2\20\21\3\2\22\25\3\2"+
		"\26\27\4\2\22\25\32\34\3\2$&\5\2qquuwx\3\2\63\64\5\2qqvvyz\4\2=Acg\3\2"+
		"BC\3\2EF\4\2\37\37HI\3\2JK\4\2\34\34OX\5\2jkmm||\3\2jk\4\2  {{\2\u045d"+
		"\2\u00bf\3\2\2\2\4\u00c1\3\2\2\2\6\u00d9\3\2\2\2\b\u00f7\3\2\2\2\n\u0106"+
		"\3\2\2\2\f\u0108\3\2\2\2\16\u010a\3\2\2\2\20\u010c\3\2\2\2\22\u0113\3"+
		"\2\2\2\24\u0118\3\2\2\2\26\u011d\3\2\2\2\30\u0121\3\2\2\2\32\u0123\3\2"+
		"\2\2\34\u0127\3\2\2\2\36\u012a\3\2\2\2 \u012e\3\2\2\2\"\u0155\3\2\2\2"+
		"$\u0157\3\2\2\2&\u016d\3\2\2\2(\u017b\3\2\2\2*\u0189\3\2\2\2,\u0192\3"+
		"\2\2\2.\u01a3\3\2\2\2\60\u01a8\3\2\2\2\62\u01af\3\2\2\2\64\u01b7\3\2\2"+
		"\2\66\u01c4\3\2\2\28\u01cf\3\2\2\2:\u01d2\3\2\2\2<\u01da\3\2\2\2>\u01dc"+
		"\3\2\2\2@\u01eb\3\2\2\2B\u01f8\3\2\2\2D\u01ff\3\2\2\2F\u020c\3\2\2\2H"+
		"\u0213\3\2\2\2J\u0220\3\2\2\2L\u0224\3\2\2\2N\u022f\3\2\2\2P\u023c\3\2"+
		"\2\2R\u0244\3\2\2\2T\u024b\3\2\2\2V\u0259\3\2\2\2X\u025b\3\2\2\2Z\u025d"+
		"\3\2\2\2\\\u0272\3\2\2\2^\u0274\3\2\2\2`\u0277\3\2\2\2b\u0280\3\2\2\2"+
		"d\u0288\3\2\2\2f\u028a\3\2\2\2h\u029a\3\2\2\2j\u02a0\3\2\2\2l\u02a8\3"+
		"\2\2\2n\u02ab\3\2\2\2p\u02ae\3\2\2\2r\u02b4\3\2\2\2t\u02b7\3\2\2\2v\u02be"+
		"\3\2\2\2x\u02c6\3\2\2\2z\u02d5\3\2\2\2|\u02e9\3\2\2\2~\u0330\3\2\2\2\u0080"+
		"\u0332\3\2\2\2\u0082\u033a\3\2\2\2\u0084\u0345\3\2\2\2\u0086\u0351\3\2"+
		"\2\2\u0088\u0353\3\2\2\2\u008a\u0358\3\2\2\2\u008c\u0372\3\2\2\2\u008e"+
		"\u0376\3\2\2\2\u0090\u037c\3\2\2\2\u0092\u038c\3\2\2\2\u0094\u0392\3\2"+
		"\2\2\u0096\u039b\3\2\2\2\u0098\u039d\3\2\2\2\u009a\u03a5\3\2\2\2\u009c"+
		"\u03a8\3\2\2\2\u009e\u03ab\3\2\2\2\u00a0\u03b9\3\2\2\2\u00a2\u03bb\3\2"+
		"\2\2\u00a4\u03c7\3\2\2\2\u00a6\u03ca\3\2\2\2\u00a8\u03d6\3\2\2\2\u00aa"+
		"\u03da\3\2\2\2\u00ac\u03dc\3\2\2\2\u00ae\u03fa\3\2\2\2\u00b0\u03fc\3\2"+
		"\2\2\u00b2\u03fe\3\2\2\2\u00b4\u0402\3\2\2\2\u00b6\u00c0\5(\25\2\u00b7"+
		"\u00c0\5*\26\2\u00b8\u00c0\5,\27\2\u00b9\u00c0\5.\30\2\u00ba\u00c0\5\60"+
		"\31\2\u00bb\u00c0\5\64\33\2\u00bc\u00c0\5:\36\2\u00bd\u00c0\5> \2\u00be"+
		"\u00c0\5\4\3\2\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b8\3\2"+
		"\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf"+
		"\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\3\3\2\2\2"+
		"\u00c1\u00c2\7_\2\2\u00c2\u00c3\7`\2\2\u00c3\u00c4\5\6\4\2\u00c4\5\3\2"+
		"\2\2\u00c5\u00c6\b\4\1\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8\5\6\4\2\u00c8"+
		"\u00c9\7\4\2\2\u00c9\u00da\3\2\2\2\u00ca\u00cb\7\5\2\2\u00cb\u00da\5\6"+
		"\4\5\u00cc\u00cd\t\2\2\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf\5\u00b4[\2\u00cf"+
		"\u00d0\5z>\2\u00d0\u00d2\7\b\2\2\u00d1\u00d3\5\6\4\2\u00d2\u00d1\3\2\2"+
		"\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6"+
		"\5\6\4\2\u00d6\u00d7\7\4\2\2\u00d7\u00da\3\2\2\2\u00d8\u00da\5\b\5\2\u00d9"+
		"\u00c5\3\2\2\2\u00d9\u00ca\3\2\2\2\u00d9\u00cc\3\2\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00ed\3\2\2\2\u00db\u00dc\f\t\2\2\u00dc\u00dd\5\f\7\2\u00dd"+
		"\u00de\5\6\4\n\u00de\u00ec\3\2\2\2\u00df\u00e0\f\b\2\2\u00e0\u00e1\5\n"+
		"\6\2\u00e1\u00e2\5\6\4\t\u00e2\u00ec\3\2\2\2\u00e3\u00e4\f\7\2\2\u00e4"+
		"\u00e5\5\16\b\2\u00e5\u00e6\5\6\4\b\u00e6\u00ec\3\2\2\2\u00e7\u00e8\f"+
		"\6\2\2\u00e8\u00e9\5\20\t\2\u00e9\u00ea\5\6\4\7\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00db\3\2\2\2\u00eb\u00df\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e7\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\7\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\b\5\1\2\u00f1\u00f8\5~@\2\u00f2"+
		"\u00f3\7\f\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\5\b\5\2\u00f5\u00f6\7\4"+
		"\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8"+
		"\u0103\3\2\2\2\u00f9\u00fa\f\5\2\2\u00fa\u00fb\7\t\2\2\u00fb\u0102\5\u00b4"+
		"[\2\u00fc\u00fd\f\4\2\2\u00fd\u00fe\7\n\2\2\u00fe\u00ff\5~@\2\u00ff\u0100"+
		"\7\13\2\2\u0100\u0102\3\2\2\2\u0101\u00f9\3\2\2\2\u0101\u00fc\3\2\2\2"+
		"\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\t\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\t\3\2\2\u0107\13\3\2\2\2\u0108"+
		"\u0109\t\4\2\2\u0109\r\3\2\2\2\u010a\u010b\t\5\2\2\u010b\17\3\2\2\2\u010c"+
		"\u010d\t\6\2\2\u010d\21\3\2\2\2\u010e\u0112\5\24\13\2\u010f\u0112\5\""+
		"\22\2\u0110\u0112\5$\23\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\2\2\3\u0117"+
		"\23\3\2\2\2\u0118\u0119\7\30\2\2\u0119\u011a\5\26\f\2\u011a\u011b\5\30"+
		"\r\2\u011b\u011c\7\31\2\2\u011c\25\3\2\2\2\u011d\u011e\5\u00b4[\2\u011e"+
		"\27\3\2\2\2\u011f\u0122\5\32\16\2\u0120\u0122\5|?\2\u0121\u011f\3\2\2"+
		"\2\u0121\u0120\3\2\2\2\u0122\31\3\2\2\2\u0123\u0125\5\36\20\2\u0124\u0126"+
		"\5\36\20\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\33\3\2\2\2\u0127"+
		"\u0128\t\7\2\2\u0128\35\3\2\2\2\u0129\u012b\5\34\17\2\u012a\u0129\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7h\2\2\u012d"+
		"\37\3\2\2\2\u012e\u0131\5\u00b4[\2\u012f\u0130\7\35\2\2\u0130\u0132\5"+
		"\u00b4[\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132!\3\2\2\2\u0133"+
		"\u0134\7\36\2\2\u0134\u0137\7|\2\2\u0135\u0136\7\35\2\2\u0136\u0138\5"+
		"\u00b4[\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2"+
		"\u0139\u0156\7\31\2\2\u013a\u013d\7\36\2\2\u013b\u013e\7\37\2\2\u013c"+
		"\u013e\5\u00b4[\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0141"+
		"\3\2\2\2\u013f\u0140\7\35\2\2\u0140\u0142\5\u00b4[\2\u0141\u013f\3\2\2"+
		"\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7 \2\2\u0144\u0145"+
		"\7|\2\2\u0145\u0156\7\31\2\2\u0146\u0147\7\36\2\2\u0147\u0148\7!\2\2\u0148"+
		"\u014d\5 \21\2\u0149\u014a\7\"\2\2\u014a\u014c\5 \21\2\u014b\u0149\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7#\2\2\u0151\u0152\7 \2"+
		"\2\u0152\u0153\7|\2\2\u0153\u0154\7\31\2\2\u0154\u0156\3\2\2\2\u0155\u0133"+
		"\3\2\2\2\u0155\u013a\3\2\2\2\u0155\u0146\3\2\2\2\u0156#\3\2\2\2\u0157"+
		"\u0158\t\b\2\2\u0158\u0162\5\u00b4[\2\u0159\u015a\7\'\2\2\u015a\u015f"+
		"\5&\24\2\u015b\u015c\7\"\2\2\u015c\u015e\5&\24\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0163\3\2"+
		"\2\2\u0161\u015f\3\2\2\2\u0162\u0159\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0168\7!\2\2\u0165\u0167\5\2\2\2\u0166\u0165\3\2"+
		"\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7#\2\2\u016c%\3\2\2\2\u016d"+
		"\u0179\5P)\2\u016e\u016f\7\3\2\2\u016f\u0174\5|?\2\u0170\u0171\7\"\2\2"+
		"\u0171\u0173\5|?\2\u0172\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\7\4\2\2\u0178\u017a\3\2\2\2\u0179\u016e\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\'\3\2\2\2\u017b\u017f\5N(\2\u017c\u017e\t\t\2\2\u017d\u017c"+
		"\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0185\5\u00b4[\2\u0183\u0184"+
		"\7\34\2\2\u0184\u0186\5|?\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0188\7\31\2\2\u0188)\3\2\2\2\u0189\u018a\7(\2\2"+
		"\u018a\u018b\5\u00b4[\2\u018b\u018e\7)\2\2\u018c\u018f\7\37\2\2\u018d"+
		"\u018f\5N(\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2"+
		"\2\u0190\u0191\7\31\2\2\u0191+\3\2\2\2\u0192\u0193\7*\2\2\u0193\u0194"+
		"\5\u00b4[\2\u0194\u019f\7!\2\2\u0195\u0196\5L\'\2\u0196\u019c\7\31\2\2"+
		"\u0197\u0198\5L\'\2\u0198\u0199\7\31\2\2\u0199\u019b\3\2\2\2\u019a\u0197"+
		"\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u0195\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\7#\2\2\u01a2-\3\2\2\2\u01a3\u01a4"+
		"\7+\2\2\u01a4\u01a5\5@!\2\u01a5\u01a6\58\35\2\u01a6\u01a7\5Z.\2\u01a7"+
		"/\3\2\2\2\u01a8\u01a9\7,\2\2\u01a9\u01ab\5\u00b4[\2\u01aa\u01ac\5@!\2"+
		"\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae"+
		"\5Z.\2\u01ae\61\3\2\2\2\u01af\u01b5\5\u00b4[\2\u01b0\u01b2\7\3\2\2\u01b1"+
		"\u01b3\5\u0080A\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b6\7\4\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\63\3\2\2\2\u01b7\u01b9\7-\2\2\u01b8\u01ba\5\u00b4[\2\u01b9\u01b8\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5@!\2\u01bc\u01be"+
		"\58\35\2\u01bd\u01bf\5\66\34\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2"+
		"\u01bf\u01c2\3\2\2\2\u01c0\u01c3\7\31\2\2\u01c1\u01c3\5Z.\2\u01c2\u01c0"+
		"\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\65\3\2\2\2\u01c4\u01c5\7.\2\2\u01c5"+
		"\u01c6\5@!\2\u01c6\67\3\2\2\2\u01c7\u01ce\5\62\32\2\u01c8\u01ce\5X-\2"+
		"\u01c9\u01ce\7s\2\2\u01ca\u01ce\7x\2\2\u01cb\u01ce\7u\2\2\u01cc\u01ce"+
		"\7w\2\2\u01cd\u01c7\3\2\2\2\u01cd\u01c8\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd"+
		"\u01ca\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2"+
		"\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d09\3\2\2\2\u01d1\u01cf"+
		"\3\2\2\2\u01d2\u01d3\7/\2\2\u01d3\u01d4\5\u00b4[\2\u01d4\u01d6\5D#\2\u01d5"+
		"\u01d7\7o\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d9\7\31\2\2\u01d9;\3\2\2\2\u01da\u01db\5\u00b4[\2\u01db"+
		"=\3\2\2\2\u01dc\u01dd\7\60\2\2\u01dd\u01de\5\u00b4[\2\u01de\u01e0\7!\2"+
		"\2\u01df\u01e1\5<\37\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e6"+
		"\3\2\2\2\u01e2\u01e3\7\"\2\2\u01e3\u01e5\5<\37\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\7#\2\2\u01ea?\3\2\2\2\u01eb\u01f4"+
		"\7\3\2\2\u01ec\u01f1\5B\"\2\u01ed\u01ee\7\"\2\2\u01ee\u01f0\5B\"\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01ec\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\7\4\2\2\u01f7A\3\2\2\2"+
		"\u01f8\u01fa\5N(\2\u01f9\u01fb\5V,\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3"+
		"\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fe\5\u00b4[\2\u01fd\u01fc\3\2\2\2"+
		"\u01fd\u01fe\3\2\2\2\u01feC\3\2\2\2\u01ff\u0208\7\3\2\2\u0200\u0205\5"+
		"F$\2\u0201\u0202\7\"\2\2\u0202\u0204\5F$\2\u0203\u0201\3\2\2\2\u0204\u0207"+
		"\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0208\u0200\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u020b\7\4\2\2\u020bE\3\2\2\2\u020c\u020e\5N(\2\u020d\u020f"+
		"\7t\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210"+
		"\u0212\5\u00b4[\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212G\3\2\2"+
		"\2\u0213\u021c\7\3\2\2\u0214\u0219\5J&\2\u0215\u0216\7\"\2\2\u0216\u0218"+
		"\5J&\2\u0217\u0215\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u0214\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\7\4\2\2\u021f"+
		"I\3\2\2\2\u0220\u0222\5N(\2\u0221\u0223\5V,\2\u0222\u0221\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223K\3\2\2\2\u0224\u0226\5N(\2\u0225\u0227\5V,\2\u0226"+
		"\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\5\u00b4"+
		"[\2\u0229M\3\2\2\2\u022a\u022b\b(\1\2\u022b\u0230\5z>\2\u022c\u0230\5"+
		"P)\2\u022d\u0230\5R*\2\u022e\u0230\5T+\2\u022f\u022a\3\2\2\2\u022f\u022c"+
		"\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u022e\3\2\2\2\u0230\u0239\3\2\2\2\u0231"+
		"\u0232\f\4\2\2\u0232\u0234\7\n\2\2\u0233\u0235\5|?\2\u0234\u0233\3\2\2"+
		"\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\7\13\2\2\u0237"+
		"\u0231\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023aO\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u0241\5\u00b4[\2\u023d\u023e"+
		"\7\t\2\2\u023e\u0240\5\u00b4[\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2"+
		"\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242Q\3\2\2\2\u0243\u0241"+
		"\3\2\2\2\u0244\u0245\7\61\2\2\u0245\u0246\7\3\2\2\u0246\u0247\5z>\2\u0247"+
		"\u0248\7\62\2\2\u0248\u0249\5N(\2\u0249\u024a\7\4\2\2\u024aS\3\2\2\2\u024b"+
		"\u024c\7-\2\2\u024c\u0252\5H%\2\u024d\u0251\7u\2\2\u024e\u0251\7s\2\2"+
		"\u024f\u0251\5X-\2\u0250\u024d\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u024f"+
		"\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0257\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\7.\2\2\u0256\u0258\5H%"+
		"\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258U\3\2\2\2\u0259\u025a"+
		"\t\n\2\2\u025aW\3\2\2\2\u025b\u025c\t\13\2\2\u025cY\3\2\2\2\u025d\u0261"+
		"\7!\2\2\u025e\u0260\5\\/\2\u025f\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261"+
		"\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2"+
		"\2\2\u0264\u0265\7#\2\2\u0265[\3\2\2\2\u0266\u0273\5`\61\2\u0267\u0273"+
		"\5b\62\2\u0268\u0273\5f\64\2\u0269\u0273\5Z.\2\u026a\u0273\5h\65\2\u026b"+
		"\u0273\5j\66\2\u026c\u0273\5l\67\2\u026d\u0273\5n8\2\u026e\u0273\5p9\2"+
		"\u026f\u0273\5r:\2\u0270\u0273\5t;\2\u0271\u0273\5d\63\2\u0272\u0266\3"+
		"\2\2\2\u0272\u0267\3\2\2\2\u0272\u0268\3\2\2\2\u0272\u0269\3\2\2\2\u0272"+
		"\u026a\3\2\2\2\u0272\u026b\3\2\2\2\u0272\u026c\3\2\2\2\u0272\u026d\3\2"+
		"\2\2\u0272\u026e\3\2\2\2\u0272\u026f\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0271\3\2\2\2\u0273]\3\2\2\2\u0274\u0275\5|?\2\u0275\u0276\7\31\2\2\u0276"+
		"_\3\2\2\2\u0277\u0278\7\65\2\2\u0278\u0279\7\3\2\2\u0279\u027a\5|?\2\u027a"+
		"\u027b\7\4\2\2\u027b\u027e\5\\/\2\u027c\u027d\7\66\2\2\u027d\u027f\5\\"+
		"/\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027fa\3\2\2\2\u0280\u0281"+
		"\7\67\2\2\u0281\u0282\7\3\2\2\u0282\u0283\5|?\2\u0283\u0284\7\4\2\2\u0284"+
		"\u0285\5\\/\2\u0285c\3\2\2\2\u0286\u0289\5v<\2\u0287\u0289\5^\60\2\u0288"+
		"\u0286\3\2\2\2\u0288\u0287\3\2\2\2\u0289e\3\2\2\2\u028a\u028b\7)\2\2\u028b"+
		"\u028e\7\3\2\2\u028c\u028f\5d\63\2\u028d\u028f\7\31\2\2\u028e\u028c\3"+
		"\2\2\2\u028e\u028d\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u0292\5|?\2\u0291"+
		"\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\7\31"+
		"\2\2\u0294\u0296\5|?\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u0298\7\4\2\2\u0298\u0299\5\\/\2\u0299g\3\2\2\2\u029a\u029c"+
		"\78\2\2\u029b\u029d\7|\2\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u029f\5\u008aF\2\u029fi\3\2\2\2\u02a0\u02a1\79\2"+
		"\2\u02a1\u02a2\5\\/\2\u02a2\u02a3\7\67\2\2\u02a3\u02a4\7\3\2\2\u02a4\u02a5"+
		"\5|?\2\u02a5\u02a6\7\4\2\2\u02a6\u02a7\7\31\2\2\u02a7k\3\2\2\2\u02a8\u02a9"+
		"\7r\2\2\u02a9\u02aa\7\31\2\2\u02aam\3\2\2\2\u02ab\u02ac\7p\2\2\u02ac\u02ad"+
		"\7\31\2\2\u02ado\3\2\2\2\u02ae\u02b0\7:\2\2\u02af\u02b1\5|?\2\u02b0\u02af"+
		"\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\31\2\2"+
		"\u02b3q\3\2\2\2\u02b4\u02b5\7;\2\2\u02b5\u02b6\7\31\2\2\u02b6s\3\2\2\2"+
		"\u02b7\u02b8\7<\2\2\u02b8\u02b9\5\u0088E\2\u02b9\u02ba\7\31\2\2\u02ba"+
		"u\3\2\2\2\u02bb\u02bc\7=\2\2\u02bc\u02bf\5x=\2\u02bd\u02bf\5L\'\2\u02be"+
		"\u02bb\3\2\2\2\u02be\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02c1\7\34"+
		"\2\2\u02c1\u02c3\5|?\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4"+
		"\3\2\2\2\u02c4\u02c5\7\31\2\2\u02c5w\3\2\2\2\u02c6\u02cd\7\3\2\2\u02c7"+
		"\u02c9\5\u00b4[\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca"+
		"\3\2\2\2\u02ca\u02cc\7\"\2\2\u02cb\u02c8\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd"+
		"\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2"+
		"\2\2\u02d0\u02d2\5\u00b4[\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d4\7\4\2\2\u02d4y\3\2\2\2\u02d5\u02d6\t\f\2\2"+
		"\u02d6{\3\2\2\2\u02d7\u02d8\b?\1\2\u02d8\u02d9\7D\2\2\u02d9\u02ea\5N("+
		"\2\u02da\u02db\7\3\2\2\u02db\u02dc\5|?\2\u02dc\u02dd\7\4\2\2\u02dd\u02ea"+
		"\3\2\2\2\u02de\u02df\t\r\2\2\u02df\u02ea\5|?\25\u02e0\u02e1\t\6\2\2\u02e1"+
		"\u02ea\5|?\24\u02e2\u02e3\t\16\2\2\u02e3\u02ea\5|?\23\u02e4\u02e5\7\5"+
		"\2\2\u02e5\u02ea\5|?\22\u02e6\u02e7\7\33\2\2\u02e7\u02ea\5|?\21\u02e8"+
		"\u02ea\5~@\2\u02e9\u02d7\3\2\2\2\u02e9\u02da\3\2\2\2\u02e9\u02de\3\2\2"+
		"\2\u02e9\u02e0\3\2\2\2\u02e9\u02e2\3\2\2\2\u02e9\u02e4\3\2\2\2\u02e9\u02e6"+
		"\3\2\2\2\u02e9\u02e8\3\2\2\2\u02ea\u0326\3\2\2\2\u02eb\u02ec\f\20\2\2"+
		"\u02ec\u02ed\7G\2\2\u02ed\u0325\5|?\21\u02ee\u02ef\f\17\2\2\u02ef\u02f0"+
		"\t\17\2\2\u02f0\u0325\5|?\20\u02f1\u02f2\f\16\2\2\u02f2\u02f3\t\6\2\2"+
		"\u02f3\u0325\5|?\17\u02f4\u02f5\f\r\2\2\u02f5\u02f6\t\20\2\2\u02f6\u0325"+
		"\5|?\16\u02f7\u02f8\f\f\2\2\u02f8\u02f9\7L\2\2\u02f9\u0325\5|?\r\u02fa"+
		"\u02fb\f\13\2\2\u02fb\u02fc\7\32\2\2\u02fc\u0325\5|?\f\u02fd\u02fe\f\n"+
		"\2\2\u02fe\u02ff\7M\2\2\u02ff\u0325\5|?\13\u0300\u0301\f\t\2\2\u0301\u0302"+
		"\t\5\2\2\u0302\u0325\5|?\n\u0303\u0304\f\b\2\2\u0304\u0305\t\4\2\2\u0305"+
		"\u0325\5|?\t\u0306\u0307\f\7\2\2\u0307\u0308\7\r\2\2\u0308\u0325\5|?\b"+
		"\u0309\u030a\f\6\2\2\u030a\u030b\7\16\2\2\u030b\u0325\5|?\7\u030c\u030d"+
		"\f\5\2\2\u030d\u030e\7N\2\2\u030e\u030f\5|?\2\u030f\u0310\7\b\2\2\u0310"+
		"\u0311\5|?\6\u0311\u0325\3\2\2\2\u0312\u0313\f\4\2\2\u0313\u0314\t\21"+
		"\2\2\u0314\u0325\5|?\5\u0315\u0316\f\33\2\2\u0316\u0325\t\r\2\2\u0317"+
		"\u0318\f\31\2\2\u0318\u0319\7\n\2\2\u0319\u031a\5|?\2\u031a\u031b\7\13"+
		"\2\2\u031b\u0325\3\2\2\2\u031c\u031d\f\30\2\2\u031d\u031e\7\3\2\2\u031e"+
		"\u031f\5\u0086D\2\u031f\u0320\7\4\2\2\u0320\u0325\3\2\2\2\u0321\u0322"+
		"\f\27\2\2\u0322\u0323\7\t\2\2\u0323\u0325\5\u00b4[\2\u0324\u02eb\3\2\2"+
		"\2\u0324\u02ee\3\2\2\2\u0324\u02f1\3\2\2\2\u0324\u02f4\3\2\2\2\u0324\u02f7"+
		"\3\2\2\2\u0324\u02fa\3\2\2\2\u0324\u02fd\3\2\2\2\u0324\u0300\3\2\2\2\u0324"+
		"\u0303\3\2\2\2\u0324\u0306\3\2\2\2\u0324\u0309\3\2\2\2\u0324\u030c\3\2"+
		"\2\2\u0324\u0312\3\2\2\2\u0324\u0315\3\2\2\2\u0324\u0317\3\2\2\2\u0324"+
		"\u031c\3\2\2\2\u0324\u0321\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2"+
		"\2\2\u0326\u0327\3\2\2\2\u0327}\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u0331"+
		"\7i\2\2\u032a\u0331\5\u00b2Z\2\u032b\u0331\7m\2\2\u032c\u0331\7|\2\2\u032d"+
		"\u0331\5\u00b4[\2\u032e\u0331\5\u00aeX\2\u032f\u0331\5\u00b0Y\2\u0330"+
		"\u0329\3\2\2\2\u0330\u032a\3\2\2\2\u0330\u032b\3\2\2\2\u0330\u032c\3\2"+
		"\2\2\u0330\u032d\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u032f\3\2\2\2\u0331"+
		"\177\3\2\2\2\u0332\u0337\5|?\2\u0333\u0334\7\"\2\2\u0334\u0336\5|?\2\u0335"+
		"\u0333\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2"+
		"\2\2\u0338\u0081\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u033f\5\u0084C\2\u033b"+
		"\u033c\7\"\2\2\u033c\u033e\5\u0084C\2\u033d\u033b\3\2\2\2\u033e\u0341"+
		"\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0343\3\2\2\2\u0341"+
		"\u033f\3\2\2\2\u0342\u0344\7\"\2\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2"+
		"\2\2\u0344\u0083\3\2\2\2\u0345\u0346\5\u00b4[\2\u0346\u0347\7\b\2\2\u0347"+
		"\u0348\5|?\2\u0348\u0085\3\2\2\2\u0349\u034b\7!\2\2\u034a\u034c\5\u0082"+
		"B\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u0352\7#\2\2\u034e\u0350\5\u0080A\2\u034f\u034e\3\2\2\2\u034f\u0350\3"+
		"\2\2\2\u0350\u0352\3\2\2\2\u0351\u0349\3\2\2\2\u0351\u034f\3\2\2\2\u0352"+
		"\u0087\3\2\2\2\u0353\u0354\5|?\2\u0354\u0355\7\3\2\2\u0355\u0356\5\u0086"+
		"D\2\u0356\u0357\7\4\2\2\u0357\u0089\3\2\2\2\u0358\u035c\7!\2\2\u0359\u035b"+
		"\5\u008cG\2\u035a\u0359\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2"+
		"\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0360"+
		"\7#\2\2\u0360\u008b\3\2\2\2\u0361\u0373\5\u00b4[\2\u0362\u0373\5\u008a"+
		"F\2\u0363\u0373\5\u008eH\2\u0364\u0373\5\u0092J\2\u0365\u0373\5\u0094"+
		"K\2\u0366\u0373\5\u009aN\2\u0367\u0373\5\u009cO\2\u0368\u0373\5\u009e"+
		"P\2\u0369\u0373\5\u00a2R\2\u036a\u0373\5\u00a6T\2\u036b\u0373\5\u00a8"+
		"U\2\u036c\u0373\7p\2\2\u036d\u0373\7r\2\2\u036e\u0373\5\u00acW\2\u036f"+
		"\u0373\5\u00b2Z\2\u0370\u0373\7|\2\2\u0371\u0373\7m\2\2\u0372\u0361\3"+
		"\2\2\2\u0372\u0362\3\2\2\2\u0372\u0363\3\2\2\2\u0372\u0364\3\2\2\2\u0372"+
		"\u0365\3\2\2\2\u0372\u0366\3\2\2\2\u0372\u0367\3\2\2\2\u0372\u0368\3\2"+
		"\2\2\u0372\u0369\3\2\2\2\u0372\u036a\3\2\2\2\u0372\u036b\3\2\2\2\u0372"+
		"\u036c\3\2\2\2\u0372\u036d\3\2\2\2\u0372\u036e\3\2\2\2\u0372\u036f\3\2"+
		"\2\2\u0372\u0370\3\2\2\2\u0372\u0371\3\2\2\2\u0373\u008d\3\2\2\2\u0374"+
		"\u0377\5\u0090I\2\u0375\u0377\5\u00aaV\2\u0376\u0374\3\2\2\2\u0376\u0375"+
		"\3\2\2\2\u0377\u008f\3\2\2\2\u0378\u037d\7:\2\2\u0379\u037d\7>\2\2\u037a"+
		"\u037d\7A\2\2\u037b\u037d\5\u00b4[\2\u037c\u0378\3\2\2\2\u037c\u0379\3"+
		"\2\2\2\u037c\u037a\3\2\2\2\u037c\u037b\3\2\2\2\u037d\u038a\3\2\2\2\u037e"+
		"\u0380\7\3\2\2\u037f\u0381\5\u008eH\2\u0380\u037f\3\2\2\2\u0380\u0381"+
		"\3\2\2\2\u0381\u0386\3\2\2\2\u0382\u0383\7\"\2\2\u0383\u0385\5\u008eH"+
		"\2\u0384\u0382\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387"+
		"\3\2\2\2\u0387\u0389\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038b\7\4\2\2\u038a"+
		"\u037e\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u0091\3\2\2\2\u038c\u038d\7Y"+
		"\2\2\u038d\u0390\5\u0096L\2\u038e\u038f\7Z\2\2\u038f\u0391\5\u008eH\2"+
		"\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0093\3\2\2\2\u0392\u0393"+
		"\5\u0096L\2\u0393\u0394\7Z\2\2\u0394\u0395\5\u008eH\2\u0395\u0095\3\2"+
		"\2\2\u0396\u039c\5\u00b4[\2\u0397\u0398\7\3\2\2\u0398\u0399\5\u0098M\2"+
		"\u0399\u039a\7\4\2\2\u039a\u039c\3\2\2\2\u039b\u0396\3\2\2\2\u039b\u0397"+
		"\3\2\2\2\u039c\u0097\3\2\2\2\u039d\u03a2\5\u00b4[\2\u039e\u039f\7\"\2"+
		"\2\u039f\u03a1\5\u00b4[\2\u03a0\u039e\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2"+
		"\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u0099\3\2\2\2\u03a4\u03a2\3\2"+
		"\2\2\u03a5\u03a6\7[\2\2\u03a6\u03a7\5\u00b4[\2\u03a7\u009b\3\2\2\2\u03a8"+
		"\u03a9\5\u00b4[\2\u03a9\u03aa\7\b\2\2\u03aa\u009d\3\2\2\2\u03ab\u03ac"+
		"\7\\\2\2\u03ac\u03b0\5\u008eH\2\u03ad\u03af\5\u00a0Q\2\u03ae\u03ad\3\2"+
		"\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1"+
		"\u009f\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b4\7]\2\2\u03b4\u03b5\5\u00aa"+
		"V\2\u03b5\u03b6\5\u008aF\2\u03b6\u03ba\3\2\2\2\u03b7\u03b8\7^\2\2\u03b8"+
		"\u03ba\5\u008aF\2\u03b9\u03b3\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u00a1"+
		"\3\2\2\2\u03bb\u03bc\7-\2\2\u03bc\u03bd\5\u00b4[\2\u03bd\u03bf\7\3\2\2"+
		"\u03be\u03c0\5\u0098M\2\u03bf\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0"+
		"\u03c1\3\2\2\2\u03c1\u03c3\7\4\2\2\u03c2\u03c4\5\u00a4S\2\u03c3\u03c2"+
		"\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\5\u008aF"+
		"\2\u03c6\u00a3\3\2\2\2\u03c7\u03c8\7\17\2\2\u03c8\u03c9\5\u0098M\2\u03c9"+
		"\u00a5\3\2\2\2\u03ca\u03cd\7)\2\2\u03cb\u03ce\5\u008aF\2\u03cc\u03ce\5"+
		"\u008eH\2\u03cd\u03cb\3\2\2\2\u03cd\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2"+
		"\u03cf\u03d2\5\u008eH\2\u03d0\u03d3\5\u008aF\2\u03d1\u03d3\5\u008eH\2"+
		"\u03d2\u03d0\3\2\2\2\u03d2\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5"+
		"\5\u008aF\2\u03d5\u00a7\3\2\2\2\u03d6\u03d7\7\65\2\2\u03d7\u03d8\5\u008e"+
		"H\2\u03d8\u03d9\5\u008aF\2\u03d9\u00a9\3\2\2\2\u03da\u03db\t\22\2\2\u03db"+
		"\u00ab\3\2\2\2\u03dc\u03dd\78\2\2\u03dd\u03de\5\u00b4[\2\u03de\u03df\5"+
		"\u008aF\2\u03df\u00ad\3\2\2\2\u03e0\u03e2\7\3\2\2\u03e1\u03e3\5|?\2\u03e2"+
		"\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03ea\3\2\2\2\u03e4\u03e6\7\""+
		"\2\2\u03e5\u03e7\5|?\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9"+
		"\3\2\2\2\u03e8\u03e4\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea"+
		"\u03eb\3\2\2\2\u03eb\u03ed\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03fb\7\4"+
		"\2\2\u03ee\u03f7\7\n\2\2\u03ef\u03f4\5|?\2\u03f0\u03f1\7\"\2\2\u03f1\u03f3"+
		"\5|?\2\u03f2\u03f0\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4"+
		"\u03f5\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u03ef\3\2"+
		"\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\7\13\2\2\u03fa"+
		"\u03e0\3\2\2\2\u03fa\u03ee\3\2\2\2\u03fb\u00af\3\2\2\2\u03fc\u03fd\5z"+
		">\2\u03fd\u00b1\3\2\2\2\u03fe\u0400\t\23\2\2\u03ff\u0401\7l\2\2\u0400"+
		"\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u00b3\3\2\2\2\u0402\u0403\t\24"+
		"\2\2\u0403\u00b5\3\2\2\2l\u00bf\u00d2\u00d9\u00eb\u00ed\u00f7\u0101\u0103"+
		"\u0111\u0113\u0121\u0125\u012a\u0131\u0137\u013d\u0141\u014d\u0155\u015f"+
		"\u0162\u0168\u0174\u0179\u017f\u0185\u018e\u019c\u019f\u01ab\u01b2\u01b5"+
		"\u01b9\u01be\u01c2\u01cd\u01cf\u01d6\u01e0\u01e6\u01f1\u01f4\u01fa\u01fd"+
		"\u0205\u0208\u020e\u0211\u0219\u021c\u0222\u0226\u022f\u0234\u0239\u0241"+
		"\u0250\u0252\u0257\u0261\u0272\u027e\u0288\u028e\u0291\u0295\u029c\u02b0"+
		"\u02be\u02c2\u02c8\u02cd\u02d1\u02e9\u0324\u0326\u0330\u0337\u033f\u0343"+
		"\u034b\u034f\u0351\u035c\u0372\u0376\u037c\u0380\u0386\u038a\u0390\u039b"+
		"\u03a2\u03b0\u03b9\u03bf\u03c3\u03cd\u03d2\u03e2\u03e6\u03ea\u03f4\u03f7"+
		"\u03fa\u0400";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}