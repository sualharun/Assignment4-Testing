# Assignment 4 — Automated Unit Test Generation Comparison

This repository contains automated test generation for the Stack class using three approaches: EvoSuite, Randoop, and ChatGPT.

## Repository Structure

The project follows the required Maven structure:

```
├── pom.xml                          # Maven configuration with JUnit 5 and JaCoCo
├── README.md                        # This file
├── src/
│   └── Stack.java                   # Subject under test (Stack implementation)
└── test/
    ├── chatgpt/
    │   └── ChatGPTTest.java         # ChatGPT-generated unit tests
    ├── randoop/
    │   ├── RegressionTest0.java     # Randoop regression tests
    │   └── ErrorTest0.java          # Randoop error tests
    └── evosuite/
        ├── EvoSuiteTest.java        # EvoSuite-generated tests
        └── EvoSuiteRegressionTest.java
```

## How to Run Tests

### Run all tests and generate coverage report:

```bash
mvn clean test
```

### View JaCoCo coverage report:

```bash
open target/site/jacoco/index.html
```

Or navigate to: `target/site/jacoco/index.html` in your browser

## Coverage Results

### ChatGPT Tests
- **Instruction Coverage**: 72% (94 of 130)
- **Branch Coverage**: 90% (9 of 10)
- **Line Coverage**: 66.7% (18 of 27)
- **Method Coverage**: 87.5% (7 of 8)

### Test Summary
- **Total Tests**: 7 (5 ChatGPT + placeholders for Randoop/EvoSuite)
- **Passing**: 7
- **Failing**: 0

## Requirements

- Java 11 or higher
- Maven 3.6 or higher

## Notes

This project uses the `test/` directory as the Maven test source directory to match the assignment's required repository structure while maintaining Maven compatibility.
