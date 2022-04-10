package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnMobileWeb extends GenericWrappers {

	@Test
	public void runMethod() {
		launchChromeBrowser("lokesh", "https://www.google.com");
		enterValue(getWebElement(Locators.NAME.toString(), "q"), "Lokesh");
		pressEnter();
	}

}
