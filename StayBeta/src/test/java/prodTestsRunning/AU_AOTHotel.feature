Feature: AU - AOT Hotel cost quote

@AU  @HotelBooking
Scenario Outline: User Book a hotel through <Data Source> for AU
  
    Given User launches the prod au application
	And User enters Valid prod AU Credentials
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Hotel Search Page 
	And Search for a <Country> with particular <SearchString> 
	And Select the <Start Day> and <Duration Of Stay> 
	And Select Number of Rooms <Rooms> 
	And Select Number of Adult Guests <Adults> into <Rooms> in automatic order 
	And Select Number of Child Guests <Children> into <Rooms> in automatic order 
	And Enter the ChildrenAge <ChildrenAge> 
	And Deselect SelectAll DataSources 
	And Select DataSource <Data Source> 
	And Exclude On Request Rooms 
	And Click Search Button
	And Clicks on Add to cart on a hotel from search results 
	And Check for Cancellation Condition <Condition> 
	And Verify if Quote is selected by default
	And Add the screenshot of the Hotel Cancellation Conditions to Report
	And Clicks On Book Radio Button
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions 
	And Provides the Adults <Adults> Details and <Children> details with <ChildrenAge>
	And Click on Book Button 
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	Given User clicks On Logout 
	Then User should be logged out and driver is closed 

	
	Examples: 
	| Country                          				     |SearchString | Data Source             | Start Day | Duration Of Stay | Rooms | Adults | Children | ChildrenAge | Condition | 
	| Melbourne (MEL), Australia (AU)        | MEL             | AOT AU                     | 90           | 2                       | 1         |2    	 | 1           | 3          		 | Outside   |
	
#	  Given User launches the prod au application
#	And User enters Valid prod AU Credentials
#	Then User logged into application 
#	And User Selects any agency
#	And In Home page user Search for a <Country> with particular <SearchString>
#	And In Home page user Select the <Start Day> and <Duration Of Stay>
#	And In Home page user Select Number of Rooms <Rooms>
#	And In Home page user Select Number of Adult Guests <Adults> into <Rooms> in automatic order 
#	And In Home page Click Search Button
#	And Through Home Search Deselect SelectAll DataSources
#	And Through Home Search Select DataSource <Data Source>