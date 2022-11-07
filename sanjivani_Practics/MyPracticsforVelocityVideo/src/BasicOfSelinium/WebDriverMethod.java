package BasicOfSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.in/");
		//String GetTitle = driver.getTitle();
		//System.out.println(GetTitle);
		System.out.println(driver.getTitle());
		
		//String CurrentUrl = driver.getCurrentUrl();
		//System.out.println(CurrentUrl);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		driver.close();
		driver.quit();
		
		
		
		

	}

}
