package Assessment;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import UiTest.HomePage;
import UiTest.clothingPage;
import UiTest.computingPage;
import resc.Base;

public class AllScenario extends Base {
	public static Logger log = LogManager.getLogger(AllScenario.class);
	
	@Test(description = " Users are able to filter for an item by brand under the Computing > Laptop section")
	public void Test_1() throws IOException, InterruptedException {

   		driver.get("https://iprice.my/");
   		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,750)", "");
        HomePage hp=new HomePage(driver);
        hp.computing().click();
        computingPage cp= new computingPage(driver); 
        cp.search().sendKeys("Dell");
        cp.search1().click();
       String Del= cp.dell().getText();
       assertEquals(Del, "Dell");
        
        
		
	}
	@Test(description = "Users are able to sort results under dresses by price in descending order")
	public void Test_2() throws IOException, InterruptedException {

   		driver.get("https://iprice.my/");
   		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1250)", "");
        HomePage hp=new HomePage(driver);
        hp.dressing().click();
        clothingPage cp1= new clothingPage(driver); 
        for (int i = 0; i <=1 ; i++) {
        	 cp1.price().click();
        }
       String cost= cp1.cost().getText();
       assertEquals(cost, "RM 999,999,999.00");
        	
	}
	@Test(description = "Users are able to search for an item")
	public void Test_3() throws IOException, InterruptedException {

		driver.get("https://iprice.my/");
   		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,750)", "");
        HomePage hp=new HomePage(driver);
        hp.search().sendKeys("iPhone 14");
        hp.search1().click();
       String phone= hp.iphone14().getText();
       assertEquals(phone, "iPhone 14");
       String phone1= hp.iphone141().getText();
       assertEquals(phone1, "Apple iPhone 14");
        
        	
	}
	
}