
Feature: Login with Parameters

  As a user, I should be able to login as different users

  Scenario: Login as Teacher with Parameters
    Given user is on the login page
    When user enters "eurotech@gmail.com" email
    And user enters "Test12345!" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome Teacher" text

  Scenario: Login as Student with Parameters
    Given user is on the login page
    When user enters "batch16@gmail.com" email
    And user enters "Test12345!" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome batch16" text


  Scenario: Login as Developer with Parameters
    Given user is on the login page
    When user enters "sparrowjack@gmail.com" email
    And user enters "sparrow1" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome Jack" text
    Then Example 1



  Scenario: Teacher navigates to the All Posts Menu
    Given user is on the login page
    When user enters "eurotech@gmail.com" email
    And user enters "Test12345!" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome Teacher" text
    And user clicks on the "All Posts" menu
    Then verify that user should be able to see "Posts" header

  Scenario: Developer navigates to the Developers Menu
    Given user is on the login page
    When user enters "sparrowjack@gmail.com" email
    And user enters "sparrow1" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome Jack" text
    And user clicks on the "Developers" menu
    Then verify that user should be able to see "Developers" heade
