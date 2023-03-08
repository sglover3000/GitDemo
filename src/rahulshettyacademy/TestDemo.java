package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {
	String username = "siron_AOveyK";
	String accessKey = "1Wxze1uEcLRZrT4kQgxC";
	
	
	@Test
	public void titleCheck() throws MalformedURLException {
	
		
	MutableCapabilities caps = new MutableCapabilities();	
	WebDriver driver = new RemoteWebDriver(new URL ("https:\\" + username + ":" + accessKey + "@" + "hub.browserstack.com" + "\\wd\\hub"),caps);
	
	driver.get("https://rahulshettyacademy.com");
	Assert.assertTrue(driver.getTitle().matches("Selenium, API Testing, Software Testing & More QA Tutorials  | Rahul Shetty Academy"));
	//driver.findElement(By.id(accessKey)).click();
	
	driver.get("https://rahulshettyacademy.com");
	Assert.assertTrue(driver.getTitle().matches("Selenium, API Testing, Software Testing & More QA Tutorials  | Rahul Shetty Academy"));
	//driver.findElement(By.id(accessKey)).click();
	
	}
}
