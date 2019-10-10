Feature: Insurance
@smoke
@GB
Scenario: User Book Insurance

Given User launches the application 
And User enters Valid Credentials 
Then User logged into application 
And User Selects any agency 
Given User is in the Insurance Page
And Selects the Region
And Enter the Date Of Birth for Insurance
And Click On Insurance Search
And Select Any Random Insurance and Add to cart
And Click On Complete Booking For Insurance
	
