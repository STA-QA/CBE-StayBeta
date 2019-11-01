Feature: Verify if User is able to book Transfers
  
@GB
Scenario Outline: Login into Application 
  
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
	
Examples: 
	| Country                           | CountrySearchString | minStartDate | Duration | Adults | 
	| London (LON), United Kingdom (GB) | LON                 | 100          | 4        | 2      | 
  