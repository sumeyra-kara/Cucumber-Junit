
Feature: Navigation Menu with Parameters

  Scenario: Developer page test
    Given Login as "Teacher"
    When At first get the text of welcome
    And Then go to "Developers" menu
    Then get the text of "Developer"
    Then verify that user should be able to "Developers" header


  Scenario: Posts page test
    Given Login as "Student"
    When Get the text of welcome
    And Then go to "All Posts" menu
    Then get the text of "All Posts"
    Then verify that user should be able to "All Posts" header

  Scenario: Dashboard page test
    Given Login as "Teacher"
    When Set the text of welcome
    And Then go to "My Account" menu
    Then get the text of "Dashboard"
    Then verify that user should be able to "Dashboard" header