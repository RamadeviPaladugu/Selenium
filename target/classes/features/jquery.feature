Feature: account creation in wikipedia
Scenario: Entering details in wikipage to create a account
Given Open the chrome browser and open wiki page
When  verify the url and title of the page
Then Enter the details for Username, passowrd, re enterpassword, email and click the button
Then the account created successfully

Scenario: Entering details in wikipage to create a account
Given Open the chrome browser and open wiki page
