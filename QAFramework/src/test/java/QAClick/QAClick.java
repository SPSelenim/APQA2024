package QAClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QAClick {
	
	public WebDriver driver=null;
	public QAClick(WebDriver driver)
	{
		this.driver=driver;
	}

	public void QAClickHome()
	{
		try
		{
driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@name='QA']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
