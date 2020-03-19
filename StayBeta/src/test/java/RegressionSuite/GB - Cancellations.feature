Feature: Cancellations for GB
 
 @GB @Cancellations 
Scenario Outline: User cancel a booking with Booking Reference Number GB <BookingRef>
   Given User launches the application
	And User enters Valid Credentials 
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
		|1556125|
		|1556131|
	    |1556133|
	    |1556132|
	    |1556134|
	    |1556163|
	    |1556164|
		


 @AU @Cancellations 
Scenario Outline: User cancel a booking with Booking Reference Number GB <BookingRef>
   Given User launches the au application
	And User enters Valid AU Credentials 
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
	    |1556138|
	    |1556165|
	    |1556166|		
		