package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnNotificationsAndroid extends GenericWrappers {

	@Test
	public void runMethod() {
		launchAndroidApp("lokesh", "com.android.vending", "com.android.vending.AssetBrowserActivity", "", "");
		showNotificationMenu();
		sleep(3000);
		hideNotificationMenu();
		closeApp();
	}

}
