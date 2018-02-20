package pageObject;

import genric.SeleniumClass;

public class HomePage extends SeleniumClass {
	
	String linktextHomepagelink="%s";
	public void clickHomePageLink(String linkName)
	{
		linktextHomepagelink=String.format(linktextHomepagelink, linkName);
		//super.identifyElement(locators.id, linktextHomepagelink);
		super.performAction(action.click, super.identifyElement(locators.LinkText, linktextHomepagelink),null);

	}

}
