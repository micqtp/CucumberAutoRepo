@Important
Feature: Create an account of Facebook
As  a user you need to open facebook home page and do the validations

@Smoke @Regression
Scenario: Validate First name field1
Given user need to be on Facebook login page
When user enters user "David" first name
Then user checks user "David" first name is present
Then close browser

Scenario: Validate create user multiple fields2
Given user need to be on Facebook login page
When user enters user "John" first name
And user enters user "Peter" surname
Then user checks user "John" first name is present
But user mobile field should be blank
Then close browser

@Regression
Scenario: Validate First name field3
Given user need to be on Facebook login page
When user enters user "David" first name
Then user checks user "David" first name is present
Then close browser

@Smoke
Scenario: Validate First name field4
Given user need to be on Facebook login page
When user enters user "David" first name
Then user checks user "David" first name is present
Then close browser

@Smoke @Regression
Scenario: Validate First name field5
Given user need to be on Facebook login page
When user enters user "David" first name
Then user checks user "David" first name is present
Then close browser