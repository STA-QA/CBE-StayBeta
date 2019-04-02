$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/testResources/TestLogic.feature");
formatter.feature({
  "line": 1,
  "name": "New Hotel Booking through Different Data Sources through LB",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login into Application",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb;login-into-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters Valid \u003cUsername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User logged into application",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks On Logout",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User should be logged out and driver is closed",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb;login-into-application;",
  "rows": [
    {
      "cells": [
        "Username",
        "password"
      ],
      "line": 12,
      "id": "new-hotel-booking-through-different-data-sources-through-lb;login-into-application;;1"
    },
    {
      "cells": [
        "gbzq4",
        "1srzq4"
      ],
      "line": 13,
      "id": "new-hotel-booking-through-different-data-sources-through-lb;login-into-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login into Application",
  "description": "",
  "id": "new-hotel-booking-through-different-data-sources-through-lb;login-into-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters Valid gbzq4 and 1srzq4",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User logged into application",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks On Logout",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User should be logged out and driver is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinitions.User_launches_the_application()"
});
formatter.result({
  "duration": 26297974976,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gbzq4",
      "offset": 18
    },
    {
      "val": "1srzq4",
      "offset": 28
    }
  ],
  "location": "TestClass.user_enters_valid_and(String,String)"
});
formatter.result({
  "duration": 485740959,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_logged_into_application()"
});
formatter.result({
  "duration": 991273399,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_clicks_on_logout()"
});
formatter.result({
  "duration": 8320702796,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinitions.user_should_be_logged_out_and_driver_is_closed()"
});
formatter.result({
  "duration": 2358645827,
  "status": "passed"
});
});