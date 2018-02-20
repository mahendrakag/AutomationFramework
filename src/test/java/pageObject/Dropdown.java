package pageObject;

import genric.SeleniumClass;

public class Dropdown extends SeleniumClass {

	String XpathSelectBar="//select[@id='dropdown']";
	//String XpathDropdownHeading ="//div[@class='example']/h3";
	public void selectFromDropdown(String value,String type)
	{
		//super.identifyElement(locators.xpath, XpathSelectBar);
		if(type.equalsIgnoreCase("index"))
		{
		super.performAction(action.selectByindex,super.identifyElement(locators.xpath, XpathSelectBar), value);
	    }
		else if(type.equalsIgnoreCase("value"))
		{
			super.performAction(action.selectByValue,super.identifyElement(locators.xpath, XpathSelectBar), value);
		}
		else if(type.equalsIgnoreCase("visibletext"))
		{
			super.performAction(action.selectbyvisibleText,super.identifyElement(locators.xpath, XpathSelectBar), value);
		}
	}
}
