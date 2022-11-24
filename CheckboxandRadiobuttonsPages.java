package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckboxandRadiobuttonsPages {
	public WebDriver driver;
	By redCheckBox=By.xpath("//input[@value='red']");
	By operaRadioButton=By.xpath("//input[@value='Opera']");
	public CheckboxandRadiobuttonsPages(WebDriver driver) {
		this.driver=driver;
	}
	public void verifyCheckBoxAndRadioButton() {
		boolean flag=false;
			boolean red=driver.findElement(redCheckBox).isEnabled();
				if(red==true) {
					flag=true;
				}
				Assert.assertTrue(true, "Red CheckBox Is Not Enabled");
			boolean redSelected=driver.findElement(redCheckBox).isSelected();
				if(redSelected==false) {
					flag=true;
				}
				Assert.assertTrue(true, "Red CheckBox Is Selected");
			boolean operaSelect=driver.findElement(operaRadioButton).isSelected();
		     	if(operaSelect==false) {
		     		flag=true;
		     	}
		     	Assert.assertTrue(true, "Opera Is Selected");
		
			
	}

}
