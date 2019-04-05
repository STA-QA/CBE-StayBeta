$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/testCaseResources/DeleteShoppingCart.feature");
formatter.feature({
  "line": 1,
  "name": "Delete the Product from the shopping cart",
  "description": "",
  "id": "delete-the-product-from-the-shopping-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login into Application",
  "description": "",
  "id": "delete-the-product-from-the-shopping-cart;login-into-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters Valid Credentials",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User logged into application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.User_launches_the_application()"
});
formatter.result({
  "duration": 32241372508,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 289440969,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 816314169,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User Navigates to Hotel Page",
  "description": "",
  "id": "delete-the-product-from-the-shopping-cart;user-navigates-to-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User Selects any agency",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Click on Hotel Menu",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase616.User_Selects_any_agency()"
});
formatter.result({
  "duration": 14987601165,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.Click_on_Hotel_Menu()"
});
formatter.result({
  "duration": 2867456813,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "User Book a hotel through \u003cData Source\u003e",
  "description": "",
  "id": "delete-the-product-from-the-shopping-cart;user-book-a-hotel-through-\u003cdata-source\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Search for a \u003cCountry\u003e with particular \u003cCountrySearchString\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Select the \u003cStart Day\u003e and \u003cDuration Of Stay\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Number of \u003cRooms\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Hotel \u003cData Source\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User verify the Search Results of \u003cData Source\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Clicks on Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Click on Delete button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Product should be deleted from cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "delete-the-product-from-the-shopping-cart;user-book-a-hotel-through-\u003cdata-source\u003e;",
  "rows": [
    {
      "cells": [
        "Country",
        "CountrySearchString",
        "Start Day",
        "Duration Of Stay",
        "Rooms",
        "Data Source",
        "Guests"
      ],
      "line": 32,
      "id": "delete-the-product-from-the-shopping-cart;user-book-a-hotel-through-\u003cdata-source\u003e;;1"
    },
    {
      "cells": [
        "Buenos Aires (BUE), Argentina (AR)",
        "BUE",
        "2",
        "1",
        "2",
        "Tourico",
        "2"
      ],
      "line": 33,
      "id": "delete-the-product-from-the-shopping-cart;user-book-a-hotel-through-\u003cdata-source\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 33,
  "name": "User Book a hotel through Tourico",
  "description": "",
  "id": "delete-the-product-from-the-shopping-cart;user-book-a-hotel-through-\u003cdata-source\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Search for a Buenos Aires (BUE), Argentina (AR) with particular BUE",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Select the 2 and 1",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Number of 2",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Hotel Tourico",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User verify the Search Results of Tourico",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Clicks on Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Click on Delete button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Product should be deleted from cart",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBookingDefinitions.user_is_in_the_hotel_search_page()"
});
formatter.result({
  "duration": 1437274838,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buenos Aires (BUE), Argentina (AR)",
      "offset": 13
    },
    {
      "val": "BUE",
      "offset": 64
    }
  ],
  "location": "TestCase616.search_for_a_with_particular(String,String)"
});
formatter.result({
  "duration": 1894467676,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 11
    },
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "TestCase616.select_the_and(int,int)"
});
formatter.result({
  "duration": 290895644,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 73220229,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 17
    }
  ],
  "location": "TestCase616.select_number_of(String)"
});
formatter.result({
  "duration": 4180009211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tourico",
      "offset": 13
    }
  ],
  "location": "TestCase616.select_hotel(String)"
});
formatter.result({
  "duration": 510598269,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10177742778,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tourico",
      "offset": 34
    }
  ],
  "location": "HotelBookingDefinitions.user_verify_the_search_results_of(String)"
});
formatter.result({
  "duration": 2671729160,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.select_a_random_hotel()"
});
formatter.result({
  "duration": 6259553941,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_add_to_cart()"
});
formatter.result({
  "duration": 7035625137,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.click_on_delete_button()"
});
