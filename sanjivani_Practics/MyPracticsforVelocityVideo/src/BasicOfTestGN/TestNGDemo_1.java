package BasicOfTestGN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo_1 {
	@Test
	public void TC1() {
	System.setProperty("Webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//a[@class='gb_A']")).click();
		
		
		driver.quit();

		
	}
	
	@Test
	public void TC2() {
		System.out.println("hi,i am sanjivani ");
	}

}
