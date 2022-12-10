package UiTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	 public HomePage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 @FindBy(xpath="//*[@id=\"homepage\"]/div[4]/div[2]/div/amp-carousel/div/div[1]/div[1]/div/a[1]/h3")
	 private WebElement computing;
	@FindBy(xpath="//*[@id=\"homepage\"]/div[5]/div[4]/div/amp-carousel/div/div[1]/div[2]/div/a[1]/h3")
	private WebElement dressing;
	@FindBy(xpath="//*[@id=\"term-desktop\"]")
	 private WebElement search;
	 @FindBy(xpath="//*[@id=\"search-btn\"]")
	private WebElement search1;
	 @FindBy(xpath="//*[@id=\"breadcrumb\"]/div[1]/div/h1")
	 private WebElement iphone14;
	@FindBy(xpath="//*[@id=\"pc0\"]/a/div/div[1]/div[1]/div[2]/h3") 
	 private WebElement iphone141;
	 
	 
	 
	 
	 public WebElement iphone14()
	 {
	 	return iphone14;
	 }
	 public WebElement iphone141()
	 {
	 	return iphone141;
	 }
	 public WebElement computing()
	 {
	 	return computing;
	 }
	 public WebElement dressing()
	 {
	 	return dressing;
	 }
	 public WebElement search()
	 {
	 	return search;
	 }
	 public WebElement search1()
	 {
	 	return search1;
	 }
}
