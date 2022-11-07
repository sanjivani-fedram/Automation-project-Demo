package BasicOfSelinium;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod_2 {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Dimension d = new Dimension();
	
		//driver.manage().window().maximize();
		
	
	}

}
