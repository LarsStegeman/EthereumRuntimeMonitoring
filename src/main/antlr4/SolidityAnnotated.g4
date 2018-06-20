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
  : AnnotationStart AnnotationKind AnnotationQuantifier ;


//Annotation Tokens
AnnotationStart
  : '//@';

AnnotationKind
  : 'inv'| 'pre'| 'post';


AnnotationQuantifier
  : '\\forall' | '\\exists';

AnnotationKeywords
  : '\\old';

// Remove '@' from LINE_COMMENT token. This means that @ cannot be used anymore.
// There may be a better solution to only check for @ at the first position.
LINE_COMMENT 
  : '//' ~[@\r\n]* -> channel(HIDDEN);
