Feature: to verify FormAuth page scenarios.
@loginSucess @login
Scenario: to verify Login with Correct details
Given launch "chrome" browser
Then launch url "https://the-internet.herokuapp.com/"
And verify page by "url" with "https://the-internet.herokuapp.com/"
And verify page by "title" with "The Internet"
Then click on homepage link "Form Authentication" 
And verify page by "url" with "https://the-internet.herokuapp.com/login"
Then enter the username "tomsmith" in username field
And enter the password "SuperSecretPassword!" in password field
Then click on Login button "Login"
And verify page by "url" with "https://the-internet.herokuapp.com/secure"

@loginfail1 @login
Scenario: to verify login page with incorrect details.
Given launch "chrome" browser
Then launch url "https://the-internet.herokuapp.com/"
And  verify page by "url" with "https://the-internet.herokuapp.com/"
And  verify page by "title" with "The Internet"
Then click on homepage link "Form Authentication" 
And  verify page by "url" with "https://the-internet.herokuapp.com/login"
Then enter the username "tomsmith11" in username field
And  enter the password "SuperSecretPassword!" in password field
Then click on Login button "Login"

@loginfail2 @login
Scenario: to verify login page with incorrect details.
Given launch "chrome" browser
Then launch url "https://the-internet.herokuapp.com/"
And  verify page by "url" with "https://the-internet.herokuapp.com/"
And  verify page by "title" with "The Internet"
Then click on homepage link "Form Authentication" 
And  verify page by "url" with "https://the-internet.herokuapp.com/login"
Then enter the username "tomsmith" in username field
And  enter the password "SuperSecretPassword!11" in password field
Then click on Login button "Login"

@loginfail3 @login
Scenario: to verify login page with incorrect details.
Given launch "chrome" browser
Then launch url "https://the-internet.herokuapp.com/"
And  verify page by "url" with "https://the-internet.herokuapp.com/"
And  verify page by "title" with "The Internet"
Then click on homepage link "Form Authentication" 
And  verify page by "url" with "https://the-internet.herokuapp.com/login"
Then enter the username "tomsmith11" in username field
And  enter the password "SuperSecretPassword!11" in password field
Then click on Login button "Login"
