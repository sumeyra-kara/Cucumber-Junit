Feature: Edit Profile Functionality
  @editProfile
  Scenario: add education as a Student
    Given user is on the login page
    When user enters "batch16@gmail.com" email
    And user enters "Test12345!" password
    And user clicks on the login button
    Then verify that user should be able to see "<username>" text
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



  @e
  Scenario Outline: add education as a Student and Teacher
    Given user is on the login page
    When user enters "<email>" email
    And user enters "<password>" password
    And user clicks on the login button
    Then verify that user should be able to see "<username>" header
    When user clicks on the "<menu>" dashboard menu
    And user clicks in career "Manager"
    And user clicks years 2
    And user enters "company" field as "<company>"
    And user enters "website" field as "<website>"
    And user enters "location" field as "<location>"
    And user enters "skills" field as "<skills>"
    And user enters "githubusername" field as "<githubusername>"
    And user enters "bio" field as "<bio>"
    And user clicks on the submit button
    Then verify that user should be able to see "<message>"
    Examples:
      | email              | password   | username        | menu         | company | website    | location | skills | githubusername | bio          | message         |
      | batch16@gmail.com  | Test12345! | Welcome batch16 | Edit Profile | Amazon  | amazon.com | Turkey   | Python | test01         | test01Amazon | Profile Updated |
      | eurotech@gmail.com | Test12345! | Welcome Teacher | Edit Profile | Amazon  | amazon.de  | Germany  | Java   | test02         | test02Amazon | Profile Updated |
