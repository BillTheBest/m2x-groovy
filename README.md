Groovy Script Examples for M2X
========================

The AT&T M2X API provides all the needed operations to connect your device to AT&T's [M2X](http://m2x.att.com) service. 
This repository provides an easy to use set of [Groovy script examples](https://github.com/attm2x/m2x-groovy/tree/master/src/main/groovy/com/att/m2x/client/examples) that enable you to use [Groovy](http://groovy.codehaus.org) script with the [M2X Java client library](https://github.com/attm2x/m2x-java).

In order to learn more about the APIs used in the Groovy Script examples, please consult the M2X [Java client documentation](https://github.com/attm2x/m2x-java/blob/master/README.md). Refer to the M2X [Glossary of Terms](https://m2x.att.com/developer/documentation/glossary) to understand the nomenclature used throughout this documentation.



Getting Started
==========================
1. Signup for an [M2X Account](https://m2x.att.com/signup).
2. Obtain your _Master Key_ from the Master Keys tab of your [Account Settings](https://m2x.att.com/account) screen.
2. Create your first [Data Source Blueprint](https://m2x.att.com/blueprints) and copy its _Feed ID_.
3. Review the [M2X API Documentation](https://m2x.att.com/developer/documentation/overview).
5. Review the M2X [Java client documentation](https://github.com/attm2x/m2x-java/blob/master/README.md).

### Setting up your first M2X data source

In order to be able to use these Groovy script examples, you will need an [AT&T M2X](https://m2x.att.com/) API key and a Data Source Feed ID. If you don't have an API key, create an account and, once registered and with your account activated, create a new [Data Source Blueprint](https://m2x.att.com/blueprints), and set aside the `Feed ID` and `API Key` values for later use. 

Leveraging the M2X Java library
=======================
Because [Groovy](http://groovy.codehaus.org) scripts can call Java code freely, these [Groovy script examples](https://github.com/attm2x/m2x-groovy/tree/master/src/main/groovy/com/att/m2x/client/examples) rely on the [M2X Java client library](https://github.com/attm2x/m2x-java). As a result, this repository only contains Groovy examples that connect to M2X using the Java client library.

For more detail on using the M2X Java client library, please refer to its [README file](https://github.com/attm2x/m2x-java/blob/master/README.md).

Prerequisites
=======================
To run the example scripts, both Groovy and the JDK (Java Development Kit) must be installed on your system. Please refer to the documentation for [Groovy](http://groovy.codehaus.org/Installing+Groovy) and [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) for instructions. You should also download the [M2X Java client library](https://github.com/attm2x/m2x-java).

There are two ways to run the example scripts:

1. The examples were developeed with [IntelliJ IDEA](http://www.jetbrains.com/idea/), a full-featured Java/Groovy IDE. If you also use IntelliJ IDEA, you can launch the scripts right in the IDE. The steps for running those scripts in IntelliJ IDEA are listed below.

2. If you use other editors, you can run the examples in your command-line environment. The steps in this case are also listed below.

In addition, [Maven](http://maven.apache.org/) must be installed. Maven is a Java project and dependency management tool. While Groovy scripts can run outside of the Maven environment, the M2X Java client library is organized using Maven. We will use Maven to fetch dependencies for the Groovy scripts. To install Maven, please refer to the official [Maven documentation](http://maven.apache.org/download.cgi#Installation).


How to Run Examples in IntelliJ IDEA
====================================

A. Clone the [m2x-java](https://github.com/attm2x/m2x-java) library:

```
   $ git clone https://github.com/attm2x/m2x-java
```

B. Build the Java library and install it to the local Maven repository:

```
   $ cd m2x-java
   $ mvn package install
```

C. Clone the [m2x-groovy](https://github.com/attm2x/m2x-groovy) examples:

```
   $ git clone https://github.com/attm2x/m2x-groovy
```

D. Launch IntelliJ, open the `m2x-groovy` project.

E. Right click on `pom.xml` file, select `Maven`, `Reimport`.

F. Now you can select the Groovy script file in the project. Right-click it and select `Run`. However, you might want to change the source to use the correct key, etc., first.

How to Run Examples in the Command Line
===================================

A. Clone the [m2x-java](https://github.com/attm2x/m2x-java) library:

```
   $ git clone https://github.com/attm2x/m2x-java
```

B. Build the Java client library as one jar file without external dependencies:

```
   $ cd m2x-java
   $ mvn package -P one-jar
```

C. There will be a file named something similar to `m2x-java-client-0.2-SNAPSHOT-one-jar.jar` (notice the `one-jar` suffix of the filename) in the `target` folder under the current path. Record the full path to this jar file aside for future use.

D. Clone the [m2x-groovy](https://github.com/attm2x/m2x-groovy) examples:

```
   $ git clone https://github.com/attm2x/m2x-groovy
```

E. Use the following command to launch the Groovy script:

```
   $ cd m2x-groovy
   $ groovy -cp <path to the generated jar file> src/main/groovy/com/att/m2x/client/examples/push_data.groovy
```

   Remember to fill in the jar file path obtained in Step C. You might also want to adjust the script first to fill in the correct key, feed ID, stream name, etc.

## License

These examples are provided under the MIT license. See [LICENSE](LICENSE) for applicable terms.
