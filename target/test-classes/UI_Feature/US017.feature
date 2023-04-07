@Demo1
Feature: System should allow the Admin to manage users

  Background:
    Given user goes to gmibank web address

  Scenario: Create a user
    When user clicks on account menu button
    And  user clicks on register link
    And  user fills out all credentials
    And  user clicks on register button
    Then system verifies that the has been successfully created

    Scenario: Admin can activate a role as user
      When user clicks on account menu button
      And user clicks on sign in link
      And user sends "admin2023" to username box
      And user sends "Admin.Strator23" to password box
      And user clicks on sign in button
      And user clicks on administration link
      And user clicks on user management link
      And user clicks on modifiedDate
      And user clicks on deactivated button to activate new user
      Then system confirm that activation has been completed









