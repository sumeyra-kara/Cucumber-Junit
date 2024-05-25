@navigation
Feature: Navigation Menu Functionality
  As a user,I should be able to navigate to all pages

  @smoke
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



#  -Write scenarios in navigationMenu.feature
#  -Create step definitions
#  -No need to use any JAVA code.
#  -Just implement the step definitions by adding print statement.
#  -Create new class NavigationMenu_StepDefs

#  Scenario: Developer page test
#  Login as Teacher
#  "At first get the text of welcome
#  Then go to Developers menu and get the text of Developers

#  Scenario: Posts page test
#  Login as Student
#  Get the text of welcome
#  Then go to All Posts menu and get the text of Posts

#  Scenario: Dashboard page test
#  Login as Teacher
#  Set the text of welcome
#  Then go to My Account menu and get the text of Dashboard
