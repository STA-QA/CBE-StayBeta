Feature: valid cost quote and Book the hotels for AU
 
 @AU 
Scenario Outline: User validates the cost quote and book it for <BookingRef>
   Given User launches the prod au application
	And User enters Valid prod AU Credentials 
	Then User logged into application 
	And User Selects any agency
	Given User Clicks on My Bookings 
	And Through scenario outline User Enters the BookingRefnumber <BookingRef>
	And Clicks on Complete Booking 
	Given User clicks on Actions and selects validate Cost Quote
	And Clicks On Book Radio Button 
	And Accepts the Terms and Conditions 
	And Click on Update button  
   Then Booking has been done successfully and Booking reference Text is stored in a file 

    Examples: 
		|BookingRef|
		|1959522|
		|1959536|