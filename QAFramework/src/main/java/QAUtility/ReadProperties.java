package QAUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {

	public File data=null;
	public File objects=null;
	
	public FileInputStream fisdata=null;
	public FileInputStream fisObjects=null;
	public Properties datap=null;
	public Properties dataO=null;
	
	public  ReadProperties()
	{
		
		try
		{
			data=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\stc\\QAFramework\\Data\\QAData.properties");
			objects=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\stc\\QAFramework\\Data\\QALocators.properties");
		
			fisdata=new FileInputStream(data);
			fisObjects=new FileInputStream(objects);
			
	 datap=new Properties();
	 datap.load(fisdata);
	dataO=new Properties();
	dataO.load(fisObjects);
	
			
	System.out.println("UserName +++++"+datap.getProperty("username"));;
	System.out.println("ID Value is +++++"+dataO.getProperty("id"));;
	
	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
