@addEducation
Feature: Add Education Functionality
  Scenario: add education as a Student
    Given Login as Student
    When clicks on Add Education
    When fill out all fields
    And clicks on submit button
    Then verify that education info is added under Education Credentials