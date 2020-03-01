package allTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import allPages.HomePage;
import allPages.TodaysDeal;

public class BaseTest {
	private static BaseTest instance;
	WebDriver driver;
	HomePage home;
	TodaysDeal deal;
	
	private BaseTest() {
		
	}
	
	public static BaseTest getInstance() {
		if (instance == null) 
			instance = new BaseTest();
	return instance;
		
	}
	
	public void browserSetUp(String browserValue) {
		if (browserValue.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Arif\\eclipse project\\ProjectMaven\\Browser\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserValue.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Arif\\eclipse project\\ProjectMaven\\Browser\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();	
	}
	
	public HomePage getHomePage() {
		if (home == null)
			home = new HomePage(driver);
		return home;
			
		
	}
	
	public TodaysDeal geTodaysDeal() {
		if (deal == null) 
			deal = new TodaysDeal(driver);
		return deal;
		
	}
	
	public void close() {
		if (driver != null) 
			driver.close();
		
	}

}
