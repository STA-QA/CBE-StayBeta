Feature: Insurance

@GB
Scenario Outline: User Book Insurance

Given User launches the application 
And User enters Valid Credentials 
Then User logged into application 
And User Selects any agency 
Given User is in the Insurance Page
And Selects the Region
And Enter NumberOfPassengers for <Insurance>
And Enter the Date Of Birth for Insurance <Age>
And Click On Insurance Search
And Select Any Random Insurance and Add to cart
And Select Book Radio Button for Insurance
And Click On Insurance Details and Add additional Details <insurance tye>
And Accepts the Terms and Conditions
And Click On Book Button
Examples:
||

	
