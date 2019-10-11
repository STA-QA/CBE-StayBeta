Feature: Hotel Booking through Expedia 
@smoke 
Scenario Outline: User Book a hotel through 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Hotel Search Page 
	And User enters <country> with startdate <numberofdaysfromtoday> 
	And Select Number of Rooms <Rooms> 
	And Select Number of Adults <Guests> 
	And Select Number of Children <Children> 
	And Select Hotel <Data Source> 
	And Click Search Button
	Then User add rooms to cart
	
	
	Examples: 
		|country| |numberofdaysfromtoday| |Rooms| |Guests| |Children| |Data Source|
		|lon    | |94         |            |1|     |2|      |0|        |Expedia Affiliate - Package Rate|