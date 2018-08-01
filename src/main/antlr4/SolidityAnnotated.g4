grammar SolidityAnnotated;
import Solidity;

@header {package generated;}


//Added annotationDefinition. This enables annotations to be on the top level only.
contractPart
  : stateVariableDeclaration
  | usingForDeclaration
  | structDefinition
  | constructorDefinition
  | modifierDefinition
  | functionDefinition
  | eventDefinition
  | enumDefinition 
  | annotationDefinition ;

annotationDefinition
  : AnnotationStart AnnotationKind annotationExpression;

// Same as the expression rule except it does not include changes, only comparisons
// Added '->' for then.
annotationExpression
  : '(' annotationExpression ')'
  | annotationExpression compareOp annotationExpression
  | annotationExpression booleanOp annotationExpression
  | annotationExpression integerOpBoolean annotationExpression
  | annotationExpression integerOpInteger annotationExpression
  | '!'annotationExpression
  | ('\\forall' | '\\exists') '(' identifier elementaryTypeName ':' annotationExpression? ':' annotationExpression')'
  | primaryAnnotationExpression;

primaryAnnotationExpression
  : primaryExpression 
  | primaryAnnotationExpression '.' identifier
  | primaryAnnotationExpression '[' primaryExpression ']'
  | '\\old' '(' primaryAnnotationExpression ')';

//Annotation Tokens
AnnotationStart
  : '//@';

AnnotationKind
  : 'inv'| 'pre'| 'post';

booleanOp
  : '&&' | '||' | '->';

compareOp
  : '==' | '!=';

integerOpBoolean
  : ('>'|'>='|'<'|'<=');

integerOpInteger
  : '+' | '-';



// Remove '@' from first position of LINE_COMMENT token. 
LINE_COMMENT 
  : '//' ~[@] ~[\r\n]* -> channel(HIDDEN);
