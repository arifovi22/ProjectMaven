package allTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;


public class HomepageTest {
	BaseTest instance;
	
	@Parameters({"driverValue"})
	@Test
	public void testDeals(String driverValue) {
		instance = BaseTest.getInstance();
		instance.browserSetUp(driverValue);
		instance.getHomePage().getUrl();
		instance.getHomePage().clickTodaysDeal();
		String deal =instance.geTodaysDeal().validateDeal();
		System.out.println(deal);
		AssertJUnit.assertEquals(deal, "Today's Deals");
		instance.close();
	}

}
