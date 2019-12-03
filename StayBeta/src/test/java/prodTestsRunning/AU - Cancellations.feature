Feature: Cancellations for AU
 
 @AU @Cancellations 
Scenario Outline: User cancel a hotel through <Data Source> and Cancel with Cancellation Condition <Condition>
   Given User launches the prod au application
	And User enters Valid prod AU Credentials 
	Then User logged into application 
	And User Selects any agency
	Given User Clicks on My Bookings 
	And Through scenario outline User Enters the BookingRefnumber <BookingRef>
	And Clicks on Complete Booking 
	And User selects cancel item
	And Takes The Screenshot And Add to Report 
	And Accepts the Terms and Conditions
	And Click on Update button 
	Then Booking is Cancelled
	And Takes The Screenshot And Add to Report 
	Then Get updated Booking Details
	And Takes The Screenshot And Add to Report 
	Then User should be logged out and driver is closed 

    Examples: 
		|BookingRef|
		|1959522|
		|1959536|
       |1959543|

		