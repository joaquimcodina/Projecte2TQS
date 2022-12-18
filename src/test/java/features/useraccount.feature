#Author: your.email@your.domain.com
#Keywords Summary:
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#when: Some key actions
#Then: to observe outcomes or validation
#And, But: To enumerate more Given, When, Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample feature Definition Template

Feature: User Account

  Scenario Outline: Login User
    Given the user is in the index page
    When the user clicks the login option
    And the user enters <email> <password> in the login form
    And the user clicks button login
    Then user has successfully logged in
    Examples:
      | email                  | password       |
      | practica.tqs@gmail.com | practicatqs123 |

  Scenario Outline: Logout User
    Given the user is in the index page
    When the user clicks the login option
    And the user enters <email> <password> in the login form
    And the user clicks button login
    And the user clicks button logout
    Then user has successfully logged out
    Examples:
      | email                  | password       |
      | practica.tqs@gmail.com | practicatqs123 |

  Scenario Outline: Modify Address Book
    Given the user is in the index page
    When the user clicks the login option
    And the user enters <email> <password> in the login form
    And the user clicks button login
    And the user clicks button my account
    And selects address book
    And modifies data
    Then the user has modified the data successfully
    Examples:
      | email                  | password       |
      | practica.tqs@gmail.com | practicatqs123 |