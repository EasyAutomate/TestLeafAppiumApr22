package learning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class FirstCodeInIosUsingSauceLabs {

	public static void main(String[] args) throws MalformedURLException {
		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName", "iOS");
		caps.setCapability("appium:app", "storage:filename=UICatalog.zip");
		caps.setCapability("appium:deviceName", "iPhone XS Simulator");
		caps.setCapability("appium:platformVersion", "15.4");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("appiumVersion", "1.22.3");
		caps.setCapability("sauce:options", sauceOptions);
		AppiumDriver driver = new AppiumDriver(new URL(
				"https://appiumapr2022:227c1f34-7dfc-4772-a011-99c172acd73a@ondemand.us-west-1.saucelabs.com:443/wd/hub"),
				caps);
		driver.findElement(AppiumBy.accessibilityId("Action Sheets")).click();
		driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
		driver.quit();

	}

}
