# Monefy Android App Test Automation
This repository contains the test automation scripts for the Monefy Android application. The tests are written in Java and utilize the Appium framework for mobile automation.
A Java +Selenium+ Cucumber +Junit + Appium + ExtentReports Framework using Page Object Model (POM)

This project automates Monefy App on Android Emulator testing using:
✔ Java (JDK 17+)
✔ Cucumber (BDD)
✔ Selenium (Web Testing)
✔ Appium V2 
✔ ExtentReports (Interactive Reporting)
✔Emulator: Android Emulator
✔ Page Object Model (POM) for Maintainability
    
#Environment Pre-requisites
1. Start the Android Emulator by typing the following command in the terminal:
```bash emulator -list-avds
emulator -avd x86_64Device - this emulator is x64 Andriod 11 and API 30 so its compatiable with the Appium V2
```
2. Start the Appium server by typing the following command in the terminal:
```bash appium
```
3. Run the TestRunner
```bash mvn clean test
```
📌 How to Run the Tests

Prerequisites
Java JDK 17 (or higher)
Android Device Manager
Android Emulator x64 Android 11 and API 30
Maven (for dependency management)
IDE (IntelliJ/Eclipse recommended)
ExtentReports - Viewing Test Results
After execution, an interactive HTML report is generated at:
target/extent-report/extent-report.html

Why Page Object Model (POM)?
✔ Reusable Methods (e.g.BalancePage(), ExepensePage, etc.)


Why Cucumber (BDD)?
✔ Business-readable tests (Gherkin syntax)


🚀 Benefits of This Framework
✅ Maintainable (POM structure)
✅ Readable Tests (Cucumber BDD)
✅ Detailed Reporting (ExtentReports)
✅ Easy CI/CD Integration (Maven-based)