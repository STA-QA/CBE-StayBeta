Feature: Print Search loading time

Scenario Outline: Check loading time

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Hotel Search Page 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select the <Start Day> and <Duration Of Stay> 
	And Select Number of Rooms <Rooms> 
	And Select Number of Adult Guests <Adults> into <Rooms> in automatic order 
	And Select Number of Child Guests <Children> into <Rooms> in automatic order 
	And Enter the ChildrenAge <ChildrenAge> 
	And Deselect SelectAll DataSources 
	And Select DataSource <Data Source> 
	And User Click Search Button on Hotel Searchpage 
	Then User should be logged out and driver is closed
	
	Examples: 
		|Country                     |CountrySearchString|Data Source         |Start Day|Duration Of Stay|Rooms|Adults   |Children|ChildrenAge|
		|Bangkok (BKK), Thailand (TH)|	BKK  |Expedia Affiliate - Package Rate |25      |3                |1    |1         |  0    | 0|
	|London (LON), United Kingdom (GB)|lon	|Expedia Affiliate - Package Rate |34		| 3               | 1	| 2        |	0 |0 |		
	|Bangkok (BKK), Thailand (TH)	 |bkk	|Expedia Affiliate - Package Rate |34		| 3               |1	| 2        |	 0| 0|		
	|Sydney (SYD), Australia (AU)	|syd	|Expedia Affiliate - Package Rate |34		| 3               |1	| 2        |	 0|0 |		
	|New York (NYC), United States (US)|nyc	|Expedia Affiliate - Package Rate |34		| 3               |1	| 2        |	 0| 0|		
	|Nadi (NAN), Fiji (FJ)|nan	|Expedia Affiliate - Package Rate              |34		| 3              |1	    | 2        |	0 |0 |		
	|Cape Town (CPT), South Africa (ZA)|cpt	|Expedia Affiliate - Package Rate |34	| 3                     |1	| 2        |	 0| 0|		
	|Phuket (HKT), Thailand (TH)|hkt	|Expedia Affiliate - Package Rate |34	| 3               |1	| 2        |	 0|0 |		
										                             
	