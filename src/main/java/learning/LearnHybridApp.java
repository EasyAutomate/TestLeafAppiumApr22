package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnHybridApp extends GenericWrappers {

	@Test
	public void runMethod() {
		launchAndroidApp("lokesh", "", "", "", "\\apks\\leaforg.apk");
		printContext();
		switchContext("WEBVIEW_com.testleaf.leaforg");
		enterValue(getWebElement(Locators.XPATH.toString(), "(//input)[1]"), "rajkumar@testleaf.com");
		enterValue(getWebElement(Locators.XPATH.toString(), "(//input)[2]"), "Leaf@123");
		click(getWebElement(Locators.XPATH.toString(), "//span[text()='Login']"));
		sleep(3000);
		closeApp();
	}

}
