package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	public WebDriver driver=null;
	public Home(WebDriver driver)
	{
		this.driver=driver;
	}

	public void home()
	{
		try
		{
			driver.manage().window().maximize();
			driver.findElement(By.id("fname")).sendKeys("jmp 2357");
		Thread.sleep(2000);
		driver.findElement(By.id("lname")).sendKeys("HHHH");
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
