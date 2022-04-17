package learning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class FirstCodeInIos {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "iOS");
		dc.setCapability("deviceName", "iPhone SE (3rd generation)");
		dc.setCapability("app", System.getProperty("user.dir")+"/apks/UiCatalog.zip");
		dc.setCapability("automationName", "XCUITest");
		dc.setCapability("noReset", true);
		AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.findElement(AppiumBy.accessibilityId("Action Sheets")).click();
		driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
		driver.quit();

	}

}
