Feature: Activities and Day Trips booking - gb 

Scenario Outline: Login into Application

	Given User launches the application
	And User enters Valid Credentials
	Then User logged into application
	And User Selects any agency
	Given User is in the ActivitiesAndDayTrips Search Page
	And Search for a <Country> with particular <CountrySearchString>
	And Select minimum <minStartDate> and maximum <maxStartDate>
	And Add Number of Adults <Adults>
	And Deselect SelectAll DataSources
	And Select DataSource <Data Source>
	And Click Search Button
	And Click Check availability for any Random record
	And Clicks on Complete Booking
	And Add the Details Of Guests <Adults>
	And Clicks On Book Radio Button for DayTrips
	And Accepts the Terms and Conditions
	And Click On Book Button
	And Takes The Screenshot And Add to Report
	
	
Examples:
|Country                                           |CountrySearchString|minStartDate|maxStartDate|Data Source|Adults|
|London (LON), United Kingdom (GB)      |LON						|2                |4                 |Viator       |2      |
|Bangkok (BKK), Thailand (TH)              |BKK						|90               |91                 |Viator       |2      |
