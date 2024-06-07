
Feature: Login Functionality
  As a user, I should be able to login, so that I can see my dashboard

  Scenario: Login as a teacher
    Given user is on the login page
    When user enters teacher username
    And user enters teacher password and clicks login button
    Then verify that user should be able to login
    #And verify that user should be able to see his name


  Scenario: Login as a student
    Given user is on the login page
    When user enters student username
    And user enters student password and clicks login button
    Then verify that user should be able to login


  Scenario: Login as a developer
    Given user is on the login page
    When user enters developer username
    And user enters developer password and clicks login button
    Then verify that user should be able to login






