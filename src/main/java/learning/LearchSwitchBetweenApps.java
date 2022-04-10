package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearchSwitchBetweenApps extends GenericWrappers {

	@Test
	public void runMethod() {
		launchAndroidApp("lokesh", "com.android.vending", "com.android.vending.AssetBrowserActivity", "", "");
		swipeUpInApp();
		stopRunningApp("com.vodqareactnative");
		switchToAnotherApp("com.vodqareactnative");
		click(getWebElement(Locators.XPATH.toString(), "//*[@text='LOG IN']"));
		switchToAnotherApp("com.android.vending");
		swipeUpInApp();
		closeApp();
	}

}
