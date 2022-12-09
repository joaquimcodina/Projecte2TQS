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

  Scenario: New Vinyls
    Given the user is in the index page
    When the user adds a vinyls to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully

  Scenario Outline: Categories
    Given the user is in the index page
    When the user selects <category>
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully
    # | 1 | = Old Gold Category
    # | 2 | = Remember Category
    # | 3 | = Trance Category
    # | 4 | = Tech-House Category
    # | 5 | = Hard-Dance Category
    # | 6 | = Hardcore Category
    # | 7 | = Hardhouse Category
    # | 8 | = Hardstyle Category
    # | 9 | = Minimal Category
    # | 10 | = Progressive Category
    # | 11 | = Techno Category
    # | 12 | = Cantaditas Category
    # | 13 | = DrumBass Category
    # | 14 | = Otros estilos Category
    # | 15 | = Bases Antiguas Category
    # | 16 | = Melodiones Category
    # | 17 | = Prog Remember Category
    # | 18 | = Picture Disc Category
    # | 19 | = Acid Category
    # | 20 | = Euro House Category
    Examples:
      | category |
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |
      | 6 |
      | 7 |
      | 8 |
      | 9 |
      | 10 |
      | 11 |
      | 12 |
      | 13 |
      | 14 |
      | 15 |
      | 16 |
      | 17 |
      | 18 |
      | 19 |
      | 20 |

  Scenario Outline: Years
    Given the user is in the index page
    When select record-vinyl menu
    And select vinyl from the <year>
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully
    #| 10 | = 1994
    #| 11 | = 1995
    #| 12 | = 1996
    #| 13 | = 1997
    #| 14 | = 1998
    #| 15 | = 1999
    #| 16 | = 2000
    #| 17 | = 2001
    #| 18 | = 2002
    Examples:
      | year |
      | 10 |
      | 11 |
      | 12 |
      | 13 |
      | 14 |
      | 15 |
      | 16 |
      | 17 |
      | 18 |

  Scenario Outline: Stamp
    Given the user is in the index page
    When select record-vinyl menu
    And select from the <stamp>
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully
    # | 4338 | = 21st Century Records
    # | 4334 | = Bit Music
    # | 4454 | = Boy Records
    # | 4676 | = Not On Label
    # | 4489 | = Vale Music
    Examples:
      | stamp |
      | 4338  |
      | 4334  |
      | 4454  |
      | 4676  |
      | 4489  |

  Scenario Outline: FilterBy
    Given the user is in the index page
    When select record-vinyl menu
    And filter by <category> <year>
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully
    #| 1 | = Trance             | 2 | = 1992
    #| 2 | = Hardstyle          | 3 | = 2001
    #| 10 | = Hardcore/Makina   | 5 | = 1996
    #| 11 | = Techno            | 1 | = 1991
    #| 12 | = Remember          | 7 | = 1995
    Examples:
      | category |  | year |
      | 1        |  | 2    |
      | 2        |  | 3    |
      | 10       |  | 5    |
      | 11       |  | 1    |
      | 12       |  | 7    |

  Scenario Outline: Wish List
    Given the user is in the index page
    When the user clicks the login option
    And the user enters <email> <password> in the login form
    And the user clicks button login
    And the user adds a vinyls to the wish list
    And the user clicks my account
    And the user clicks wish list
    And the user writes a comment
    Then the vinyls have been added to the wish list successfully
    Examples:
      | email                  | password       |
      | practica.tqs@gmail.com | practicatqs123 |

  Scenario Outline: TopMusicBySuze
    Given the user is in the index page
    When the user clicks the login option
    And the user enters <email> <password> in the login form
    And the user clicks button login
    And select TopMusicBySuze
    Then redirected to menu option successfully
    Examples:
      | email                  | password       |
      | practica.tqs@gmail.com | practicatqs123 |

  Scenario Outline: RinconDeCMillan
    Given the user is in the index page
    When the user clicks the login option
    And the user enters <email> <password> in the login form
    And the user clicks button login
    And select RinconDeCMillan
    Then redirected to menu option successfully
    Examples:
      | email                  | password       |
      | practica.tqs@gmail.com | practicatqs123 |

  Scenario Outline: Search
    Given the user is in the index page
    When the user search vinyls <name>
    And the user clicks search button
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully
    Examples:
      | name      |
      | skudero   |
      | xque      |
      | dj tiesto |

  Scenario Outline: SortBy
    Given the user is in the index page
    When select record-vinyl menu
    And filter by <option>
    And the user adds a vinyl of the selected category to the cart
    And the user clicks the my cart button
    Then the vinyls have been added to the cart successfully
    Examples:
      | option      |
      | Posición    |
      | ref         |
      | name        |
      | Precio      |
      | Fecha       |

  Scenario Outline: PlayTrack
    Given the user is in the index page
    When the user clicks the login option
    And the user enters <email> <password> in the login form
    And the user clicks button login
    And select record-vinyl menu
    And select the first track of a random vinyl
    Then the track has been played successfully
    Examples:
      | email                  | password       |
      | practica.tqs@gmail.com | practicatqs123 |