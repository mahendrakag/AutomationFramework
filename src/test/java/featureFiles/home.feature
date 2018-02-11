Feature: to verify home page scenarios.
@home
Scenario: to verify hone page
Given launch "chrome" browser
Then launch url "https://the-internet.herokuapp.com/"
And verify page by "url" with "https://the-internet.herokuapp.com/"
And verify page by "title" with "The Internet1"