package BasicOfSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownHandaling {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver","/usr/bin/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.meesho.com/");
	
	driver.manage().window().maximize();
	
	WebElement Etinic = driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
	
	Actions EtinicWear = new Actions(driver);
	
	EtinicWear.moveToElement(Etinic).perform();
	
	WebElement satinsadi = driver.findElement(By.xpath("//p[text()='Satin Sarees']"));
	
	//EtinicWear.moveToElement(satinsadi).click().perform();
	
	EtinicWear.moveToElement(satinsadi).contextClick().build().perform();//context click method use right click
	Thread.sleep(2000);
	
	WebElement doundlodappp = driver.findElement(By.xpath("//span[@color='#333333'][1]"));
	
	EtinicWear.moveToElement(doundlodappp).doubleClick().build().perform();
	
	driver.quit();
	
	
	}

}
