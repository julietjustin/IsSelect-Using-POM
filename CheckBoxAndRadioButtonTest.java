package com.obsqura.assignmentwithpom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.CheckboxandRadiobuttonsPages;

public class CheckBoxAndRadioButtonTest extends BaseIsSelected {
	CheckboxandRadiobuttonsPages CheckboxandRadiobuttonsPagesobj;
	@Test
	public void clickCheckBoxAbdRadioButton() {
		CheckboxandRadiobuttonsPagesobj=new CheckboxandRadiobuttonsPages(driver);
		CheckboxandRadiobuttonsPagesobj.verifyCheckBoxAndRadioButton();
		
	}
	

}
