package selenium.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import selenium.util.DriverManager;

import java.util.concurrent.TimeUnit;

import static config.ConfigProperty.getProperty;


public class BaseSteps {


	@Before
	public void startScenario() {
		WebDriver driver = DriverManager.getDriver();
		driver.get(getProperty("app.url"));
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}

	@After
	public void afterMethod() {
		DriverManager.quitDriver();
	}


}

