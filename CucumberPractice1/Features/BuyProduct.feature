Feature: Buy product on Amazon

Scenario Outline: Buy puma shoes 

Given User launches Google Chrome
And User opens Amazon application <"https://www.amazon.com">
Then User should be asked to sign in
When User clicks on Sign in button
And User enters username "<username>"
And User enters password "<password>"
And User clicks on login button
Then User should be logged in to their account
When User enters Puma shoes in the amazon search bar
And User clicks on magnifying mirror icon
Then User should be displayed with Puma shoes
When User clicks on the product he likes
Then User should be taken to the corresponding page of the product
When User clicks on Buy
Then User should be taken to checkout page

Examples: 
          |username|password|
          |9908789159|$$$$4444$$$$amazon|
 