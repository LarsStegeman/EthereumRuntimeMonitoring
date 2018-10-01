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

// Same as the expression rule except it does not include assignments, only comparisons
annotationExpression
  : '(' annotationExpression ')'
  | '!'annotationExpression
  | ('\\forall' | '\\exists') '(' identifier 'in' identifier ':' annotationExpression')'
  | annotationExpression integerOpInteger annotationExpression
  | annotationExpression integerOpBoolean annotationExpression
  | annotationExpression compareOp annotationExpression
  | annotationExpression booleanOp annotationExpression
  | primaryAnnotationExpression;

primaryAnnotationExpression
  : primaryExpression 
  | primaryAnnotationExpression '.' identifier
  | primaryAnnotationExpression '[' primaryAnnotationExpression ']'
  | '\\old' '(' primaryAnnotationExpression ')';

//Annotation Tokens
AnnotationStart
  : '//@';

AnnotationKind
  : 'inv'| 'pre'| 'post';

// Added '->' for then.
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
// Send whitespace to channel hidden.
WS
  : [ \t\r\n\u000C]+ -> channel(HIDDEN);