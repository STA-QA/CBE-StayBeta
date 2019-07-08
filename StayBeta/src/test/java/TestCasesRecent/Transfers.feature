Feature: Transfers - gb 

Scenario: Login into Application 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	
Scenario Outline: User Book a day trip

	Given User is in the Transfers Page
	And Search for a <Country> with particular <CountrySearchString>
	And Select minimum <minStartDate> and maximum <maxStartDate>
	And Click Search Button
	And Click Check availability for any Random record
	
	
Examples:
|Country                                           |CountrySearchString|minStartDate|maxStartDate|
|London (LON), United Kingdom (GB)  |LON							|2|4|