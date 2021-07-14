$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ActorClickOnToAdvanceSearchInEbayHomePage.feature");
formatter.feature({
  "name": "Ebay Home Page Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User clicks on to Advanced Search Link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@eBayAdvanceSearchScenarios"
    }
  ]
});
formatter.step({
  "name": "As an User I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ebay.scenario.based.steps.ActorClickOnToAdvanceSearchInEbayHomePage.as_an_User_I_am_on_Ebay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on The Advanced Search Link",
  "keyword": "When "
});
formatter.match({
  "location": "com.ebay.scenario.based.steps.ActorClickOnToAdvanceSearchInEbayHomePage.i_click_on_The_Advanced_Search_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Navigate to the Advance Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ebay.scenario.based.steps.ActorClickOnToAdvanceSearchInEbayHomePage.i_Navigate_to_the_Advance_Search_Page()"
});
formatter.result({
  "status": "passed"
});
});