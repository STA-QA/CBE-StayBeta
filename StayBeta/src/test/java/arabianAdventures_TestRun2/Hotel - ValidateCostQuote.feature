Feature: Validating Cost Quote - AA 

@GB 
Scenario Outline: User validated the cost quote for Booking reference <BookingRef>
	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User Clicks on My Bookings 
	And Through scenario outline User Enters the BookingRefnumber <BookingRef> 
	And Clicks on Complete Booking 
	Given User clicks on Actions and selects validate Cost Quote 
	And Clicks Book rb during changing from quote to book 
	And Accepts the Terms and Conditions 
	And Click on Update button 
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	
	
	Examples: 
		|BookingRef|
		|          |


@GB 
Scenario Outline: User validated the cost quote for Booking reference <BookingRef>
	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User Clicks on My Bookings 
	And Through scenario outline User Enters the BookingRefnumber <BookingRef> 
	And Clicks on Complete Booking 
	Given User clicks on Actions and selects validate Cost Quote 
	And Clicks Book rb during changing from quote to book 
	And Accepts the Terms and Conditions 
	And Click on Update button 
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	
	
	Examples: 
		|BookingRef|
		|          |
