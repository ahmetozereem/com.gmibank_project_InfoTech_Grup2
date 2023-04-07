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






