package Hooks;
import SeleniumDriver.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class HooksSteps {

	@Before
	public void Before() {
		//Driver Initialization
		DriverManager.initializeChromeDriver();
	}
	@After
	public void After() {
		//Driver Initialization
		DriverManager.closeChromeDriver();
	}
}
