$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 153300,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "browser is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "search.browser_is_opened()"
});
formatter.result({
  "duration": 144909200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Test google search2",
  "description": "",
  "id": "google-search;test-google-search2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User on google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "enter keyword and search",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "shows information",
  "keyword": "Then "
});
formatter.match({
  "location": "search.user_on_google_search_page()"
});
formatter.result({
  "duration": 10161434700,
  "status": "passed"
});
formatter.match({
  "location": "search.enter_keyword_and_search()"
});
formatter.result({
  "duration": 4864226200,
  "status": "passed"
});
formatter.match({
  "location": "search.shows_information()"
});
formatter.result({
  "duration": 975707500,
  "status": "passed"
});
formatter.after({
  "duration": 280500,
  "status": "passed"
});
});