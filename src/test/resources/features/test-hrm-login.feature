
Feature: Validate the login functionality of Orange HRM

  @login @UI
  Scenario: Check the successful login to the orange HRM with valid credentials
    Given user navigates to the orange hrm login page
		And user enters valid "Admin" user name
		And user enters valid "admin123" password
		Then user clicks the login button

