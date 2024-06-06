Feature: Edit Profile Functionality
  @editProfile
  Scenario: add education as a Student
    Given user is on the login page
    When user enters "batch16@gmail.com" email
    And user enters "Test12345!" password
    And user clicks on the login button
    Then verify that user should be able to see "Dashboard" header
    When user clicks on the "Edit Profile" dashboard menu
    And user clicks in career "Manager"
    And user clicks years 2
    And user enters "company" field as "Amazon"
    And user enters "website" field as "amazon.com"
    And user enters "location" field as "Turkey"
    And user enters "skills" field as "Python"
    And user enters "githubusername" field as "test01"
    And user enters "bio" field as "test01Amazon"
    And user clicks on the submit button
    Then verify that user should be able to see "Profile Updated"