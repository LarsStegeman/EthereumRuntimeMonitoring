# Ethereum Runtime Verification

One Paragraph of project description goes here

## Getting Started

### Prerequisites

- Java 1.8
- Maven 3.5.3
- ANTLR 4 (Maven will get this automatically when installing)

### Installing

To install this tool perform the following steps

Clone this repository
```
git clone https://github.com/LarsStegeman/EthereumRuntimeMonitoring
```

Build the tool using maven
```
mvn package
```

Run the tool with basic example
```
mvn exec:java
```
This should output the file `basicAnnotations_generated.sol`. 

## Using the tool

### Grammar examples
For example annotations see section 5 in the [paper](report/thesis/thesis.pdf). The grammar for the annotation language can be found in the file [SolidityAnnotation.g4](src/main/antlr4/SolidityAnnotated.g4).
More example annotations can be found in the [test directory](src/test/contracts).

### Run the tool on other contracts
When the tool is build, a jar file is also generated to use the tool on other contracts. The jar file is located in the `target` directory.
Use the tool on other contracts using the command 
```
java -jar .\target\Ethereum-RuntimeVerification-1.0.jar     <my-annotated-contract.sol>
``` 
This will generate a file `my-annotated-contract_generated.sol`

### Parameters
For debugging and testing the tool has two parameters which can be switched on. They can be found in [Parameters.java](src/main/java/utils/Parameters.java). The boolean `DEBUG` enables extra print statements to be printed while parsing. The boolean `STOPONERROR` makes it so that the tool does not stop on the first error it encounters.