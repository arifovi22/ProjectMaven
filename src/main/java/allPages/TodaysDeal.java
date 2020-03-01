package allPages;

import org.openqa.selenium.WebDriver;

public class TodaysDeal extends Generic {
	String validatetodaysDeal = "//div[contains(text(),'Deals')]";
	

	public TodaysDeal(WebDriver driver) {
		super(driver);
		
	}
	
	public String validateDeal() {
	return getText(validatetodaysDeal);
		
	}

}
