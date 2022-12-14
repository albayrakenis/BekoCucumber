 selenium-cucumber-java
This repository contains a collection of sample selenium-cucumber-java projects and libraries that demonstrate how to use the tool and develop automation 
script using the Cucumber (v 3.0.0) BDD framework with Java as programming language. It generate Allure, HTML and JSON reporters as well. It also generate
screen shots for your tests if you enable it and also generate error shots for your failed test cases as well.

Installation (pre-requisites)
JDK 17 (make sure Java class path is set)
Maven (make sure .m2 class path is set)
İntellij İdea
İntellij İdea Plugins for
Maven
Cucumber
Browser driver (make sure you have your desired browser driver and class path is set)
Framework set up
Fork / Clone repository from here or download zip and set it up in your local workspace.

Run Some Sample Tests
Open terminal (MAC OSX) or command prompt / power shell (for windows OS) and navigate to the project directory type mvn clean test command to run features.
With this command it will invoke the default Firefox browser and will execute the tests.

To run features on specific browser use, mvn test "-Dbrowser=browser_name" browser_name can be one of following but make sure that browser’s driver file are
present and specified in system variable. -- firefox -- chrome -- ie -- safari etc.
Please note that browser drivers are not included as part of this framework. The reason for not including is that selenium browser driver version are varies
based on the browser version that you are using and also selenium server version.

To run specific feature if you have multiple feature files use, mvn test -Dcucumber.options="classpath:features/my_first.feature"
Reporters
Once you ran your tests you can generate the various types of reports. This framework selenium-cucumber-java uses several different types of test reporters 
to communicate pass/failure.







HTML Report:
To generate HTML report use mvn test -Dcucumber.options="–plugin html:target/result.html"



Develop automation scripts using BDD approach - Cucumber-Java
There are already many predefined StepDefinitions which is packaged under /steps/Commonsteps.java will help you speed up your automation development that 
support both your favorite workaday helpers methods.

Tests are written in the Cucumber framework using the Gherkin Syntax. More about Gherkin & Cucumber can be found at https://cucumber.io/docs/reference 
A typical test will look similar to this:

Feature: Product add to cart

  @add
  Scenario:Users should add product to cart
    Given Users can be go to login page
    When Users can be login
    And Users can select product
    And Users can select 2 quantity
    Then Users can logout


The Page Object Design Pattern
Within your web app's UI there are areas that your tests interact with. A Page Object simply models these as objects within the test code. 
This reduces the amount of duplicated code and means that if the UI changes, the fix need only be applied in one place. In other wards one of the 
challenges of writing test automation is keeping your [selectors] ( classes, id's, or xpath' etc.) up to date with the latest version of your code.
The next challenge is to keep the code you write nice and DRY (Don't Repeat Yourself). The page object pattern helps us accomplish this in one solution.
Instead of including our selectors in our step definitions(in cucumber) we instead place them in a .java file where we can manage all these selectors 
and methods together. Your test file should only call the test methods.

You can also place reusable methods or logic inside of these pages and call them from your step java files. The page object serves as a layer of 
abstraction between tests and code. When A test fails, it fails on a individual step. That step may call a selector that is no longer valid, but 
that selector may be used by many other steps. By having a single source of truth of what the selector is supposed to be, fixing one selector on 
the page object could repair a number of failing tests that were affected by the same selector.

Contribution
Create a fork of the project into your own repository. Make all your necessary changes and create a pull request with a description on what
was added or removed and details explaining the changes in lines of code. If approved, project owners will merge it.

Licensing
MIT
