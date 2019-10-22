Feature: Insurance

@GB
Scenario Outline: User Book Insurance
Given User launches the application 
And User enters Valid Credentials 
Then User logged into application 
And User Selects any agency 
Given User is in the Insurance Page
And Selects the Region
And Select the Insurance Type <Insurance Type>
And Enter Number Of <Passengers> for Insurance
And Enter the Date Of Birth for Insurance <Age> for <Passengers>
And Click On Insurance Search
And Select Any Random Insurance and Add to cart
#And Select Book Radio Button for Insurance
#And Click On Insurance Details and Add additional Details <insurance tye>
#And Accepts the Terms and Conditions
#And Click On Book Button

Examples:
|Passengers|Age  |Insurance Type|
|1             |40    |Single trip     |

	
