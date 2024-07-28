# UserRegistration_Using_Junit

## Prerequisites:
1. Ensure Git is installed on your PC. If not, download and install it from https://git-scm.com/downloads
2. Ensure you have Java installed to run the project. If not, download and install the JDK from
3. Install IntelliJ IDEA from https://www.jetbrains.com/idea/download/?section=windows
4. Install and setup selenium and gradle dependencies 

## Tools Used:
* selenium
*  IntelliJ IDEA

## framework Used:
* Junit


## Problem Statement:
Automate this website:

_https://demo.wpeverest.com/user-registration/guest-registration-form/_

Steps for Automation:

1. Input following fields: Firstname, Lastname, UserEmail, Gender, Date of Birth, Nationality, Phone, Country(Bangladesh), Terms & Conditions
2. Then click on submit button
3. Finally, Assert that registration is successful

## To generate report

* Navigate to the Project Directory and check if gradle is installed
* Run this command in the command prompt **"gradle clean test"**
* Open the test report located at: _build/reports/tests/test/index.html_ and class report at: _build/reports/tests/test/classes/WebFormTest.html_

## Report Summary



