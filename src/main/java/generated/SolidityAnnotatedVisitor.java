// Generated from SolidityAnnotated.g4 by ANTLR 4.7
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SolidityAnnotatedParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SolidityAnnotatedVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#contractPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractPart(SolidityAnnotatedParser.ContractPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#annotationDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDefinition(SolidityAnnotatedParser.AnnotationDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#annotationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationExpression(SolidityAnnotatedParser.AnnotationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#primaryAnnotationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAnnotationExpression(SolidityAnnotatedParser.PrimaryAnnotationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#booleanOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOp(SolidityAnnotatedParser.BooleanOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#compareOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(SolidityAnnotatedParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#integerOpBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerOpBoolean(SolidityAnnotatedParser.IntegerOpBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#integerOpInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerOpInteger(SolidityAnnotatedParser.IntegerOpIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#sourceUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceUnit(SolidityAnnotatedParser.SourceUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#pragmaDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaDirective(SolidityAnnotatedParser.PragmaDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#pragmaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaName(SolidityAnnotatedParser.PragmaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#pragmaValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaValue(SolidityAnnotatedParser.PragmaValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(SolidityAnnotatedParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#versionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionOperator(SolidityAnnotatedParser.VersionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#versionConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionConstraint(SolidityAnnotatedParser.VersionConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(SolidityAnnotatedParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#importDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDirective(SolidityAnnotatedParser.ImportDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#contractDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractDefinition(SolidityAnnotatedParser.ContractDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceSpecifier(SolidityAnnotatedParser.InheritanceSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVariableDeclaration(SolidityAnnotatedParser.StateVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingForDeclaration(SolidityAnnotatedParser.UsingForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(SolidityAnnotatedParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#constructorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDefinition(SolidityAnnotatedParser.ConstructorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#modifierDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierDefinition(SolidityAnnotatedParser.ModifierDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#modifierInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierInvocation(SolidityAnnotatedParser.ModifierInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(SolidityAnnotatedParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#returnParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnParameters(SolidityAnnotatedParser.ReturnParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#modifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierList(SolidityAnnotatedParser.ModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#eventDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDefinition(SolidityAnnotatedParser.EventDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(SolidityAnnotatedParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#enumDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinition(SolidityAnnotatedParser.EnumDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SolidityAnnotatedParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SolidityAnnotatedParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#eventParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventParameterList(SolidityAnnotatedParser.EventParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#eventParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventParameter(SolidityAnnotatedParser.EventParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameterList(SolidityAnnotatedParser.FunctionTypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameter(SolidityAnnotatedParser.FunctionTypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SolidityAnnotatedParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(SolidityAnnotatedParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserDefinedTypeName(SolidityAnnotatedParser.UserDefinedTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping(SolidityAnnotatedParser.MappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#functionTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeName(SolidityAnnotatedParser.FunctionTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#storageLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageLocation(SolidityAnnotatedParser.StorageLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#stateMutability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMutability(SolidityAnnotatedParser.StateMutabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SolidityAnnotatedParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SolidityAnnotatedParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SolidityAnnotatedParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SolidityAnnotatedParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SolidityAnnotatedParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(SolidityAnnotatedParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SolidityAnnotatedParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineAssemblyStatement(SolidityAnnotatedParser.InlineAssemblyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(SolidityAnnotatedParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(SolidityAnnotatedParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(SolidityAnnotatedParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SolidityAnnotatedParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(SolidityAnnotatedParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#emitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatement(SolidityAnnotatedParser.EmitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(SolidityAnnotatedParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SolidityAnnotatedParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementaryTypeName(SolidityAnnotatedParser.ElementaryTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SolidityAnnotatedParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(SolidityAnnotatedParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(SolidityAnnotatedParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#nameValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValueList(SolidityAnnotatedParser.NameValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#nameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValue(SolidityAnnotatedParser.NameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(SolidityAnnotatedParser.FunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SolidityAnnotatedParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyBlock(SolidityAnnotatedParser.AssemblyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyItem(SolidityAnnotatedParser.AssemblyItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyExpression(SolidityAnnotatedParser.AssemblyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyCall(SolidityAnnotatedParser.AssemblyCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyLocalDefinition(SolidityAnnotatedParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyAssignment(SolidityAnnotatedParser.AssemblyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIdentifierOrList(SolidityAnnotatedParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIdentifierList(SolidityAnnotatedParser.AssemblyIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyStackAssignment(SolidityAnnotatedParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#labelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDefinition(SolidityAnnotatedParser.LabelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblySwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblySwitch(SolidityAnnotatedParser.AssemblySwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyCase(SolidityAnnotatedParser.AssemblyCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFunctionDefinition(SolidityAnnotatedParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFunctionReturns(SolidityAnnotatedParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFor(SolidityAnnotatedParser.AssemblyForContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIf(SolidityAnnotatedParser.AssemblyIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyLiteral(SolidityAnnotatedParser.AssemblyLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#subAssembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAssembly(SolidityAnnotatedParser.SubAssemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#tupleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpression(SolidityAnnotatedParser.TupleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#elementaryTypeNameExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementaryTypeNameExpression(SolidityAnnotatedParser.ElementaryTypeNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(SolidityAnnotatedParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityAnnotatedParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SolidityAnnotatedParser.IdentifierContext ctx);
}