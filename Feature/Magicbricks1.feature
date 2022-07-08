@MagicBricks
Feature: Magicbricks
@Webpage_opening
Scenario: Home loan application
Given Open the website by using URL
Then Click on home loan link in Magic Bricks web site

@Sucessful_Loanapplication
Scenario: To verify user can submit the loan application when all required fields are entered correctly
Given User is on homeloans webpage 
And Enter loan amount
And Enter 10-digit mobile number
And Agree to T&C
When Clicks on get started button
Then User should be navigated to next page
And User is able to enter the one time password
Then user is able to Enter current city name
When User clicks on next button
Then user able to Enter yes or no in have you shortlisted any property?
When User clicks on yes or NO button
Then user is able to Enter Email address
When User clicks on next button
Then user able to Enter Full name
When User clicks on next button
Then user able to Enter Nature of income
When User clicks on next button
Then user able to Enter monthly income
When User clicks on next button
Then user able to Enter Property city name
When User clicks on next button
Then user able to Select bank from bank list
When User clicks on apply button
Then Application should be submitted by clicking on apply button

@UnSucessful_Loanapplication
Scenario: To verify user is not able to submit the loan application when all mandatory fields are not entered
Given User is on homeloans webpage 
And Enter loan amount
And Enter 10-digit mobile number
And Agree to T&C
When Clicks on get started button
Then User should be navigated to next page
And User is able to enter the one time password
Then user is able to Enter current city name
When User clicks on next button
Then user able to Enter yes or no in have you shortlisted any property?
When User clicks on yes or NO button
Then user is able to Enter Email address
When User clicks on next button
Then Alert Please enter valid Email

@UnSucessful_Loanapplication
Scenario: To verify user is not able to submit the loan application when all mandatory fields are not entered
Given User is on homeloans webpage 
And Enter loan amount
And Enter 10-digit mobile number
And Agree to T&C
When Clicks on get started button
Then User should be navigated to next page
And User is able to enter the one time password
Then user is able to Enter current city name
When User clicks on next button
Then Alert Please enter a valid city name

@Loan_Against_property
Scenario: To verify user is able submit the Loan against property application when all required fields are entered correctly
Given User is on homeloans webpage 
And Clicks on Balence transfer 
And Enter loan amount
And Enter 10-digit mobile number
And Agree to T&C
When Clicks on get started button
Then User should be navigated to next page
And User is able to enter the one time password
Then user is able to Enter current city name
When User clicks on next button
Then user able to Enter yes or no in have you shortlisted any property?
When User clicks on yes or NO button
Then user is able to Enter Email address
When User clicks on next button
Then user able to Enter Full name
When User clicks on next button
Then user able to Enter Nature of income
When User clicks on next button
Then user able to Enter monthly income
When User clicks on next button
Then user able to Enter Property city name
When User clicks on next button
Then user able to Select bank from bank list
When User clicks on apply button
Then Application should be submitted by clicking on apply button

@UnSucessful_Loanapplication
Scenario: To verify user is not able to submit the Loan against property application when all required fields are missed
Given User is on homeloans webpage 
And Clicks on Balence transfer
And Enter loan amount
And Enter 10-digit mobile number
And Agree to T&C
When Clicks on get started button
Then User should be navigated to next page
And User is able to enter the one time password
Then user is able to Enter current city name
When User clicks on next button
Then user able to Enter yes or no in have you shortlisted any property?
When User clicks on yes or NO button
When user is not Entered the Email address
And  User clicks on next button
Then Alert Please enter valid Email

@UnSucessful_Loanapplication
Scenario: To verify user is not able to submit the loan application when all filed values are entered in non-acceptable format
Given User is on homeloans webpage
And Clicks on Balence transfer 
And Enter loan amount
And Enter 10-digit mobile number
And Agree to T&C
When Clicks on get started button
Then User should be navigated to next page
And User is able to enter the one time password
Then user is able to Enter current city name in non accpatble format
When User clicks on next button
Then Alert Please enter a valid city name


@SuccessfullLogIn
Scenario:  log In functionality when user enter valid credentials
Given user is on LogIn page
When click on log in button
Then user is able to enter registered email_id
And click on next
When enter registered password
And click on logIn
Then User should LogIn successfully
Then click on logOut

@Forgot_password
Scenario: Forgot Password functionality
Given User is on forgot password page
When enter the registered mail id/mobile no
When enter the 3 digit verification code received on mail/mobile no
When enter new password
And re-enter the new password 
And click on submit

@unsucessful_Forgot_password
Scenario: unsucessful Forgot password functionality
Given user is on forgort password page
When Invalid emial address entered 
Then alert please give a valid Email address











