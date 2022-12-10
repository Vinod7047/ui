package resc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;





public class Base

{
	
 public  WebDriver driver;
 public Properties prop;
	@BeforeClass
public  WebDriver initializeDriver() throws IOException 
{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\welcome\\git\\UI\\src\\main\\java\\resc\\proprerties.data");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	if(browserName.equals("Chrome"))
			{
 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe"); 
 driver =new ChromeDriver();
	        }
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	return driver;
	
}
	public  String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException 
	{
	
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}


@AfterTest
public void closeApplication()
{
 driver.quit();

}

}	
	

