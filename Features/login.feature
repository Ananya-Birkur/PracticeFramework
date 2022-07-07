Feature: Login functionality
Scenario Outline: Login verification with valid credentials
Given Navigate to prohealth website
When Enter valid <username> <password> 
And click on submit
Then select <Facility> <Roles>
And click on login

Examples:
|username|password|Facility|Roles|
|Admin   |123qwe  |1       |1    |