package drivers;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
	
	private DriverManager() {}

	private static ThreadLocal<WebDriver> drf = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return drf.get();
	}

	public static void setDriver(WebDriver dref) {
		if (Objects.nonNull(drf)) {
			drf.set(dref);
		}
	}

	public static void unload() {

		drf.remove();
	}

}
