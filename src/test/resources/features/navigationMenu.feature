
Feature: Navigation Menu Functionality
  As a user,I should be able to navigate to all pages

  Scenario: Developer page test
    Given Login as Teacher
    When At first get the text of welcome
    Then Then go to Developers menu and get the text of Developers


  Scenario: Posts page test
    Given Login as Student
    When Get the text of welcome
    Then Then go to All Posts menu and get the text of Posts

  Scenario: Dashboard page test
    Given Login as Teacher
    When Set the text of welcome
    Then Then go to My Account menu and get the text of Dashboard








