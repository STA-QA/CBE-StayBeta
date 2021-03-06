Feature: Verify if User is able to book and cancel Transfers
  
@GB
Scenario Outline: Verify if User is able to book and cancel Transfers in GB
  
	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Transfers Page 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select minimum <minStartDate> and maximum <Duration> 
	And Add Number of Adults <Adults> 
	And Click Search Button 
	And Click Check availability for any Random record 
	And Clicks On Book Radio Button for Transfers 
	And Clicks on Complete Booking 
	And Add the Details Of Guests <Adults> 
	And Accepts the Terms and Conditions 
	And Click On Insurance Details 
	And Add The Passengers Transfers Additional Details 
	And Click On Book Button 
	And Takes The Screenshot And Add to Report
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	Given User Clicks on My Bookings 
	And User Enters Booking Refnumber 
	And Clicks on Complete Booking 
	And User selects cancel item 
	And Accepts the Terms and Conditions 
	And Click on Update button
	Then Booking is Cancelled 
	Then Get updated Booking Details
	Then User should be logged out and driver is closed
	
Examples: 
	| Country                                      | CountrySearchString | minStartDate | Duration | Adults | 
	| Bangkok (BKK), Thailand (TH)                 | BKK                 | 100          | 4        | 2      | 
  
  @AU
Scenario Outline: Verify if User is able to book and cancel Transfers in AU
  
	Given User launches the au application 
	And User enters Valid AU Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Transfers Page 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select minimum <minStartDate> and maximum <Duration> 
	And Add Number of Adults <Adults> 
	And Click Search Button 
	And Click Check availability for any Random record 
	And Clicks On Book Radio Button for Transfers 
	And Clicks on Complete Booking 
	And Add the Details Of Guests <Adults> 
	And Accepts the Terms and Conditions 
	And Click On Insurance Details 
	And Add The Passengers Transfers Additional Details 
	And Click On Book Button 
	And Takes The Screenshot And Add to Report
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	Given User Clicks on My Bookings 
	And User Enters Booking Refnumber 
	And Clicks on Complete Booking 
	And User selects cancel item 
	And Accepts the Terms and Conditions 
	And Click on Update button
	Then Booking is Cancelled 
	Then Get updated Booking Details
	Then User should be logged out and driver is closed
	
Examples: 
	| Country                                      | CountrySearchString | minStartDate | Duration | Adults | 
	| Bangkok (BKK), Thailand (TH)                 | BKK                 | 100          | 4        | 2      | 
  