Feature: Register to mailchimp
  I want to test registering as user to mailchimp using various scenarios
@mytag
  Scenario Outline: Register new user 
    Given I have used <browser> as a browser 
    Given I have entered <email> as an email
    And I have also entered <username> as a username and chosen <random>
    And I have also entered <password> as a password
    When I click sign up
    Then the registration should <status> and I verify <message>
    
   
   
   Examples:
   | browser  | email                 | username          | random | password            | status | message |
   | "chrome" | "annelie@vannelie.se" | "AnnelieVannelie" | "yes" | "AnnelieVannelie1_"  | "pass" | "Check your email" |
   | "chrome" | "annelie@vannelie.se" | "AnnelieVannelieAnnelieVannelieAnnelieVannelieAnnelieVannelieAnnelieVannelieAnnelieVannelieAnnelieVannelie" | "yes" | "AnnelieVannelie1_" | "fail limit" | "Enter a value less than 100 characters long" |
   | "chrome" | "annelie@vannelie.se" | "AnnelieVannelie" | "no"  | "AnnelieVannelie1_"  | "fail existing" | "Another user with this username already exists" |
   | "chrome" |         ""            | "AnnelieVannelie" | "yes" | "AnnelieVannelie1_"  | "fail email" | "Please enter a value" |
   
   