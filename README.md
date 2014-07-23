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

Requirements and Dependencies
=======================
There are five primary dependencies, which are explained in greater detail below:

1. [Install Groovy](http://groovy.codehaus.org/Installing+Groovy)
2. [Install the Java Development Kit (JDK)](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
3. Install [Maven]((http://maven.apache.org/download.cgi#Installation))
4. Download the [M2X Java Client library](https://github.com/attm2x/m2x-java)
5. Download the [M2X example Groovy scripts](https://github.com/attm2x/m2x-groovy)

To run the example scripts, both Groovy and the JDK (Java Development Kit) must be installed on your system. Please refer to the documentation for [Groovy](http://groovy.codehaus.org/Installing+Groovy) and [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) for instructions. You should also download the [M2X Java client library](https://github.com/attm2x/m2x-java).

There are two ways to run the example scripts:

1. The examples were developed with [IntelliJ IDEA](http://www.jetbrains.com/idea/), a full-featured Java/Groovy IDE. If you also use IntelliJ IDEA, you can launch the scripts right in the IDE. The steps for running those scripts in IntelliJ IDEA are listed below.

2. If you use other editors, you can run the examples in your command-line environment. The steps in this case are also listed below.

In addition, [Maven](http://maven.apache.org/) must be installed. Maven is a Java project and dependency management tool. While Groovy scripts can run outside of the Maven environment, the M2X Java client library is organized using Maven. We will use Maven to fetch dependencies for the Groovy scripts. To install Maven, please refer to the official [Maven documentation](http://maven.apache.org/download.cgi#Installation).

Configure Java SDKs in IntelliJ IDEA
====================================

If this is the first time that you are using IntelliJ IDEA, you need to configure the Java SDK and Groovy SDK. Please follow the following steps. Notice this is only needed if you want to develop Groovy using IntelliJ IDEA, command-line way of running scripts does not need these steps.

First, you need to setup the Java SDK.

1. Click `File`, then select `Project Structure`.

2. Click on the `+` sign, and select `SDK` as shown in the screenshot below:

![Add Java SDK]
(screenshots/1-add-java-sdk.png)

3. Navigate to the folder where JDK is installed on your system. Depending on your system this might change. For example, on Mac OS X 10.9, the system-provided JDK can be found at `/System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home`.

4. Click `Apply` or `OK` to save the changes.

Then, you need to setup the Groovy SDK.

1. Right click on the project name, select `Add Framework Support...` as shown in the next screenshot:

![Add Framework Support]
(screenshots/2-add-framework-support.png)

NOTE: if you didn't find this item in the menu, then chances are you already set the Groovy framework up.

2. In the dialog poped up, first tick the checkbox next to `Groovy` on the left, then select the Groovy library in the dropdown menu. If nothing is shown in the dropdown menu, you may want to add one first: click on `Create` button and navigate to the `libexec` folder in your Groovy installation path. On Mac OS X 10.9, you may refer to the following screenshot:

![Navigate Groovy]
(screenshots/3-navigate-groovy.png)

3. Click `OK` on all the dialogs to save changes.

Now you've already setup the Java SDK and Groovy SDK, you are good to run the examples!

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

F. Open the Groovy script file you want to run. Replace the following variables with values from your M2X account (API Key + Feed ID) or based on the data you want to store (stream name + value):

   * `<key>`: Your M2X API key
   * `<feed id>`: ID of feed to push
   * `<stream name>`: Name of stream to push
   * `<value to push>`: Value to push

G. Right-click it and select `Run`. 

If you run into problems, please make sure to double check that you are using the correct correct key and Feed ID as outlined in Step F above.

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

E. Open the Groovy script file you want to run. Replace the following variables with correct values from your M2X account (in the case of Key and Feed ID) and the data you want to store (stream name + value):

   * `<key>`: Your M2X API key
   * `<feed id>`: ID of feed to push
   * `<stream name>`: Name of stream to push
   * `<value to push>`: Value to push

F. Use the following command to launch the Groovy script (suppose the script you want to run is `push_data.groovy`):

```
   $ cd m2x-groovy
   $ groovy -cp <path to the generated jar file> src/main/groovy/com/att/m2x/client/examples/push_data.groovy
```

   Remember to fill in the jar file path obtained in Step C and ensure that you adjusted the script to fill in the correct Key and Feed ID as outlined in Step E above. 

License
==========================

These examples are provided under the MIT license. See [LICENSE](LICENSE) for applicable terms.
