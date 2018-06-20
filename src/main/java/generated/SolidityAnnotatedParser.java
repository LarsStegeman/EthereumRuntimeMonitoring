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
		T__87=88, T__88=89, AnnotationStart=90, AnnotationKind=91, AnnotationQuantifier=92, 
		AnnotationKeywords=93, LINE_COMMENT=94, Int=95, Uint=96, Byte=97, Fixed=98, 
		Ufixed=99, VersionLiteral=100, BooleanLiteral=101, DecimalNumber=102, 
		HexNumber=103, NumberUnit=104, HexLiteral=105, ReservedKeyword=106, AnonymousKeyword=107, 
		BreakKeyword=108, ConstantKeyword=109, ContinueKeyword=110, ExternalKeyword=111, 
		IndexedKeyword=112, InternalKeyword=113, PayableKeyword=114, PrivateKeyword=115, 
		PublicKeyword=116, PureKeyword=117, ViewKeyword=118, Identifier=119, StringLiteral=120, 
		WS=121, COMMENT=122;
	public static final int
		RULE_contractPart = 0, RULE_annotationDefinition = 1, RULE_sourceUnit = 2, 
		RULE_pragmaDirective = 3, RULE_pragmaName = 4, RULE_pragmaValue = 5, RULE_version = 6, 
		RULE_versionOperator = 7, RULE_versionConstraint = 8, RULE_importDeclaration = 9, 
		RULE_importDirective = 10, RULE_contractDefinition = 11, RULE_inheritanceSpecifier = 12, 
		RULE_stateVariableDeclaration = 13, RULE_usingForDeclaration = 14, RULE_structDefinition = 15, 
		RULE_constructorDefinition = 16, RULE_modifierDefinition = 17, RULE_modifierInvocation = 18, 
		RULE_functionDefinition = 19, RULE_returnParameters = 20, RULE_modifierList = 21, 
		RULE_eventDefinition = 22, RULE_enumValue = 23, RULE_enumDefinition = 24, 
		RULE_parameterList = 25, RULE_parameter = 26, RULE_eventParameterList = 27, 
		RULE_eventParameter = 28, RULE_functionTypeParameterList = 29, RULE_functionTypeParameter = 30, 
		RULE_variableDeclaration = 31, RULE_typeName = 32, RULE_userDefinedTypeName = 33, 
		RULE_mapping = 34, RULE_functionTypeName = 35, RULE_storageLocation = 36, 
		RULE_stateMutability = 37, RULE_block = 38, RULE_statement = 39, RULE_expressionStatement = 40, 
		RULE_ifStatement = 41, RULE_whileStatement = 42, RULE_simpleStatement = 43, 
		RULE_forStatement = 44, RULE_inlineAssemblyStatement = 45, RULE_doWhileStatement = 46, 
		RULE_continueStatement = 47, RULE_breakStatement = 48, RULE_returnStatement = 49, 
		RULE_throwStatement = 50, RULE_emitStatement = 51, RULE_variableDeclarationStatement = 52, 
		RULE_identifierList = 53, RULE_elementaryTypeName = 54, RULE_expression = 55, 
		RULE_primaryExpression = 56, RULE_expressionList = 57, RULE_nameValueList = 58, 
		RULE_nameValue = 59, RULE_functionCallArguments = 60, RULE_functionCall = 61, 
		RULE_assemblyBlock = 62, RULE_assemblyItem = 63, RULE_assemblyExpression = 64, 
		RULE_assemblyCall = 65, RULE_assemblyLocalDefinition = 66, RULE_assemblyAssignment = 67, 
		RULE_assemblyIdentifierOrList = 68, RULE_assemblyIdentifierList = 69, 
		RULE_assemblyStackAssignment = 70, RULE_labelDefinition = 71, RULE_assemblySwitch = 72, 
		RULE_assemblyCase = 73, RULE_assemblyFunctionDefinition = 74, RULE_assemblyFunctionReturns = 75, 
		RULE_assemblyFor = 76, RULE_assemblyIf = 77, RULE_assemblyLiteral = 78, 
		RULE_subAssembly = 79, RULE_tupleExpression = 80, RULE_elementaryTypeNameExpression = 81, 
		RULE_numberLiteral = 82, RULE_identifier = 83;
	public static final String[] ruleNames = {
		"contractPart", "annotationDefinition", "sourceUnit", "pragmaDirective", 
		"pragmaName", "pragmaValue", "version", "versionOperator", "versionConstraint", 
		"importDeclaration", "importDirective", "contractDefinition", "inheritanceSpecifier", 
		"stateVariableDeclaration", "usingForDeclaration", "structDefinition", 
		"constructorDefinition", "modifierDefinition", "modifierInvocation", "functionDefinition", 
		"returnParameters", "modifierList", "eventDefinition", "enumValue", "enumDefinition", 
		"parameterList", "parameter", "eventParameterList", "eventParameter", 
		"functionTypeParameterList", "functionTypeParameter", "variableDeclaration", 
		"typeName", "userDefinedTypeName", "mapping", "functionTypeName", "storageLocation", 
		"stateMutability", "block", "statement", "expressionStatement", "ifStatement", 
		"whileStatement", "simpleStatement", "forStatement", "inlineAssemblyStatement", 
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
		null, "'pragma'", "';'", "'^'", "'~'", "'>='", "'>'", "'<'", "'<='", "'='", 
		"'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", "'contract'", 
		"'interface'", "'library'", "'is'", "'('", "')'", "'using'", "'for'", 
		"'struct'", "'constructor'", "'modifier'", "'function'", "'returns'", 
		"'event'", "'enum'", "'['", "']'", "'.'", "'mapping'", "'=>'", "'memory'", 
		"'storage'", "'if'", "'else'", "'while'", "'assembly'", "'do'", "'return'", 
		"'throw'", "'emit'", "'var'", "'address'", "'bool'", "'string'", "'byte'", 
		"'++'", "'--'", "'new'", "'+'", "'-'", "'after'", "'delete'", "'!'", "'**'", 
		"'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'=='", "'!='", "'&&'", "'||'", 
		"'?'", "':'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'let'", "':='", "'=:'", "'switch'", "'case'", 
		"'default'", "'->'", "'//@'", null, null, "'\\old'", null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'anonymous'", 
		"'break'", "'constant'", "'continue'", "'external'", "'indexed'", "'internal'", 
		"'payable'", "'private'", "'public'", "'pure'", "'view'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "AnnotationStart", "AnnotationKind", 
		"AnnotationQuantifier", "AnnotationKeywords", "LINE_COMMENT", "Int", "Uint", 
		"Byte", "Fixed", "Ufixed", "VersionLiteral", "BooleanLiteral", "DecimalNumber", 
		"HexNumber", "NumberUnit", "HexLiteral", "ReservedKeyword", "AnonymousKeyword", 
		"BreakKeyword", "ConstantKeyword", "ContinueKeyword", "ExternalKeyword", 
		"IndexedKeyword", "InternalKeyword", "PayableKeyword", "PrivateKeyword", 
		"PublicKeyword", "PureKeyword", "ViewKeyword", "Identifier", "StringLiteral", 
		"WS", "COMMENT"
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				enumDefinition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
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
		public TerminalNode AnnotationQuantifier() { return getToken(SolidityAnnotatedParser.AnnotationQuantifier, 0); }
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
			setState(179);
			match(AnnotationStart);
			setState(180);
			match(AnnotationKind);
			setState(181);
			match(AnnotationQuantifier);
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
		enterRule(_localctx, 4, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) {
				{
				setState(186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(183);
					pragmaDirective();
					}
					break;
				case T__10:
					{
					setState(184);
					importDirective();
					}
					break;
				case T__16:
				case T__17:
				case T__18:
					{
					setState(185);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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
		enterRule(_localctx, 6, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__0);
			setState(194);
			pragmaName();
			setState(195);
			pragmaValue();
			setState(196);
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
		enterRule(_localctx, 8, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 10, RULE_pragmaValue);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
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
		enterRule(_localctx, 12, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			versionConstraint();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==VersionLiteral) {
				{
				setState(205);
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
		enterRule(_localctx, 14, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_versionConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(210);
				versionOperator();
				}
			}

			setState(213);
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
		enterRule(_localctx, 18, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			identifier();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(216);
				match(T__9);
				setState(217);
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
		enterRule(_localctx, 20, RULE_importDirective);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__10);
				setState(221);
				match(StringLiteral);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(222);
					match(T__9);
					setState(223);
					identifier();
					}
				}

				setState(226);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(T__10);
				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(228);
					match(T__11);
					}
					break;
				case T__12:
				case Identifier:
					{
					setState(229);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(232);
					match(T__9);
					setState(233);
					identifier();
					}
				}

				setState(236);
				match(T__12);
				setState(237);
				match(StringLiteral);
				setState(238);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(T__10);
				setState(240);
				match(T__13);
				setState(241);
				importDeclaration();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(242);
					match(T__14);
					setState(243);
					importDeclaration();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(T__15);
				setState(250);
				match(T__12);
				setState(251);
				match(StringLiteral);
				setState(252);
				match(T__1);
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
		enterRule(_localctx, 22, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(257);
			identifier();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(258);
				match(T__19);
				setState(259);
				inheritanceSpecifier();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(260);
					match(T__14);
					setState(261);
					inheritanceSpecifier();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(269);
			match(T__13);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__34) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (AnnotationStart - 90)) | (1L << (Int - 90)) | (1L << (Uint - 90)) | (1L << (Byte - 90)) | (1L << (Fixed - 90)) | (1L << (Ufixed - 90)) | (1L << (Identifier - 90)))) != 0)) {
				{
				{
				setState(270);
				contractPart();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
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
		enterRule(_localctx, 24, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			userDefinedTypeName();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(279);
				match(T__20);
				setState(280);
				expression(0);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(281);
					match(T__14);
					setState(282);
					expression(0);
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(T__21);
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
		enterRule(_localctx, 26, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			typeName(0);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (InternalKeyword - 109)) | (1L << (PrivateKeyword - 109)) | (1L << (PublicKeyword - 109)))) != 0)) {
				{
				{
				setState(293);
				_la = _input.LA(1);
				if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (InternalKeyword - 109)) | (1L << (PrivateKeyword - 109)) | (1L << (PublicKeyword - 109)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			identifier();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(300);
				match(T__8);
				setState(301);
				expression(0);
				}
			}

			setState(304);
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
		enterRule(_localctx, 28, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__22);
			setState(307);
			identifier();
			setState(308);
			match(T__23);
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(309);
				match(T__11);
				}
				break;
			case T__12:
			case T__27:
			case T__34:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(310);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(313);
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
		enterRule(_localctx, 30, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__24);
			setState(316);
			identifier();
			setState(317);
			match(T__13);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__34) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(318);
				variableDeclaration();
				setState(319);
				match(T__1);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__34) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
					{
					{
					setState(320);
					variableDeclaration();
					setState(321);
					match(T__1);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(330);
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
		enterRule(_localctx, 32, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__25);
			setState(333);
			parameterList();
			setState(334);
			modifierList();
			setState(335);
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
		enterRule(_localctx, 34, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__26);
			setState(338);
			identifier();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(339);
				parameterList();
				}
			}

			setState(342);
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
		enterRule(_localctx, 36, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			identifier();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(345);
				match(T__20);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
					{
					setState(346);
					expressionList();
					}
				}

				setState(349);
				match(T__21);
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
		enterRule(_localctx, 38, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__27);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==Identifier) {
				{
				setState(353);
				identifier();
				}
			}

			setState(356);
			parameterList();
			setState(357);
			modifierList();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(358);
				returnParameters();
				}
			}

			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(361);
				match(T__1);
				}
				break;
			case T__13:
				{
				setState(362);
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
		enterRule(_localctx, 40, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__28);
			setState(366);
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
		enterRule(_localctx, 42, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (ExternalKeyword - 109)) | (1L << (InternalKeyword - 109)) | (1L << (PayableKeyword - 109)) | (1L << (PrivateKeyword - 109)) | (1L << (PublicKeyword - 109)) | (1L << (PureKeyword - 109)) | (1L << (ViewKeyword - 109)) | (1L << (Identifier - 109)))) != 0)) {
				{
				setState(374);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case Identifier:
					{
					setState(368);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(369);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(370);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(371);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(372);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(373);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(378);
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
		enterRule(_localctx, 44, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__29);
			setState(380);
			identifier();
			setState(381);
			eventParameterList();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(382);
				match(AnonymousKeyword);
				}
			}

			setState(385);
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
		enterRule(_localctx, 46, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 48, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(T__30);
			setState(390);
			identifier();
			setState(391);
			match(T__13);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==Identifier) {
				{
				setState(392);
				enumValue();
				}
			}

			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(395);
				match(T__14);
				setState(396);
				enumValue();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
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
		enterRule(_localctx, 50, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__20);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__34) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(405);
				parameter();
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(406);
					match(T__14);
					setState(407);
					parameter();
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(415);
			match(T__21);
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
		enterRule(_localctx, 52, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			typeName(0);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36 || _la==T__37) {
				{
				setState(418);
				storageLocation();
				}
			}

			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==Identifier) {
				{
				setState(421);
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
		enterRule(_localctx, 54, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__20);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__34) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(425);
				eventParameter();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(426);
					match(T__14);
					setState(427);
					eventParameter();
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(435);
			match(T__21);
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
		enterRule(_localctx, 56, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			typeName(0);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(438);
				match(IndexedKeyword);
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==Identifier) {
				{
				setState(441);
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
		enterRule(_localctx, 58, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__20);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__34) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(445);
				functionTypeParameter();
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(446);
					match(T__14);
					setState(447);
					functionTypeParameter();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(455);
			match(T__21);
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
		enterRule(_localctx, 60, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			typeName(0);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36 || _la==T__37) {
				{
				setState(458);
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
		enterRule(_localctx, 62, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			typeName(0);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36 || _la==T__37) {
				{
				setState(462);
				storageLocation();
				}
			}

			setState(465);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				{
				setState(468);
				elementaryTypeName();
				}
				break;
			case T__12:
			case Identifier:
				{
				setState(469);
				userDefinedTypeName();
				}
				break;
			case T__34:
				{
				setState(470);
				mapping();
				}
				break;
			case T__27:
				{
				setState(471);
				functionTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(474);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(475);
					match(T__31);
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
						{
						setState(476);
						expression(0);
						}
					}

					setState(479);
					match(T__32);
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 66, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			identifier();
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(486);
					match(T__33);
					setState(487);
					identifier();
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 68, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__34);
			setState(494);
			match(T__20);
			setState(495);
			elementaryTypeName();
			setState(496);
			match(T__35);
			setState(497);
			typeName(0);
			setState(498);
			match(T__21);
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
		enterRule(_localctx, 70, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__27);
			setState(501);
			functionTypeParameterList();
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(505);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(502);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(503);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(504);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(510);
				match(T__28);
				setState(511);
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
		enterRule(_localctx, 72, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37) ) {
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
		enterRule(_localctx, 74, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (PayableKeyword - 109)) | (1L << (PureKeyword - 109)) | (1L << (ViewKeyword - 109)))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T__13);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__23) | (1L << T__27) | (1L << T__31) | (1L << T__34) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (BreakKeyword - 95)) | (1L << (ContinueKeyword - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
				{
				{
				setState(519);
				statement();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
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
		enterRule(_localctx, 78, RULE_statement);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				ifStatement();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				whileStatement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				forStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				block();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				inlineAssemblyStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 6);
				{
				setState(532);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(533);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(534);
				breakStatement();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 9);
				{
				setState(535);
				returnStatement();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 10);
				{
				setState(536);
				throwStatement();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 11);
				{
				setState(537);
				emitStatement();
				}
				break;
			case T__3:
			case T__12:
			case T__20:
			case T__27:
			case T__31:
			case T__34:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
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
				setState(538);
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
		enterRule(_localctx, 80, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			expression(0);
			setState(542);
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
		enterRule(_localctx, 82, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(T__38);
			setState(545);
			match(T__20);
			setState(546);
			expression(0);
			setState(547);
			match(T__21);
			setState(548);
			statement();
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(549);
				match(T__39);
				setState(550);
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
		enterRule(_localctx, 84, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(T__40);
			setState(554);
			match(T__20);
			setState(555);
			expression(0);
			setState(556);
			match(T__21);
			setState(557);
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
		enterRule(_localctx, 86, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(559);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(560);
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
		enterRule(_localctx, 88, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__23);
			setState(564);
			match(T__20);
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__20:
			case T__27:
			case T__31:
			case T__34:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
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
				setState(565);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(566);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
				{
				setState(569);
				expression(0);
				}
			}

			setState(572);
			match(T__1);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
				{
				setState(573);
				expression(0);
				}
			}

			setState(576);
			match(T__21);
			setState(577);
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
		enterRule(_localctx, 90, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(T__41);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(580);
				match(StringLiteral);
				}
			}

			setState(583);
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
		enterRule(_localctx, 92, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(T__42);
			setState(586);
			statement();
			setState(587);
			match(T__40);
			setState(588);
			match(T__20);
			setState(589);
			expression(0);
			setState(590);
			match(T__21);
			setState(591);
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
		enterRule(_localctx, 94, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(ContinueKeyword);
			setState(594);
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
		enterRule(_localctx, 96, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(BreakKeyword);
			setState(597);
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
		enterRule(_localctx, 98, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(T__43);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
				{
				setState(600);
				expression(0);
				}
			}

			setState(603);
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
		enterRule(_localctx, 100, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(T__44);
			setState(606);
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
		enterRule(_localctx, 102, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(T__45);
			setState(609);
			functionCall();
			setState(610);
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
		enterRule(_localctx, 104, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(612);
				match(T__46);
				setState(613);
				identifierList();
				}
				break;
			case 2:
				{
				setState(614);
				variableDeclaration();
				}
				break;
			}
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(617);
				match(T__8);
				setState(618);
				expression(0);
				}
			}

			setState(621);
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
		enterRule(_localctx, 106, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(T__20);
			setState(630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12 || _la==Identifier) {
						{
						setState(624);
						identifier();
						}
					}

					setState(627);
					match(T__14);
					}
					} 
				}
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==Identifier) {
				{
				setState(633);
				identifier();
				}
			}

			setState(636);
			match(T__21);
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
		enterRule(_localctx, 108, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (T__46 - 47)) | (1L << (T__47 - 47)) | (1L << (T__48 - 47)) | (1L << (T__49 - 47)) | (1L << (T__50 - 47)) | (1L << (Int - 47)) | (1L << (Uint - 47)) | (1L << (Byte - 47)) | (1L << (Fixed - 47)) | (1L << (Ufixed - 47)))) != 0)) ) {
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(641);
				match(T__53);
				setState(642);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(643);
				match(T__20);
				setState(644);
				expression(0);
				setState(645);
				match(T__21);
				}
				break;
			case 3:
				{
				setState(647);
				_la = _input.LA(1);
				if ( !(_la==T__51 || _la==T__52) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(648);
				expression(19);
				}
				break;
			case 4:
				{
				setState(649);
				_la = _input.LA(1);
				if ( !(_la==T__54 || _la==T__55) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(650);
				expression(18);
				}
				break;
			case 5:
				{
				setState(651);
				_la = _input.LA(1);
				if ( !(_la==T__56 || _la==T__57) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(652);
				expression(17);
				}
				break;
			case 6:
				{
				setState(653);
				match(T__58);
				setState(654);
				expression(16);
				}
				break;
			case 7:
				{
				setState(655);
				match(T__3);
				setState(656);
				expression(15);
				}
				break;
			case 8:
				{
				setState(657);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(717);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(660);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(661);
						match(T__59);
						setState(662);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(663);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(664);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__60) | (1L << T__61))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(665);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(666);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(667);
						_la = _input.LA(1);
						if ( !(_la==T__54 || _la==T__55) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(668);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(669);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(670);
						_la = _input.LA(1);
						if ( !(_la==T__62 || _la==T__63) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(671);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(672);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(673);
						match(T__64);
						setState(674);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(675);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(676);
						match(T__2);
						setState(677);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(678);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(679);
						match(T__65);
						setState(680);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(681);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(682);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(683);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(684);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(685);
						_la = _input.LA(1);
						if ( !(_la==T__66 || _la==T__67) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(686);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(687);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(688);
						match(T__68);
						setState(689);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(690);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(691);
						match(T__69);
						setState(692);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(693);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(694);
						match(T__70);
						setState(695);
						expression(0);
						setState(696);
						match(T__71);
						setState(697);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(699);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(700);
						_la = _input.LA(1);
						if ( !(_la==T__8 || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(701);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(702);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(703);
						_la = _input.LA(1);
						if ( !(_la==T__51 || _la==T__52) ) {
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
						setState(704);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(705);
						match(T__31);
						setState(706);
						expression(0);
						setState(707);
						match(T__32);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(709);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(710);
						match(T__20);
						setState(711);
						functionCallArguments();
						setState(712);
						match(T__21);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(714);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(715);
						match(T__33);
						setState(716);
						identifier();
						}
						break;
					}
					} 
				}
				setState(721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		enterRule(_localctx, 112, RULE_primaryExpression);
		try {
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				match(BooleanLiteral);
				}
				break;
			case DecimalNumber:
			case HexNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				numberLiteral();
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				match(HexLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(725);
				match(StringLiteral);
				}
				break;
			case T__12:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(726);
				identifier();
				}
				break;
			case T__20:
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(727);
				tupleExpression();
				}
				break;
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 7);
				{
				setState(728);
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
		enterRule(_localctx, 114, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			expression(0);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(732);
				match(T__14);
				setState(733);
				expression(0);
				}
				}
				setState(738);
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
		enterRule(_localctx, 116, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			nameValue();
			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(740);
					match(T__14);
					setState(741);
					nameValue();
					}
					} 
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(747);
				match(T__14);
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
		enterRule(_localctx, 118, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			identifier();
			setState(751);
			match(T__71);
			setState(752);
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
		enterRule(_localctx, 120, RULE_functionCallArguments);
		int _la;
		try {
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				match(T__13);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==Identifier) {
					{
					setState(755);
					nameValueList();
					}
				}

				setState(758);
				match(T__15);
				}
				break;
			case T__3:
			case T__12:
			case T__20:
			case T__21:
			case T__31:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
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
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
					{
					setState(759);
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
		enterRule(_localctx, 122, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			expression(0);
			setState(765);
			match(T__20);
			setState(766);
			functionCallArguments();
			setState(767);
			match(T__21);
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
		enterRule(_localctx, 124, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(T__13);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__23) | (1L << T__27) | (1L << T__38) | (1L << T__41) | (1L << T__43) | (1L << T__47) | (1L << T__50))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (T__82 - 83)) | (1L << (T__84 - 83)) | (1L << (T__85 - 83)) | (1L << (DecimalNumber - 83)) | (1L << (HexNumber - 83)) | (1L << (HexLiteral - 83)) | (1L << (BreakKeyword - 83)) | (1L << (ContinueKeyword - 83)) | (1L << (Identifier - 83)) | (1L << (StringLiteral - 83)))) != 0)) {
				{
				{
				setState(770);
				assemblyItem();
				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(776);
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
		enterRule(_localctx, 126, RULE_assemblyItem);
		try {
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(781);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(782);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(783);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(784);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(785);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(786);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(787);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(788);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(789);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(790);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(791);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(792);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(793);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(794);
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
		enterRule(_localctx, 128, RULE_assemblyExpression);
		try {
			setState(799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__43:
			case T__47:
			case T__50:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
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
		enterRule(_localctx, 130, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				{
				setState(801);
				match(T__43);
				}
				break;
			case T__47:
				{
				setState(802);
				match(T__47);
				}
				break;
			case T__50:
				{
				setState(803);
				match(T__50);
				}
				break;
			case T__12:
			case Identifier:
				{
				setState(804);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(807);
				match(T__20);
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__43) | (1L << T__47) | (1L << T__50))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
					{
					setState(808);
					assemblyExpression();
					}
				}

				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(811);
					match(T__14);
					setState(812);
					assemblyExpression();
					}
					}
					setState(817);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(818);
				match(T__21);
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
		enterRule(_localctx, 132, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(T__82);
			setState(822);
			assemblyIdentifierOrList();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__83) {
				{
				setState(823);
				match(T__83);
				setState(824);
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
		enterRule(_localctx, 134, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			assemblyIdentifierOrList();
			setState(828);
			match(T__83);
			setState(829);
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
		enterRule(_localctx, 136, RULE_assemblyIdentifierOrList);
		try {
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				identifier();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				match(T__20);
				setState(833);
				assemblyIdentifierList();
				setState(834);
				match(T__21);
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
		enterRule(_localctx, 138, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			identifier();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(839);
				match(T__14);
				setState(840);
				identifier();
				}
				}
				setState(845);
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
		enterRule(_localctx, 140, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(T__84);
			setState(847);
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
		enterRule(_localctx, 142, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			identifier();
			setState(850);
			match(T__71);
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
		enterRule(_localctx, 144, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(T__85);
			setState(853);
			assemblyExpression();
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__86 || _la==T__87) {
				{
				{
				setState(854);
				assemblyCase();
				}
				}
				setState(859);
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
		enterRule(_localctx, 146, RULE_assemblyCase);
		try {
			setState(866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__86:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				match(T__86);
				setState(861);
				assemblyLiteral();
				setState(862);
				assemblyBlock();
				}
				break;
			case T__87:
				enterOuterAlt(_localctx, 2);
				{
				setState(864);
				match(T__87);
				setState(865);
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
		enterRule(_localctx, 148, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			match(T__27);
			setState(869);
			identifier();
			setState(870);
			match(T__20);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==Identifier) {
				{
				setState(871);
				assemblyIdentifierList();
				}
			}

			setState(874);
			match(T__21);
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__88) {
				{
				setState(875);
				assemblyFunctionReturns();
				}
			}

			setState(878);
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
		enterRule(_localctx, 150, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(880);
			match(T__88);
			setState(881);
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
		enterRule(_localctx, 152, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(T__23);
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(884);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__43:
			case T__47:
			case T__50:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(885);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(888);
			assemblyExpression();
			setState(891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(889);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__43:
			case T__47:
			case T__50:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(890);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(893);
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
		enterRule(_localctx, 154, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(T__38);
			setState(896);
			assemblyExpression();
			setState(897);
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
		enterRule(_localctx, 156, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (StringLiteral - 102)))) != 0)) ) {
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
		enterRule(_localctx, 158, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(T__41);
			setState(902);
			identifier();
			setState(903);
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
		enterRule(_localctx, 160, RULE_tupleExpression);
		int _la;
		try {
			setState(931);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				match(T__20);
				{
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
					{
					setState(906);
					expression(0);
					}
				}

				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(909);
					match(T__14);
					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
						{
						setState(910);
						expression(0);
						}
					}

					}
					}
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(918);
				match(T__21);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				match(T__31);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Int - 95)) | (1L << (Uint - 95)) | (1L << (Byte - 95)) | (1L << (Fixed - 95)) | (1L << (Ufixed - 95)) | (1L << (BooleanLiteral - 95)) | (1L << (DecimalNumber - 95)) | (1L << (HexNumber - 95)) | (1L << (HexLiteral - 95)) | (1L << (Identifier - 95)) | (1L << (StringLiteral - 95)))) != 0)) {
					{
					setState(920);
					expression(0);
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(921);
						match(T__14);
						setState(922);
						expression(0);
						}
						}
						setState(927);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(930);
				match(T__32);
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
		enterRule(_localctx, 162, RULE_elementaryTypeNameExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
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
		enterRule(_localctx, 164, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(936);
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
		enterRule(_localctx, 166, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==Identifier) ) {
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
		case 32:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 55:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 25);
		case 15:
			return precpred(_ctx, 23);
		case 16:
			return precpred(_ctx, 22);
		case 17:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3|\u03b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00b4\n\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\7\4\u00bd\n\4\f\4\16\4\u00c0\13\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\5\7\u00cd\n\7\3\b\3\b\5\b\u00d1\n\b\3\t\3\t\3\n"+
		"\5\n\u00d6\n\n\3\n\3\n\3\13\3\13\3\13\5\13\u00dd\n\13\3\f\3\f\3\f\3\f"+
		"\5\f\u00e3\n\f\3\f\3\f\3\f\3\f\5\f\u00e9\n\f\3\f\3\f\5\f\u00ed\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f7\n\f\f\f\16\f\u00fa\13\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0101\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0109\n\r\f\r\16"+
		"\r\u010c\13\r\5\r\u010e\n\r\3\r\3\r\7\r\u0112\n\r\f\r\16\r\u0115\13\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u011e\n\16\f\16\16\16\u0121\13"+
		"\16\3\16\3\16\5\16\u0125\n\16\3\17\3\17\7\17\u0129\n\17\f\17\16\17\u012c"+
		"\13\17\3\17\3\17\3\17\5\17\u0131\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u013a\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u0146\n\21\f\21\16\21\u0149\13\21\5\21\u014b\n\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0157\n\23\3\23\3\23\3\24\3\24"+
		"\3\24\5\24\u015e\n\24\3\24\5\24\u0161\n\24\3\25\3\25\5\25\u0165\n\25\3"+
		"\25\3\25\3\25\5\25\u016a\n\25\3\25\3\25\5\25\u016e\n\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0179\n\27\f\27\16\27\u017c\13\27"+
		"\3\30\3\30\3\30\3\30\5\30\u0182\n\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\5\32\u018c\n\32\3\32\3\32\7\32\u0190\n\32\f\32\16\32\u0193\13\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u019b\n\33\f\33\16\33\u019e\13\33"+
		"\5\33\u01a0\n\33\3\33\3\33\3\34\3\34\5\34\u01a6\n\34\3\34\5\34\u01a9\n"+
		"\34\3\35\3\35\3\35\3\35\7\35\u01af\n\35\f\35\16\35\u01b2\13\35\5\35\u01b4"+
		"\n\35\3\35\3\35\3\36\3\36\5\36\u01ba\n\36\3\36\5\36\u01bd\n\36\3\37\3"+
		"\37\3\37\3\37\7\37\u01c3\n\37\f\37\16\37\u01c6\13\37\5\37\u01c8\n\37\3"+
		"\37\3\37\3 \3 \5 \u01ce\n \3!\3!\5!\u01d2\n!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u01db\n\"\3\"\3\"\3\"\5\"\u01e0\n\"\3\"\7\"\u01e3\n\"\f\"\16\"\u01e6"+
		"\13\"\3#\3#\3#\7#\u01eb\n#\f#\16#\u01ee\13#\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\7%\u01fc\n%\f%\16%\u01ff\13%\3%\3%\5%\u0203\n%\3&\3&\3\'\3"+
		"\'\3(\3(\7(\u020b\n(\f(\16(\u020e\13(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\5)\u021e\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u022a\n+\3,\3"+
		",\3,\3,\3,\3,\3-\3-\5-\u0234\n-\3.\3.\3.\3.\5.\u023a\n.\3.\5.\u023d\n"+
		".\3.\3.\5.\u0241\n.\3.\3.\3.\3/\3/\5/\u0248\n/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\5\63\u025c"+
		"\n\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\5\66"+
		"\u026a\n\66\3\66\3\66\5\66\u026e\n\66\3\66\3\66\3\67\3\67\5\67\u0274\n"+
		"\67\3\67\7\67\u0277\n\67\f\67\16\67\u027a\13\67\3\67\5\67\u027d\n\67\3"+
		"\67\3\67\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\5"+
		"9\u0295\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\79\u02d0\n9\f9\169\u02d3\13"+
		"9\3:\3:\3:\3:\3:\3:\3:\5:\u02dc\n:\3;\3;\3;\7;\u02e1\n;\f;\16;\u02e4\13"+
		";\3<\3<\3<\7<\u02e9\n<\f<\16<\u02ec\13<\3<\5<\u02ef\n<\3=\3=\3=\3=\3>"+
		"\3>\5>\u02f7\n>\3>\3>\5>\u02fb\n>\5>\u02fd\n>\3?\3?\3?\3?\3?\3@\3@\7@"+
		"\u0306\n@\f@\16@\u0309\13@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\5A\u031e\nA\3B\3B\5B\u0322\nB\3C\3C\3C\3C\5C\u0328\nC\3"+
		"C\3C\5C\u032c\nC\3C\3C\7C\u0330\nC\fC\16C\u0333\13C\3C\5C\u0336\nC\3D"+
		"\3D\3D\3D\5D\u033c\nD\3E\3E\3E\3E\3F\3F\3F\3F\3F\5F\u0347\nF\3G\3G\3G"+
		"\7G\u034c\nG\fG\16G\u034f\13G\3H\3H\3H\3I\3I\3I\3J\3J\3J\7J\u035a\nJ\f"+
		"J\16J\u035d\13J\3K\3K\3K\3K\3K\3K\5K\u0365\nK\3L\3L\3L\3L\5L\u036b\nL"+
		"\3L\3L\5L\u036f\nL\3L\3L\3M\3M\3M\3N\3N\3N\5N\u0379\nN\3N\3N\3N\5N\u037e"+
		"\nN\3N\3N\3O\3O\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3R\3R\5R\u038e\nR\3R\3R\5R\u0392"+
		"\nR\7R\u0394\nR\fR\16R\u0397\13R\3R\3R\3R\3R\3R\7R\u039e\nR\fR\16R\u03a1"+
		"\13R\5R\u03a3\nR\3R\5R\u03a6\nR\3S\3S\3T\3T\5T\u03ac\nT\3U\3U\3U\2\4B"+
		"pV\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\2\23\3\2\5\13\3\2\23\25\5\2oossuv\3\2\'(\5\2oottwx\4\2\61"+
		"\65ae\3\2\66\67\3\29:\3\2;<\4\2\16\16?@\3\2AB\3\2\7\n\3\2EF\4\2\13\13"+
		"KT\5\2hikkzz\3\2hi\4\2\17\17yy\2\u0403\2\u00b3\3\2\2\2\4\u00b5\3\2\2\2"+
		"\6\u00be\3\2\2\2\b\u00c3\3\2\2\2\n\u00c8\3\2\2\2\f\u00cc\3\2\2\2\16\u00ce"+
		"\3\2\2\2\20\u00d2\3\2\2\2\22\u00d5\3\2\2\2\24\u00d9\3\2\2\2\26\u0100\3"+
		"\2\2\2\30\u0102\3\2\2\2\32\u0118\3\2\2\2\34\u0126\3\2\2\2\36\u0134\3\2"+
		"\2\2 \u013d\3\2\2\2\"\u014e\3\2\2\2$\u0153\3\2\2\2&\u015a\3\2\2\2(\u0162"+
		"\3\2\2\2*\u016f\3\2\2\2,\u017a\3\2\2\2.\u017d\3\2\2\2\60\u0185\3\2\2\2"+
		"\62\u0187\3\2\2\2\64\u0196\3\2\2\2\66\u01a3\3\2\2\28\u01aa\3\2\2\2:\u01b7"+
		"\3\2\2\2<\u01be\3\2\2\2>\u01cb\3\2\2\2@\u01cf\3\2\2\2B\u01da\3\2\2\2D"+
		"\u01e7\3\2\2\2F\u01ef\3\2\2\2H\u01f6\3\2\2\2J\u0204\3\2\2\2L\u0206\3\2"+
		"\2\2N\u0208\3\2\2\2P\u021d\3\2\2\2R\u021f\3\2\2\2T\u0222\3\2\2\2V\u022b"+
		"\3\2\2\2X\u0233\3\2\2\2Z\u0235\3\2\2\2\\\u0245\3\2\2\2^\u024b\3\2\2\2"+
		"`\u0253\3\2\2\2b\u0256\3\2\2\2d\u0259\3\2\2\2f\u025f\3\2\2\2h\u0262\3"+
		"\2\2\2j\u0269\3\2\2\2l\u0271\3\2\2\2n\u0280\3\2\2\2p\u0294\3\2\2\2r\u02db"+
		"\3\2\2\2t\u02dd\3\2\2\2v\u02e5\3\2\2\2x\u02f0\3\2\2\2z\u02fc\3\2\2\2|"+
		"\u02fe\3\2\2\2~\u0303\3\2\2\2\u0080\u031d\3\2\2\2\u0082\u0321\3\2\2\2"+
		"\u0084\u0327\3\2\2\2\u0086\u0337\3\2\2\2\u0088\u033d\3\2\2\2\u008a\u0346"+
		"\3\2\2\2\u008c\u0348\3\2\2\2\u008e\u0350\3\2\2\2\u0090\u0353\3\2\2\2\u0092"+
		"\u0356\3\2\2\2\u0094\u0364\3\2\2\2\u0096\u0366\3\2\2\2\u0098\u0372\3\2"+
		"\2\2\u009a\u0375\3\2\2\2\u009c\u0381\3\2\2\2\u009e\u0385\3\2\2\2\u00a0"+
		"\u0387\3\2\2\2\u00a2\u03a5\3\2\2\2\u00a4\u03a7\3\2\2\2\u00a6\u03a9\3\2"+
		"\2\2\u00a8\u03ad\3\2\2\2\u00aa\u00b4\5\34\17\2\u00ab\u00b4\5\36\20\2\u00ac"+
		"\u00b4\5 \21\2\u00ad\u00b4\5\"\22\2\u00ae\u00b4\5$\23\2\u00af\u00b4\5"+
		"(\25\2\u00b0\u00b4\5.\30\2\u00b1\u00b4\5\62\32\2\u00b2\u00b4\5\4\3\2\u00b3"+
		"\u00aa\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2"+
		"\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\3\3\2\2\2\u00b5\u00b6\7\\\2\2"+
		"\u00b6\u00b7\7]\2\2\u00b7\u00b8\7^\2\2\u00b8\5\3\2\2\2\u00b9\u00bd\5\b"+
		"\5\2\u00ba\u00bd\5\26\f\2\u00bb\u00bd\5\30\r\2\u00bc\u00b9\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\7\2\2\3\u00c2\7\3\2\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00c5\5\n\6\2"+
		"\u00c5\u00c6\5\f\7\2\u00c6\u00c7\7\4\2\2\u00c7\t\3\2\2\2\u00c8\u00c9\5"+
		"\u00a8U\2\u00c9\13\3\2\2\2\u00ca\u00cd\5\16\b\2\u00cb\u00cd\5p9\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\r\3\2\2\2\u00ce\u00d0\5\22\n"+
		"\2\u00cf\u00d1\5\22\n\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\17\3\2\2\2\u00d2\u00d3\t\2\2\2\u00d3\21\3\2\2\2\u00d4\u00d6\5\20\t\2"+
		"\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\7f\2\2\u00d8\23\3\2\2\2\u00d9\u00dc\5\u00a8U\2\u00da\u00db\7\f\2\2\u00db"+
		"\u00dd\5\u00a8U\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\25\3\2"+
		"\2\2\u00de\u00df\7\r\2\2\u00df\u00e2\7z\2\2\u00e0\u00e1\7\f\2\2\u00e1"+
		"\u00e3\5\u00a8U\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u0101\7\4\2\2\u00e5\u00e8\7\r\2\2\u00e6\u00e9\7\16\2\2"+
		"\u00e7\u00e9\5\u00a8U\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00eb\7\f\2\2\u00eb\u00ed\5\u00a8U\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\17\2\2"+
		"\u00ef\u00f0\7z\2\2\u00f0\u0101\7\4\2\2\u00f1\u00f2\7\r\2\2\u00f2\u00f3"+
		"\7\20\2\2\u00f3\u00f8\5\24\13\2\u00f4\u00f5\7\21\2\2\u00f5\u00f7\5\24"+
		"\13\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\22"+
		"\2\2\u00fc\u00fd\7\17\2\2\u00fd\u00fe\7z\2\2\u00fe\u00ff\7\4\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00de\3\2\2\2\u0100\u00e5\3\2\2\2\u0100\u00f1\3\2"+
		"\2\2\u0101\27\3\2\2\2\u0102\u0103\t\3\2\2\u0103\u010d\5\u00a8U\2\u0104"+
		"\u0105\7\26\2\2\u0105\u010a\5\32\16\2\u0106\u0107\7\21\2\2\u0107\u0109"+
		"\5\32\16\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2"+
		"\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0104"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0113\7\20\2\2"+
		"\u0110\u0112\5\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\7\22\2\2\u0117\31\3\2\2\2\u0118\u0124\5D#\2\u0119\u011a\7\27\2"+
		"\2\u011a\u011f\5p9\2\u011b\u011c\7\21\2\2\u011c\u011e\5p9\2\u011d\u011b"+
		"\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\30\2\2\u0123\u0125\3"+
		"\2\2\2\u0124\u0119\3\2\2\2\u0124\u0125\3\2\2\2\u0125\33\3\2\2\2\u0126"+
		"\u012a\5B\"\2\u0127\u0129\t\4\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u0130\5\u00a8U\2\u012e\u012f\7\13\2\2\u012f\u0131"+
		"\5p9\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\7\4\2\2\u0133\35\3\2\2\2\u0134\u0135\7\31\2\2\u0135\u0136\5\u00a8"+
		"U\2\u0136\u0139\7\32\2\2\u0137\u013a\7\16\2\2\u0138\u013a\5B\"\2\u0139"+
		"\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\4"+
		"\2\2\u013c\37\3\2\2\2\u013d\u013e\7\33\2\2\u013e\u013f\5\u00a8U\2\u013f"+
		"\u014a\7\20\2\2\u0140\u0141\5@!\2\u0141\u0147\7\4\2\2\u0142\u0143\5@!"+
		"\2\u0143\u0144\7\4\2\2\u0144\u0146\3\2\2\2\u0145\u0142\3\2\2\2\u0146\u0149"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u0140\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\7\22\2\2\u014d!\3\2\2\2\u014e\u014f\7\34\2\2\u014f\u0150"+
		"\5\64\33\2\u0150\u0151\5,\27\2\u0151\u0152\5N(\2\u0152#\3\2\2\2\u0153"+
		"\u0154\7\35\2\2\u0154\u0156\5\u00a8U\2\u0155\u0157\5\64\33\2\u0156\u0155"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\5N(\2\u0159"+
		"%\3\2\2\2\u015a\u0160\5\u00a8U\2\u015b\u015d\7\27\2\2\u015c\u015e\5t;"+
		"\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161"+
		"\7\30\2\2\u0160\u015b\3\2\2\2\u0160\u0161\3\2\2\2\u0161\'\3\2\2\2\u0162"+
		"\u0164\7\36\2\2\u0163\u0165\5\u00a8U\2\u0164\u0163\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\5\64\33\2\u0167\u0169\5,\27\2"+
		"\u0168\u016a\5*\26\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016d"+
		"\3\2\2\2\u016b\u016e\7\4\2\2\u016c\u016e\5N(\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016c\3\2\2\2\u016e)\3\2\2\2\u016f\u0170\7\37\2\2\u0170\u0171\5\64\33"+
		"\2\u0171+\3\2\2\2\u0172\u0179\5&\24\2\u0173\u0179\5L\'\2\u0174\u0179\7"+
		"q\2\2\u0175\u0179\7v\2\2\u0176\u0179\7s\2\2\u0177\u0179\7u\2\2\u0178\u0172"+
		"\3\2\2\2\u0178\u0173\3\2\2\2\u0178\u0174\3\2\2\2\u0178\u0175\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017b-\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e"+
		"\7 \2\2\u017e\u017f\5\u00a8U\2\u017f\u0181\58\35\2\u0180\u0182\7m\2\2"+
		"\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184"+
		"\7\4\2\2\u0184/\3\2\2\2\u0185\u0186\5\u00a8U\2\u0186\61\3\2\2\2\u0187"+
		"\u0188\7!\2\2\u0188\u0189\5\u00a8U\2\u0189\u018b\7\20\2\2\u018a\u018c"+
		"\5\60\31\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0191\3\2\2\2"+
		"\u018d\u018e\7\21\2\2\u018e\u0190\5\60\31\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2"+
		"\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7\22\2\2\u0195\63\3\2\2\2\u0196\u019f"+
		"\7\27\2\2\u0197\u019c\5\66\34\2\u0198\u0199\7\21\2\2\u0199\u019b\5\66"+
		"\34\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u0197\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\7\30\2\2\u01a2"+
		"\65\3\2\2\2\u01a3\u01a5\5B\"\2\u01a4\u01a6\5J&\2\u01a5\u01a4\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9\5\u00a8U\2\u01a8\u01a7"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\67\3\2\2\2\u01aa\u01b3\7\27\2\2\u01ab"+
		"\u01b0\5:\36\2\u01ac\u01ad\7\21\2\2\u01ad\u01af\5:\36\2\u01ae\u01ac\3"+
		"\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7\30\2\2\u01b69\3\2\2\2\u01b7\u01b9"+
		"\5B\"\2\u01b8\u01ba\7r\2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01bd\5\u00a8U\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd;\3\2\2\2\u01be\u01c7\7\27\2\2\u01bf\u01c4\5> \2\u01c0\u01c1"+
		"\7\21\2\2\u01c1\u01c3\5> \2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c7\u01bf\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\7\30\2\2\u01ca=\3\2\2\2\u01cb\u01cd\5B\"\2\u01cc\u01ce\5J&\2\u01cd"+
		"\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce?\3\2\2\2\u01cf\u01d1\5B\"\2\u01d0"+
		"\u01d2\5J&\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2"+
		"\2\u01d3\u01d4\5\u00a8U\2\u01d4A\3\2\2\2\u01d5\u01d6\b\"\1\2\u01d6\u01db"+
		"\5n8\2\u01d7\u01db\5D#\2\u01d8\u01db\5F$\2\u01d9\u01db\5H%\2\u01da\u01d5"+
		"\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"\u01e4\3\2\2\2\u01dc\u01dd\f\4\2\2\u01dd\u01df\7\"\2\2\u01de\u01e0\5p"+
		"9\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e3\7#\2\2\u01e2\u01dc\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5C\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01ec"+
		"\5\u00a8U\2\u01e8\u01e9\7$\2\2\u01e9\u01eb\5\u00a8U\2\u01ea\u01e8\3\2"+
		"\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"E\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7%\2\2\u01f0\u01f1\7\27\2\2"+
		"\u01f1\u01f2\5n8\2\u01f2\u01f3\7&\2\2\u01f3\u01f4\5B\"\2\u01f4\u01f5\7"+
		"\30\2\2\u01f5G\3\2\2\2\u01f6\u01f7\7\36\2\2\u01f7\u01fd\5<\37\2\u01f8"+
		"\u01fc\7s\2\2\u01f9\u01fc\7q\2\2\u01fa\u01fc\5L\'\2\u01fb\u01f8\3\2\2"+
		"\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0202\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200"+
		"\u0201\7\37\2\2\u0201\u0203\5<\37\2\u0202\u0200\3\2\2\2\u0202\u0203\3"+
		"\2\2\2\u0203I\3\2\2\2\u0204\u0205\t\5\2\2\u0205K\3\2\2\2\u0206\u0207\t"+
		"\6\2\2\u0207M\3\2\2\2\u0208\u020c\7\20\2\2\u0209\u020b\5P)\2\u020a\u0209"+
		"\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7\22\2\2\u0210O\3\2\2\2"+
		"\u0211\u021e\5T+\2\u0212\u021e\5V,\2\u0213\u021e\5Z.\2\u0214\u021e\5N"+
		"(\2\u0215\u021e\5\\/\2\u0216\u021e\5^\60\2\u0217\u021e\5`\61\2\u0218\u021e"+
		"\5b\62\2\u0219\u021e\5d\63\2\u021a\u021e\5f\64\2\u021b\u021e\5h\65\2\u021c"+
		"\u021e\5X-\2\u021d\u0211\3\2\2\2\u021d\u0212\3\2\2\2\u021d\u0213\3\2\2"+
		"\2\u021d\u0214\3\2\2\2\u021d\u0215\3\2\2\2\u021d\u0216\3\2\2\2\u021d\u0217"+
		"\3\2\2\2\u021d\u0218\3\2\2\2\u021d\u0219\3\2\2\2\u021d\u021a\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021eQ\3\2\2\2\u021f\u0220\5p9\2\u0220"+
		"\u0221\7\4\2\2\u0221S\3\2\2\2\u0222\u0223\7)\2\2\u0223\u0224\7\27\2\2"+
		"\u0224\u0225\5p9\2\u0225\u0226\7\30\2\2\u0226\u0229\5P)\2\u0227\u0228"+
		"\7*\2\2\u0228\u022a\5P)\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"U\3\2\2\2\u022b\u022c\7+\2\2\u022c\u022d\7\27\2\2\u022d\u022e\5p9\2\u022e"+
		"\u022f\7\30\2\2\u022f\u0230\5P)\2\u0230W\3\2\2\2\u0231\u0234\5j\66\2\u0232"+
		"\u0234\5R*\2\u0233\u0231\3\2\2\2\u0233\u0232\3\2\2\2\u0234Y\3\2\2\2\u0235"+
		"\u0236\7\32\2\2\u0236\u0239\7\27\2\2\u0237\u023a\5X-\2\u0238\u023a\7\4"+
		"\2\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023a\u023c\3\2\2\2\u023b"+
		"\u023d\5p9\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2"+
		"\2\u023e\u0240\7\4\2\2\u023f\u0241\5p9\2\u0240\u023f\3\2\2\2\u0240\u0241"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\7\30\2\2\u0243\u0244\5P)\2\u0244"+
		"[\3\2\2\2\u0245\u0247\7,\2\2\u0246\u0248\7z\2\2\u0247\u0246\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\5~@\2\u024a]\3\2\2\2\u024b"+
		"\u024c\7-\2\2\u024c\u024d\5P)\2\u024d\u024e\7+\2\2\u024e\u024f\7\27\2"+
		"\2\u024f\u0250\5p9\2\u0250\u0251\7\30\2\2\u0251\u0252\7\4\2\2\u0252_\3"+
		"\2\2\2\u0253\u0254\7p\2\2\u0254\u0255\7\4\2\2\u0255a\3\2\2\2\u0256\u0257"+
		"\7n\2\2\u0257\u0258\7\4\2\2\u0258c\3\2\2\2\u0259\u025b\7.\2\2\u025a\u025c"+
		"\5p9\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025e\7\4\2\2\u025ee\3\2\2\2\u025f\u0260\7/\2\2\u0260\u0261\7\4\2\2\u0261"+
		"g\3\2\2\2\u0262\u0263\7\60\2\2\u0263\u0264\5|?\2\u0264\u0265\7\4\2\2\u0265"+
		"i\3\2\2\2\u0266\u0267\7\61\2\2\u0267\u026a\5l\67\2\u0268\u026a\5@!\2\u0269"+
		"\u0266\3\2\2\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u026c\7\13"+
		"\2\2\u026c\u026e\5p9\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u0270\7\4\2\2\u0270k\3\2\2\2\u0271\u0278\7\27\2\2\u0272"+
		"\u0274\5\u00a8U\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275"+
		"\3\2\2\2\u0275\u0277\7\21\2\2\u0276\u0273\3\2\2\2\u0277\u027a\3\2\2\2"+
		"\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278"+
		"\3\2\2\2\u027b\u027d\5\u00a8U\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2"+
		"\2\u027d\u027e\3\2\2\2\u027e\u027f\7\30\2\2\u027fm\3\2\2\2\u0280\u0281"+
		"\t\7\2\2\u0281o\3\2\2\2\u0282\u0283\b9\1\2\u0283\u0284\78\2\2\u0284\u0295"+
		"\5B\"\2\u0285\u0286\7\27\2\2\u0286\u0287\5p9\2\u0287\u0288\7\30\2\2\u0288"+
		"\u0295\3\2\2\2\u0289\u028a\t\b\2\2\u028a\u0295\5p9\25\u028b\u028c\t\t"+
		"\2\2\u028c\u0295\5p9\24\u028d\u028e\t\n\2\2\u028e\u0295\5p9\23\u028f\u0290"+
		"\7=\2\2\u0290\u0295\5p9\22\u0291\u0292\7\6\2\2\u0292\u0295\5p9\21\u0293"+
		"\u0295\5r:\2\u0294\u0282\3\2\2\2\u0294\u0285\3\2\2\2\u0294\u0289\3\2\2"+
		"\2\u0294\u028b\3\2\2\2\u0294\u028d\3\2\2\2\u0294\u028f\3\2\2\2\u0294\u0291"+
		"\3\2\2\2\u0294\u0293\3\2\2\2\u0295\u02d1\3\2\2\2\u0296\u0297\f\20\2\2"+
		"\u0297\u0298\7>\2\2\u0298\u02d0\5p9\21\u0299\u029a\f\17\2\2\u029a\u029b"+
		"\t\13\2\2\u029b\u02d0\5p9\20\u029c\u029d\f\16\2\2\u029d\u029e\t\t\2\2"+
		"\u029e\u02d0\5p9\17\u029f\u02a0\f\r\2\2\u02a0\u02a1\t\f\2\2\u02a1\u02d0"+
		"\5p9\16\u02a2\u02a3\f\f\2\2\u02a3\u02a4\7C\2\2\u02a4\u02d0\5p9\r\u02a5"+
		"\u02a6\f\13\2\2\u02a6\u02a7\7\5\2\2\u02a7\u02d0\5p9\f\u02a8\u02a9\f\n"+
		"\2\2\u02a9\u02aa\7D\2\2\u02aa\u02d0\5p9\13\u02ab\u02ac\f\t\2\2\u02ac\u02ad"+
		"\t\r\2\2\u02ad\u02d0\5p9\n\u02ae\u02af\f\b\2\2\u02af\u02b0\t\16\2\2\u02b0"+
		"\u02d0\5p9\t\u02b1\u02b2\f\7\2\2\u02b2\u02b3\7G\2\2\u02b3\u02d0\5p9\b"+
		"\u02b4\u02b5\f\6\2\2\u02b5\u02b6\7H\2\2\u02b6\u02d0\5p9\7\u02b7\u02b8"+
		"\f\5\2\2\u02b8\u02b9\7I\2\2\u02b9\u02ba\5p9\2\u02ba\u02bb\7J\2\2\u02bb"+
		"\u02bc\5p9\6\u02bc\u02d0\3\2\2\2\u02bd\u02be\f\4\2\2\u02be\u02bf\t\17"+
		"\2\2\u02bf\u02d0\5p9\5\u02c0\u02c1\f\33\2\2\u02c1\u02d0\t\b\2\2\u02c2"+
		"\u02c3\f\31\2\2\u02c3\u02c4\7\"\2\2\u02c4\u02c5\5p9\2\u02c5\u02c6\7#\2"+
		"\2\u02c6\u02d0\3\2\2\2\u02c7\u02c8\f\30\2\2\u02c8\u02c9\7\27\2\2\u02c9"+
		"\u02ca\5z>\2\u02ca\u02cb\7\30\2\2\u02cb\u02d0\3\2\2\2\u02cc\u02cd\f\27"+
		"\2\2\u02cd\u02ce\7$\2\2\u02ce\u02d0\5\u00a8U\2\u02cf\u0296\3\2\2\2\u02cf"+
		"\u0299\3\2\2\2\u02cf\u029c\3\2\2\2\u02cf\u029f\3\2\2\2\u02cf\u02a2\3\2"+
		"\2\2\u02cf\u02a5\3\2\2\2\u02cf\u02a8\3\2\2\2\u02cf\u02ab\3\2\2\2\u02cf"+
		"\u02ae\3\2\2\2\u02cf\u02b1\3\2\2\2\u02cf\u02b4\3\2\2\2\u02cf\u02b7\3\2"+
		"\2\2\u02cf\u02bd\3\2\2\2\u02cf\u02c0\3\2\2\2\u02cf\u02c2\3\2\2\2\u02cf"+
		"\u02c7\3\2\2\2\u02cf\u02cc\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2"+
		"\2\2\u02d1\u02d2\3\2\2\2\u02d2q\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02dc"+
		"\7g\2\2\u02d5\u02dc\5\u00a6T\2\u02d6\u02dc\7k\2\2\u02d7\u02dc\7z\2\2\u02d8"+
		"\u02dc\5\u00a8U\2\u02d9\u02dc\5\u00a2R\2\u02da\u02dc\5\u00a4S\2\u02db"+
		"\u02d4\3\2\2\2\u02db\u02d5\3\2\2\2\u02db\u02d6\3\2\2\2\u02db\u02d7\3\2"+
		"\2\2\u02db\u02d8\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02da\3\2\2\2\u02dc"+
		"s\3\2\2\2\u02dd\u02e2\5p9\2\u02de\u02df\7\21\2\2\u02df\u02e1\5p9\2\u02e0"+
		"\u02de\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2"+
		"\2\2\u02e3u\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02ea\5x=\2\u02e6\u02e7"+
		"\7\21\2\2\u02e7\u02e9\5x=\2\u02e8\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2"+
		"\2\2\u02ed\u02ef\7\21\2\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"w\3\2\2\2\u02f0\u02f1\5\u00a8U\2\u02f1\u02f2\7J\2\2\u02f2\u02f3\5p9\2"+
		"\u02f3y\3\2\2\2\u02f4\u02f6\7\20\2\2\u02f5\u02f7\5v<\2\u02f6\u02f5\3\2"+
		"\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fd\7\22\2\2\u02f9"+
		"\u02fb\5t;\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\3\2\2"+
		"\2\u02fc\u02f4\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd{\3\2\2\2\u02fe\u02ff"+
		"\5p9\2\u02ff\u0300\7\27\2\2\u0300\u0301\5z>\2\u0301\u0302\7\30\2\2\u0302"+
		"}\3\2\2\2\u0303\u0307\7\20\2\2\u0304\u0306\5\u0080A\2\u0305\u0304\3\2"+
		"\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u030a\3\2\2\2\u0309\u0307\3\2\2\2\u030a\u030b\7\22\2\2\u030b\177\3\2"+
		"\2\2\u030c\u031e\5\u00a8U\2\u030d\u031e\5~@\2\u030e\u031e\5\u0082B\2\u030f"+
		"\u031e\5\u0086D\2\u0310\u031e\5\u0088E\2\u0311\u031e\5\u008eH\2\u0312"+
		"\u031e\5\u0090I\2\u0313\u031e\5\u0092J\2\u0314\u031e\5\u0096L\2\u0315"+
		"\u031e\5\u009aN\2\u0316\u031e\5\u009cO\2\u0317\u031e\7n\2\2\u0318\u031e"+
		"\7p\2\2\u0319\u031e\5\u00a0Q\2\u031a\u031e\5\u00a6T\2\u031b\u031e\7z\2"+
		"\2\u031c\u031e\7k\2\2\u031d\u030c\3\2\2\2\u031d\u030d\3\2\2\2\u031d\u030e"+
		"\3\2\2\2\u031d\u030f\3\2\2\2\u031d\u0310\3\2\2\2\u031d\u0311\3\2\2\2\u031d"+
		"\u0312\3\2\2\2\u031d\u0313\3\2\2\2\u031d\u0314\3\2\2\2\u031d\u0315\3\2"+
		"\2\2\u031d\u0316\3\2\2\2\u031d\u0317\3\2\2\2\u031d\u0318\3\2\2\2\u031d"+
		"\u0319\3\2\2\2\u031d\u031a\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031c\3\2"+
		"\2\2\u031e\u0081\3\2\2\2\u031f\u0322\5\u0084C\2\u0320\u0322\5\u009eP\2"+
		"\u0321\u031f\3\2\2\2\u0321\u0320\3\2\2\2\u0322\u0083\3\2\2\2\u0323\u0328"+
		"\7.\2\2\u0324\u0328\7\62\2\2\u0325\u0328\7\65\2\2\u0326\u0328\5\u00a8"+
		"U\2\u0327\u0323\3\2\2\2\u0327\u0324\3\2\2\2\u0327\u0325\3\2\2\2\u0327"+
		"\u0326\3\2\2\2\u0328\u0335\3\2\2\2\u0329\u032b\7\27\2\2\u032a\u032c\5"+
		"\u0082B\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0331\3\2\2\2"+
		"\u032d\u032e\7\21\2\2\u032e\u0330\5\u0082B\2\u032f\u032d\3\2\2\2\u0330"+
		"\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0334\3\2"+
		"\2\2\u0333\u0331\3\2\2\2\u0334\u0336\7\30\2\2\u0335\u0329\3\2\2\2\u0335"+
		"\u0336\3\2\2\2\u0336\u0085\3\2\2\2\u0337\u0338\7U\2\2\u0338\u033b\5\u008a"+
		"F\2\u0339\u033a\7V\2\2\u033a\u033c\5\u0082B\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u0087\3\2\2\2\u033d\u033e\5\u008aF\2\u033e\u033f"+
		"\7V\2\2\u033f\u0340\5\u0082B\2\u0340\u0089\3\2\2\2\u0341\u0347\5\u00a8"+
		"U\2\u0342\u0343\7\27\2\2\u0343\u0344\5\u008cG\2\u0344\u0345\7\30\2\2\u0345"+
		"\u0347\3\2\2\2\u0346\u0341\3\2\2\2\u0346\u0342\3\2\2\2\u0347\u008b\3\2"+
		"\2\2\u0348\u034d\5\u00a8U\2\u0349\u034a\7\21\2\2\u034a\u034c\5\u00a8U"+
		"\2\u034b\u0349\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e"+
		"\3\2\2\2\u034e\u008d\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0351\7W\2\2\u0351"+
		"\u0352\5\u00a8U\2\u0352\u008f\3\2\2\2\u0353\u0354\5\u00a8U\2\u0354\u0355"+
		"\7J\2\2\u0355\u0091\3\2\2\2\u0356\u0357\7X\2\2\u0357\u035b\5\u0082B\2"+
		"\u0358\u035a\5\u0094K\2\u0359\u0358\3\2\2\2\u035a\u035d\3\2\2\2\u035b"+
		"\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u0093\3\2\2\2\u035d\u035b\3\2"+
		"\2\2\u035e\u035f\7Y\2\2\u035f\u0360\5\u009eP\2\u0360\u0361\5~@\2\u0361"+
		"\u0365\3\2\2\2\u0362\u0363\7Z\2\2\u0363\u0365\5~@\2\u0364\u035e\3\2\2"+
		"\2\u0364\u0362\3\2\2\2\u0365\u0095\3\2\2\2\u0366\u0367\7\36\2\2\u0367"+
		"\u0368\5\u00a8U\2\u0368\u036a\7\27\2\2\u0369\u036b\5\u008cG\2\u036a\u0369"+
		"\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e\7\30\2\2"+
		"\u036d\u036f\5\u0098M\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0371\5~@\2\u0371\u0097\3\2\2\2\u0372\u0373\7[\2"+
		"\2\u0373\u0374\5\u008cG\2\u0374\u0099\3\2\2\2\u0375\u0378\7\32\2\2\u0376"+
		"\u0379\5~@\2\u0377\u0379\5\u0082B\2\u0378\u0376\3\2\2\2\u0378\u0377\3"+
		"\2\2\2\u0379\u037a\3\2\2\2\u037a\u037d\5\u0082B\2\u037b\u037e\5~@\2\u037c"+
		"\u037e\5\u0082B\2\u037d\u037b\3\2\2\2\u037d\u037c\3\2\2\2\u037e\u037f"+
		"\3\2\2\2\u037f\u0380\5~@\2\u0380\u009b\3\2\2\2\u0381\u0382\7)\2\2\u0382"+
		"\u0383\5\u0082B\2\u0383\u0384\5~@\2\u0384\u009d\3\2\2\2\u0385\u0386\t"+
		"\20\2\2\u0386\u009f\3\2\2\2\u0387\u0388\7,\2\2\u0388\u0389\5\u00a8U\2"+
		"\u0389\u038a\5~@\2\u038a\u00a1\3\2\2\2\u038b\u038d\7\27\2\2\u038c\u038e"+
		"\5p9\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0395\3\2\2\2\u038f"+
		"\u0391\7\21\2\2\u0390\u0392\5p9\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2"+
		"\2\2\u0392\u0394\3\2\2\2\u0393\u038f\3\2\2\2\u0394\u0397\3\2\2\2\u0395"+
		"\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2\2\2\u0397\u0395\3\2"+
		"\2\2\u0398\u03a6\7\30\2\2\u0399\u03a2\7\"\2\2\u039a\u039f\5p9\2\u039b"+
		"\u039c\7\21\2\2\u039c\u039e\5p9\2\u039d\u039b\3\2\2\2\u039e\u03a1\3\2"+
		"\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1"+
		"\u039f\3\2\2\2\u03a2\u039a\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\3\2"+
		"\2\2\u03a4\u03a6\7#\2\2\u03a5\u038b\3\2\2\2\u03a5\u0399\3\2\2\2\u03a6"+
		"\u00a3\3\2\2\2\u03a7\u03a8\5n8\2\u03a8\u00a5\3\2\2\2\u03a9\u03ab\t\21"+
		"\2\2\u03aa\u03ac\7j\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac"+
		"\u00a7\3\2\2\2\u03ad\u03ae\t\22\2\2\u03ae\u00a9\3\2\2\2e\u00b3\u00bc\u00be"+
		"\u00cc\u00d0\u00d5\u00dc\u00e2\u00e8\u00ec\u00f8\u0100\u010a\u010d\u0113"+
		"\u011f\u0124\u012a\u0130\u0139\u0147\u014a\u0156\u015d\u0160\u0164\u0169"+
		"\u016d\u0178\u017a\u0181\u018b\u0191\u019c\u019f\u01a5\u01a8\u01b0\u01b3"+
		"\u01b9\u01bc\u01c4\u01c7\u01cd\u01d1\u01da\u01df\u01e4\u01ec\u01fb\u01fd"+
		"\u0202\u020c\u021d\u0229\u0233\u0239\u023c\u0240\u0247\u025b\u0269\u026d"+
		"\u0273\u0278\u027c\u0294\u02cf\u02d1\u02db\u02e2\u02ea\u02ee\u02f6\u02fa"+
		"\u02fc\u0307\u031d\u0321\u0327\u032b\u0331\u0335\u033b\u0346\u034d\u035b"+
		"\u0364\u036a\u036e\u0378\u037d\u038d\u0391\u0395\u039f\u03a2\u03a5\u03ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}