Feature: to verify dropdown page scenarios.
@dropdown
Scenario: to verify dropdown page
Given launch "chrome" browser
Then launch url "https://the-internet.herokuapp.com/"
And verify page by "url" with "https://the-internet.herokuapp.com/"
And verify page by "title" with "The Internet"
Then click on homepage link "Dropdown" 
And verify page by "url" with "https://the-internet.herokuapp.com/dropdown"
Then select value form dropdown "2" by "index"
Then select value form dropdown "1" by "value"
Then select value form dropdown "Option 1" by "visibletext"
