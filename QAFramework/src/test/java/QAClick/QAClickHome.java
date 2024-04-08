package QAClick;

/*
 * echo "# APQA2024" >> README.md
 init init
 add README.md
 commit -m "first commit"
 branch -M main
 remote add origin https://github.com/SPSelenim/APQA2024.git
 push -u origin main
 push an existing repository from the command line
 remote add origin https://github.com/SPSelenim/APQA2024.git
 branch -M main
 push -u origin mai
 */
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
//Added comments
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
