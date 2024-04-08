package QAClick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import QAUtility.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;

public class QAClickHome {
	public WebDriver driver=null;
	
	@BeforeClass
	public void beforeClassTest()
	{
		try
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			//driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
			ReadProperties rp=new ReadProperties();
			driver.get(rp.datap.getProperty("URL"));
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@Test
  public void f() {
	  
	  QAClick qa=new QAClick(driver);
	  qa.QAClickHome();
  }

	@AfterClass
	public void afterClassTest()
	{
		driver.quit();
	}

}
