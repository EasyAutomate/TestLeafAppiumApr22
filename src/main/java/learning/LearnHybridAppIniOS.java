package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnHybridAppIniOS extends GenericWrappers {

	@Test
	public void runMethod() {
		launchIosApp("iPhone 12", "", "", "", "/apks/UiCatalog.zip");
		swipeUpinAppUntilElementIsVisible(Locators.ACCESSIBILITY_ID.toString(), "Web View");
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Web View"));
		sleep(10000);
		printContext();
		switchWebview();
		click(getWebElement(Locators.ID.toString(), "ac-gn-menuanchor-open"));
		click(getWebElement(Locators.XPATH.toString(), "(//*[text()='AirPods'])[1]/.."));
		driver.quit();

	}

}
