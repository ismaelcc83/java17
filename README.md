<# Java 17 Features

![Maven Build](https://github.com/ismaelcc83/java17/actions/workflows/maven.yml/badge.svg)

Practical exploration of some relevant features introduced in Java 17.

This repository contains small, focused and executable examples designed to understand modern Java features such as records, sealed classes, pattern matching and deserialization filters.

## Author

Created by [Ismael Castro Capafons](https://github.com/ismaelcc83)

## Features included

- **JEP 395** - Records
- **JEP 398** - Deprecate the Applet API for Removal
- **JEP 406** - Pattern Matching for switch
- **JEP 409** - Sealed Classes
- **JEP 415** - Context-Specific Deserialization Filters

> Note: JEP 406 was a preview feature in Java 17. If the preview switch version is enabled in the code, the project must be compiled and executed with `--enable-preview`.

## Project structure

```text
src
├── main
│   └── java
│       └── dev
│           └── eltiempovuela
│               └── java17
│                   └── jeps
│                       ├── App.java
│                       ├── Jep395.java
│                       ├── Jep398.java
│                       ├── Jep406.java
│                       ├── Jep409.java
│                       └── Jep415.java
└── test
    └── java
        └── dev
            └── eltiempovuela
                └── java17
                    └── jeps
                        ├── Jep395Test.java
                        └── Jep406Test.java
```

## Requirements

- JDK 17
- Maven 3.8 or higher

## How to compile

```bash
mvn clean compile
```

## How to run

Run the `App` class from your IDE.

The application shows a simple console menu where each option executes one Java 17 example.

If preview features are enabled in the code, remember to add the following VM option when running the application:

```bash
--enable-preview
```

## How to test

```bash
mvn clean test
```

## How to verify

Run the full Maven verification lifecycle:

```bash
mvn clean verify
```

This command compiles the project, runs the tests and executes the configured quality checks.

## How to format

If Spotless is configured in the `pom.xml`, format the code with:

```bash
mvn spotless:apply
```

To check formatting without modifying files:

```bash
mvn spotless:check
```

## Continuous Integration

This project includes a GitHub Actions workflow that runs the Maven build automatically on pushes and pull requests.

The workflow executes:

```bash
mvn clean verify
```

## Purpose

The goal of this project is to explore and understand Java 17 features through small, simple and executable code examples.

Java 17 is a long-term support version and represents a major step in modern Java development. The examples are intentionally simple, but the project also includes unit tests and build automation to keep the repository clean, maintainable and closer to a professional Java project structure.

## Notes

The examples in this repository focus on:

- using records to model immutable data carriers with less boilerplate;
- understanding sealed classes and controlled inheritance hierarchies;
- exploring pattern matching concepts introduced around Java 17;
- understanding deprecated APIs such as Applets;
- learning the purpose of context-specific deserialization filters.
