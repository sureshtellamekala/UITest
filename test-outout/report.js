$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Search",
  "description": "",
  "id": "amazon-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Amazon search for Book and assert cost scenario",
  "description": "",
  "id": "amazon-search;amazon-search-for-book-and-assert-cost-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Read the URL and navigate",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify title of Main page is \"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs \u0026 more\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Search for the text \"qa testing for beginners\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify search results available",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Store price of \"1\" search option and click",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify price on Product page is same as Search page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click AddToCard and validate price in cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "MainPageSteps.getUrlandNavigate()"
});
formatter.result({
  "duration": 5089143500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs \u0026 more",
      "offset": 30
    }
  ],
  "location": "MainPageSteps.verifyMainpageTitle(String)"
});
formatter.result({
  "duration": 9004700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qa testing for beginners",
      "offset": 21
    }
  ],
  "location": "MainPageSteps.searchForText(String)"
});
formatter.result({
  "duration": 1919469400,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.verifyRecordsAvailable()"
});
formatter.result({
  "duration": 2136026200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 16
    }
  ],
  "location": "SearchPageSteps.storePriceandClick(int)"
});
formatter.result({
  "duration": 4111064400,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsSteps.verifyRecordsAvailable()"
});
formatter.result({
  "duration": 218499100,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsSteps.addTocartAndValidatePrice()"
});
formatter.result({
  "duration": 2404728500,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailsSteps.closeBrowser()"
});
formatter.result({
  "duration": 997838300,
  "status": "passed"
});
});