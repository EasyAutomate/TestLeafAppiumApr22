package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnHybridAppWithNativeCode extends GenericWrappers {

	@Test
	public void runMethod() {
		launchAndroidApp("lokesh", "", "", "", "\\apks\\leaforg.apk");
		enterValue(getWebElement(Locators.XPATH.toString(), "(//android.widget.EditText)[1]"), "rajkumar@testleaf.com");
		enterValue(getWebElement(Locators.XPATH.toString(), "(//android.widget.EditText)[2]"), "Leaf@123");
		click(getWebElement(Locators.XPATH.toString(), "//android.widget.Button"));
		sleep(3000);
		closeApp();
	}

}
