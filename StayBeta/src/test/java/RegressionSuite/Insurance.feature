Feature: Insurance

@GB
Scenario Outline: User Book Insurance
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
And Click On Insurance Search
And Select Any Random Insurance and Add to cart
And Select Book Radio Button for Insurance
And Clicks on Complete Booking
And Adds the Passenger <Passengers> Details for Insurance with their <Age>
And Click On Insurance Details
And Add additional Details for Insurance
And Accepts the Terms and Conditions
#And Click On Book Button
And Takes The Screenshot And Add to Report
	

Examples:
|Passengers|Age  |Insurance Type|StartDay|NoOfDays|
|1             |40    |Single trip     |30|30|
#|1             |58    |Annual     |

@DE
Scenario Outline: User Book Insurance
Given User launches the DE application
And User enters Valid DE Credentials 
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
Examples:
|Passengers|Age  |Insurance Type|StartDay|NoOfDays|
|1             |40    |Single trip     |30|30|
#|1             |58    |Annual     |


@ZA
Scenario Outline: User Book Insurance
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
And Select Any Random Insurance and Add to cart
And Select Book Radio Button for Insurance
And Clicks on Complete Booking
And Adds the Passenger <Passengers> Details for Insurance with their <Age>
And Click On Insurance Details
And Add additional Details for Insurance
And Accepts the Terms and Conditions
#And Click On Book Button
And Takes The Screenshot And Add to Report
Examples:
|Passengers|Age  |Insurance Type|StartDay|NoOfDays|
|1             |40    |Single trip     |30|30|
#|1             |58    |Annual     |


@Cancel
Scenario: Cancel Booking By Retrieving latest Booking
Given User launches the application 
And User enters Valid Credentials 
Then User logged into application 
And User Selects any agency 
	Given User Clicks on My Bookings 
	And Clicks on Retrieve latest booking 
	And Clicks on Complete Booking 
	And User selects cancel item 
	And Accepts the Terms and Conditions 
	And Click on Update button
	Then Booking is Cancelled
	And Takes The Screenshot And Add to Report