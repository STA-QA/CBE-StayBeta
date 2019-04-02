$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DeleteShoppingCart.feature");
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
  "duration": 7921254180,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 232969634,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 392460770,
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
  "duration": 4526351201,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.Click_on_Hotel_Menu()"
});
formatter.result({
  "duration": 5925631338,
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
  "duration": 1573317677,
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
  "duration": 1718179265,
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
  "duration": 246521211,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 60809061,
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
  "duration": 4073593369,
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
  "duration": 308778385,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10123200799,
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
  "duration": 2294554717,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.select_a_random_hotel()"
});
formatter.result({
  "duration": 6155977521,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_add_to_cart()"
});
formatter.result({
  "duration": 6211994428,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.click_on_delete_button()"
});
formatter.result({
  "duration": 5055100485,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.product_should_be_deleted_from_cart()"
});
formatter.result({
  "duration": 19179926,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "User Logs out of application and closes Browser",
  "description": "",
  "id": "delete-the-product-from-the-shopping-cart;user-logs-out-of-application-and-closes-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "User clicks On Logout",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "User should be logged out and driver is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.user_clicks_on_logout()"
});
formatter.result({
  "duration": 8308368494,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_should_be_logged_out_and_driver_is_closed()"
});
formatter.result({
  "duration": 2120381885,
  "status": "passed"
});
formatter.uri("HotelBooking1.feature");
formatter.feature({
  "line": 1,
  "name": "New Hotel Booking through Different Data Sources through LB",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login into Application",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb;login-into-application",
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
  "duration": 13850621948,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 260205529,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 3224084400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User Navigates to Hotel Page",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb;user-navigates-to-hotel-page",
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
  "duration": 5850637629,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.Click_on_Hotel_Menu()"
});
formatter.result({
  "duration": 1546156539,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "User Book a hotel through \u003cData Source\u003e",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb;user-book-a-hotel-through-\u003cdata-source\u003e",
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
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Provides the \u003cGuests\u003e Details",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.examples({
  "line": 35,
  "name": "",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb;user-book-a-hotel-through-\u003cdata-source\u003e;",
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
      "line": 36,
      "id": "new-hotel-booking-through-different-data-sources-through-lb;user-book-a-hotel-through-\u003cdata-source\u003e;;1"
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
      "line": 37,
      "id": "new-hotel-booking-through-different-data-sources-through-lb;user-book-a-hotel-through-\u003cdata-source\u003e;;2"
    },
    {
      "cells": [
        "Buenos Aires (BUE), Argentina (AR)",
        "BUE",
        "2",
        "1",
        "1",
        "Tourico",
        "1"
      ],
      "line": 38,
      "id": "new-hotel-booking-through-different-data-sources-through-lb;user-book-a-hotel-through-\u003cdata-source\u003e;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 37,
  "name": "User Book a hotel through Tourico",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb;user-book-a-hotel-through-\u003cdata-source\u003e;;2",
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
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Provides the 2 Details",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBookingDefinitions.user_is_in_the_hotel_search_page()"
});
formatter.result({
  "duration": 1602124944,
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
  "duration": 825893902,
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
  "duration": 255756895,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 55082981,
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
  "duration": 4116994810,
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
  "duration": 297344823,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10105109419,
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
  "duration": 2299464661,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.select_a_random_hotel()"
});
formatter.result({
  "duration": 6152223223,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_add_to_cart()"
});
formatter.result({
  "duration": 6126533537,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.verify_if_quote_is_selected_by_default()"
});
formatter.result({
  "duration": 3027234072,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_book_radio_button()"
});
formatter.result({
  "duration": 5086646805,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_complete_booking()"
});
formatter.result({
  "duration": 3179288817,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.accepts_the_terms_and_conditions()"
});
formatter.result({
  "duration": 1498484788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "HotelBookingDefinitions.provides_the_details(int)"
});
formatter.result({
  "duration": 1042951437,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.click_on_book_button()"
});
formatter.result({
  "duration": 445775457,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file()"
});
formatter.result({
  "duration": 5260425061,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "User Book a hotel through Tourico",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb;user-book-a-hotel-through-\u003cdata-source\u003e;;3",
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
  "name": "Select Number of 1",
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
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Provides the 1 Details",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBookingDefinitions.user_is_in_the_hotel_search_page()"
});
formatter.result({
  "duration": 1245859696,
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
  "duration": 1594168530,
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
  "duration": 247861016,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 63922631,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "TestCase616.select_number_of(String)"
});
formatter.result({
  "duration": 4122486042,
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
  "duration": 300089345,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10131795390,
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
  "duration": 2204456292,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.select_a_random_hotel()"
});
formatter.result({
  "duration": 6096403605,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_add_to_cart()"
});
formatter.result({
  "duration": 6198740058,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.verify_if_quote_is_selected_by_default()"
});
formatter.result({
  "duration": 3083054420,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_book_radio_button()"
});
formatter.result({
  "duration": 5094632392,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_complete_booking()"
});
formatter.result({
  "duration": 3089412842,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.accepts_the_terms_and_conditions()"
});
formatter.result({
  "duration": 1847014613,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    }
  ],
  "location": "HotelBookingDefinitions.provides_the_details(int)"
});
formatter.result({
  "duration": 440040624,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.click_on_book_button()"
});
formatter.result({
  "duration": 79828167,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file()"
});
formatter.result({
  "duration": 6231051823,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "User Logs out of application and closes Browser",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb;user-logs-out-of-application-and-closes-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "User clicks On Logout",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User should be logged out and driver is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.user_clicks_on_logout()"
});
formatter.result({
  "duration": 8259875866,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_should_be_logged_out_and_driver_is_closed()"
});
formatter.result({
  "duration": 2323692741,
  "status": "passed"
});
formatter.uri("HotelBooking2.feature");
formatter.feature({
  "line": 1,
  "name": "New Hotel Booking through Different Data Sources  through Adding hotel to cart from tabular results directly",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources--through-adding-hotel-to-cart-from-tabular-results-directly",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login into Application",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources--through-adding-hotel-to-cart-from-tabular-results-directly;login-into-application",
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
  "duration": 12466844383,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 228735062,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 675492580,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User Navigates to Hotel Page",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources--through-adding-hotel-to-cart-from-tabular-results-directly;user-navigates-to-hotel-page",
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
  "duration": 6063272056,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.Click_on_Hotel_Menu()"
});
formatter.result({
  "duration": 1351219281,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "User Book a hotel through \u003cData Source\u003e",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources--through-adding-hotel-to-cart-from-tabular-results-directly;user-book-a-hotel-through-\u003cdata-source\u003e",
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
  "name": "Clicks on Add to cart on a hotel from search results",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Provides the \u003cGuests\u003e Details",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources--through-adding-hotel-to-cart-from-tabular-results-directly;user-book-a-hotel-through-\u003cdata-source\u003e;",
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
      "line": 35,
      "id": "new-hotel-booking-through-different-data-sources--through-adding-hotel-to-cart-from-tabular-results-directly;user-book-a-hotel-through-\u003cdata-source\u003e;;1"
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
      "line": 36,
      "id": "new-hotel-booking-through-different-data-sources--through-adding-hotel-to-cart-from-tabular-results-directly;user-book-a-hotel-through-\u003cdata-source\u003e;;2"
    },
    {
      "cells": [
        "Buenos Aires (BUE), Argentina (AR)",
        "BUE",
        "2",
        "1",
        "1",
        "Tourico",
        "1"
      ],
      "line": 37,
      "id": "new-hotel-booking-through-different-data-sources--through-adding-hotel-to-cart-from-tabular-results-directly;user-book-a-hotel-through-\u003cdata-source\u003e;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 36,
  "name": "User Book a hotel through Tourico",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources--through-adding-hotel-to-cart-from-tabular-results-directly;user-book-a-hotel-through-\u003cdata-source\u003e;;2",
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
  "name": "Clicks on Add to cart on a hotel from search results",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Provides the 2 Details",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBookingDefinitions.user_is_in_the_hotel_search_page()"
});
formatter.result({
  "duration": 1454729249,
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
  "duration": 842599528,
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
  "duration": 289273537,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 73176549,
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
  "duration": 4086023579,
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
  "duration": 256925305,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10108097177,
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
  "duration": 2285071786,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.clicks_on_add_to_cart_on_a_hotel_from_search_results()"
});
formatter.result({
  "duration": 5368021180,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.verify_if_quote_is_selected_by_default()"
});
formatter.result({
  "duration": 3050116148,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_book_radio_button()"
});
formatter.result({
  "duration": 5149722302,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_complete_booking()"
});
formatter.result({
  "duration": 3135646691,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.accepts_the_terms_and_conditions()"
});
formatter.result({
  "duration": 2940330539,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "HotelBookingDefinitions.provides_the_details(int)"
});
formatter.result({
  "duration": 1073393529,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.click_on_book_button()"
});
formatter.result({
  "duration": 89155019,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file()"
});
formatter.result({
  "duration": 4624457824,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "User Book a hotel through Tourico",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources--through-adding-hotel-to-cart-from-tabular-results-directly;user-book-a-hotel-through-\u003cdata-source\u003e;;3",
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
  "name": "Select Number of 1",
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
  "name": "Clicks on Add to cart on a hotel from search results",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Provides the 1 Details",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBookingDefinitions.user_is_in_the_hotel_search_page()"
});
formatter.result({
  "duration": 1323094680,
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
  "duration": 821374522,
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
  "duration": 247676492,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 53736612,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "TestCase616.select_number_of(String)"
});
formatter.result({
  "duration": 4090916385,
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
  "duration": 276299965,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10105253830,
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
  "duration": 2226138962,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.clicks_on_add_to_cart_on_a_hotel_from_search_results()"
});
formatter.result({
  "duration": 5160340823,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.verify_if_quote_is_selected_by_default()"
});
formatter.result({
  "duration": 3023006794,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_book_radio_button()"
});
formatter.result({
  "duration": 5119690467,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_complete_booking()"
});
formatter.result({
  "duration": 3137394929,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.accepts_the_terms_and_conditions()"
});
formatter.result({
  "duration": 1075723783,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    }
  ],
  "location": "HotelBookingDefinitions.provides_the_details(int)"
});
formatter.result({
  "duration": 401934221,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.click_on_book_button()"
});
formatter.result({
  "duration": 78182766,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file()"
});
formatter.result({
  "duration": 4129903471,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "User Logs out of application and closes Browser",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources--through-adding-hotel-to-cart-from-tabular-results-directly;user-logs-out-of-application-and-closes-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "User clicks On Logout",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "User should be logged out and driver is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.user_clicks_on_logout()"
});
formatter.result({
  "duration": 8300247613,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_should_be_logged_out_and_driver_is_closed()"
});
formatter.result({
  "duration": 2089171064,
  "status": "passed"
});
formatter.uri("HotelBooking3.feature");
formatter.feature({
  "line": 1,
  "name": "New Hotel Booking through Different Data Sources by selecting a single room",
  "description": "             from the expanded list randomly from LB",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login into Application",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;login-into-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters Valid Credentials",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User logged into application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.User_launches_the_application()"
});
formatter.result({
  "duration": 8578094881,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 215896784,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 1135782349,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Navigates to Hotel Page",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-navigates-to-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User Selects any agency",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on Hotel Menu",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase616.User_Selects_any_agency()"
});
formatter.result({
  "duration": 4644605589,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.Click_on_Hotel_Menu()"
});
formatter.result({
  "duration": 2782872084,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "User Book a hotel through \u003cData Source\u003e",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-book-a-hotel-through-\u003cdata-source\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a \u003cCountry\u003e with particular \u003cCountrySearchString\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the \u003cStart Day\u003e and \u003cDuration Of Stay\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of \u003cRooms\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel \u003cData Source\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Room Selection in LB",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Select a Random room and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Provides the \u003cGuests\u003e Details",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-book-a-hotel-through-\u003cdata-source\u003e;",
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
      "line": 38,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-book-a-hotel-through-\u003cdata-source\u003e;;1"
    },
    {
      "cells": [
        "Buenos Aires (BUE), Argentina (AR)",
        "BUE",
        "2",
        "1",
        "1",
        "Tourico",
        "1"
      ],
      "line": 39,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-book-a-hotel-through-\u003cdata-source\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 39,
  "name": "User Book a hotel through Tourico",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-book-a-hotel-through-\u003cdata-source\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a Buenos Aires (BUE), Argentina (AR) with particular BUE",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the 2 and 1",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of 1",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel Tourico",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Room Selection in LB",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Select a Random room and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Provides the 1 Details",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBookingDefinitions.user_is_in_the_hotel_search_page()"
});
formatter.result({
  "duration": 1779427392,
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
  "duration": 833588847,
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
  "duration": 247484310,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 49918861,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "TestCase616.select_number_of(String)"
});
formatter.result({
  "duration": 4107422899,
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
  "duration": 255385294,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10122287296,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.select_a_random_hotel()"
});
formatter.result({
  "duration": 6137013117,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.click_on_room_selection_in_lb()"
});
formatter.result({
  "duration": 11210580229,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearchDefinitions.select_a_random_room_and_add_to_cart()"
});
formatter.result({
  "duration": 4215120761,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.verify_if_quote_is_selected_by_default()"
});
formatter.result({
  "duration": 3057133532,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_book_radio_button()"
});
formatter.result({
  "duration": 5131642956,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_complete_booking()"
});
formatter.result({
  "duration": 3141666697,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.accepts_the_terms_and_conditions()"
});
formatter.result({
  "duration": 1763265127,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    }
  ],
  "location": "HotelBookingDefinitions.provides_the_details(int)"
});
formatter.result({
  "duration": 454662515,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.click_on_book_button()"
});
formatter.result({
  "duration": 427563006,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file()"
});
formatter.result({
  "duration": 3931945634,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "User Logs out of application and closes Browser",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-logs-out-of-application-and-closes-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "User clicks On Logout",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "User should be logged out and driver is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.user_clicks_on_logout()"
});
formatter.result({
  "duration": 8328623838,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_should_be_logged_out_and_driver_is_closed()"
});
formatter.result({
  "duration": 2106299709,
  "status": "passed"
});
formatter.uri("HotelBooking4.feature");
formatter.feature({
  "line": 1,
  "name": "New Hotel Booking through Different Data Sources by selecting a Multiple rooms with same room type",
  "description": "from the expanded list randomly from LB",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-same-room-type",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login into Application",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-same-room-type;login-into-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters Valid Credentials",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User logged into application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.User_launches_the_application()"
});
formatter.result({
  "duration": 7218145715,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 199075557,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 450577094,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Navigates to Hotel Page",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-same-room-type;user-navigates-to-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User Selects any agency",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on Hotel Menu",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase616.User_Selects_any_agency()"
});
formatter.result({
  "duration": 10607614352,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.Click_on_Hotel_Menu()"
});
formatter.result({
  "duration": 4238230028,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "User Book a hotel through \u003cData Source\u003e",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a \u003cCountry\u003e with particular \u003cCountrySearchString\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the \u003cStart Day\u003e and \u003cDuration Of Stay\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of \u003cRooms\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel \u003cData Source\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Room Selection in LB",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Select multiple rooms with same room type and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Provides the \u003cGuests\u003e Details",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;",
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
      "line": 38,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;;1"
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
      "line": 39,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 39,
  "name": "User Book a hotel through Tourico",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a Buenos Aires (BUE), Argentina (AR) with particular BUE",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the 2 and 1",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of 2",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel Tourico",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Room Selection in LB",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Select multiple rooms with same room type and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Provides the 2 Details",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBookingDefinitions.user_is_in_the_hotel_search_page()"
});
formatter.result({
  "duration": 4019309749,
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
  "duration": 1917549476,
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
  "duration": 240705786,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 53812829,
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
  "duration": 4064933138,
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
  "duration": 280127197,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10102889296,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.select_a_random_hotel()"
});
formatter.result({
  "duration": 6145523103,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.click_on_room_selection_in_lb()"
});
formatter.result({
  "duration": 11223223045,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearchDefinitions.select_multiple_rooms_with_same_room_type_and_add_to_cart()"
});
formatter.result({
  "duration": 8739623804,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.verify_if_quote_is_selected_by_default()"
});
formatter.result({
  "duration": 3029817044,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_book_radio_button()"
});
formatter.result({
  "duration": 5159882429,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_complete_booking()"
});
formatter.result({
  "duration": 3151889184,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.accepts_the_terms_and_conditions()"
});
formatter.result({
  "duration": 2775374792,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "HotelBookingDefinitions.provides_the_details(int)"
});
formatter.result({
  "duration": 1011397460,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.click_on_book_button()"
});
formatter.result({
  "duration": 82254330,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file()"
});
formatter.result({
  "duration": 5800710016,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "User Logs out of application and closes Browser",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-same-room-type;user-logs-out-of-application-and-closes-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "User clicks On Logout",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User should be logged out and driver is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.user_clicks_on_logout()"
});
formatter.result({
  "duration": 8324826143,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_should_be_logged_out_and_driver_is_closed()"
});
formatter.result({
  "duration": 2156454148,
  "status": "passed"
});
formatter.uri("HotelBooking5.feature");
formatter.feature({
  "line": 1,
  "name": "New Hotel Booking through Different Data Sources by selecting a Multiple rooms with different room types",
  "description": "            from the expanded list randomly from LB",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-different-room-types",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login into Application",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-different-room-types;login-into-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters Valid Credentials",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User logged into application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.User_launches_the_application()"
});
formatter.result({
  "duration": 9415133525,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 188101845,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 903287154,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Navigates to Hotel Page",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-different-room-types;user-navigates-to-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User Selects any agency",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on Hotel Menu",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase616.User_Selects_any_agency()"
});
formatter.result({
  "duration": 6475278154,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.Click_on_Hotel_Menu()"
});
formatter.result({
  "duration": 1773711523,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "User Book a hotel through \u003cData Source\u003e",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-different-room-types;user-book-a-hotel-through-\u003cdata-source\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a \u003cCountry\u003e with particular \u003cCountrySearchString\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the \u003cStart Day\u003e and \u003cDuration Of Stay\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of \u003cRooms\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel \u003cData Source\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Room Selection in LB",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Select multiple rooms with different room type and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Provides the \u003cGuests\u003e Details",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-different-room-types;user-book-a-hotel-through-\u003cdata-source\u003e;",
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
      "line": 38,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-different-room-types;user-book-a-hotel-through-\u003cdata-source\u003e;;1"
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
      "line": 39,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-different-room-types;user-book-a-hotel-through-\u003cdata-source\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 39,
  "name": "User Book a hotel through Tourico",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-different-room-types;user-book-a-hotel-through-\u003cdata-source\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a Buenos Aires (BUE), Argentina (AR) with particular BUE",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the 2 and 1",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of 2",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel Tourico",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Room Selection in LB",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Select multiple rooms with different room type and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Provides the 2 Details",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBookingDefinitions.user_is_in_the_hotel_search_page()"
});
formatter.result({
  "duration": 902466277,
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
  "duration": 1466592030,
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
  "duration": 240490265,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 50588033,
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
  "duration": 4063941959,
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
  "duration": 300223179,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10107185133,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.select_a_random_hotel()"
});
formatter.result({
  "duration": 6127883918,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.click_on_room_selection_in_lb()"
});
formatter.result({
  "duration": 11218514035,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearchDefinitions.select_multiple_rooms_with_different_room_type_and_add_to_cart()"
});
formatter.result({
  "duration": 8953828145,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.verify_if_quote_is_selected_by_default()"
});
formatter.result({
  "duration": 3052082095,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_book_radio_button()"
});
formatter.result({
  "duration": 5136382964,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_complete_booking()"
});
formatter.result({
  "duration": 3111735146,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.accepts_the_terms_and_conditions()"
});
formatter.result({
  "duration": 1982707981,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "HotelBookingDefinitions.provides_the_details(int)"
});
formatter.result({
  "duration": 1093979265,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.click_on_book_button()"
});
formatter.result({
  "duration": 1003776179,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file()"
});
formatter.result({
  "duration": 4421350453,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "User Logs out of application and closes Browser",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-multiple-rooms-with-different-room-types;user-logs-out-of-application-and-closes-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "User clicks On Logout",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "User should be logged out and driver is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.user_clicks_on_logout()"
});
formatter.result({
  "duration": 8253231176,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_should_be_logged_out_and_driver_is_closed()"
});
formatter.result({
  "duration": 2115528100,
  "status": "passed"
});
formatter.uri("HotelBooking6.feature");
formatter.feature({
  "line": 1,
  "name": "New Hotel Booking through Different Data Sources by selecting a single room",
  "description": "             from the expanded room list randomly from Table Source",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login into Application",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;login-into-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters Valid Credentials",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User logged into application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.User_launches_the_application()"
});
formatter.result({
  "duration": 6515549616,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 185369358,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 400408068,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Navigates to Hotel Page",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-navigates-to-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User Selects any agency",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on Hotel Menu",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase616.User_Selects_any_agency()"
});
formatter.result({
  "duration": 5978320612,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.Click_on_Hotel_Menu()"
});
formatter.result({
  "duration": 2068069682,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "User Book a hotel through \u003cData Source\u003e",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-book-a-hotel-through-\u003cdata-source\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a \u003cCountry\u003e with particular \u003cCountrySearchString\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the \u003cStart Day\u003e and \u003cDuration Of Stay\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of \u003cRooms\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel \u003cData Source\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Expand room list of any hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Select a room from the list and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Provides the \u003cGuests\u003e Details",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-book-a-hotel-through-\u003cdata-source\u003e;",
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
      "line": 37,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-book-a-hotel-through-\u003cdata-source\u003e;;1"
    },
    {
      "cells": [
        "Buenos Aires (BUE), Argentina (AR)",
        "BUE",
        "2",
        "1",
        "1",
        "Tourico",
        "1"
      ],
      "line": 38,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-book-a-hotel-through-\u003cdata-source\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 38,
  "name": "User Book a hotel through Tourico",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-book-a-hotel-through-\u003cdata-source\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a Buenos Aires (BUE), Argentina (AR) with particular BUE",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the 2 and 1",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of 1",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel Tourico",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Expand room list of any hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Select a room from the list and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Provides the 1 Details",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBookingDefinitions.user_is_in_the_hotel_search_page()"
});
formatter.result({
  "duration": 641849033,
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
  "duration": 2103693033,
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
  "duration": 233492209,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 53235552,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "TestCase616.select_number_of(String)"
});
formatter.result({
  "duration": 4123672320,
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
  "duration": 271959273,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10115566025,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearchDefinitions.expand_room_list_of_any_hotel()"
});
formatter.result({
  "duration": 2196771559,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearchDefinitions.select_a_room_from_the_list_and_add_to_cart()"
});
formatter.result({
  "duration": 4780544018,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.verify_if_quote_is_selected_by_default()"
});
formatter.result({
  "duration": 3045998636,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_book_radio_button()"
});
formatter.result({
  "duration": 5093528166,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.clicks_on_complete_booking()"
});
formatter.result({
  "duration": 3131656815,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.accepts_the_terms_and_conditions()"
});
formatter.result({
  "duration": 1824124879,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    }
  ],
  "location": "HotelBookingDefinitions.provides_the_details(int)"
});
formatter.result({
  "duration": 431528815,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.click_on_book_button()"
});
formatter.result({
  "duration": 88714130,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file()"
});
formatter.result({
  "duration": 6788986540,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "User Logs out of application and closes Browser",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-a-single-room;user-logs-out-of-application-and-closes-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "User clicks On Logout",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User should be logged out and driver is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.user_clicks_on_logout()"
});
formatter.result({
  "duration": 8350547555,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_should_be_logged_out_and_driver_is_closed()"
});
formatter.result({
  "duration": 2109408539,
  "status": "passed"
});
formatter.uri("HotelBooking7.feature");
formatter.feature({
  "line": 1,
  "name": "New Hotel Booking through Different Data Sources by selecting Multiple rooms with same room type",
  "description": "from the expanded room list randomly from Table Source",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login into Application",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;login-into-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters Valid Credentials",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User logged into application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.User_launches_the_application()"
});
formatter.result({
  "duration": 21694866876,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 204744019,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 438967030,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Navigates to Hotel Page",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-navigates-to-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User Selects any agency",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on Hotel Menu",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase616.User_Selects_any_agency()"
});
formatter.result({
  "duration": 7637586017,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.Click_on_Hotel_Menu()"
});
formatter.result({
  "duration": 1891293091,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "User Book a hotel through \u003cData Source\u003e",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a \u003cCountry\u003e with particular \u003cCountrySearchString\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the \u003cStart Day\u003e and \u003cDuration Of Stay\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of \u003cRooms\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel \u003cData Source\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Room Selection in LB",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Select multiple rooms with same room type from the list and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Provides the \u003cGuests\u003e Details",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;",
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
      "line": 38,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;;1"
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
      "line": 39,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 39,
  "name": "User Book a hotel through Tourico",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a Buenos Aires (BUE), Argentina (AR) with particular BUE",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the 2 and 1",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of 2",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel Tourico",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Room Selection in LB",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Select multiple rooms with same room type from the list and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Provides the 2 Details",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBookingDefinitions.user_is_in_the_hotel_search_page()"
});
formatter.result({
  "duration": 1181347025,
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
  "duration": 1795092974,
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
  "duration": 232479515,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 54985614,
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
  "duration": 4135180640,
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
  "duration": 275778848,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10099533220,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.select_a_random_hotel()"
});
formatter.result({
  "duration": 6111104263,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.click_on_room_selection_in_lb()"
});
formatter.result({
  "duration": 11214623348,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearchDefinitions.select_multiple_rooms_with_same_room_type_from_the_list_and_add_to_cart()"
});
formatter.result({
  "duration": 32135605118,
  "error_message": "java.lang.IllegalArgumentException: bound must be positive\r\n\tat java.util.Random.nextInt(Random.java:388)\r\n\tat CBE.StayBeta.HotelSearchImpl.SelectMultipleRoomsSameTypeFromListInSearchResults(HotelSearchImpl.java:257)\r\n\tat stepDefinitions.HotelSearchDefinitions.select_multiple_rooms_with_same_room_type_from_the_list_and_add_to_cart(HotelSearchDefinitions.java:63)\r\n\tat ✽.And Select multiple rooms with same room type from the list and add to cart(HotelBooking7.feature:27)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HotelBookingDefinitions.verify_if_quote_is_selected_by_default()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase616.clicks_on_book_radio_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase616.clicks_on_complete_booking()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase616.accepts_the_terms_and_conditions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "HotelBookingDefinitions.provides_the_details(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase616.click_on_book_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelBookingDefinitions.booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 42,
  "name": "User Logs out of application and closes Browser",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-logs-out-of-application-and-closes-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "User clicks On Logout",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "User should be logged out and driver is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.user_clicks_on_logout()"
});
formatter.result({
  "duration": 12071267491,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"m_cphHeader_T_CustToolbar_cbeNav_btnLogOut\"]\"}\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027UKLF3GWKC2\u0027, ip: \u002710.44.253.139\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628402 (536cd7adbad73a..., userDataDir: C:\\Users\\KIRANM~1.ADA\\AppDa...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:53418}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 73.0.3683.86, webStorageEnabled: true}\nSession ID: da9a34fc7b4fc045404926ac0772c01b\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"m_cphHeader_T_CustToolbar_cbeNav_btnLogOut\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat utilities.Login.ClickOnLogout(Login.java:24)\r\n\tat stepDefinitions.LoginDefinitions.user_clicks_on_logout(LoginDefinitions.java:40)\r\n\tat ✽.Given User clicks On Logout(HotelBooking7.feature:44)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginDefinitions.user_should_be_logged_out_and_driver_is_closed()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("HotelBooking8.feature");
formatter.feature({
  "line": 1,
  "name": "New Hotel Booking through Different Data Sources by selecting Multiple rooms with same room type",
  "description": "from the expanded room list randomly from Table Source",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login into Application",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;login-into-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters Valid Credentials",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User logged into application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.User_launches_the_application()"
});
formatter.result({
  "duration": 14133186979,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 189787360,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 10960849904,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Navigates to Hotel Page",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-navigates-to-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User Selects any agency",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on Hotel Menu",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase616.User_Selects_any_agency()"
});
formatter.result({
  "duration": 5815019747,
  "status": "passed"
});
formatter.match({
  "location": "HomePageDefinitions.Click_on_Hotel_Menu()"
});
formatter.result({
  "duration": 1598972354,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "User Book a hotel through \u003cData Source\u003e",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a \u003cCountry\u003e with particular \u003cCountrySearchString\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the \u003cStart Day\u003e and \u003cDuration Of Stay\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of \u003cRooms\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel \u003cData Source\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Room Selection in LB",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Select multiple rooms with different room type from the list and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Provides the \u003cGuests\u003e Details",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;",
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
      "line": 38,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;;1"
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
      "line": 39,
      "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 39,
  "name": "User Book a hotel through Tourico",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-book-a-hotel-through-\u003cdata-source\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User is in the Hotel Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Search for a Buenos Aires (BUE), Argentina (AR) with particular BUE",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the 2 and 1",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select Exclude dorm beds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Number of 2",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Hotel Tourico",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select a Random Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Room Selection in LB",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Select multiple rooms with different room type from the list and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify if Quote is selected by default",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Clicks On Book Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Clicks on Complete Booking",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Accepts the Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Provides the 2 Details",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Book Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Booking has been done successfully and Booking reference Text is stored in a file",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelBookingDefinitions.user_is_in_the_hotel_search_page()"
});
formatter.result({
  "duration": 1737848581,
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
  "duration": 1444116200,
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
  "duration": 246012493,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Select_Exclude_dorm_beds()"
});
formatter.result({
  "duration": 62913584,
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
  "duration": 4060902053,
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
  "duration": 242154264,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.Click_Search_Button()"
});
formatter.result({
  "duration": 10100399316,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.select_a_random_hotel()"
});
formatter.result({
  "duration": 6135302077,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.click_on_room_selection_in_lb()"
});
formatter.result({
  "duration": 11130459596,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearchDefinitions.select_multiple_rooms_with_different_room_type_from_the_list_and_add_to_cart()"
});
formatter.result({
  "duration": 32083076300,
  "error_message": "java.lang.IllegalArgumentException: bound must be positive\r\n\tat java.util.Random.nextInt(Random.java:388)\r\n\tat CBE.StayBeta.HotelSearchImpl.SelectMultipleRoomsDifferentTypeFromListInSearchResults(HotelSearchImpl.java:282)\r\n\tat stepDefinitions.HotelSearchDefinitions.select_multiple_rooms_with_different_room_type_from_the_list_and_add_to_cart(HotelSearchDefinitions.java:71)\r\n\tat ✽.And Select multiple rooms with different room type from the list and add to cart(HotelBooking8.feature:27)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HotelBookingDefinitions.verify_if_quote_is_selected_by_default()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase616.clicks_on_book_radio_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase616.clicks_on_complete_booking()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase616.accepts_the_terms_and_conditions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "HotelBookingDefinitions.provides_the_details(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase616.click_on_book_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelBookingDefinitions.booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 42,
  "name": "User Logs out of application and closes Browser",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-by-selecting-multiple-rooms-with-same-room-type;user-logs-out-of-application-and-closes-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "User clicks On Logout",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "User should be logged out and driver is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.user_clicks_on_logout()"
});
formatter.result({
  "duration": 12062393196,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"m_cphHeader_T_CustToolbar_cbeNav_btnLogOut\"]\"}\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027UKLF3GWKC2\u0027, ip: \u002710.44.253.139\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628402 (536cd7adbad73a..., userDataDir: C:\\Users\\KIRANM~1.ADA\\AppDa...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:53554}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 73.0.3683.86, webStorageEnabled: true}\nSession ID: c3490b821d7e2058d03a9f753587184a\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"m_cphHeader_T_CustToolbar_cbeNav_btnLogOut\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat utilities.Login.ClickOnLogout(Login.java:24)\r\n\tat stepDefinitions.LoginDefinitions.user_clicks_on_logout(LoginDefinitions.java:40)\r\n\tat ✽.Given User clicks On Logout(HotelBooking8.feature:44)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginDefinitions.user_should_be_logged_out_and_driver_is_closed()"
});
formatter.result({
  "status": "skipped"
});
});