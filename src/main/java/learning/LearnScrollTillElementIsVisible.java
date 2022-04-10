package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnScrollTillElementIsVisible extends GenericWrappers {

	@Test
	public void runMethod() {
		launchAndroidApp("lokesh", "com.android.vending", "com.android.vending.AssetBrowserActivity", "", "");
		swipeUpinAppUntilElementIsVisible(Locators.XPATH.toString(), "//android.view.View[@text='Maps & GPS']");
		closeApp();
	}

}
