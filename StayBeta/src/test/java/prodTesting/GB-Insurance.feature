 Feature: Verify if User is able to book Insurance for Different Divisons
 
@GB
Scenario Outline: User Book Insurance for GB 
	Given User launches the prod gb application 
	And User enters Valid prod GB Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Insurance Page 
	And Selects the Region 
	And Select the Insurance Type <Insurance Type> 
	And Enter Number Of <Passengers> for Insurance 
	And From Date and To Date for Insurance <StartDay> and <NoOfDays> 
	And Enter the Date Of Birth for Insurance <Age> for <Passengers> 
	And Click On Insurance Search 
	And Select Any Random Insurance and Add to cart 
	And Select Book Radio Button for Insurance 
	And Clicks on Complete Booking 
	And Adds the Passenger <Passengers> Details for Insurance with their <Age> 
	And Click On Insurance Details 
	And Add additional Details for Insurance 
	And Accepts the Terms and Conditions 
    And Click On Book Button
	And Takes The Screenshot And Add to Report
	Then Booking has been done successfully and Booking reference Text is stored in a file 

Examples:
|Passengers |Age  |Insurance Type|StartDay|NoOfDays|
|1               |40    |Single trip       |60         |30      |