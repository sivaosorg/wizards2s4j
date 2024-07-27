# wizards2s4j

## Introduction

**wizards2s4j**: A Java 1.8 library offering a robust collection of utility functions for streamlined development. It
provides an opinionated view of the Spring platform and third-party libraries, enabling you to get started with minimal
configuration.

## Features

- Comprehensive set of utility functions.
- Written in Java 1.8.
- Well-documented code for easy understanding.
- Regular updates and maintenance.

## Installation

```bash
git clone --depth 1 https://github.com/sivaosorg/wizards2s4j.git
```

## Generation Plugin Java

```bash
curl https://gradle-initializr.cleverapps.io/starter.zip -d type=groovy-gradle-plugin  -d testFramework=testng -d projectName=wizards2s4j -o wizards2s4j.zip
```

## Modules

Explain how users can interact with the various modules.

### Tidying up

To tidy up the project's Java modules, use the following command:

```bash
./gradlew clean
```

or

```bash
make clean
```

### Building SDK

```bash
./gradlew jar
```

or

```bash
make jar
```

### Upgrading version

- file `gradle.yml`

```yaml
ng:
  name: wizards2s4j
  version: v1.0.0
  enabled_link: false # enable compression and attachment of the external libraries
  jars:
    # unify4J: Java 1.8 skeleton library offering a rich toolkit of utility functions
    # for collections, strings, date/time, JSON, maps, and more.
    - enabled: false # enable compression and attachment of the external libraries
      source: "./../libs/unify4j-v1.0.0.jar"
    # alpha4J: is a Java 8 library featuring common data structures and algorithms.
    # Enhance your projects with efficient and easy-to-use implementations designed for performance and clarity.
    - enabled: true
      source: "./../libs/alpha4j-v1.0.0.jar"
```

## Add dependencies

```groovy
// The "spring-core" library, version 5.3.31, is a fundamental component of the Spring Framework,
// offering essential functionality for dependency injection, bean management, and core utilities to facilitate robust Java application development within the Spring ecosystem.
implementation group: 'org.springframework', name: 'spring-core', version: '5.3.31'
// The "spring-boot-starter-web" library, version 2.7.18, is a Spring Boot starter module that facilitates the setup of web applications,
// providing essential dependencies and configurations for building web-based projects.
implementation group: 'org.springframework.boot', name: 'spring-boot-starter-web', version: '2.7.18'
// The "spring-boot-configuration-processor" library, version 2.7.18,
// is a Spring Boot module that processes configuration metadata annotations to generate metadata files and aid in auto-configuration of Spring applications.
implementation group: 'org.springframework.boot', name: 'spring-boot-configuration-processor', version: '2.7.18'
```

## Integration

1. Add dependency into file `build.gradle`

```gradle
implementation files('libs/wizards2s4j-v1.0.0.jar') // filename based on ng.name and ng.version
```

2. Edit file `main Spring Boot application` (optional)

```java

@SpringBootApplication
@ComponentScan(basePackages = {"your_package", "org.wizards2s4j"}) // root name of package wizard4j
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
```
