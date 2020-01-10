Feature: Cancellations Of Bonotel
 
 @AU @Cancellations 
Scenario Outline:Cancellation Of Hotel with Booking Reference Number AU <BookingRef>
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
		|          |
	
		
		
@GB @Cancellations 
Scenario Outline:Cancellation Of Hotel with Booking Reference Number GB <BookingRef>
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
		|          |
	
		