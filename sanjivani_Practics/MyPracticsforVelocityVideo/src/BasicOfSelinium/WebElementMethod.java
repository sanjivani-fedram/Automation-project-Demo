package BasicOfSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement sendKeyMethod = driver.findElement(By.xpath("//input[@type='text']"));
		
		sendKeyMethod.sendKeys("kids toys"+Keys.ENTER);
		
		//sendKeyMethod.clear();
		
		/*
		 * String text = sendKeyMethod.getText();
		 * 
		 * System.out.println(text);
		 */
		 boolean isEmableMethod = driver.findElement(By.xpath("//img[@class='_bGlmZ_img_1R5u3']")).isEnabled();
		 
		 System.out.println(isEmableMethod);
		 if(isEmableMethod==true) {
			 System.out.println("Element is enable");
		 }else {
			 System.out.println("Element is not enable");
		 }
		 
		 boolean IsDisplayMethod = driver.findElement(By.xpath("//span[@class='a-truncate-cut'][1]")).isDisplayed();
		 if(IsDisplayMethod==true) {
			 System.out.println("is display");
		 }else {
			 System.out.println("is not display");
		 }
		 
		 boolean isSlectedMethod = driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']")).isSelected();
		 if(isSlectedMethod ==true) {
			 System.out.println("Element is selected");
		 }else {
			 System.out.println("Element is not selected");
		 }
		driver.quit();
	
	}
}
