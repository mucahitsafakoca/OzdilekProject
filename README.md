## Ozdilekteyim Appium Project

## About The Project

This project is a Maven project developed using the Java programming language and one of the BDD (Behavior-Driven Development) frameworks.
Additionally, it is created using the Appium, JUnit, and Log4J libraries.
The project emphasizes adherence to OOP principles and the usage of the Page Object Pattern.
It should be noted that Gauge framework is used in this project.
This project automatically tests specific scenarios.

## Steps
* The Ozdilekteyim application is launched.
* The Application Launch is Verified.
* Notification permissions popup is dismissed. If the popup doesn't appear, it's logged without failing.
* Click on the Start Shopping button.
* Click on the Categories button.
* Verify navigation to the Categories screen.
* Click on the Women category.
* Scroll to the Accessories section.
* Click on the Bags category.
* Click on the Brands option.
* Randomly select 2 brands and record the product counts for each brand.(Product counts not recorded)
* Click on the Apply button.
* Check if the recorded product counts match the product counts in the Search box.(undone due to block)
* Click on the Sort button.
* Check the Best Sellers checkbox.
* Record the price information of the 3rd product listed on the page.
* Click on the product with the recorded price information.
* Compare the recorded price with the price information on the Product page.
* Click on the Add to Cart button.
* Verify redirection to the Login screen.

## Project Dependencies

This project is a Java project managed using Maven. The significant dependencies used in the project are listed below:

- [Gauge](https://gauge.org/): A framework for writing and managing BDD (Behavior-Driven Development) scenarios. Version: ${gauge.version}
- [AssertJ](https://assertj.github.io/doc/): An advanced assertion library for Java. Version: 3.10.0
- [Appium Java Client](http://appium.io/): A framework used for writing automated tests for mobile applications. Version: ${appium.version}
- [JUnit Jupiter](https://junit.org/junit5/): JUnit 5, a test framework for Java. Version: ${junit.version}
- [SLF4J](http://www.slf4j.org/): A simple logging facade. Integrated with Log4J. Version: ${slf4j.version}

## Project Configuration

The project is structured as a Maven project. Maven manages dependencies and configuration settings in the POM (Project Object Model) file. The important configuration settings in the POM file are as follows:

- `maven.compiler.source`: Source code version for Java compilation. Value: 11
- `maven.compiler.target`: Target JVM version for Java compilation. Value: 11
- `specsDir`: Directory where Gauge scenarios are located. Value: specs
- Version numbers of other dependencies are used as variables (${...}).

## Contact

Mucahit Safa KOCA - mucahitsafakoca@gmail.com - mucahit.koca@testinium.com

Project Link: https://github.com/mucahitsafakoca/OzdilekteyimAppiumProject.git