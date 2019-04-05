$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/testCaseResources/HotelBookingAmend.feature");
formatter.feature({
  "line": 1,
  "name": "Amend a Hotel Booking through Searching Booking from the list",
  "description": "",
  "id": "amend-a-hotel-booking-through-searching-booking-from-the-list",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login into Application",
  "description": "",
  "id": "amend-a-hotel-booking-through-searching-booking-from-the-list;login-into-application",
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
formatter.step({
  "line": 8,
  "name": "User Selects any agency",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDefinitions.User_launches_the_application()"
});
formatter.result({
  "duration": 22489879257,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 279498503,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 525955532,
  "status": "passed"
});
formatter.match({
  "location": "TestCase616.User_Selects_any_agency()"
});
formatter.result({
  "duration": 16607445145,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Amend Booking By Searching BRN from My Bookings",
  "description": "",
  "id": "amend-a-hotel-booking-through-searching-booking-from-the-list;amend-booking-by-searching-brn-from-my-bookings",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User Clicks on My Bookings",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Clicks on Search Booking",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Enters the search parameter",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Selects the Related Booking",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Click on Continue Booking In Search",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Select Amend this item Option",
  "keyword": "And "
});
formatter.match({
  "location": "CancelBooking.user_clicks_on_my_bookings()"
});
formatter.result({
  "duration": 2241644088,
  "status": "passed"
});
formatter.match({
  "location": "CancelBooking.clicks_on_search_booking()"
});
formatter.result({
  "duration": 100548467,
  "status": "passed"
});
formatter.match({
  "location": "CancelBooking.enters_the_search_parameter()"
});
formatter.result({
  "duration": 6786373665,
  "status": "passed"
});
formatter.match({
  "location": "CancelBooking.selects_the_related_booking()"
});
formatter.result({
  "duration": 5575693150,
  "status": "passed"
});
formatter.match({
  "location": "CancelBooking.click_on_continue_booking_in_search()"
});
formatter.result({
  "duration": 4116102093,
  "status": "passed"
});
formatter.match({
  "location": "CancelBooking.select_amend_this_item_option()"
});
formatter.result({
  "duration": 28271468061,
  "status": "passed"
});
});