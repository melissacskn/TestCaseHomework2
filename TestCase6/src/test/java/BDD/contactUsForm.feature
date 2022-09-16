Feature: Contact Us Form
  Scenario: Go to Automation website and fill contact us form
    Given launch browser
    When   Navigate to url http://automationexercise.com
    Then  Verify that home page is visible successfully

    Given Click on Contact Us button
    Then  Verify GET IN TOUCH is visible
    Given Enter name, email, subject and message
    And Upload file
    And Click Submit button
    When Click OK button
    Then Verify success message Success! Your details have been submitted successfully. is visible

    When Click Home button
    Then verify that landed to home page successfully



