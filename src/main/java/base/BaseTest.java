package base;
 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import utils.Log;
 
public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod

	public void setup() {

		Log.info("Starting WebDriver....!");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		Log.info("Navigetting ot Web URL....!");
		driver.get("https://admin-demo.nopcommerce.com/login");

	}

	@AfterMethod	

	public void teadDown() {

		if(driver != null) {

//			driver.quit();

		}

	}
 
}

 