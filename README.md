# Selenium Automation Framework – OrangeHRM

## Project Overview

This project is a basic Selenium automation framework developed using the OrangeHRM demo application.
It demonstrates the use of Selenium WebDriver with Java and TestNG, along with a structured framework design.

---

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven

---

## Framework Design

The framework follows the Page Object Model (POM) design pattern to separate test logic from page elements.

### Project Structure

```
src/test/java
 ├── pageObjects       → Page classes (BasePage, HomePage)
 ├── testBase          → BaseClass for driver setup
 ├── testCases         → Test cases (TC001_Login)
 
```
## Features Implemented

* Basic framework setup using Maven
* Page Object Model (POM) structure
* WebDriver initialization using BaseClass
* Login functionality automation

---

## Test Scenario Covered

* Login test using valid credentials

---

## How to Run the Project

### Prerequisites

* Java installed
* Maven installed
* Eclipse or any Java IDE

### Steps

1. Clone the repository:
   ```
   git clone <your-github-repo-link>
   ```
2. Open the project in your IDE

3. Run the test class:

   ```
   TC001_Login.java
---

## Learning Outcome
* Understood Selenium WebDriver basics
* Learned Page Object Model design
* Practiced TestNG test execution

## Author
Gowthami KS
