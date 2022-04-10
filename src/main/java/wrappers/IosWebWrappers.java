package wrappers;

public class IosWebWrappers extends IosNativeWrappers {

	public boolean launchSafariBrowser(String deviceName, String URL, String udid) {
		return launchBrowser("iOS", "Safari", deviceName, URL, udid, "", "", "", "");
	}

	public boolean launchSafariBrowserInParallel(String deviceName, String URL, String udid, String wdaLocalPort,
			String webkitDebugProxyPort) {
		return launchBrowser("iOS", "Safari", deviceName, URL, udid, "", wdaLocalPort, "", webkitDebugProxyPort);
	}

	public boolean deleteSafariCookies() {
		switchToAnotherApp("com.apple.Preferences");
		stopRunningApp("com.apple.Preferences");
		switchToAnotherApp("com.apple.Preferences");
		switchNativeview();
		swipeDownInApp();
		enterValue(getWebElement(Locators.XPATH.toString(), "//*[@label='Search']"), "Safari");
		try {
			click(getWebElement(Locators.XPATH.toString(), "//XCUIElementTypeCell[2]//*[@name='Safari']"));
		} catch (Exception e) {
			click(getWebElement(Locators.XPATH.toString(), "//*[@label='Safari']"));
		}
		sleep(1000);
		swipeUpinAppUntilElementIsVisible(Locators.XPATH.toString(),
				"//*[@value='Clear History and Website Data' and @visible='true']");
		click(getWebElement(Locators.XPATH.toString(),
				"//*[@value='Clear History and Website Data' and @visible='true']"));
		click(getWebElement(Locators.XPATH.toString(), "//*[@label='Clear' or @label='Clear History and Data']"));
		stopRunningApp("com.apple.Preferences");
		switchToAnotherApp("com.apple.mobilesafari");
		switchWebview();
		return true;
	}
}
