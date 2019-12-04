Feature: Verify if User is able to book Transfers
  
@GB
Scenario Outline: Login into Application 
  
	Given User launches the prod au application 
	And User enters Valid prod AU Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Transfers Page 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select minimum <minStartDate> and maximum <Duration> 
	And Add Number of Adults <Adults> 
	And Deselect SelectAll DataSources 
	And Select DataSource <Data Source>
	And Click Search Button
	And Select Any Random Insurance and Add to cart
#	And Click Check availability for any Random record 
	And Clicks On Book Radio Button for Transfers 
	And Clicks on Complete Booking 
	And Add the Details Of Guests <Adults> 
	And Accepts the Terms and Conditions 
	And Click On Insurance Details 
	And Add The Passengers Transfers Additional Details 
	And Click On Book Button 
	And Takes The Screenshot And Add to Report
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	Then User should be logged out and driver is closed
	
Examples: 
	| Country                                      | CountrySearchString | minStartDate | Duration | Adults |Data Source|
	| London (LON), United Kingdom (GB) | LON                 	| 60        			  |		 2        | 1      |STAy          | 