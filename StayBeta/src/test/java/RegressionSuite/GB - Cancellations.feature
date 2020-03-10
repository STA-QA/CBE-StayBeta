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
		|1556060|
		|1556061|
		|1556064|
		|1556065|
		|1556068|
		|1556069|
		|1556073|
		|1556074|
		


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
		|1556062|
		|1556063|
		|1556066|
		|1556067|
		|1556071|
		|1556075|
		|1556077|
		
		