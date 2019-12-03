Feature: Gb - Viator Day Trips Booking 

@GB 
Scenario Outline: User Makes The Activities and Day Trips Booking in GB for <Data Source>
	Given User launches the prod gb application 
	And User enters Valid prod GB Credentials 
	Then User logged into application
	And User Selects any agency 
	Given User is in the Insurance Page 
	And Selects the Region 
	Given User is in the ActivitiesAndDayTrips Search Page 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select minimum <minStartDate> and maximum <Duration> 
	And Add Number of Adults <Adults> 
	And Deselect SelectAll DataSources 
	And Select DataSource <Data Source> 
	And Click Search Button 
	And Click Check availability for any Random record 
	And Check for Cancellation condition for DayTrips <Condition> 
	And Clicks on Complete Booking 
	And Add the Details Of Guests <Adults> 
	And Clicks On Book Radio Button for DayTrips 
	And Accepts the Terms and Conditions	
	And Click On Book Button 
	And Takes The Screenshot And Add to Report
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	
	
	
  Examples: 
		| Country                           			| CountrySearchString | minStartDate | Duration | Data Source | Adults | Condition | 
		| Bangkok (BKK), Thailand (TH)      | BKK                		 | 90         		  | 1        | Viator      | 2      | Outside   |