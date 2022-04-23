package learning;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class LearnDatePickerInIoS extends GenericWrappers {

	@Test
	public void runMethod() {
		launchIosApp("iPhone 12", "", "", "", "/apks/UiCatalog.zip");
		click(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Picker View"));
		enterValue(getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Red color component value"), "75");
		chooseNextOptionInPickerWheel(
				getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Green color component value"));
		chooseNextOptionInPickerWheel(
				getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Green color component value"));
		chooseNextOptionInPickerWheel(
				getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Green color component value"));
		choosePreviousOptionInPickerWheel(
				getWebElement(Locators.ACCESSIBILITY_ID.toString(), "Blue color component value"));

	}

}
