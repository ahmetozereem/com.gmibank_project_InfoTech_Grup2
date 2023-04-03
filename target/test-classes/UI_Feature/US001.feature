Feature: System should allow any user to register with valid credentials
         validating the success message

  Background:
    Given user goes to home page

  @US001
  Scenario: Must be a 9 digit SSN number

    When User clicks the user button
    And User clicks on register tab
    And Enters the appropriate SSN number
    Then Checks that there is no warning under the SSN number

  Scenario:  The name must contain chars and not be blank.
    When User clicks the user button
    And User clicks on register tab
    And Enters the appropriate name
    And Checks that there is no warning under the name

  Scenario: The last name must contains chars and

    When User clicks the user button
    And User clicks on register tab
    And Enters the appropriate lastname
    And Checks that there is no warning under the lastname

