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

Feature: MusicStore Scenarios

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

  Scenario: New Vinyls
    Given the user is in the index page
    When the user adds a vinyls to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Old Gold Category
    Given the user is in the index page
    When the user selects old gold category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Remember Category
    Given the user is in the index page
    When the user selects remember category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Trance Category
    Given the user is in the index page
    When the user selects trance category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Tech-House Category
    Given the user is in the index page
    When the user selects tech-house category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Hard-Dance Category
    Given the user is in the index page
    When the user selects hard-dance category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Hardcore Category
    Given the user is in the index page
    When the user selects hardcore category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Hardhouse Category
    Given the user is in the index page
    When the user selects hardhouse category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Hardstyle Category
    Given the user is in the index page
    When the user selects hardstyle category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Minimal Category
    Given the user is in the index page
    When the user selects minimal category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Progressive Category
    Given the user is in the index page
    When the user selects progressive category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Techno Category
    Given the user is in the index page
    When the user selects techno category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Cantaditas Category
    Given the user is in the index page
    When the user selects cantaditas category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: DrumBass Category
    Given the user is in the index page
    When the user selects drumbass category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Other Category
    Given the user is in the index page
    When the user selects other category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Old Bases Category
    Given the user is in the index page
    When the user selects old bases category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Melodiones Category
    Given the user is in the index page
    When the user selects melodiones category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: ProgRemember Category
    Given the user is in the index page
    When the user selects progremember category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: PictureDisc Category
    Given the user is in the index page
    When the user selects picturedisc category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Acid Category
    Given the user is in the index page
    When the user selects acid category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: EuroHouse Category
    Given the user is in the index page
    When the user selects eurohouse category
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario: Year 1985
    Given the user is in the index page
    When the user selects record-vinyl menu
    And the user selects vinyl from the year 1985
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully