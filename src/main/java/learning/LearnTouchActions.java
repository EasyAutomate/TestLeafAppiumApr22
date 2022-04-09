package learning;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
//import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MultiTouchAction;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.touch.WaitOptions;
//import io.appium.java_client.touch.offset.PointOption;

public class LearnTouchActions {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "Lokesh device");
		dc.setCapability("app", System.getProperty("user.dir") + "/apks/MultiTouch Tester_v1.2.apk");
		dc.setCapability("noReset", true);
		AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		int maxY = driver.manage().window().getSize().getHeight();
		int maxX = driver.manage().window().getSize().getWidth();
		//Below code will not work for Appium version 8.X.Y and above
		//Downgrade appium version to 7.X.Y for below methods (TouchActions and MultiTouchAction) to work
		/*
		// Swipe up
		new TouchAction<>(driver).press(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.8)))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
				.moveTo(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.2))).release().perform();
		// Swipe down
		new TouchAction<>(driver).press(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.2)))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
				.moveTo(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.8))).release().perform();
		// Swipe left
		new TouchAction<>(driver).press(PointOption.point((int) (maxX * 0.8), (int) (maxY * 0.5)))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
				.moveTo(PointOption.point((int) (maxX * 0.2), (int) (maxY * 0.5))).release().perform();
		// Swipe Right
		new TouchAction<>(driver).press(PointOption.point((int) (maxX * 0.2), (int) (maxY * 0.5)))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
				.moveTo(PointOption.point((int) (maxX * 0.8), (int) (maxY * 0.5))).release().perform();
		//Multitouch
		new MultiTouchAction(driver)
				.add(new TouchAction<>(driver).press(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.8)))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
						.moveTo(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.2))).release())
				.add(new TouchAction<>(driver).press(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.2)))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
						.moveTo(PointOption.point((int) (maxX * 0.5), (int) (maxY * 0.8))).release())
				.perform();			
		*/		
		//Pointer Input
		//Pinch
		PointerInput input = new PointerInput(Kind.TOUCH, "finger1");
		Sequence finger1 = new Sequence(input, 1);
		finger1.addAction(input.createPointerMove(Duration.ofMillis(0), Origin.viewport(), (int) (maxX * 0.25), (int) (maxY * 0.25)));
		finger1.addAction(input.createPointerDown(MouseButton.LEFT.asArg()));
		finger1.addAction(input.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), (int) (maxX * 0.5), (int) (maxY * 0.5)));
		finger1.addAction(input.createPointerUp(MouseButton.LEFT.asArg()));
		PointerInput input2 = new PointerInput(Kind.TOUCH, "finger2");
		Sequence finger2 = new Sequence(input2, 1);
		finger2.addAction(input2.createPointerMove(Duration.ofMillis(0), Origin.viewport(), (int) (maxX * 0.75), (int) (maxY * 0.75)));
		finger2.addAction(input2.createPointerDown(MouseButton.LEFT.asArg()));
		finger2.addAction(input2.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), (int) (maxX * 0.5), (int) (maxY * 0.5)));
		finger2.addAction(input2.createPointerUp(MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(finger1,finger2));
		//Swipe up 
		PointerInput input3 = new PointerInput(Kind.TOUCH, "finger1");
		Sequence swipeUp1 = new Sequence(input3, 1);
		swipeUp1.addAction(input3.createPointerMove(Duration.ofMillis(0), Origin.viewport(), (int) (maxX * 0.5), (int) (maxY * 0.8)));
		swipeUp1.addAction(input3.createPointerDown(MouseButton.LEFT.asArg()));
		swipeUp1.addAction(input3.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), (int) (maxX * 0.5), (int) (maxY * 0.2)));
		swipeUp1.addAction(input3.createPointerUp(MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(swipeUp1));

	}
}
