Feature: Register to mailchimp
  I want to test registering as user to mailchimp using various scenarios
@mytag
  Scenario Outline: Register new user correctly
    Given I have used <browser> as a browser 
    Given I have entered <email> as an email
    And I have also entered <username> and random selector as a username
    And I have also entered <password> as a password
    When I click sign up
    Then the registration should <status>
    
    Scenario Outline: Register new user with too long username
    Given I have used <browser> as a browser 
    Given I have entered <email> as an email
    And I have also entered <username> and random selector as a username
    And I have also entered <password> as a password
    When I click sign up
    Then the registration should <status>
    
    Scenario Outline: Register new user with already existing username
    Given I have used <browser> as a browser 
    Given I have entered <email> as an email
    And I have also entered <username> as a username
    And I have also entered <password> as a password
    When I click sign up
    Then the registration should <status>
    
    Scenario Outline: Register new user with missing email
    Given I have used <browser> as a browser 
    Given I have entered <email> as an email
    And I have also entered <username> and random selector as a username
    And I have also entered <password> as a password
    When I click sign up
    Then the registration should <status>
   
   Examples:
   | browser| email               | username        | password          | status |
   | "chrome" | "annelie@vannelie.se" | "AnnelieVannelie" | "AnnelieVannelie1_" | "pass"   |
   | "chrome" | "annelie@vannelie.se" | "AnnelieVannelieAnnelieVannelieAnnelieVannelieAnnelieVannelieAnnelieVannelieAnnelieVannelieAnnelieVannelie" | "AnnelieVannelie1_" | "fail" | 
   | "chrome" | "annelie@vannelie.se" | "AnnelieVannelie" | "AnnelieVannelie1_" | "fail"   | 
   | "chrome" |         ""            | "AnnelieVannelie" | "AnnelieVannelie1_" | "fail"   | 
   
   