package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnDataMethodsInAndroid extends GenericWrappers {

	@Test
	public void runMethod() {
		launchAndroidApp("lokesh", "com.android.vending", "com.android.vending.AssetBrowserActivity", "", "");
		dataOffInAndroid();
		sleep(3000);
		dataOnInAndroid();
		closeApp();
	}

}
