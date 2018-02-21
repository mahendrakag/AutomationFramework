package pageObject;

import genric.SeleniumClass;

public class FormAuthentication extends SeleniumClass{

	String Username="%s";
	String XapthUser="//input[@id='username']";
	String XpathPassword= "//input[@id='password']";
	public void EnterUserName(String linkname)
	{
		Username=String.format(Username, linkname);
		super.performAction(action.sendkeys, super.identifyElement(locators.xpath, XapthUser), Username);
	}
	String UserPassword="%s";
	public void EnterPassword(String linkname)
	{
		UserPassword=String.format(UserPassword, linkname);
		super.performAction(action.sendkeys, super.identifyElement(locators.xpath, XpathPassword), UserPassword);
	}
	
	String linktextloginbutton="//button[@type='submit']";
	public void clickonLogin(String linkName)
	{
		
		super.performAction(action.click, super.identifyElement(locators.xpath, linktextloginbutton),null);

	}
	

}
