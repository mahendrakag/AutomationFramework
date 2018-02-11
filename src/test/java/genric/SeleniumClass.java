package genric;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class SeleniumClass extends BaseClass {

		public WebDriver driver;
		public void launchBrowser(String browserName)
		{
			String path=super.getAndConcatCurrentPath("\\src\\test\\java\\Drivers\\");
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",path+"chromedriver.exe");
				driver =new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",path+"geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver",path+"IEDriverServer.exe");
				driver =new InternetExplorerDriver();
				
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
		public void lanuchUrl(String url)
		{
			driver.get(url);
		}
		public String getPageDetails(String type)
		{
			String actual =null;
			if(type.equalsIgnoreCase("title"))
			{
				actual =driver.getTitle();
			}
			else if(type.equalsIgnoreCase("url"))
			{
				actual =driver.getCurrentUrl();
			}
			else if(type.equalsIgnoreCase("handle"))
			{
				actual =driver.getWindowHandle();
			}
			else if(type.equalsIgnoreCase("source"))
			{
				actual =driver.getPageSource();
			}
			return actual;
		}
		public void closeBrowser()
		{
			driver.close();
		}
		public void TakeScreenshot(String name)
		{
			//long ctime= System.currentTimeMillis();
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dstfile =new File(super.getAndConcatCurrentPath("\\src\\test\\java\\Screenshots\\"+name+".png"));
		try {
			FileUtils.copyFile(file, dstfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
}
