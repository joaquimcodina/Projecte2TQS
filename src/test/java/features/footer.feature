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
Feature: Footer

  Scenario Outline: Footer
    Given the user is in the index page
    When the user clicks the login option
    And the user enters <email> <password> in the login form
    And the user clicks button login
    And select footer option
    Then redirected to footer option successfully
    Examples:
      | email                  | password       |
      | practica.tqs@gmail.com | practicatqs123 |