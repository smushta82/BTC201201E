Feature: validate login credantial

Background:
Given open black browser
And navigate to url

@smoke
Scenario: as a user using valid credantial should login


When user type userID in userText box
And user type password in passText box
And user click on login button
Then user should see his profile page

@reg
Scenario Outline: as a user using invalid credantil should not login


When user type <"userID"> in userText box
And user type <"password"> in passText box
And user click on login button
Then user should see his profile page

Examples: 
|userID|password|
|user1|a123|
|user2|b123|
