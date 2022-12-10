package UiTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class computingPage {
	WebDriver driver;
	 public computingPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 
	 @FindBy(xpath="//*[@id=\"term-desktop\"]")
	 private WebElement search;
	 @FindBy(xpath="//*[@id=\"search-btn\"]")
	 private WebElement search1;
	 @FindBy(xpath="//*[@id=\"breadcrumb\"]/div[1]/div/h1")
	 private WebElement dell;
	 
	
	 
	 
	 
	 
	 
	
	 public WebElement search()
	 {
	 	return search;
	 }
	 public WebElement search1()
	 {
	 	return search1;
	 }
	 public WebElement dell()
	 {
	 	return dell;
	 }
}
