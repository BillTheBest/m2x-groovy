Groovy Script Examples for the M2X API
========================

The AT&T M2X API provides all the needed operations to connect your device to AT&T's [M2X](http://m2x.att.com) service. 
This repository provides an easy to use set of [Groovy script examples](https://github.com/attm2x/m2x-groovy/tree/master/src/main/groovy/com/att/m2x/client/examples) that enable you to use [Groovy](http://groovy.codehaus.org) script with the [M2X Java client library](https://github.com/attm2x/m2x-java).

In order to use these Groovy script examples, please consult the M2X [Java client documentation](https://github.com/attm2x/m2x-java/blob/master/README.md).


Getting Started
==========================
1. Signup for an [M2X Account](https://m2x.att.com/signup).
2. Obtain your _Master Key_ from the Master Keys tab of your [Account Settings](https://m2x.att.com/account) screen.
2. Create your first [Data Source Blueprint](https://m2x.att.com/blueprints) and copy its _Feed ID_.
3. Review the [M2X API Documentation](https://m2x.att.com/developer/documentation/overview).
5. Review the M2X [Java client documentation](https://github.com/attm2x/m2x-java/blob/master/README.md).



Leveraging the M2X Java library
=======================

Because [Groovy](http://groovy.codehaus.org) scripts can call Java code freely, these [Groovy script examples](https://github.com/attm2x/m2x-groovy/tree/master/src/main/groovy/com/att/m2x/client/examples) rely on the [M2X Java client library](https://github.com/attm2x/m2x-java). As a result, this repository only contains Groovy examples that connect to M2X using the Java client library.

There are two ways to run the examples: if you are using [IntelliJ IDEA](http://www.jetbrains.com/idea/), you can launch the script right in the IDE; otherwise, you can run the examples in the command line. In either case, [Maven](http://maven.apache.org/) must also be installed. We will explain how to run the examples in both ways below.

For more detail on using the M2X Java client library, please refer to its [README file](https://github.com/attm2x/m2x-java/blob/master/README.md).

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
