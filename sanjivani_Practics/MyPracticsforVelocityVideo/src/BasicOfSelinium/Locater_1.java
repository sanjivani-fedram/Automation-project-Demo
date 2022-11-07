package BasicOfSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater_1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		// this is to check the git working
		driver.get("https://www.google.co.in/");
		driver.findElement(By.className("//a[@class='gb_d'][1]")).click();
		driver.quit();
	}
}
