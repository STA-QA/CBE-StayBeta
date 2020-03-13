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
	And Select DataSource <DataSource> 
	And User Click Search Button on Hotel Searchpage <DataSource> and <Country>
	Then User should be logged out and driver is closed
	
	Examples: 
	|Country                     |CountrySearchString|DataSource         |Start Day|Duration Of Stay|Rooms|Adults   |Children|ChildrenAge|
#   |Bangkok (BKK), Thailand (TH)|	BKK  |Expedia Affiliate - Package Rate 		|25     | 1 | 1	| 2        | 0 | 0 |
#	|Bangkok (BKK), Thailand (TH)|	BKK  |JacTravel								|25     | 1 | 1	| 2        | 0 | 0 |
#	|Bangkok (BKK), Thailand (TH)|	BKK  |STAy									|25     | 1 | 1	| 2        | 0 | 0 |
	|Bangkok (BKK), Thailand (TH)|	BKK  |Expedia Rapid PKG 					|25     | 1 | 1	| 2        | 0 | 0 |
#	|London (LON), United Kingdom (GB)|lon	|Expedia Affiliate - Package Rate 	|25		| 1 | 1	| 2        | 0 | 0 |	
#   |London (LON), United Kingdom (GB)|lon	|JacTravel				 			|25		| 1 | 1	| 2        | 0 | 0 |
#	|London (LON), United Kingdom (GB)|lon	|STAy					 			|25		| 1 | 1	| 2        | 0 | 0 |
	|London (LON), United Kingdom (GB)|lon	|Expedia Rapid PKG					|25		| 1 | 1	| 2        | 0 | 0 |	
#   |Sydney (SYD), Australia (AU)	|syd	|Expedia Affiliate - Package Rate 	|25		| 1 | 1	| 2        | 0 | 0 |
#   |Sydney (SYD), Australia (AU)	|syd	|JacTravel				 			|25		| 1 | 1	| 2        | 0 | 0 |
#	|Sydney (SYD), Australia (AU)	|syd	|STAy					 			|25		| 1 | 1	| 2        | 0 | 0 |
#	|Sydney (SYD), Australia (AU)	|syd	|AOT AU					 			|25		| 1 | 1	| 2        | 0 | 0 |
    |Sydney (SYD), Australia (AU)	|syd	|Expedia Rapid PKG  				|25		| 1 | 1	| 2        | 0 | 0 |	
#   |New York (NYC), United States (US)|nyc	|Expedia Affiliate - Package Rate 	|25		| 1 | 1	| 2        | 0 | 0 |
#   |New York (NYC), United States (US)|nyc	|Tourico				 			|25		| 1 | 1	| 2        | 0 | 0 |
#	|New York (NYC), United States (US)|nyc	|JacTravel				 			|25		| 1 | 1	| 2        | 0 | 0 |
#	|New York (NYC), United States (US)|nyc	|STAy					 			|25		| 1 | 1	| 2        | 0 | 0 |
    |New York (NYC), United States (US)|nyc	|Expedia Rapid PKG 					|25		| 1 | 1	| 2        | 0 | 0 |
#   |Paris (PAR), France (FR)		   |PAR |Expedia Affiliate - Package Rate 	|25		| 1 | 1	| 2        | 0 | 0 |	
#	|Paris (PAR), France (FR)		   |PAR |JacTravel						 	|25		| 1 | 1	| 2        | 0 | 0 |
#	|Paris (PAR), France (FR)		   |PAR |STAy							 	|25		| 1 | 1	| 2        | 0 | 0 |
	|Paris (PAR), France (FR)		   |PAR |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 |
#   |Leeds (LBA), United Kingdom (GB) |LBA |JacTravel						 	|25		| 1 | 1	| 2        | 0 | 0 |	
	|Leeds (LBA), United Kingdom (GB) |LBA |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
#	|Ho Chi Minh (SGN), Vietnam (VN)|SGN  |JacTravel						 	|25		| 1 | 1	| 2        | 0 | 0 |
	|Ho Chi Minh (SGN), Vietnam (VN)|SGN  |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
#	|Warsaw (WAW), Poland (PL)      |WAW  |JacTravel						 	|25		| 1 | 1	| 2        | 0 | 0 |
	|Warsaw (WAW), Poland (PL)      |WAW  |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
#	|Cairns (CNS), Australia (AU)   |CNS  |JacTravel						 	|25		| 1 | 1	| 2        | 0 | 0 |
	|Cairns (CNS), Australia (AU)   |CNS  |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 |
	|Miami (MIA), United States (US)   |MIA  |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
	|Queenstown [TAS] (UEE), Australia (AU)  |UEE  |Expedia Rapid PKG		 	|25		| 1 | 1	| 2        | 0 | 0 | 
	|New Delhi (DEL), India (IN)  |DEL  |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
	|Hyderabad (HYD), India (IN)  |HYD  |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
	|Amsterdam (AMS), Netherlands (NL)  |AMS  |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
	|Santorini, Greece (GR)  |santorini  |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
	|Orlando (MCO), United States (US)  |MCO |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
	|Barcelona (BCN), Spain (ES)  |BCN |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
    |Ayia Napa, Cyprus (CY)  |Ayia |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
	|Dubai (DXB), United Arab Emirates (AE) | DXB |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
	|Mauritius (MRU), Mauritius (MU) | MRU |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
	|Maldives (MLD), Maldives (MV) | MLD |Expedia Rapid PKG				 	|25		| 1 | 1	| 2        | 0 | 0 | 
	
	

	
	
	
	
	
	
	
	