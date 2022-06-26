Feature: Login functionality for leaftaps application

Background:
Given Open the Chrome browser

Scenario Outline: Login with positive credential
Given Load the application url <url>
And Enter the username <username>
And Enter the password <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|url|username|password|
|'http://leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|
|'http://leaftaps.com/opentaps'|'DemoCSR'|'crmsfa'|

Scenario: Login with negative credential
Given Load the application url 'http://leaftaps.com/opentaps'
And Enter the username 'Demo'
And Enter the password 'crmsfa'
When Click on Login button
But Error message should be displayed