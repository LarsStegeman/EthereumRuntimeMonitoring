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
		AnnotationKind=94, LINE_COMMENT=95, Int=96, Uint=97, Byte=98, Fixed=99, 
		Ufixed=100, VersionLiteral=101, BooleanLiteral=102, DecimalNumber=103, 
		HexNumber=104, NumberUnit=105, HexLiteral=106, ReservedKeyword=107, AnonymousKeyword=108, 
		BreakKeyword=109, ConstantKeyword=110, ContinueKeyword=111, ExternalKeyword=112, 
		IndexedKeyword=113, InternalKeyword=114, PayableKeyword=115, PrivateKeyword=116, 
		PublicKeyword=117, PureKeyword=118, ViewKeyword=119, Identifier=120, StringLiteral=121, 
		WS=122, COMMENT=123;
	public static final int
		RULE_contractPart = 0, RULE_annotationDefinition = 1, RULE_annotationExpression = 2, 
		RULE_sourceUnit = 3, RULE_pragmaDirective = 4, RULE_pragmaName = 5, RULE_pragmaValue = 6, 
		RULE_version = 7, RULE_versionOperator = 8, RULE_versionConstraint = 9, 
		RULE_importDeclaration = 10, RULE_importDirective = 11, RULE_contractDefinition = 12, 
		RULE_inheritanceSpecifier = 13, RULE_stateVariableDeclaration = 14, RULE_usingForDeclaration = 15, 
		RULE_structDefinition = 16, RULE_constructorDefinition = 17, RULE_modifierDefinition = 18, 
		RULE_modifierInvocation = 19, RULE_functionDefinition = 20, RULE_returnParameters = 21, 
		RULE_modifierList = 22, RULE_eventDefinition = 23, RULE_enumValue = 24, 
		RULE_enumDefinition = 25, RULE_parameterList = 26, RULE_parameter = 27, 
		RULE_eventParameterList = 28, RULE_eventParameter = 29, RULE_functionTypeParameterList = 30, 
		RULE_functionTypeParameter = 31, RULE_variableDeclaration = 32, RULE_typeName = 33, 
		RULE_userDefinedTypeName = 34, RULE_mapping = 35, RULE_functionTypeName = 36, 
		RULE_storageLocation = 37, RULE_stateMutability = 38, RULE_block = 39, 
		RULE_statement = 40, RULE_expressionStatement = 41, RULE_ifStatement = 42, 
		RULE_whileStatement = 43, RULE_simpleStatement = 44, RULE_forStatement = 45, 
		RULE_inlineAssemblyStatement = 46, RULE_doWhileStatement = 47, RULE_continueStatement = 48, 
		RULE_breakStatement = 49, RULE_returnStatement = 50, RULE_throwStatement = 51, 
		RULE_emitStatement = 52, RULE_variableDeclarationStatement = 53, RULE_identifierList = 54, 
		RULE_elementaryTypeName = 55, RULE_expression = 56, RULE_primaryExpression = 57, 
		RULE_expressionList = 58, RULE_nameValueList = 59, RULE_nameValue = 60, 
		RULE_functionCallArguments = 61, RULE_functionCall = 62, RULE_assemblyBlock = 63, 
		RULE_assemblyItem = 64, RULE_assemblyExpression = 65, RULE_assemblyCall = 66, 
		RULE_assemblyLocalDefinition = 67, RULE_assemblyAssignment = 68, RULE_assemblyIdentifierOrList = 69, 
		RULE_assemblyIdentifierList = 70, RULE_assemblyStackAssignment = 71, RULE_labelDefinition = 72, 
		RULE_assemblySwitch = 73, RULE_assemblyCase = 74, RULE_assemblyFunctionDefinition = 75, 
		RULE_assemblyFunctionReturns = 76, RULE_assemblyFor = 77, RULE_assemblyIf = 78, 
		RULE_assemblyLiteral = 79, RULE_subAssembly = 80, RULE_tupleExpression = 81, 
		RULE_elementaryTypeNameExpression = 82, RULE_numberLiteral = 83, RULE_identifier = 84;
	public static final String[] ruleNames = {
		"contractPart", "annotationDefinition", "annotationExpression", "sourceUnit", 
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
		null, "'&&'", "'||'", "'->'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", 
		"'+'", "'-'", "'!'", "'\\forall'", "'\\exists'", "'('", "':'", "')'", 
		"'\\old'", "'pragma'", "';'", "'^'", "'~'", "'='", "'as'", "'import'", 
		"'*'", "'from'", "'{'", "','", "'}'", "'contract'", "'interface'", "'library'", 
		"'is'", "'using'", "'for'", "'struct'", "'constructor'", "'modifier'", 
		"'function'", "'returns'", "'event'", "'enum'", "'['", "']'", "'.'", "'mapping'", 
		"'=>'", "'memory'", "'storage'", "'if'", "'else'", "'while'", "'assembly'", 
		"'do'", "'return'", "'throw'", "'emit'", "'var'", "'address'", "'bool'", 
		"'string'", "'byte'", "'++'", "'--'", "'new'", "'after'", "'delete'", 
		"'**'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'?'", "'|='", "'^='", 
		"'&='", "'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'let'", 
		"':='", "'=:'", "'switch'", "'case'", "'default'", "'//@'", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'anonymous'", "'break'", "'constant'", "'continue'", "'external'", "'indexed'", 
		"'internal'", "'payable'", "'private'", "'public'", "'pure'", "'view'"
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
		"AnnotationKind", "LINE_COMMENT", "Int", "Uint", "Byte", "Fixed", "Ufixed", 
		"VersionLiteral", "BooleanLiteral", "DecimalNumber", "HexNumber", "NumberUnit", 
		"HexLiteral", "ReservedKeyword", "AnonymousKeyword", "BreakKeyword", "ConstantKeyword", 
		"ContinueKeyword", "ExternalKeyword", "IndexedKeyword", "InternalKeyword", 
		"PayableKeyword", "PrivateKeyword", "PublicKeyword", "PureKeyword", "ViewKeyword", 
		"Identifier", "StringLiteral", "WS", "COMMENT"
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(177);
				enumDefinition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(178);
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
			setState(181);
			match(AnnotationStart);
			setState(182);
			match(AnnotationKind);
			setState(183);
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
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
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
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(186);
				match(T__11);
				setState(187);
				annotationExpression(4);
				}
				break;
			case T__12:
			case T__13:
				{
				setState(188);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				match(T__14);
				setState(190);
				identifier();
				setState(191);
				elementaryTypeName();
				setState(192);
				match(T__15);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__26) | (1L << T__43) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteral - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteral - 96)))) != 0)) {
					{
					setState(193);
					annotationExpression(0);
					}
				}

				setState(196);
				match(T__15);
				setState(197);
				annotationExpression(0);
				setState(198);
				match(T__16);
				}
				break;
			case T__17:
				{
				setState(200);
				match(T__17);
				setState(201);
				match(T__14);
				setState(202);
				identifier();
				setState(203);
				match(T__16);
				}
				break;
			case T__14:
			case T__26:
			case T__43:
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
				setState(205);
				primaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(226);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(208);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(209);
						match(T__0);
						setState(210);
						annotationExpression(11);
						}
						break;
					case 2:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(211);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(212);
						match(T__1);
						setState(213);
						annotationExpression(10);
						}
						break;
					case 3:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(214);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(215);
						match(T__2);
						setState(216);
						annotationExpression(9);
						}
						break;
					case 4:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(217);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(218);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						annotationExpression(8);
						}
						break;
					case 5:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(220);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(221);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(222);
						annotationExpression(7);
						}
						break;
					case 6:
						{
						_localctx = new AnnotationExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_annotationExpression);
						setState(223);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(224);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(225);
						annotationExpression(6);
						}
						break;
					}
					} 
				}
				setState(230);
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
		enterRule(_localctx, 6, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__24) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) {
				{
				setState(234);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(231);
					pragmaDirective();
					}
					break;
				case T__24:
					{
					setState(232);
					importDirective();
					}
					break;
				case T__30:
				case T__31:
				case T__32:
					{
					setState(233);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
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
		enterRule(_localctx, 8, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__18);
			setState(242);
			pragmaName();
			setState(243);
			pragmaValue();
			setState(244);
			match(T__19);
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
		enterRule(_localctx, 10, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		enterRule(_localctx, 12, RULE_pragmaValue);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
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
		enterRule(_localctx, 14, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			versionConstraint();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0) || _la==VersionLiteral) {
				{
				setState(253);
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
		enterRule(_localctx, 16, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_versionConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				setState(258);
				versionOperator();
				}
			}

			setState(261);
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
		enterRule(_localctx, 20, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			identifier();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(264);
				match(T__23);
				setState(265);
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
		enterRule(_localctx, 22, RULE_importDirective);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(T__24);
				setState(269);
				match(StringLiteral);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(270);
					match(T__23);
					setState(271);
					identifier();
					}
				}

				setState(274);
				match(T__19);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(T__24);
				setState(278);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(276);
					match(T__25);
					}
					break;
				case T__26:
				case Identifier:
					{
					setState(277);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(280);
					match(T__23);
					setState(281);
					identifier();
					}
				}

				setState(284);
				match(T__26);
				setState(285);
				match(StringLiteral);
				setState(286);
				match(T__19);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(T__24);
				setState(288);
				match(T__27);
				setState(289);
				importDeclaration();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__28) {
					{
					{
					setState(290);
					match(T__28);
					setState(291);
					importDeclaration();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
				match(T__29);
				setState(298);
				match(T__26);
				setState(299);
				match(StringLiteral);
				setState(300);
				match(T__19);
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
		enterRule(_localctx, 24, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(305);
			identifier();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(306);
				match(T__33);
				setState(307);
				inheritanceSpecifier();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__28) {
					{
					{
					setState(308);
					match(T__28);
					setState(309);
					inheritanceSpecifier();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(317);
			match(T__27);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (AnnotationStart - 93)) | (1L << (Int - 93)) | (1L << (Uint - 93)) | (1L << (Byte - 93)) | (1L << (Fixed - 93)) | (1L << (Ufixed - 93)) | (1L << (Identifier - 93)))) != 0)) {
				{
				{
				setState(318);
				contractPart();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(T__29);
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
		enterRule(_localctx, 26, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			userDefinedTypeName();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(327);
				match(T__14);
				setState(328);
				expression(0);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__28) {
					{
					{
					setState(329);
					match(T__28);
					setState(330);
					expression(0);
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				match(T__16);
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
		enterRule(_localctx, 28, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			typeName(0);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (ConstantKeyword - 110)) | (1L << (InternalKeyword - 110)) | (1L << (PrivateKeyword - 110)) | (1L << (PublicKeyword - 110)))) != 0)) {
				{
				{
				setState(341);
				_la = _input.LA(1);
				if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (ConstantKeyword - 110)) | (1L << (InternalKeyword - 110)) | (1L << (PrivateKeyword - 110)) | (1L << (PublicKeyword - 110)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			identifier();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(348);
				match(T__22);
				setState(349);
				expression(0);
				}
			}

			setState(352);
			match(T__19);
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
		enterRule(_localctx, 30, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__34);
			setState(355);
			identifier();
			setState(356);
			match(T__35);
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(357);
				match(T__25);
				}
				break;
			case T__26:
			case T__39:
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
				setState(358);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(361);
			match(T__19);
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
		enterRule(_localctx, 32, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__36);
			setState(364);
			identifier();
			setState(365);
			match(T__27);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__39) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(366);
				variableDeclaration();
				setState(367);
				match(T__19);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__39) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
					{
					{
					setState(368);
					variableDeclaration();
					setState(369);
					match(T__19);
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(378);
			match(T__29);
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
		enterRule(_localctx, 34, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(T__37);
			setState(381);
			parameterList();
			setState(382);
			modifierList();
			setState(383);
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
		enterRule(_localctx, 36, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__38);
			setState(386);
			identifier();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(387);
				parameterList();
				}
			}

			setState(390);
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
		enterRule(_localctx, 38, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			identifier();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(393);
				match(T__14);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__21) | (1L << T__26) | (1L << T__43) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(394);
					expressionList();
					}
				}

				setState(397);
				match(T__16);
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
		enterRule(_localctx, 40, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__39);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==Identifier) {
				{
				setState(401);
				identifier();
				}
			}

			setState(404);
			parameterList();
			setState(405);
			modifierList();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(406);
				returnParameters();
				}
			}

			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				{
				setState(409);
				match(T__19);
				}
				break;
			case T__27:
				{
				setState(410);
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
		enterRule(_localctx, 42, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T__40);
			setState(414);
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
		enterRule(_localctx, 44, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26 || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (ConstantKeyword - 110)) | (1L << (ExternalKeyword - 110)) | (1L << (InternalKeyword - 110)) | (1L << (PayableKeyword - 110)) | (1L << (PrivateKeyword - 110)) | (1L << (PublicKeyword - 110)) | (1L << (PureKeyword - 110)) | (1L << (ViewKeyword - 110)) | (1L << (Identifier - 110)))) != 0)) {
				{
				setState(422);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__26:
				case Identifier:
					{
					setState(416);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(417);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(418);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(419);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(420);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(421);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(426);
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
		enterRule(_localctx, 46, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T__41);
			setState(428);
			identifier();
			setState(429);
			eventParameterList();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(430);
				match(AnonymousKeyword);
				}
			}

			setState(433);
			match(T__19);
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
		enterRule(_localctx, 48, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		enterRule(_localctx, 50, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__42);
			setState(438);
			identifier();
			setState(439);
			match(T__27);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==Identifier) {
				{
				setState(440);
				enumValue();
				}
			}

			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(443);
				match(T__28);
				setState(444);
				enumValue();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
			match(T__29);
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
		enterRule(_localctx, 52, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__14);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__39) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(453);
				parameter();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__28) {
					{
					{
					setState(454);
					match(T__28);
					setState(455);
					parameter();
					}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(463);
			match(T__16);
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
		enterRule(_localctx, 54, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			typeName(0);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48 || _la==T__49) {
				{
				setState(466);
				storageLocation();
				}
			}

			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==Identifier) {
				{
				setState(469);
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
		enterRule(_localctx, 56, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(T__14);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__39) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(473);
				eventParameter();
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__28) {
					{
					{
					setState(474);
					match(T__28);
					setState(475);
					eventParameter();
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(483);
			match(T__16);
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
		enterRule(_localctx, 58, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			typeName(0);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(486);
				match(IndexedKeyword);
				}
			}

			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==Identifier) {
				{
				setState(489);
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
		enterRule(_localctx, 60, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(T__14);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__39) | (1L << T__46) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(493);
				functionTypeParameter();
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__28) {
					{
					{
					setState(494);
					match(T__28);
					setState(495);
					functionTypeParameter();
					}
					}
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(503);
			match(T__16);
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
		enterRule(_localctx, 62, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			typeName(0);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48 || _la==T__49) {
				{
				setState(506);
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
		enterRule(_localctx, 64, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			typeName(0);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48 || _la==T__49) {
				{
				setState(510);
				storageLocation();
				}
			}

			setState(513);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
				setState(516);
				elementaryTypeName();
				}
				break;
			case T__26:
			case Identifier:
				{
				setState(517);
				userDefinedTypeName();
				}
				break;
			case T__46:
				{
				setState(518);
				mapping();
				}
				break;
			case T__39:
				{
				setState(519);
				functionTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(522);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(523);
					match(T__43);
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__21) | (1L << T__26) | (1L << T__43) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
						{
						setState(524);
						expression(0);
						}
					}

					setState(527);
					match(T__44);
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 68, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			identifier();
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(534);
					match(T__45);
					setState(535);
					identifier();
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 70, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(T__46);
			setState(542);
			match(T__14);
			setState(543);
			elementaryTypeName();
			setState(544);
			match(T__47);
			setState(545);
			typeName(0);
			setState(546);
			match(T__16);
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
		enterRule(_localctx, 72, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(T__39);
			setState(549);
			functionTypeParameterList();
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(553);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(550);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(551);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(552);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(558);
				match(T__40);
				setState(559);
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
		enterRule(_localctx, 74, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		enterRule(_localctx, 76, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_la = _input.LA(1);
			if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (ConstantKeyword - 110)) | (1L << (PayableKeyword - 110)) | (1L << (PureKeyword - 110)) | (1L << (ViewKeyword - 110)))) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(T__27);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__35) | (1L << T__39) | (1L << T__43) | (1L << T__46) | (1L << T__50) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (BreakKeyword - 64)) | (1L << (ContinueKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(567);
				statement();
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			match(T__29);
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
		enterRule(_localctx, 80, RULE_statement);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				ifStatement();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				whileStatement();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				forStatement();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				block();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 5);
				{
				setState(579);
				inlineAssemblyStatement();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 6);
				{
				setState(580);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(581);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(582);
				breakStatement();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 9);
				{
				setState(583);
				returnStatement();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 10);
				{
				setState(584);
				throwStatement();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 11);
				{
				setState(585);
				emitStatement();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__14:
			case T__21:
			case T__26:
			case T__39:
			case T__43:
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
				setState(586);
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
		enterRule(_localctx, 82, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			expression(0);
			setState(590);
			match(T__19);
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
		enterRule(_localctx, 84, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(T__50);
			setState(593);
			match(T__14);
			setState(594);
			expression(0);
			setState(595);
			match(T__16);
			setState(596);
			statement();
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(597);
				match(T__51);
				setState(598);
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
		enterRule(_localctx, 86, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(T__52);
			setState(602);
			match(T__14);
			setState(603);
			expression(0);
			setState(604);
			match(T__16);
			setState(605);
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
		enterRule(_localctx, 88, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(607);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(608);
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
		enterRule(_localctx, 90, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(T__35);
			setState(612);
			match(T__14);
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__14:
			case T__21:
			case T__26:
			case T__39:
			case T__43:
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
				setState(613);
				simpleStatement();
				}
				break;
			case T__19:
				{
				setState(614);
				match(T__19);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__21) | (1L << T__26) | (1L << T__43) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(617);
				expression(0);
				}
			}

			setState(620);
			match(T__19);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__21) | (1L << T__26) | (1L << T__43) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(621);
				expression(0);
				}
			}

			setState(624);
			match(T__16);
			setState(625);
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
		enterRule(_localctx, 92, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(T__53);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(628);
				match(StringLiteral);
				}
			}

			setState(631);
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
		enterRule(_localctx, 94, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(T__54);
			setState(634);
			statement();
			setState(635);
			match(T__52);
			setState(636);
			match(T__14);
			setState(637);
			expression(0);
			setState(638);
			match(T__16);
			setState(639);
			match(T__19);
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
		enterRule(_localctx, 96, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(ContinueKeyword);
			setState(642);
			match(T__19);
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
		enterRule(_localctx, 98, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(BreakKeyword);
			setState(645);
			match(T__19);
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
		enterRule(_localctx, 100, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T__55);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__21) | (1L << T__26) | (1L << T__43) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(648);
				expression(0);
				}
			}

			setState(651);
			match(T__19);
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
		enterRule(_localctx, 102, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(T__56);
			setState(654);
			match(T__19);
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
		enterRule(_localctx, 104, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(T__57);
			setState(657);
			functionCall();
			setState(658);
			match(T__19);
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
		enterRule(_localctx, 106, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(660);
				match(T__58);
				setState(661);
				identifierList();
				}
				break;
			case 2:
				{
				setState(662);
				variableDeclaration();
				}
				break;
			}
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(665);
				match(T__22);
				setState(666);
				expression(0);
				}
			}

			setState(669);
			match(T__19);
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
		enterRule(_localctx, 108, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(T__14);
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__26 || _la==Identifier) {
						{
						setState(672);
						identifier();
						}
					}

					setState(675);
					match(T__28);
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==Identifier) {
				{
				setState(681);
				identifier();
				}
			}

			setState(684);
			match(T__16);
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
		enterRule(_localctx, 110, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(689);
				match(T__65);
				setState(690);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(691);
				match(T__14);
				setState(692);
				expression(0);
				setState(693);
				match(T__16);
				}
				break;
			case 3:
				{
				setState(695);
				_la = _input.LA(1);
				if ( !(_la==T__63 || _la==T__64) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(696);
				expression(19);
				}
				break;
			case 4:
				{
				setState(697);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(698);
				expression(18);
				}
				break;
			case 5:
				{
				setState(699);
				_la = _input.LA(1);
				if ( !(_la==T__66 || _la==T__67) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(700);
				expression(17);
				}
				break;
			case 6:
				{
				setState(701);
				match(T__11);
				setState(702);
				expression(16);
				}
				break;
			case 7:
				{
				setState(703);
				match(T__21);
				setState(704);
				expression(15);
				}
				break;
			case 8:
				{
				setState(705);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(765);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(708);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(709);
						match(T__68);
						setState(710);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(711);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(712);
						_la = _input.LA(1);
						if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (T__25 - 26)) | (1L << (T__69 - 26)) | (1L << (T__70 - 26)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(713);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(714);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(715);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(716);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(717);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(718);
						_la = _input.LA(1);
						if ( !(_la==T__71 || _la==T__72) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(719);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(720);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(721);
						match(T__73);
						setState(722);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(723);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(724);
						match(T__20);
						setState(725);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(726);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(727);
						match(T__74);
						setState(728);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(729);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(730);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(731);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(732);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(733);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(734);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(735);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(736);
						match(T__0);
						setState(737);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(738);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(739);
						match(T__1);
						setState(740);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(741);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(742);
						match(T__75);
						setState(743);
						expression(0);
						setState(744);
						match(T__15);
						setState(745);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(747);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(748);
						_la = _input.LA(1);
						if ( !(((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (T__22 - 23)) | (1L << (T__76 - 23)) | (1L << (T__77 - 23)) | (1L << (T__78 - 23)) | (1L << (T__79 - 23)) | (1L << (T__80 - 23)) | (1L << (T__81 - 23)) | (1L << (T__82 - 23)) | (1L << (T__83 - 23)) | (1L << (T__84 - 23)) | (1L << (T__85 - 23)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(749);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(750);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(751);
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
						setState(752);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(753);
						match(T__43);
						setState(754);
						expression(0);
						setState(755);
						match(T__44);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(757);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(758);
						match(T__14);
						setState(759);
						functionCallArguments();
						setState(760);
						match(T__16);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(762);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(763);
						match(T__45);
						setState(764);
						identifier();
						}
						break;
					}
					} 
				}
				setState(769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
		enterRule(_localctx, 114, RULE_primaryExpression);
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				match(BooleanLiteral);
				}
				break;
			case DecimalNumber:
			case HexNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				numberLiteral();
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				match(HexLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(773);
				match(StringLiteral);
				}
				break;
			case T__26:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(774);
				identifier();
				}
				break;
			case T__14:
			case T__43:
				enterOuterAlt(_localctx, 6);
				{
				setState(775);
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
				setState(776);
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
		enterRule(_localctx, 116, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			expression(0);
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(780);
				match(T__28);
				setState(781);
				expression(0);
				}
				}
				setState(786);
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
		enterRule(_localctx, 118, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			nameValue();
			setState(792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(788);
					match(T__28);
					setState(789);
					nameValue();
					}
					} 
				}
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(795);
				match(T__28);
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
		enterRule(_localctx, 120, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			identifier();
			setState(799);
			match(T__15);
			setState(800);
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
		enterRule(_localctx, 122, RULE_functionCallArguments);
		int _la;
		try {
			setState(810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(T__27);
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26 || _la==Identifier) {
					{
					setState(803);
					nameValueList();
					}
				}

				setState(806);
				match(T__29);
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__14:
			case T__16:
			case T__21:
			case T__26:
			case T__43:
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
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__21) | (1L << T__26) | (1L << T__43) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(807);
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
		enterRule(_localctx, 124, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			expression(0);
			setState(813);
			match(T__14);
			setState(814);
			functionCallArguments();
			setState(815);
			match(T__16);
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
		enterRule(_localctx, 126, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(T__27);
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__26) | (1L << T__27) | (1L << T__35) | (1L << T__39) | (1L << T__50) | (1L << T__53) | (1L << T__55) | (1L << T__59) | (1L << T__62))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__88 - 87)) | (1L << (T__89 - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (BreakKeyword - 87)) | (1L << (ContinueKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				{
				setState(818);
				assemblyItem();
				}
				}
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(824);
			match(T__29);
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
		enterRule(_localctx, 128, RULE_assemblyItem);
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(829);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(830);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(831);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(832);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(833);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(834);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(835);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(836);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(837);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(838);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(839);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(840);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(841);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(842);
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
		enterRule(_localctx, 130, RULE_assemblyExpression);
		try {
			setState(847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__55:
			case T__59:
			case T__62:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
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
		enterRule(_localctx, 132, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				{
				setState(849);
				match(T__55);
				}
				break;
			case T__59:
				{
				setState(850);
				match(T__59);
				}
				break;
			case T__62:
				{
				setState(851);
				match(T__62);
				}
				break;
			case T__26:
			case Identifier:
				{
				setState(852);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(855);
				match(T__14);
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__55) | (1L << T__59) | (1L << T__62))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
					{
					setState(856);
					assemblyExpression();
					}
				}

				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__28) {
					{
					{
					setState(859);
					match(T__28);
					setState(860);
					assemblyExpression();
					}
					}
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(866);
				match(T__16);
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
		enterRule(_localctx, 134, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(T__86);
			setState(870);
			assemblyIdentifierOrList();
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__87) {
				{
				setState(871);
				match(T__87);
				setState(872);
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
		enterRule(_localctx, 136, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			assemblyIdentifierOrList();
			setState(876);
			match(T__87);
			setState(877);
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
		enterRule(_localctx, 138, RULE_assemblyIdentifierOrList);
		try {
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				identifier();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				match(T__14);
				setState(881);
				assemblyIdentifierList();
				setState(882);
				match(T__16);
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
		enterRule(_localctx, 140, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			identifier();
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(887);
				match(T__28);
				setState(888);
				identifier();
				}
				}
				setState(893);
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
		enterRule(_localctx, 142, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(T__88);
			setState(895);
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
		enterRule(_localctx, 144, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			identifier();
			setState(898);
			match(T__15);
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
		enterRule(_localctx, 146, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(T__89);
			setState(901);
			assemblyExpression();
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__90 || _la==T__91) {
				{
				{
				setState(902);
				assemblyCase();
				}
				}
				setState(907);
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
		enterRule(_localctx, 148, RULE_assemblyCase);
		try {
			setState(914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__90:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				match(T__90);
				setState(909);
				assemblyLiteral();
				setState(910);
				assemblyBlock();
				}
				break;
			case T__91:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(T__91);
				setState(913);
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
		enterRule(_localctx, 150, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(T__39);
			setState(917);
			identifier();
			setState(918);
			match(T__14);
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==Identifier) {
				{
				setState(919);
				assemblyIdentifierList();
				}
			}

			setState(922);
			match(T__16);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(923);
				assemblyFunctionReturns();
				}
			}

			setState(926);
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
		enterRule(_localctx, 152, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(928);
			match(T__2);
			setState(929);
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
		enterRule(_localctx, 154, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(T__35);
			setState(934);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				{
				setState(932);
				assemblyBlock();
				}
				break;
			case T__26:
			case T__55:
			case T__59:
			case T__62:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(933);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(936);
			assemblyExpression();
			setState(939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				{
				setState(937);
				assemblyBlock();
				}
				break;
			case T__26:
			case T__55:
			case T__59:
			case T__62:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(938);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(941);
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
		enterRule(_localctx, 156, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(T__50);
			setState(944);
			assemblyExpression();
			setState(945);
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
		enterRule(_localctx, 158, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (StringLiteral - 103)))) != 0)) ) {
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
		enterRule(_localctx, 160, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(T__53);
			setState(950);
			identifier();
			setState(951);
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
		enterRule(_localctx, 162, RULE_tupleExpression);
		int _la;
		try {
			setState(979);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				match(T__14);
				{
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__21) | (1L << T__26) | (1L << T__43) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(954);
					expression(0);
					}
				}

				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__28) {
					{
					{
					setState(957);
					match(T__28);
					setState(959);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__21) | (1L << T__26) | (1L << T__43) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
						{
						setState(958);
						expression(0);
						}
					}

					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(966);
				match(T__16);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				match(T__43);
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__21) | (1L << T__26) | (1L << T__43) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(968);
					expression(0);
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__28) {
						{
						{
						setState(969);
						match(T__28);
						setState(970);
						expression(0);
						}
						}
						setState(975);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(978);
				match(T__44);
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
		enterRule(_localctx, 164, RULE_elementaryTypeNameExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
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
		enterRule(_localctx, 166, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(984);
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
		enterRule(_localctx, 168, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==Identifier) ) {
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
		case 33:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 56:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean annotationExpression_sempred(AnnotationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3}\u03e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00b6\n\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c5\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d1\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00e5\n\4\f\4\16\4\u00e8"+
		"\13\4\3\5\3\5\3\5\7\5\u00ed\n\5\f\5\16\5\u00f0\13\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\5\b\u00fd\n\b\3\t\3\t\5\t\u0101\n\t\3\n\3\n"+
		"\3\13\5\13\u0106\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u010d\n\f\3\r\3\r\3\r"+
		"\3\r\5\r\u0113\n\r\3\r\3\r\3\r\3\r\5\r\u0119\n\r\3\r\3\r\5\r\u011d\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0127\n\r\f\r\16\r\u012a\13\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0131\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0139"+
		"\n\16\f\16\16\16\u013c\13\16\5\16\u013e\n\16\3\16\3\16\7\16\u0142\n\16"+
		"\f\16\16\16\u0145\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u014e"+
		"\n\17\f\17\16\17\u0151\13\17\3\17\3\17\5\17\u0155\n\17\3\20\3\20\7\20"+
		"\u0159\n\20\f\20\16\20\u015c\13\20\3\20\3\20\3\20\5\20\u0161\n\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u016a\n\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0176\n\22\f\22\16\22\u0179\13\22\5\22"+
		"\u017b\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0187"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\5\25\u018e\n\25\3\25\5\25\u0191\n\25\3"+
		"\26\3\26\5\26\u0195\n\26\3\26\3\26\3\26\5\26\u019a\n\26\3\26\3\26\5\26"+
		"\u019e\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01a9\n"+
		"\30\f\30\16\30\u01ac\13\30\3\31\3\31\3\31\3\31\5\31\u01b2\n\31\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u01bc\n\33\3\33\3\33\7\33\u01c0"+
		"\n\33\f\33\16\33\u01c3\13\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u01cb"+
		"\n\34\f\34\16\34\u01ce\13\34\5\34\u01d0\n\34\3\34\3\34\3\35\3\35\5\35"+
		"\u01d6\n\35\3\35\5\35\u01d9\n\35\3\36\3\36\3\36\3\36\7\36\u01df\n\36\f"+
		"\36\16\36\u01e2\13\36\5\36\u01e4\n\36\3\36\3\36\3\37\3\37\5\37\u01ea\n"+
		"\37\3\37\5\37\u01ed\n\37\3 \3 \3 \3 \7 \u01f3\n \f \16 \u01f6\13 \5 \u01f8"+
		"\n \3 \3 \3!\3!\5!\u01fe\n!\3\"\3\"\5\"\u0202\n\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\5#\u020b\n#\3#\3#\3#\5#\u0210\n#\3#\7#\u0213\n#\f#\16#\u0216\13#\3"+
		"$\3$\3$\7$\u021b\n$\f$\16$\u021e\13$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\7&\u022c\n&\f&\16&\u022f\13&\3&\3&\5&\u0233\n&\3\'\3\'\3(\3(\3)\3"+
		")\7)\u023b\n)\f)\16)\u023e\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\5*\u024e\n*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\5,\u025a\n,\3-\3-\3-\3-"+
		"\3-\3-\3.\3.\5.\u0264\n.\3/\3/\3/\3/\5/\u026a\n/\3/\5/\u026d\n/\3/\3/"+
		"\5/\u0271\n/\3/\3/\3/\3\60\3\60\5\60\u0278\n\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\5"+
		"\64\u028c\n\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\5\67\u029a\n\67\3\67\3\67\5\67\u029e\n\67\3\67\3\67\38\38\58\u02a4"+
		"\n8\38\78\u02a7\n8\f8\168\u02aa\138\38\58\u02ad\n8\38\38\39\39\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02c5\n:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\7:\u0300\n:\f:\16:\u0303\13:\3;\3;\3;\3;\3;\3;"+
		"\3;\5;\u030c\n;\3<\3<\3<\7<\u0311\n<\f<\16<\u0314\13<\3=\3=\3=\7=\u0319"+
		"\n=\f=\16=\u031c\13=\3=\5=\u031f\n=\3>\3>\3>\3>\3?\3?\5?\u0327\n?\3?\3"+
		"?\5?\u032b\n?\5?\u032d\n?\3@\3@\3@\3@\3@\3A\3A\7A\u0336\nA\fA\16A\u0339"+
		"\13A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u034e"+
		"\nB\3C\3C\5C\u0352\nC\3D\3D\3D\3D\5D\u0358\nD\3D\3D\5D\u035c\nD\3D\3D"+
		"\7D\u0360\nD\fD\16D\u0363\13D\3D\5D\u0366\nD\3E\3E\3E\3E\5E\u036c\nE\3"+
		"F\3F\3F\3F\3G\3G\3G\3G\3G\5G\u0377\nG\3H\3H\3H\7H\u037c\nH\fH\16H\u037f"+
		"\13H\3I\3I\3I\3J\3J\3J\3K\3K\3K\7K\u038a\nK\fK\16K\u038d\13K\3L\3L\3L"+
		"\3L\3L\3L\5L\u0395\nL\3M\3M\3M\3M\5M\u039b\nM\3M\3M\5M\u039f\nM\3M\3M"+
		"\3N\3N\3N\3O\3O\3O\5O\u03a9\nO\3O\3O\3O\5O\u03ae\nO\3O\3O\3P\3P\3P\3P"+
		"\3Q\3Q\3R\3R\3R\3R\3S\3S\5S\u03be\nS\3S\3S\5S\u03c2\nS\7S\u03c4\nS\fS"+
		"\16S\u03c7\13S\3S\3S\3S\3S\3S\7S\u03ce\nS\fS\16S\u03d1\13S\5S\u03d3\n"+
		"S\3S\5S\u03d6\nS\3T\3T\3U\3U\5U\u03dc\nU\3V\3V\3V\2\5\6DrW\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\2\24\3\2\17\20\3\2\6\7\3\2\b\13\3\2\f\r\4\2\b\13\27\31\3\2!#\5"+
		"\2ppttvw\3\2\63\64\5\2ppuuxy\4\2=Abf\3\2BC\3\2EF\4\2\34\34HI\3\2JK\4\2"+
		"\31\31OX\5\2ijll{{\3\2ij\4\2\35\35zz\2\u043c\2\u00b5\3\2\2\2\4\u00b7\3"+
		"\2\2\2\6\u00d0\3\2\2\2\b\u00ee\3\2\2\2\n\u00f3\3\2\2\2\f\u00f8\3\2\2\2"+
		"\16\u00fc\3\2\2\2\20\u00fe\3\2\2\2\22\u0102\3\2\2\2\24\u0105\3\2\2\2\26"+
		"\u0109\3\2\2\2\30\u0130\3\2\2\2\32\u0132\3\2\2\2\34\u0148\3\2\2\2\36\u0156"+
		"\3\2\2\2 \u0164\3\2\2\2\"\u016d\3\2\2\2$\u017e\3\2\2\2&\u0183\3\2\2\2"+
		"(\u018a\3\2\2\2*\u0192\3\2\2\2,\u019f\3\2\2\2.\u01aa\3\2\2\2\60\u01ad"+
		"\3\2\2\2\62\u01b5\3\2\2\2\64\u01b7\3\2\2\2\66\u01c6\3\2\2\28\u01d3\3\2"+
		"\2\2:\u01da\3\2\2\2<\u01e7\3\2\2\2>\u01ee\3\2\2\2@\u01fb\3\2\2\2B\u01ff"+
		"\3\2\2\2D\u020a\3\2\2\2F\u0217\3\2\2\2H\u021f\3\2\2\2J\u0226\3\2\2\2L"+
		"\u0234\3\2\2\2N\u0236\3\2\2\2P\u0238\3\2\2\2R\u024d\3\2\2\2T\u024f\3\2"+
		"\2\2V\u0252\3\2\2\2X\u025b\3\2\2\2Z\u0263\3\2\2\2\\\u0265\3\2\2\2^\u0275"+
		"\3\2\2\2`\u027b\3\2\2\2b\u0283\3\2\2\2d\u0286\3\2\2\2f\u0289\3\2\2\2h"+
		"\u028f\3\2\2\2j\u0292\3\2\2\2l\u0299\3\2\2\2n\u02a1\3\2\2\2p\u02b0\3\2"+
		"\2\2r\u02c4\3\2\2\2t\u030b\3\2\2\2v\u030d\3\2\2\2x\u0315\3\2\2\2z\u0320"+
		"\3\2\2\2|\u032c\3\2\2\2~\u032e\3\2\2\2\u0080\u0333\3\2\2\2\u0082\u034d"+
		"\3\2\2\2\u0084\u0351\3\2\2\2\u0086\u0357\3\2\2\2\u0088\u0367\3\2\2\2\u008a"+
		"\u036d\3\2\2\2\u008c\u0376\3\2\2\2\u008e\u0378\3\2\2\2\u0090\u0380\3\2"+
		"\2\2\u0092\u0383\3\2\2\2\u0094\u0386\3\2\2\2\u0096\u0394\3\2\2\2\u0098"+
		"\u0396\3\2\2\2\u009a\u03a2\3\2\2\2\u009c\u03a5\3\2\2\2\u009e\u03b1\3\2"+
		"\2\2\u00a0\u03b5\3\2\2\2\u00a2\u03b7\3\2\2\2\u00a4\u03d5\3\2\2\2\u00a6"+
		"\u03d7\3\2\2\2\u00a8\u03d9\3\2\2\2\u00aa\u03dd\3\2\2\2\u00ac\u00b6\5\36"+
		"\20\2\u00ad\u00b6\5 \21\2\u00ae\u00b6\5\"\22\2\u00af\u00b6\5$\23\2\u00b0"+
		"\u00b6\5&\24\2\u00b1\u00b6\5*\26\2\u00b2\u00b6\5\60\31\2\u00b3\u00b6\5"+
		"\64\33\2\u00b4\u00b6\5\4\3\2\u00b5\u00ac\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5"+
		"\u00ae\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2"+
		"\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\3\3\2\2\2\u00b7\u00b8\7_\2\2\u00b8\u00b9\7`\2\2\u00b9\u00ba\5\6\4\2\u00ba"+
		"\5\3\2\2\2\u00bb\u00bc\b\4\1\2\u00bc\u00bd\7\16\2\2\u00bd\u00d1\5\6\4"+
		"\6\u00be\u00bf\t\2\2\2\u00bf\u00c0\7\21\2\2\u00c0\u00c1\5\u00aaV\2\u00c1"+
		"\u00c2\5p9\2\u00c2\u00c4\7\22\2\2\u00c3\u00c5\5\6\4\2\u00c4\u00c3\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\22\2\2\u00c7"+
		"\u00c8\5\6\4\2\u00c8\u00c9\7\23\2\2\u00c9\u00d1\3\2\2\2\u00ca\u00cb\7"+
		"\24\2\2\u00cb\u00cc\7\21\2\2\u00cc\u00cd\5\u00aaV\2\u00cd\u00ce\7\23\2"+
		"\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1\5t;\2\u00d0\u00bb\3\2\2\2\u00d0\u00be"+
		"\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00e6\3\2\2\2\u00d2"+
		"\u00d3\f\f\2\2\u00d3\u00d4\7\3\2\2\u00d4\u00e5\5\6\4\r\u00d5\u00d6\f\13"+
		"\2\2\u00d6\u00d7\7\4\2\2\u00d7\u00e5\5\6\4\f\u00d8\u00d9\f\n\2\2\u00d9"+
		"\u00da\7\5\2\2\u00da\u00e5\5\6\4\13\u00db\u00dc\f\t\2\2\u00dc\u00dd\t"+
		"\3\2\2\u00dd\u00e5\5\6\4\n\u00de\u00df\f\b\2\2\u00df\u00e0\t\4\2\2\u00e0"+
		"\u00e5\5\6\4\t\u00e1\u00e2\f\7\2\2\u00e2\u00e3\t\5\2\2\u00e3\u00e5\5\6"+
		"\4\b\u00e4\u00d2\3\2\2\2\u00e4\u00d5\3\2\2\2\u00e4\u00d8\3\2\2\2\u00e4"+
		"\u00db\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\u00e8\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\7\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ed\5\n\6\2\u00ea\u00ed\5\30\r\2\u00eb\u00ed\5\32\16"+
		"\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f2\7\2\2\3\u00f2\t\3\2\2\2\u00f3\u00f4\7\25\2"+
		"\2\u00f4\u00f5\5\f\7\2\u00f5\u00f6\5\16\b\2\u00f6\u00f7\7\26\2\2\u00f7"+
		"\13\3\2\2\2\u00f8\u00f9\5\u00aaV\2\u00f9\r\3\2\2\2\u00fa\u00fd\5\20\t"+
		"\2\u00fb\u00fd\5r:\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\17"+
		"\3\2\2\2\u00fe\u0100\5\24\13\2\u00ff\u0101\5\24\13\2\u0100\u00ff\3\2\2"+
		"\2\u0100\u0101\3\2\2\2\u0101\21\3\2\2\2\u0102\u0103\t\6\2\2\u0103\23\3"+
		"\2\2\2\u0104\u0106\5\22\n\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\7g\2\2\u0108\25\3\2\2\2\u0109\u010c\5\u00aa"+
		"V\2\u010a\u010b\7\32\2\2\u010b\u010d\5\u00aaV\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\27\3\2\2\2\u010e\u010f\7\33\2\2\u010f\u0112\7{\2"+
		"\2\u0110\u0111\7\32\2\2\u0111\u0113\5\u00aaV\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0131\7\26\2\2\u0115\u0118\7"+
		"\33\2\2\u0116\u0119\7\34\2\2\u0117\u0119\5\u00aaV\2\u0118\u0116\3\2\2"+
		"\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u011b\7\32\2\2\u011b"+
		"\u011d\5\u00aaV\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\7\35\2\2\u011f\u0120\7{\2\2\u0120\u0131\7\26\2\2"+
		"\u0121\u0122\7\33\2\2\u0122\u0123\7\36\2\2\u0123\u0128\5\26\f\2\u0124"+
		"\u0125\7\37\2\2\u0125\u0127\5\26\f\2\u0126\u0124\3\2\2\2\u0127\u012a\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012c\7 \2\2\u012c\u012d\7\35\2\2\u012d\u012e\7{"+
		"\2\2\u012e\u012f\7\26\2\2\u012f\u0131\3\2\2\2\u0130\u010e\3\2\2\2\u0130"+
		"\u0115\3\2\2\2\u0130\u0121\3\2\2\2\u0131\31\3\2\2\2\u0132\u0133\t\7\2"+
		"\2\u0133\u013d\5\u00aaV\2\u0134\u0135\7$\2\2\u0135\u013a\5\34\17\2\u0136"+
		"\u0137\7\37\2\2\u0137\u0139\5\34\17\2\u0138\u0136\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u0134\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0143\7\36\2\2\u0140\u0142\5\2\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7 \2\2\u0147\33\3\2\2\2\u0148\u0154"+
		"\5F$\2\u0149\u014a\7\21\2\2\u014a\u014f\5r:\2\u014b\u014c\7\37\2\2\u014c"+
		"\u014e\5r:\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2"+
		"\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153"+
		"\7\23\2\2\u0153\u0155\3\2\2\2\u0154\u0149\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\35\3\2\2\2\u0156\u015a\5D#\2\u0157\u0159\t\b\2\2\u0158\u0157\3"+
		"\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0160\5\u00aaV\2\u015e\u015f"+
		"\7\31\2\2\u015f\u0161\5r:\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\7\26\2\2\u0163\37\3\2\2\2\u0164\u0165\7%\2"+
		"\2\u0165\u0166\5\u00aaV\2\u0166\u0169\7&\2\2\u0167\u016a\7\34\2\2\u0168"+
		"\u016a\5D#\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2"+
		"\2\u016b\u016c\7\26\2\2\u016c!\3\2\2\2\u016d\u016e\7\'\2\2\u016e\u016f"+
		"\5\u00aaV\2\u016f\u017a\7\36\2\2\u0170\u0171\5B\"\2\u0171\u0177\7\26\2"+
		"\2\u0172\u0173\5B\"\2\u0173\u0174\7\26\2\2\u0174\u0176\3\2\2\2\u0175\u0172"+
		"\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u0170\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7 \2\2\u017d#\3\2\2\2\u017e\u017f"+
		"\7(\2\2\u017f\u0180\5\66\34\2\u0180\u0181\5.\30\2\u0181\u0182\5P)\2\u0182"+
		"%\3\2\2\2\u0183\u0184\7)\2\2\u0184\u0186\5\u00aaV\2\u0185\u0187\5\66\34"+
		"\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
		"\5P)\2\u0189\'\3\2\2\2\u018a\u0190\5\u00aaV\2\u018b\u018d\7\21\2\2\u018c"+
		"\u018e\5v<\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2"+
		"\2\u018f\u0191\7\23\2\2\u0190\u018b\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		")\3\2\2\2\u0192\u0194\7*\2\2\u0193\u0195\5\u00aaV\2\u0194\u0193\3\2\2"+
		"\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\5\66\34\2\u0197"+
		"\u0199\5.\30\2\u0198\u019a\5,\27\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019d\3\2\2\2\u019b\u019e\7\26\2\2\u019c\u019e\5P)\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e+\3\2\2\2\u019f\u01a0\7+\2\2\u01a0"+
		"\u01a1\5\66\34\2\u01a1-\3\2\2\2\u01a2\u01a9\5(\25\2\u01a3\u01a9\5N(\2"+
		"\u01a4\u01a9\7r\2\2\u01a5\u01a9\7w\2\2\u01a6\u01a9\7t\2\2\u01a7\u01a9"+
		"\7v\2\2\u01a8\u01a2\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8"+
		"\u01a5\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2"+
		"\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab/\3\2\2\2\u01ac\u01aa"+
		"\3\2\2\2\u01ad\u01ae\7,\2\2\u01ae\u01af\5\u00aaV\2\u01af\u01b1\5:\36\2"+
		"\u01b0\u01b2\7n\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b4\7\26\2\2\u01b4\61\3\2\2\2\u01b5\u01b6\5\u00aaV\2"+
		"\u01b6\63\3\2\2\2\u01b7\u01b8\7-\2\2\u01b8\u01b9\5\u00aaV\2\u01b9\u01bb"+
		"\7\36\2\2\u01ba\u01bc\5\62\32\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2"+
		"\2\u01bc\u01c1\3\2\2\2\u01bd\u01be\7\37\2\2\u01be\u01c0\5\62\32\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7 \2\2\u01c5"+
		"\65\3\2\2\2\u01c6\u01cf\7\21\2\2\u01c7\u01cc\58\35\2\u01c8\u01c9\7\37"+
		"\2\2\u01c9\u01cb\58\35\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d2\7\23\2\2\u01d2\67\3\2\2\2\u01d3\u01d5\5D#\2\u01d4\u01d6\5L\'\2"+
		"\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d9"+
		"\5\u00aaV\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d99\3\2\2\2\u01da"+
		"\u01e3\7\21\2\2\u01db\u01e0\5<\37\2\u01dc\u01dd\7\37\2\2\u01dd\u01df\5"+
		"<\37\2\u01de\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01db\3\2"+
		"\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7\23\2\2\u01e6"+
		";\3\2\2\2\u01e7\u01e9\5D#\2\u01e8\u01ea\7s\2\2\u01e9\u01e8\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01ed\5\u00aaV\2\u01ec\u01eb"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed=\3\2\2\2\u01ee\u01f7\7\21\2\2\u01ef"+
		"\u01f4\5@!\2\u01f0\u01f1\7\37\2\2\u01f1\u01f3\5@!\2\u01f2\u01f0\3\2\2"+
		"\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f8"+
		"\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01ef\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\7\23\2\2\u01fa?\3\2\2\2\u01fb\u01fd\5D#\2\u01fc"+
		"\u01fe\5L\'\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01feA\3\2\2\2\u01ff"+
		"\u0201\5D#\2\u0200\u0202\5L\'\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2"+
		"\2\u0202\u0203\3\2\2\2\u0203\u0204\5\u00aaV\2\u0204C\3\2\2\2\u0205\u0206"+
		"\b#\1\2\u0206\u020b\5p9\2\u0207\u020b\5F$\2\u0208\u020b\5H%\2\u0209\u020b"+
		"\5J&\2\u020a\u0205\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a"+
		"\u0209\3\2\2\2\u020b\u0214\3\2\2\2\u020c\u020d\f\4\2\2\u020d\u020f\7."+
		"\2\2\u020e\u0210\5r:\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u0213\7/\2\2\u0212\u020c\3\2\2\2\u0213\u0216\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215E\3\2\2\2\u0216\u0214\3\2\2\2"+
		"\u0217\u021c\5\u00aaV\2\u0218\u0219\7\60\2\2\u0219\u021b\5\u00aaV\2\u021a"+
		"\u0218\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2"+
		"\2\2\u021dG\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\7\61\2\2\u0220\u0221"+
		"\7\21\2\2\u0221\u0222\5p9\2\u0222\u0223\7\62\2\2\u0223\u0224\5D#\2\u0224"+
		"\u0225\7\23\2\2\u0225I\3\2\2\2\u0226\u0227\7*\2\2\u0227\u022d\5> \2\u0228"+
		"\u022c\7t\2\2\u0229\u022c\7r\2\2\u022a\u022c\5N(\2\u022b\u0228\3\2\2\2"+
		"\u022b\u0229\3\2\2\2\u022b\u022a\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b"+
		"\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0232\3\2\2\2\u022f\u022d\3\2\2\2\u0230"+
		"\u0231\7+\2\2\u0231\u0233\5> \2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2"+
		"\2\u0233K\3\2\2\2\u0234\u0235\t\t\2\2\u0235M\3\2\2\2\u0236\u0237\t\n\2"+
		"\2\u0237O\3\2\2\2\u0238\u023c\7\36\2\2\u0239\u023b\5R*\2\u023a\u0239\3"+
		"\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\7 \2\2\u0240Q\3\2\2\2\u0241"+
		"\u024e\5V,\2\u0242\u024e\5X-\2\u0243\u024e\5\\/\2\u0244\u024e\5P)\2\u0245"+
		"\u024e\5^\60\2\u0246\u024e\5`\61\2\u0247\u024e\5b\62\2\u0248\u024e\5d"+
		"\63\2\u0249\u024e\5f\64\2\u024a\u024e\5h\65\2\u024b\u024e\5j\66\2\u024c"+
		"\u024e\5Z.\2\u024d\u0241\3\2\2\2\u024d\u0242\3\2\2\2\u024d\u0243\3\2\2"+
		"\2\u024d\u0244\3\2\2\2\u024d\u0245\3\2\2\2\u024d\u0246\3\2\2\2\u024d\u0247"+
		"\3\2\2\2\u024d\u0248\3\2\2\2\u024d\u0249\3\2\2\2\u024d\u024a\3\2\2\2\u024d"+
		"\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024eS\3\2\2\2\u024f\u0250\5r:\2\u0250"+
		"\u0251\7\26\2\2\u0251U\3\2\2\2\u0252\u0253\7\65\2\2\u0253\u0254\7\21\2"+
		"\2\u0254\u0255\5r:\2\u0255\u0256\7\23\2\2\u0256\u0259\5R*\2\u0257\u0258"+
		"\7\66\2\2\u0258\u025a\5R*\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"W\3\2\2\2\u025b\u025c\7\67\2\2\u025c\u025d\7\21\2\2\u025d\u025e\5r:\2"+
		"\u025e\u025f\7\23\2\2\u025f\u0260\5R*\2\u0260Y\3\2\2\2\u0261\u0264\5l"+
		"\67\2\u0262\u0264\5T+\2\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264"+
		"[\3\2\2\2\u0265\u0266\7&\2\2\u0266\u0269\7\21\2\2\u0267\u026a\5Z.\2\u0268"+
		"\u026a\7\26\2\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026a\u026c\3"+
		"\2\2\2\u026b\u026d\5r:\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u0270\7\26\2\2\u026f\u0271\5r:\2\u0270\u026f\3\2"+
		"\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\7\23\2\2\u0273"+
		"\u0274\5R*\2\u0274]\3\2\2\2\u0275\u0277\78\2\2\u0276\u0278\7{\2\2\u0277"+
		"\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\5\u0080"+
		"A\2\u027a_\3\2\2\2\u027b\u027c\79\2\2\u027c\u027d\5R*\2\u027d\u027e\7"+
		"\67\2\2\u027e\u027f\7\21\2\2\u027f\u0280\5r:\2\u0280\u0281\7\23\2\2\u0281"+
		"\u0282\7\26\2\2\u0282a\3\2\2\2\u0283\u0284\7q\2\2\u0284\u0285\7\26\2\2"+
		"\u0285c\3\2\2\2\u0286\u0287\7o\2\2\u0287\u0288\7\26\2\2\u0288e\3\2\2\2"+
		"\u0289\u028b\7:\2\2\u028a\u028c\5r:\2\u028b\u028a\3\2\2\2\u028b\u028c"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\7\26\2\2\u028eg\3\2\2\2\u028f"+
		"\u0290\7;\2\2\u0290\u0291\7\26\2\2\u0291i\3\2\2\2\u0292\u0293\7<\2\2\u0293"+
		"\u0294\5~@\2\u0294\u0295\7\26\2\2\u0295k\3\2\2\2\u0296\u0297\7=\2\2\u0297"+
		"\u029a\5n8\2\u0298\u029a\5B\"\2\u0299\u0296\3\2\2\2\u0299\u0298\3\2\2"+
		"\2\u029a\u029d\3\2\2\2\u029b\u029c\7\31\2\2\u029c\u029e\5r:\2\u029d\u029b"+
		"\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\7\26\2\2"+
		"\u02a0m\3\2\2\2\u02a1\u02a8\7\21\2\2\u02a2\u02a4\5\u00aaV\2\u02a3\u02a2"+
		"\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\7\37\2\2"+
		"\u02a6\u02a3\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9"+
		"\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ad\5\u00aaV"+
		"\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af"+
		"\7\23\2\2\u02afo\3\2\2\2\u02b0\u02b1\t\13\2\2\u02b1q\3\2\2\2\u02b2\u02b3"+
		"\b:\1\2\u02b3\u02b4\7D\2\2\u02b4\u02c5\5D#\2\u02b5\u02b6\7\21\2\2\u02b6"+
		"\u02b7\5r:\2\u02b7\u02b8\7\23\2\2\u02b8\u02c5\3\2\2\2\u02b9\u02ba\t\f"+
		"\2\2\u02ba\u02c5\5r:\25\u02bb\u02bc\t\5\2\2\u02bc\u02c5\5r:\24\u02bd\u02be"+
		"\t\r\2\2\u02be\u02c5\5r:\23\u02bf\u02c0\7\16\2\2\u02c0\u02c5\5r:\22\u02c1"+
		"\u02c2\7\30\2\2\u02c2\u02c5\5r:\21\u02c3\u02c5\5t;\2\u02c4\u02b2\3\2\2"+
		"\2\u02c4\u02b5\3\2\2\2\u02c4\u02b9\3\2\2\2\u02c4\u02bb\3\2\2\2\u02c4\u02bd"+
		"\3\2\2\2\u02c4\u02bf\3\2\2\2\u02c4\u02c1\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c5"+
		"\u0301\3\2\2\2\u02c6\u02c7\f\20\2\2\u02c7\u02c8\7G\2\2\u02c8\u0300\5r"+
		":\21\u02c9\u02ca\f\17\2\2\u02ca\u02cb\t\16\2\2\u02cb\u0300\5r:\20\u02cc"+
		"\u02cd\f\16\2\2\u02cd\u02ce\t\5\2\2\u02ce\u0300\5r:\17\u02cf\u02d0\f\r"+
		"\2\2\u02d0\u02d1\t\17\2\2\u02d1\u0300\5r:\16\u02d2\u02d3\f\f\2\2\u02d3"+
		"\u02d4\7L\2\2\u02d4\u0300\5r:\r\u02d5\u02d6\f\13\2\2\u02d6\u02d7\7\27"+
		"\2\2\u02d7\u0300\5r:\f\u02d8\u02d9\f\n\2\2\u02d9\u02da\7M\2\2\u02da\u0300"+
		"\5r:\13\u02db\u02dc\f\t\2\2\u02dc\u02dd\t\4\2\2\u02dd\u0300\5r:\n\u02de"+
		"\u02df\f\b\2\2\u02df\u02e0\t\3\2\2\u02e0\u0300\5r:\t\u02e1\u02e2\f\7\2"+
		"\2\u02e2\u02e3\7\3\2\2\u02e3\u0300\5r:\b\u02e4\u02e5\f\6\2\2\u02e5\u02e6"+
		"\7\4\2\2\u02e6\u0300\5r:\7\u02e7\u02e8\f\5\2\2\u02e8\u02e9\7N\2\2\u02e9"+
		"\u02ea\5r:\2\u02ea\u02eb\7\22\2\2\u02eb\u02ec\5r:\6\u02ec\u0300\3\2\2"+
		"\2\u02ed\u02ee\f\4\2\2\u02ee\u02ef\t\20\2\2\u02ef\u0300\5r:\5\u02f0\u02f1"+
		"\f\33\2\2\u02f1\u0300\t\f\2\2\u02f2\u02f3\f\31\2\2\u02f3\u02f4\7.\2\2"+
		"\u02f4\u02f5\5r:\2\u02f5\u02f6\7/\2\2\u02f6\u0300\3\2\2\2\u02f7\u02f8"+
		"\f\30\2\2\u02f8\u02f9\7\21\2\2\u02f9\u02fa\5|?\2\u02fa\u02fb\7\23\2\2"+
		"\u02fb\u0300\3\2\2\2\u02fc\u02fd\f\27\2\2\u02fd\u02fe\7\60\2\2\u02fe\u0300"+
		"\5\u00aaV\2\u02ff\u02c6\3\2\2\2\u02ff\u02c9\3\2\2\2\u02ff\u02cc\3\2\2"+
		"\2\u02ff\u02cf\3\2\2\2\u02ff\u02d2\3\2\2\2\u02ff\u02d5\3\2\2\2\u02ff\u02d8"+
		"\3\2\2\2\u02ff\u02db\3\2\2\2\u02ff\u02de\3\2\2\2\u02ff\u02e1\3\2\2\2\u02ff"+
		"\u02e4\3\2\2\2\u02ff\u02e7\3\2\2\2\u02ff\u02ed\3\2\2\2\u02ff\u02f0\3\2"+
		"\2\2\u02ff\u02f2\3\2\2\2\u02ff\u02f7\3\2\2\2\u02ff\u02fc\3\2\2\2\u0300"+
		"\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302s\3\2\2\2"+
		"\u0303\u0301\3\2\2\2\u0304\u030c\7h\2\2\u0305\u030c\5\u00a8U\2\u0306\u030c"+
		"\7l\2\2\u0307\u030c\7{\2\2\u0308\u030c\5\u00aaV\2\u0309\u030c\5\u00a4"+
		"S\2\u030a\u030c\5\u00a6T\2\u030b\u0304\3\2\2\2\u030b\u0305\3\2\2\2\u030b"+
		"\u0306\3\2\2\2\u030b\u0307\3\2\2\2\u030b\u0308\3\2\2\2\u030b\u0309\3\2"+
		"\2\2\u030b\u030a\3\2\2\2\u030cu\3\2\2\2\u030d\u0312\5r:\2\u030e\u030f"+
		"\7\37\2\2\u030f\u0311\5r:\2\u0310\u030e\3\2\2\2\u0311\u0314\3\2\2\2\u0312"+
		"\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313w\3\2\2\2\u0314\u0312\3\2\2\2"+
		"\u0315\u031a\5z>\2\u0316\u0317\7\37\2\2\u0317\u0319\5z>\2\u0318\u0316"+
		"\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u031f\7\37\2\2\u031e\u031d\3"+
		"\2\2\2\u031e\u031f\3\2\2\2\u031fy\3\2\2\2\u0320\u0321\5\u00aaV\2\u0321"+
		"\u0322\7\22\2\2\u0322\u0323\5r:\2\u0323{\3\2\2\2\u0324\u0326\7\36\2\2"+
		"\u0325\u0327\5x=\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328"+
		"\3\2\2\2\u0328\u032d\7 \2\2\u0329\u032b\5v<\2\u032a\u0329\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u0324\3\2\2\2\u032c\u032a\3\2"+
		"\2\2\u032d}\3\2\2\2\u032e\u032f\5r:\2\u032f\u0330\7\21\2\2\u0330\u0331"+
		"\5|?\2\u0331\u0332\7\23\2\2\u0332\177\3\2\2\2\u0333\u0337\7\36\2\2\u0334"+
		"\u0336\5\u0082B\2\u0335\u0334\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335"+
		"\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033a\3\2\2\2\u0339\u0337\3\2\2\2\u033a"+
		"\u033b\7 \2\2\u033b\u0081\3\2\2\2\u033c\u034e\5\u00aaV\2\u033d\u034e\5"+
		"\u0080A\2\u033e\u034e\5\u0084C\2\u033f\u034e\5\u0088E\2\u0340\u034e\5"+
		"\u008aF\2\u0341\u034e\5\u0090I\2\u0342\u034e\5\u0092J\2\u0343\u034e\5"+
		"\u0094K\2\u0344\u034e\5\u0098M\2\u0345\u034e\5\u009cO\2\u0346\u034e\5"+
		"\u009eP\2\u0347\u034e\7o\2\2\u0348\u034e\7q\2\2\u0349\u034e\5\u00a2R\2"+
		"\u034a\u034e\5\u00a8U\2\u034b\u034e\7{\2\2\u034c\u034e\7l\2\2\u034d\u033c"+
		"\3\2\2\2\u034d\u033d\3\2\2\2\u034d\u033e\3\2\2\2\u034d\u033f\3\2\2\2\u034d"+
		"\u0340\3\2\2\2\u034d\u0341\3\2\2\2\u034d\u0342\3\2\2\2\u034d\u0343\3\2"+
		"\2\2\u034d\u0344\3\2\2\2\u034d\u0345\3\2\2\2\u034d\u0346\3\2\2\2\u034d"+
		"\u0347\3\2\2\2\u034d\u0348\3\2\2\2\u034d\u0349\3\2\2\2\u034d\u034a\3\2"+
		"\2\2\u034d\u034b\3\2\2\2\u034d\u034c\3\2\2\2\u034e\u0083\3\2\2\2\u034f"+
		"\u0352\5\u0086D\2\u0350\u0352\5\u00a0Q\2\u0351\u034f\3\2\2\2\u0351\u0350"+
		"\3\2\2\2\u0352\u0085\3\2\2\2\u0353\u0358\7:\2\2\u0354\u0358\7>\2\2\u0355"+
		"\u0358\7A\2\2\u0356\u0358\5\u00aaV\2\u0357\u0353\3\2\2\2\u0357\u0354\3"+
		"\2\2\2\u0357\u0355\3\2\2\2\u0357\u0356\3\2\2\2\u0358\u0365\3\2\2\2\u0359"+
		"\u035b\7\21\2\2\u035a\u035c\5\u0084C\2\u035b\u035a\3\2\2\2\u035b\u035c"+
		"\3\2\2\2\u035c\u0361\3\2\2\2\u035d\u035e\7\37\2\2\u035e\u0360\5\u0084"+
		"C\2\u035f\u035d\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361"+
		"\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0366\7\23"+
		"\2\2\u0365\u0359\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0087\3\2\2\2\u0367"+
		"\u0368\7Y\2\2\u0368\u036b\5\u008cG\2\u0369\u036a\7Z\2\2\u036a\u036c\5"+
		"\u0084C\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u0089\3\2\2\2"+
		"\u036d\u036e\5\u008cG\2\u036e\u036f\7Z\2\2\u036f\u0370\5\u0084C\2\u0370"+
		"\u008b\3\2\2\2\u0371\u0377\5\u00aaV\2\u0372\u0373\7\21\2\2\u0373\u0374"+
		"\5\u008eH\2\u0374\u0375\7\23\2\2\u0375\u0377\3\2\2\2\u0376\u0371\3\2\2"+
		"\2\u0376\u0372\3\2\2\2\u0377\u008d\3\2\2\2\u0378\u037d\5\u00aaV\2\u0379"+
		"\u037a\7\37\2\2\u037a\u037c\5\u00aaV\2\u037b\u0379\3\2\2\2\u037c\u037f"+
		"\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u008f\3\2\2\2\u037f"+
		"\u037d\3\2\2\2\u0380\u0381\7[\2\2\u0381\u0382\5\u00aaV\2\u0382\u0091\3"+
		"\2\2\2\u0383\u0384\5\u00aaV\2\u0384\u0385\7\22\2\2\u0385\u0093\3\2\2\2"+
		"\u0386\u0387\7\\\2\2\u0387\u038b\5\u0084C\2\u0388\u038a\5\u0096L\2\u0389"+
		"\u0388\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2"+
		"\2\2\u038c\u0095\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u038f\7]\2\2\u038f"+
		"\u0390\5\u00a0Q\2\u0390\u0391\5\u0080A\2\u0391\u0395\3\2\2\2\u0392\u0393"+
		"\7^\2\2\u0393\u0395\5\u0080A\2\u0394\u038e\3\2\2\2\u0394\u0392\3\2\2\2"+
		"\u0395\u0097\3\2\2\2\u0396\u0397\7*\2\2\u0397\u0398\5\u00aaV\2\u0398\u039a"+
		"\7\21\2\2\u0399\u039b\5\u008eH\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2"+
		"\2\u039b\u039c\3\2\2\2\u039c\u039e\7\23\2\2\u039d\u039f\5\u009aN\2\u039e"+
		"\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\5\u0080"+
		"A\2\u03a1\u0099\3\2\2\2\u03a2\u03a3\7\5\2\2\u03a3\u03a4\5\u008eH\2\u03a4"+
		"\u009b\3\2\2\2\u03a5\u03a8\7&\2\2\u03a6\u03a9\5\u0080A\2\u03a7\u03a9\5"+
		"\u0084C\2\u03a8\u03a6\3\2\2\2\u03a8\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2"+
		"\u03aa\u03ad\5\u0084C\2\u03ab\u03ae\5\u0080A\2\u03ac\u03ae\5\u0084C\2"+
		"\u03ad\u03ab\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0"+
		"\5\u0080A\2\u03b0\u009d\3\2\2\2\u03b1\u03b2\7\65\2\2\u03b2\u03b3\5\u0084"+
		"C\2\u03b3\u03b4\5\u0080A\2\u03b4\u009f\3\2\2\2\u03b5\u03b6\t\21\2\2\u03b6"+
		"\u00a1\3\2\2\2\u03b7\u03b8\78\2\2\u03b8\u03b9\5\u00aaV\2\u03b9\u03ba\5"+
		"\u0080A\2\u03ba\u00a3\3\2\2\2\u03bb\u03bd\7\21\2\2\u03bc\u03be\5r:\2\u03bd"+
		"\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c5\3\2\2\2\u03bf\u03c1\7\37"+
		"\2\2\u03c0\u03c2\5r:\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4"+
		"\3\2\2\2\u03c3\u03bf\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5"+
		"\u03c6\3\2\2\2\u03c6\u03c8\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03d6\7\23"+
		"\2\2\u03c9\u03d2\7.\2\2\u03ca\u03cf\5r:\2\u03cb\u03cc\7\37\2\2\u03cc\u03ce"+
		"\5r:\2\u03cd\u03cb\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03ca\3\2"+
		"\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\7/\2\2\u03d5"+
		"\u03bb\3\2\2\2\u03d5\u03c9\3\2\2\2\u03d6\u00a5\3\2\2\2\u03d7\u03d8\5p"+
		"9\2\u03d8\u00a7\3\2\2\2\u03d9\u03db\t\22\2\2\u03da\u03dc\7k\2\2\u03db"+
		"\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u00a9\3\2\2\2\u03dd\u03de\t\23"+
		"\2\2\u03de\u00ab\3\2\2\2i\u00b5\u00c4\u00d0\u00e4\u00e6\u00ec\u00ee\u00fc"+
		"\u0100\u0105\u010c\u0112\u0118\u011c\u0128\u0130\u013a\u013d\u0143\u014f"+
		"\u0154\u015a\u0160\u0169\u0177\u017a\u0186\u018d\u0190\u0194\u0199\u019d"+
		"\u01a8\u01aa\u01b1\u01bb\u01c1\u01cc\u01cf\u01d5\u01d8\u01e0\u01e3\u01e9"+
		"\u01ec\u01f4\u01f7\u01fd\u0201\u020a\u020f\u0214\u021c\u022b\u022d\u0232"+
		"\u023c\u024d\u0259\u0263\u0269\u026c\u0270\u0277\u028b\u0299\u029d\u02a3"+
		"\u02a8\u02ac\u02c4\u02ff\u0301\u030b\u0312\u031a\u031e\u0326\u032a\u032c"+
		"\u0337\u034d\u0351\u0357\u035b\u0361\u0365\u036b\u0376\u037d\u038b\u0394"+
		"\u039a\u039e\u03a8\u03ad\u03bd\u03c1\u03c5\u03cf\u03d2\u03d5\u03db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}