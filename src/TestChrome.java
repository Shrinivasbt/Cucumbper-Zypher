import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestChrome  {
 
	@Test
	public void Fbook() {
	// launch facebook
	// Initialize browser	
	System.setProperty("webdriver.chrome.driver", "../FirstTest/src/Drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	System.out.println("Chrome lanched");	
			
		// Open facebook
		driver.get("http://www.facebook.com");
		System.out.println("Facebook opened");
		
		// close facebook
		driver.close();
		System.out.println("Facebook closed");
		
		
			System.out.println("TestNG test");
				
				
		}
	
	@Test (priority =3)
	public void Fbook1() {
	
			System.out.println("Fbook1");	
		}
	
	@Test (priority =1)
	public void Fbook2() {
	
			System.out.println("Fbook2");	
		}
	
	@Test (priority =2)
	public void Fbook3() {
	
			System.out.println("Fbook3");	
		}
	
	
	
}


	 
	
	

 
