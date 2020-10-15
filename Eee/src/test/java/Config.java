import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Config extends SetUp {

	@BeforeTest
	public void beforeTest() {
		SetUp.setUpbeforeTest();
		driver.get("https://www.google.com/");	
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
