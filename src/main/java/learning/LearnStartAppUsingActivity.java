package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnStartAppUsingActivity extends GenericWrappers {

	@Test
	public void runMethod() {
		launchAndroidApp("lokesh", "com.android.vending", "com.android.vending.AssetBrowserActivity", "", "");
		startAnAppUsingActivity("com.vodqareactnative", "com.vodqareactnative.MainActivity");
		click(getWebElement(Locators.XPATH.toString(), "//*[@text='LOG IN']"));
		switchToAnotherApp("com.android.vending");
		swipeUpInApp();
		closeApp();
	}

}
