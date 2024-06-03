
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



  Scenario: Teacher navigates to the All Posts Menu
    Given user is on the login page
    When user enters "eurotech@gmail.com" email
    And user enters "Test12345!" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome Teacher" text
    And user clicks on the "All Posts" menu
    Then verify that user should be able to see "Posts" header

  @wip
  Scenario: Developer navigates to the Developers Menu
    Given user is on the login page
    When user enters "sparrowjack@gmail.com" email
    And user enters "sparrow1" password
    And user clicks on the login button
    Then verify that user should be able to see "Welcome Jack" text
    And user clicks on the "Developers" menu
    Then verify that user should be able to see "Developers" header


  Scenario Outline: Navigate with DDF
    Given user is on the login page
    When user enters "<email>" email
    And user enters "<password>" password
    And user clicks on the login button
    Then verify that user should be able to see "<username>" text
    And user clicks on the "<menuName>" menu
    Then verify that user should be able to see "<header>" header
    Examples:
      | email                 | password   | username        | menuName   | header     |
      | eurotech@gmail.com    | Test12345! | Welcome Teacher | All Posts  | Posts      |
      | sparrowjack@gmail.com | sparrow1   | Welcome Jack    | Developers | Developers |