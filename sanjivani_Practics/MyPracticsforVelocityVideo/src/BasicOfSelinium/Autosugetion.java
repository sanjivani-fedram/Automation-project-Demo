package BasicOfSelinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugetion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String expectedResult = "Redmi Note 10";
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("readmi");
		Thread.sleep(2000);
		List<WebElement> alloption = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		Thread.sleep(2000);
		
		for(WebElement opsion:alloption) {
			String Actualresult =  opsion.getText();
			
			if(Actualresult .equals(expectedResult)) {
				System.out.println(expectedResult);
				opsion.click();
				break;
				
			}
			
			
		}
		
		driver.quit();

	}

}
