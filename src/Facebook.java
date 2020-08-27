

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	
public void launchbrowser() {
	// Initialize browser	
System.setProperty("webdriver.chrome.driver", "../FirstTest/src/Drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	System.out.println("Chrome lanched");
		
	}
public void Openfacebook() {
		
	// Open facebook
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.facebook.com");
	System.out.println("Facebook opened");
	
		
	}

public void Closefacebook() {
	
	// Open facebook
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.facebook.com");
	System.out.println("Facebook opened");
		
	}

}
