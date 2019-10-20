Feature: Test Facebook smoke scenarion

    #Scenario: Test login with valid credential
    ##Given Open chrome and start application
    #When I enter valid username and valid password
    #Then User should be able to login successfully
    
    #Scenario: Test login with valid credential
    #Given Open chrome and start application
    #When I enter valid "nayonahameddu2016@gmail.com" and valid "071506"
    #Then User should be able to login successfully
    #Then application should be closed
    
     Scenario Outline: Test login with valid credential
   Given Open chrome and start application
   When I enter valid "username" and valid "password"
   Then User should be able to login successfully
   Then application should be closed
    
    Examples:
    |username                    | password  |
    |nayonahameddu2016@gmail.com | 071506    |
    |nayonahameddu2016@gmail.com | password2 |
    |nayonahameddu2016@gmail.com | password3 |
    