Feature: Cancellations for GB
 
 @GB @Cancellations 
Scenario Outline: User cancel a booking with Booking Reference Number GB <BookingRef>
   Given User launches the prod gb application
	And User enters Valid prod GB Credentials 
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
		|1960081|
		|1960091|
		


		