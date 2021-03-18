Feature: Register
  I want to use this template for my feature file - Ha en beskrivande text på engelska

  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name> - I have logged in at Mailchimp 
    And I have entered i de olika fälten
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
