$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CaseStudy1.feature");
formatter.feature({
  "name": "Case Study-1 tests",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "homepage is open",
  "keyword": "Given "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.homepageIsOpen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the pop up",
  "keyword": "And "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.iCloseThePopUp()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Task-1 search result test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Verify page title \"Best Buy | Official Online Store | Shop Now \u0026 Save\"",
  "keyword": "When "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.verifyPageTitle(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"Drone\"",
  "keyword": "When "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.iSearchFor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search result should be seen",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.searchResultShouldBeSeen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "homepage is open",
  "keyword": "Given "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.homepageIsOpen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the pop up",
  "keyword": "And "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.iCloseThePopUp()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Task-2 Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I open \"Account\" dropdown menu",
  "keyword": "And "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.iOpenDropdownMenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose \"Account\" submenu",
  "keyword": "And "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.iChooseSubmenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify page title \"Sign In to Best Buy\"",
  "keyword": "When "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.verifyPageTitle(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login with credentials",
  "keyword": "And "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.loginWithCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy1.step_def.MyStepdefs.verifySuccessLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});