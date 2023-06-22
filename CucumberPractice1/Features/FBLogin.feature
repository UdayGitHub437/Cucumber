Feature: Fb login functionality

Scenario Outline: Login with valid credentials

Given User launches Google Chrome 
And User opens Fb app <"https://www.facebook.com">
When User enters username as "<username>" and password as "<password>"
And User clicks on login button
Then User should be logged in <"Facebook">
And Close the browser

Examples:
          |username|password|
          |9908789159|$$$$4444$$$$udayvirat0418|
          |9908789159|udayvirat|

