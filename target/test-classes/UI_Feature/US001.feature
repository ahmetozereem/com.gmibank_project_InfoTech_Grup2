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
    Then Checks that there is no warning under the name

  Scenario: The last name must contains chars and not be blank

    When User clicks the user button
    And User clicks on register tab
    And Enters the appropriate lastname
    Then Checks that there is no warning under the lastname

  Scenario: The adress must contains  chars and digit

    When User clicks the user button
    And User clicks on register tab
    And Enters the appropriate adress
    Then Checks that there is no warning under the adress

  Scenario: Phone number must contains 10 digits

    When User clicks the user button
    And User clicks on register tab
    And Enters the appropriate Phone Number
    Then Checks that there is no warning under the Phone number

    Scenario: New password must contains char and digits and special character

      When User clicks the user button
      And User clicks on register tab
      And Enters the appropriate new password
      Then Checks that there is no warning under the new password

    Scenario: Email format must contains "@" and "." extensions

      When User clicks the user button
      And User clicks on register tab
      And Enters the appropriate emailAdress
      Then Checks that there is no warning under the emailAdress




