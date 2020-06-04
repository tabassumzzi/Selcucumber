Feature: Mercury Tours login
Scenario: Login with Valid user credentials

Given Launch firfox and Navigate to URL
When Enter Valid user "mercury" and password "mercury"
Then User should able to login successfully

Scenario: Select Flight Details

Given app should be in flight details page
When Select flight data
Then flight selection page to be opened