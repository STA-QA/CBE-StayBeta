Feature: Booking Transfers

@GB
Scenario Outline: Login into Application 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Transfers Page
	And Search for a <Country> with particular <CountrySearchString>
	And Select minimum <minStartDate> and maximum <maxStartDate>
	And Add Number of Adults <Adults>
	And Click Search Button
	And Click Check availability for any Random record
	And Clicks on Complete Booking
	And Add the Details Of Guests <Adults>
	And Clicks On Book Radio Button for DayTrips
	And Accepts the Terms and Conditions
	And Click On Details And Add The additional information
	And Click On Book Button
	And Takes The Screenshot And Add to Report
	
Examples:
|Country                                           |CountrySearchString|minStartDate|maxStartDate|Adults|
|London (LON), United Kingdom (GB)      |LON						|2                |4                |2       |