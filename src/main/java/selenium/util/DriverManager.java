package selenium.util;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import static config.ConfigProperty.getProperty;


public class DriverManager {
	private static WebDriver driver = null;

	public static WebDriver getDriver(){
		if (driver == null){
			driver = createDriver();
		}
		return driver;
	}

	public static void quitDriver(){
		if (driver != null){
			driver.quit();
			driver = null;
		}
	}

	private static WebDriver createDriver() {

		switch (getProperty("browser")) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", getProperty("webdriver.chrome.driver"));
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("useAutomationExtension", false);
                options.addArguments("--disable-notifications");
				driver = new ChromeDriver(options);
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", getProperty("webdriver.gecko.driver"));
				driver = new FirefoxDriver();
				break;
			default:
				driver = new ChromeDriver();
				break;
		}
		return driver;
	}
}
