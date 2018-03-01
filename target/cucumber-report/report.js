$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MultipleWindows.feature");
formatter.feature({
  "line": 1,
  "name": "to verify Multiple windows page scenarios.",
  "description": "",
  "id": "to-verify-multiple-windows-page-scenarios.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "to verify multiple windows",
  "description": "",
  "id": "to-verify-multiple-windows-page-scenarios.;to-verify-multiple-windows",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@nwp"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "launch \"chrome\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "launch url \"https://the-internet.herokuapp.com/\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "verify page by \"url\" with \"https://the-internet.herokuapp.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "verify page by \"title\" with \"The Internet\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on homepage link \"Multiple Windows\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify page by \"url\" with \"https://the-internet.herokuapp.com/windows\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on \"Click Here\" link",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "switch to another window with title as \"New Window\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify text as \"New Window\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "switch to another window with title as \"The Internet\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "verify page by \"url\" with \"https://the-internet.herokuapp.com/windows\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 8
    }
  ],
  "location": "HomeStepDef.launch_browser(String)"
});
formatter.result({
  "duration": 9912326439,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://the-internet.herokuapp.com/",
      "offset": 12
    }
  ],
  "location": "HomeStepDef.launch_url(String)"
});
formatter.result({
  "duration": 5997092104,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 16
    },
    {
      "val": "https://the-internet.herokuapp.com/",
      "offset": 27
    }
  ],
  "location": "HomeStepDef.verify_page_by_with(String,String)"
});
formatter.result({
  "duration": 36662912,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "title",
      "offset": 16
    },
    {
      "val": "The Internet",
      "offset": 29
    }
  ],
  "location": "HomeStepDef.verify_page_by_with(String,String)"
});
formatter.result({
  "duration": 14379461,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Multiple Windows",
      "offset": 24
    }
  ],
  "location": "HomeStepDef.click_on_homepage_link(String)"
});
formatter.result({
  "duration": 648695529,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 16
    },
    {
      "val": "https://the-internet.herokuapp.com/windows",
      "offset": 27
    }
  ],
  "location": "HomeStepDef.verify_page_by_with(String,String)"
});
formatter.result({
  "duration": 8382188,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Click Here",
      "offset": 10
    }
  ],
  "location": "MultipleWindowsStepDef.click_on_link(String)"
});
formatter.result({
  "duration": 132607626,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Window",
      "offset": 40
    }
  ],
  "location": "MultipleWindowsStepDef.switch_to_another_window_with_title_as(String)"
});
formatter.result({
  "duration": 1059758598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Window",
      "offset": 16
    }
  ],
  "location": "MultipleWindowsStepDef.verify_text_as(String)"
});
formatter.result({
  "duration": 40754868,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The Internet",
      "offset": 40
    }
  ],
  "location": "MultipleWindowsStepDef.switch_to_another_window_with_title_as(String)"
});
formatter.result({
  "duration": 37958007,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 16
    },
    {
      "val": "https://the-internet.herokuapp.com/windows",
      "offset": 27
    }
  ],
  "location": "HomeStepDef.verify_page_by_with(String,String)"
});
formatter.result({
  "duration": 9575110,
  "status": "passed"
});
formatter.after({
  "duration": 349927734,
  "status": "passed"
});
});