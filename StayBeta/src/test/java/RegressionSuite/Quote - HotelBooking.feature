Feature: Hotel Quoting - gb for few data sources 



Scenario Outline: User Book a hotel through <Data Source> 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Hotel Search Page 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select the <Start Day> and <Duration Of Stay> 
	And Select Number of Rooms <Rooms> 
	And Select Number of Adult Guests <Adults> into <Rooms> in automatic order 
<<<<<<< HEAD:StayBeta/src/test/java/TestCasesRecent/1-TestCase.feature
	And Select Number of Child Guests <Children> into <Rooms> in automatic order 
	And Enter the ChildrenAge <ChildrenAge> 
	And Select Hotel <Data Source> 
=======
	And Select Number of Child Guests <Children> into <Rooms> in automatic order
	And Enter the ChildrenAge <ChildrenAge> 
	And Deselect SelectAll DataSources
	And Select DataSource <Data Source>
	And Exclude On Request Rooms
>>>>>>> 4046ffafc73c22b61eabbfc2b6ee3b89bce0bdd9:StayBeta/src/test/java/TestCasesRecent/Quote - HotelBooking.feature
	And Click Search Button 
	And Clicks on Add to cart on a hotel from search results 
	And Check for Cancellation Condition <Condition> 
	And Verify if Quote is selected by default 
	And Clicks on Complete Booking 
<<<<<<< HEAD:StayBeta/src/test/java/TestCasesRecent/1-TestCase.feature
	And Accepts the Terms and Conditions 
	#	And Provides the <Adults> and <Children> Details 
	And Provides the Adults <Adults> Details and <Children> details with <ChildrenAge> 
	
	#	And Click on Book Button 
	#Then Booking has been done successfully and Booking reference Text is stored in a file
	#Given User clicks On Logout
	#Then User should be logged out and driver is closed	
=======
	And Accepts the Terms and Conditions
   And Provides the Adults <Adults> Details and <Children> details with <ChildrenAge>
 	And Click on Book Button 
	Then Booking has been done successfully and Booking reference Text is stored in a file
	Given User clicks On Logout
	Then User should be logged out and driver is closed	
>>>>>>> 4046ffafc73c22b61eabbfc2b6ee3b89bce0bdd9:StayBeta/src/test/java/TestCasesRecent/Quote - HotelBooking.feature
	
	Examples: 
		|Country                           |CountrySearchString|Data Source      |Start Day|Duration Of Stay|Rooms|Adults   |Children|ChildrenAge|Condition|
		#|Cape Town (CPT), South Africa (ZA)|	CPT            |followme2AFRICA|10       |6                      |3      |2,3,1     |1,0,0 |5	   |Ignore   |
		|Cape Town (CPT), South Africa (ZA)|	CPT            |followme2AFRICA|10       |6                      |1      |2     |1   |3	   |Ignore   |
		#|Cape Town (CPT), South Africa (ZA)|	CPT            |followme2AFRICA|10       |6                      |1      |2,     |2   |5,6	   |Ignore   |
		
		
		
		
		
		
		#|New York (NYC), United States (US)	|	NYC             |15       |5               |1    |Tourico         |2        |0		|Outside|
		
		
		
		
	