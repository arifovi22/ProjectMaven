package allPages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Generic {
	
	String todaysDeal ="//a[contains(text(),'Deals')]";
	
	
	
	

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void getUrl() {
		url("https://www.amazon.com/");
	}
	
	public void clickTodaysDeal() {
		clickElement(todaysDeal);
	}
	

}
