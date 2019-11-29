$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/Smoke.feature");
formatter.feature({
  "line": 1,
  "name": "Smoke testing",
  "description": "",
  "id": "smoke-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login successfully to the website",
  "description": "",
  "id": "smoke-testing;login-successfully-to-the-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "A browser session with the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user clicks on sigin",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Login page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the user provides username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "smoke.a_browser_session_with_the_website()"
});
formatter.result({
  "duration": 3015382200,
  "status": "passed"
});
formatter.match({
  "location": "smoke.the_user_clicks_on_sigin()"
});
