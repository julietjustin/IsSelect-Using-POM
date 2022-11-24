package com.obsqura.assignmentwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseIsSelected {
	WebDriver driver;
	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\ProjectWithPom\\src\\main\\java\\Resourse\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
}
