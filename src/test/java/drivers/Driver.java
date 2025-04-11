package drivers;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.ConfigLoader;

public final class Driver {
	
	
	private Driver() {}
	
	public static void initDriver(String browser) {
		
		if(Objects.isNull(DriverManager.getDriver())) {
			
			WebDriver driver = DriverFactory.getBrowser(browser);
			DriverManager.setDriver(driver);
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().get(ConfigLoader.getInstance().getBaseUrl());
		
		}
		
	}
	
	public static void closeDriver() {
		
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
