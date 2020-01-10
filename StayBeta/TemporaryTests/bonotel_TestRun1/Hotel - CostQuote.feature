Feature: Hotel Cost Quoting for few data sources 

@GB 
Scenario Outline: User Cost Quote a hotel through <Data Source> 
	Given User launches the application 
	And User enters Valid Credentials 
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
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions 
	And Provides the Adults <Adults> Details and <Children> details with <ChildrenAge>
	And Click on Book Button 
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	Given User clicks On Logout 
	Then User should be logged out and driver is closed 
	
  Examples: 
   | Country                           | SearchString | Data Source     | Start Day | Duration Of Stay | Rooms | Adults | Children | ChildrenAge | Condition | 
   | London (LON), United Kingdom (GB) | LON          | Bonotel         | 5         | 2                | 1     | 2      | 0        | 0           | Inside    | 
   | New York (NYC), United States (US)| NYC          | Bonotel         | 10        | 2                | 1     | 2      | 0        | 0           | Outside   | 
		
@AU  @SpiraTestId2
Scenario Outline: User Book a hotel through <Data Source> for AU 
		
	Given User launches the au application 
	And User enters Valid AU Credentials 
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
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions 
	And Provides the Adults <Adults> Details and <Children> details with <ChildrenAge>
	And Click on Book Button 
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	Given User clicks On Logout 
	Then User should be logged out and driver is closed 
			
    Examples: 
   | Country                           | SearchString | Data Source     | Start Day | Duration Of Stay | Rooms | Adults | Children | ChildrenAge | Condition | 
   | London (LON), United Kingdom (GB) | LON          | Bonotel         | 5         | 2                | 1     | 2      | 0        | 0           | Inside    | 
   | New York (NYC), United States (US)| NYC          | Bonotel         | 10        | 2                | 1     | 2      | 0        | 0           | Outside   | 
				
  