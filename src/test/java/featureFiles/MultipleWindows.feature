Feature: to verify Multiple windows page scenarios.
@nwp
Scenario: to verify multiple windows
Given launch "chrome" browser
Then launch url "https://the-internet.herokuapp.com/"
And verify page by "url" with "https://the-internet.herokuapp.com/"
And verify page by "title" with "The Internet"
Then click on homepage link "Multiple Windows" 
And verify page by "url" with "https://the-internet.herokuapp.com/windows"
Then click on "Click Here" link
Then switch to another window with title as "New Window"
And verify text as "New Window"
Then switch to another window with title as "The Internet"
And verify page by "url" with "https://the-internet.herokuapp.com/windows"