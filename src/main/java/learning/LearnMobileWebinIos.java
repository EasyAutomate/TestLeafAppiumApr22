package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnMobileWebinIos extends GenericWrappers {

	@Test
	public void runMethod() {
		launchSafariBrowser("lokesh", "https://www.google.com", "FF1CFEBA-53E3-4011-B959-64D22136C5B8");
		// if(!isKeyboardShown())
		click(getWebElement(Locators.XPATH.toString(), "(//*[@name='q'])[last()]"));
		enterValue(getWebElement(Locators.NAME.toString(), "q"), "Lokesh");
		switchNativeview();
		// System.out.println(driver.getPageSource());
		// click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Search"));
		click(getWebElement(Locators.XPATH.toString(), "//XCUIElementTypeKeyboard//XCUIElementTypeButton[2]"));

		switchWebview();
		sleep(5000);
		closeApp();
	}

}
