package UiTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clothingPage {
	WebDriver driver;
	 public clothingPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 @FindBy(xpath="//*[@id=\"sort-option\"]/div/a[3]")
	 private WebElement price;
	@FindBy(xpath="//*[@id=\"pc0\"]/a/div/div[1]/div/div[3]/div")
	private WebElement cost;
	 
	 
	 
	 
	 
	 
	 public WebElement price()
	 {
	 	return price;
	 }
	 public WebElement cost()
	 {
	 	return cost;
	 }
	
	
}
