 Feature: Verify if User is able to book Insurance for Different Divisons
 
@GB
Scenario Outline: User Book Insurance for GB for 
	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Insurance Page 
	And Selects the Region 
	And Select the Insurance Type <Insurance Type> 
	And Enter Number Of <Passengers> for Insurance 
	And From Date and To Date for Insurance <StartDay> and <NoOfDays> 
	And Enter the Date Of Birth for Insurance <Age> for <Passengers> 
#	And Click On Insurance Search 
#	And Select Any Random Insurance and Add to cart 
#	And Select Book Radio Button for Insurance 
#	And Clicks on Complete Booking 
#	And Adds the Passenger <Passengers> Details for Insurance with their <Age> 
#	And Click On Insurance Details 
#	And Add additional Details for Insurance 
#	And Accepts the Terms and Conditions 
#    And Click On Book Button
#	And Takes The Screenshot And Add to Report
#	Then Booking has been done successfully and Booking reference Text is stored in a file
#	Given User Clicks on My Bookings 
#	And User Enters Booking Refnumber 
#	And Clicks on Complete Booking
#	And Select Amend this item Option
#	And From Date and To Date for Insurance <NewStartDay> and <NoOfDays> 
#	And Click Search Button 
#	And Click on Add to Cart
#	And Clicks on Complete Booking
#	And Takes The Screenshot And Add to Report	
#	And Accepts the Terms and Conditions
#	And Click On Details icon during amendments 
#	And Add additional Details for Insurance 
#	And Click on Update button
#	And Takes The Screenshot And Add to Report 
#	Then Get updated Booking Details
	

Examples:
|Passengers |Age  |Insurance Type|StartDay|NoOfDays|NewStartDay|
|1               |40    |Single trip       |60         |30      |50|
|1               |58    |Annual     	       |50         |365     |60|



@DE
Scenario Outline: User Book Insurance for DE
	Given User launches the DE application 
	And User enters Valid DE Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Insurance Page
	And Takes The Screenshot And Add to Report
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
	Given User Clicks on My Bookings 
	And User Enters Booking Refnumber 
	And Clicks on Complete Booking
	And Select Amend this item Option
	And From Date and To Date for Insurance <NewStartDay> and <NoOfDays> 
	And Click Search Button 
	And Click on Add to Cart
	And Clicks on Complete Booking
	And Takes The Screenshot And Add to Report	
	And Accepts the Terms and Conditions
	And Click On Details icon during amendments 
	And Add additional Details for Insurance 
	And Click on Update button
	And Takes The Screenshot And Add to Report 
	Then Get updated Booking Details


Examples:
|Passengers	   |Age  |Insurance Type|StartDay|NoOfDays|NewStartDay|
|1             |40   |Single trip   |60      |30      |50|
|1             |58   |Annual     	|50      |365     |60|


@ZA
Scenario Outline: User Book Insurance for ZA
	Given User launches the ZA application 
	And User enters Valid ZA Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Insurance Page
	And Selects the Region 
	And Select the Insurance Type <Insurance Type> 
	And Enter Number Of <Passengers> for Insurance 
	And From Date and To Date for Insurance <StartDay> and <NoOfDays> 
	And Enter the Date Of Birth for Insurance <Age> for <Passengers> 
	And Click On Insurance Search
	And Takes The Screenshot And Add to Report
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
	Given User Clicks on My Bookings 
	And User Enters Booking Refnumber 
	And Clicks on Complete Booking
	And Select Amend this item Option
	And From Date and To Date for Insurance <NewStartDay> and <NoOfDays> 
	And Click Search Button 
	And Click on Add to Cart
	And Clicks on Complete Booking
	And Takes The Screenshot And Add to Report	
	And Accepts the Terms and Conditions
	And Click On Details icon during amendments 
	And Add additional Details for Insurance 
	And Click on Update button
	And Takes The Screenshot And Add to Report 
	Then Get updated Booking Details
Examples: 
|Passengers	   |Age  |Insurance Type|StartDay|NoOfDays|NewStartDay|
|1             |40   |Single trip   |60      |30      |50|
|1             |58   |Annual     	|50      |364     |60|

