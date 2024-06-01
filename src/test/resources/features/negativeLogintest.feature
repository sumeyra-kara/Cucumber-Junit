#ClassTask--> Create a Negative Login Test Feature file with Scenorio Outline which includes 4 different doto as;
#eurotech
#eurotech@
#eurotech@gmail
#eurotec@gmail.com
#Do not forget to take the messages which show the result as negative
#Create Step Def class and if needed create Locators and methods in related page class
  @negative
  Feature: Negative Login Test

    Background:
      Given user is on the login page

    Scenario Outline:
      When user enters "<email>" email
      And user enters "<password>" password
      And user clicks on the login button
      Then verify that user should be able to see warning message as '<expectedMessage>'
      Examples:
        | email             | password   | expectedMessage                                                                               |
        | eurotech          | Test12345! | Die E-Mail-Adresse muss ein @-Zeichen enthalten. In der Angabe "eurotech" fehlt ein @-Zeichen |
        | eurotech@         | Test12345! | Gib etwas nach dem @-Zeichen ein. Die Angabe „eurotech@“ ist unvollständig                    |
        | eurotech@gmail    | Test12345! | Please include a valid email!                                                                 |
        | eurotec@gmail.com | Test12345! | Invalid Credentials!                                                                          |

