package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	 
	public static  WebDriver getBrowser(String browser) {
		
		WebDriver driver = null;
		 
		switch(browser) {
		  
		case "chrome" ->{
			 driver = new ChromeDriver();
			 }
		case "edge" -> {
			   driver =new EdgeDriver();
		   }
		   default -> throw new IllegalStateException("INVALID BROWSER" + browser);
		}
		return driver;
	}

}
