Feature: To test new or a particular Data Source End to End 

Scenario: Login into Application 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	
Scenario: User Expands Search options
	
	Given User Selects any agency
	And Verify Home Page Assertions
	And Click on Hotel Menu 
	And Expand Show Extra options 
#Add assertions	Then Extra options are displayed in the page
	
Scenario Outline: 
	Verify if the data source is available in the list and checked by default 
		
	Then <Data Source> should be displayed in the Data source list 
	And <Data Source Value> Should be selected by default 
	
	Examples: 
	
		|Data Source|Data Source Value|
		|Tourico|Tourico|
    	|AOT NZ and Pacific - New|ecco|
		

	
		
		
		
		
