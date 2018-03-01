package pageObject;

import genric.SeleniumClass;

public class MultipleWindows extends SeleniumClass {
	
	String LinkText="%s";
	public void ClickHere(String linkname)
	{
		LinkText=String.format(LinkText, linkname);
		super.performAction(action.click, super.identifyElement(locators.LinkText, LinkText), null);
	}
	public void switchWindow(String pageTitle)
	{
		super.performAction(action.switchWindow, null, pageTitle);
	}
	String xpathOfNewWindow="//h3";
	
	public String getTextFromElement()
	{
		return super.identifyElement(locators.xpath, xpathOfNewWindow).getText();
		
	}

}
