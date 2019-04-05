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
