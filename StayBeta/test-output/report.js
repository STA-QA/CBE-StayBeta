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
formatter.result({
  "duration": 4530749659,
  "status": "passed"
});
formatter.match({
  "location": "HotelBookingDefinitions.product_should_be_deleted_from_cart()"
});
formatter.result({
  "duration": 134334454,
  "error_message": "java.lang.AssertionError: expected [(1 item)] but found [(0 item)]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat CBE.StayBeta.HotelCancelImpl.ProductDeleteVerification(HotelCancelImpl.java:58)\r\n\tat stepDefinitions.HotelBookingDefinitions.product_should_be_deleted_from_cart(HotelBookingDefinitions.java:121)\r\n\tat ✽.Then Product should be deleted from cart(src/test/java/testCaseResources/DeleteShoppingCart.feature:28)\r\n",
  "status": "failed"
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
  "duration": 2250736181,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca onclick\u003d\"return drConfirm(\u0027\u0027, \u0027Are you sure you want to logout?\u0027, event);if (!this.disabled) { focus();onfocus(); };\" id\u003d\"m_cphHeader_T_CustToolbar_cbeNav_btnLogOut\" onfocus\u003d\"GetFocus(this.id);\" href\u003d\"javascript:__doPostBack(\u0027m$cphHeader$T_CustToolbar$cbeNav$btnLogOut\u0027,\u0027\u0027)\" style\u003d\"\" tabindex\u003d\"-1\"\u003e...\u003c/a\u003e is not clickable at point (788, 146). Other element would receive the click: \u003cdiv unselectable\u003d\"on\" class\u003d\"TelerikModalOverlay\" style\u003d\"position: absolute; left: 0px; top: 0px; z-index: 3000; background-color: rgb(170, 170, 170); opacity: 0.5; width: 1263px; height: 2941px;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027UKLF3GWKC2\u0027, ip: \u002710.44.253.139\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628402 (536cd7adbad73a..., userDataDir: C:\\Users\\KIRANM~1.ADA\\AppDa...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:64019}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 73.0.3683.86, webStorageEnabled: true}\nSession ID: 9e5af697c2277a706c6e03aeb2ca6c30\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat utilities.Login.ClickOnLogout(Login.java:24)\r\n\tat stepDefinitions.LoginDefinitions.user_clicks_on_logout(LoginDefinitions.java:40)\r\n\tat ✽.Given User clicks On Logout(src/test/java/testCaseResources/DeleteShoppingCart.feature:38)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginDefinitions.user_should_be_logged_out_and_driver_is_closed()"
});
formatter.result({
  "status": "skipped"
});
});