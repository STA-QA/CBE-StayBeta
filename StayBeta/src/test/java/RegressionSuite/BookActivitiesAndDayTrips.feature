Feature: Activities and Day Trips Booking 

@GB
Scenario Outline: User Makes The Activities and Day Trips Booking in GB 
	Given User launches the application 
	And User enters Valid Credentials 
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
	
	
  Examples: 
		| Country                           | CountrySearchString | minStartDate | Duration | Data Source | Adults | Condition | 
		| London (LON), United Kingdom (GB) | LON                 | 2            | 2        | Viator      | 2      | Ignore    | 
		| Bangkok (BKK), Thailand (TH)      | BKK                 | 90           | 1        | Viator      | 2      | Outside   |
		
@US 
Scenario Outline: User Makes The Activities and Day Trips Booking in US 
	Given User launches the US application
	And User enters Valid US Credentials
	Then User logged into application 
	And User Selects any agency 
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
	And Click On Insurance Details 
	And Add The Passengers Transfers Additional Details
	And Click On Book Button 
	And Takes The Screenshot And Add to Report 
			
			
  Examples: 
		| Country                           | CountrySearchString | minStartDate | Duration | Data Source | Adults | Condition | 
		| Bangkok (BKK), Thailand (TH)      | BKK                 | 90           | 1        | Viator      | 2      | Outside   |     