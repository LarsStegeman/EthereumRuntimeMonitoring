// Generated from SolidityAnnotated.g4 by ANTLR 4.7
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SolidityAnnotatedParser}.
 */
public interface SolidityAnnotatedListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void enterContractPart(SolidityAnnotatedParser.ContractPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void exitContractPart(SolidityAnnotatedParser.ContractPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#annotationDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationDefinition(SolidityAnnotatedParser.AnnotationDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#annotationDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationDefinition(SolidityAnnotatedParser.AnnotationDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#annotationExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationExpression(SolidityAnnotatedParser.AnnotationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#annotationExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationExpression(SolidityAnnotatedParser.AnnotationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#primaryAnnotationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAnnotationExpression(SolidityAnnotatedParser.PrimaryAnnotationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#primaryAnnotationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAnnotationExpression(SolidityAnnotatedParser.PrimaryAnnotationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#booleanOp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOp(SolidityAnnotatedParser.BooleanOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#booleanOp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOp(SolidityAnnotatedParser.BooleanOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(SolidityAnnotatedParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(SolidityAnnotatedParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#integerOpBoolean}.
	 * @param ctx the parse tree
	 */
	void enterIntegerOpBoolean(SolidityAnnotatedParser.IntegerOpBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#integerOpBoolean}.
	 * @param ctx the parse tree
	 */
	void exitIntegerOpBoolean(SolidityAnnotatedParser.IntegerOpBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#integerOpInteger}.
	 * @param ctx the parse tree
	 */
	void enterIntegerOpInteger(SolidityAnnotatedParser.IntegerOpIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#integerOpInteger}.
	 * @param ctx the parse tree
	 */
	void exitIntegerOpInteger(SolidityAnnotatedParser.IntegerOpIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void enterSourceUnit(SolidityAnnotatedParser.SourceUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void exitSourceUnit(SolidityAnnotatedParser.SourceUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void enterPragmaDirective(SolidityAnnotatedParser.PragmaDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void exitPragmaDirective(SolidityAnnotatedParser.PragmaDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#pragmaName}.
	 * @param ctx the parse tree
	 */
	void enterPragmaName(SolidityAnnotatedParser.PragmaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#pragmaName}.
	 * @param ctx the parse tree
	 */
	void exitPragmaName(SolidityAnnotatedParser.PragmaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#pragmaValue}.
	 * @param ctx the parse tree
	 */
	void enterPragmaValue(SolidityAnnotatedParser.PragmaValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#pragmaValue}.
	 * @param ctx the parse tree
	 */
	void exitPragmaValue(SolidityAnnotatedParser.PragmaValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(SolidityAnnotatedParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(SolidityAnnotatedParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void enterVersionOperator(SolidityAnnotatedParser.VersionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void exitVersionOperator(SolidityAnnotatedParser.VersionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#versionConstraint}.
	 * @param ctx the parse tree
	 */
	void enterVersionConstraint(SolidityAnnotatedParser.VersionConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#versionConstraint}.
	 * @param ctx the parse tree
	 */
	void exitVersionConstraint(SolidityAnnotatedParser.VersionConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(SolidityAnnotatedParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(SolidityAnnotatedParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void enterImportDirective(SolidityAnnotatedParser.ImportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void exitImportDirective(SolidityAnnotatedParser.ImportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(SolidityAnnotatedParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(SolidityAnnotatedParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceSpecifier(SolidityAnnotatedParser.InheritanceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceSpecifier(SolidityAnnotatedParser.InheritanceSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVariableDeclaration(SolidityAnnotatedParser.StateVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVariableDeclaration(SolidityAnnotatedParser.StateVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingForDeclaration(SolidityAnnotatedParser.UsingForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingForDeclaration(SolidityAnnotatedParser.UsingForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(SolidityAnnotatedParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(SolidityAnnotatedParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDefinition(SolidityAnnotatedParser.ConstructorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDefinition(SolidityAnnotatedParser.ConstructorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModifierDefinition(SolidityAnnotatedParser.ModifierDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModifierDefinition(SolidityAnnotatedParser.ModifierDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void enterModifierInvocation(SolidityAnnotatedParser.ModifierInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void exitModifierInvocation(SolidityAnnotatedParser.ModifierInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(SolidityAnnotatedParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(SolidityAnnotatedParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void enterReturnParameters(SolidityAnnotatedParser.ReturnParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void exitReturnParameters(SolidityAnnotatedParser.ReturnParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(SolidityAnnotatedParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(SolidityAnnotatedParser.ModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEventDefinition(SolidityAnnotatedParser.EventDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEventDefinition(SolidityAnnotatedParser.EventDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(SolidityAnnotatedParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(SolidityAnnotatedParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(SolidityAnnotatedParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(SolidityAnnotatedParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SolidityAnnotatedParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SolidityAnnotatedParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SolidityAnnotatedParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SolidityAnnotatedParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void enterEventParameterList(SolidityAnnotatedParser.EventParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void exitEventParameterList(SolidityAnnotatedParser.EventParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void enterEventParameter(SolidityAnnotatedParser.EventParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void exitEventParameter(SolidityAnnotatedParser.EventParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameterList(SolidityAnnotatedParser.FunctionTypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameterList(SolidityAnnotatedParser.FunctionTypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameter(SolidityAnnotatedParser.FunctionTypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameter(SolidityAnnotatedParser.FunctionTypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SolidityAnnotatedParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SolidityAnnotatedParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(SolidityAnnotatedParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(SolidityAnnotatedParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedTypeName(SolidityAnnotatedParser.UserDefinedTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedTypeName(SolidityAnnotatedParser.UserDefinedTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(SolidityAnnotatedParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(SolidityAnnotatedParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeName(SolidityAnnotatedParser.FunctionTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeName(SolidityAnnotatedParser.FunctionTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void enterStorageLocation(SolidityAnnotatedParser.StorageLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void exitStorageLocation(SolidityAnnotatedParser.StorageLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void enterStateMutability(SolidityAnnotatedParser.StateMutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void exitStateMutability(SolidityAnnotatedParser.StateMutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SolidityAnnotatedParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SolidityAnnotatedParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SolidityAnnotatedParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SolidityAnnotatedParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SolidityAnnotatedParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SolidityAnnotatedParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SolidityAnnotatedParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SolidityAnnotatedParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SolidityAnnotatedParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SolidityAnnotatedParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(SolidityAnnotatedParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(SolidityAnnotatedParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SolidityAnnotatedParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SolidityAnnotatedParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void enterInlineAssemblyStatement(SolidityAnnotatedParser.InlineAssemblyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void exitInlineAssemblyStatement(SolidityAnnotatedParser.InlineAssemblyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(SolidityAnnotatedParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(SolidityAnnotatedParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(SolidityAnnotatedParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(SolidityAnnotatedParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(SolidityAnnotatedParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(SolidityAnnotatedParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SolidityAnnotatedParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SolidityAnnotatedParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(SolidityAnnotatedParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(SolidityAnnotatedParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatement(SolidityAnnotatedParser.EmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatement(SolidityAnnotatedParser.EmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(SolidityAnnotatedParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(SolidityAnnotatedParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SolidityAnnotatedParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SolidityAnnotatedParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void enterElementaryTypeName(SolidityAnnotatedParser.ElementaryTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void exitElementaryTypeName(SolidityAnnotatedParser.ElementaryTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SolidityAnnotatedParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SolidityAnnotatedParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SolidityAnnotatedParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SolidityAnnotatedParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(SolidityAnnotatedParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(SolidityAnnotatedParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void enterNameValueList(SolidityAnnotatedParser.NameValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void exitNameValueList(SolidityAnnotatedParser.NameValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(SolidityAnnotatedParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(SolidityAnnotatedParser.NameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(SolidityAnnotatedParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(SolidityAnnotatedParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SolidityAnnotatedParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SolidityAnnotatedParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyBlock(SolidityAnnotatedParser.AssemblyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyBlock(SolidityAnnotatedParser.AssemblyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyItem(SolidityAnnotatedParser.AssemblyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyItem(SolidityAnnotatedParser.AssemblyItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyExpression(SolidityAnnotatedParser.AssemblyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyExpression(SolidityAnnotatedParser.AssemblyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCall(SolidityAnnotatedParser.AssemblyCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCall(SolidityAnnotatedParser.AssemblyCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLocalDefinition(SolidityAnnotatedParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLocalDefinition(SolidityAnnotatedParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyAssignment(SolidityAnnotatedParser.AssemblyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyAssignment(SolidityAnnotatedParser.AssemblyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierOrList(SolidityAnnotatedParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierOrList(SolidityAnnotatedParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierList(SolidityAnnotatedParser.AssemblyIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierList(SolidityAnnotatedParser.AssemblyIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyStackAssignment(SolidityAnnotatedParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyStackAssignment(SolidityAnnotatedParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(SolidityAnnotatedParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(SolidityAnnotatedParser.LabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void enterAssemblySwitch(SolidityAnnotatedParser.AssemblySwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void exitAssemblySwitch(SolidityAnnotatedParser.AssemblySwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCase(SolidityAnnotatedParser.AssemblyCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCase(SolidityAnnotatedParser.AssemblyCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionDefinition(SolidityAnnotatedParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionDefinition(SolidityAnnotatedParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionReturns(SolidityAnnotatedParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionReturns(SolidityAnnotatedParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFor(SolidityAnnotatedParser.AssemblyForContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFor(SolidityAnnotatedParser.AssemblyForContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIf(SolidityAnnotatedParser.AssemblyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIf(SolidityAnnotatedParser.AssemblyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLiteral(SolidityAnnotatedParser.AssemblyLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLiteral(SolidityAnnotatedParser.AssemblyLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void enterSubAssembly(SolidityAnnotatedParser.SubAssemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void exitSubAssembly(SolidityAnnotatedParser.SubAssemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(SolidityAnnotatedParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(SolidityAnnotatedParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#elementaryTypeNameExpression}.
	 * @param ctx the parse tree
	 */
	void enterElementaryTypeNameExpression(SolidityAnnotatedParser.ElementaryTypeNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#elementaryTypeNameExpression}.
	 * @param ctx the parse tree
	 */
	void exitElementaryTypeNameExpression(SolidityAnnotatedParser.ElementaryTypeNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(SolidityAnnotatedParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(SolidityAnnotatedParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityAnnotatedParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SolidityAnnotatedParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityAnnotatedParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SolidityAnnotatedParser.IdentifierContext ctx);
}