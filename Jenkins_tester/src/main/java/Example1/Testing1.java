package Example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing1 {
	
	public void testleaf_editActions() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.linkText("Edit")).click();
		Actions act = new Actions(driver);
		WebElement element=driver.findElement(By.id("email"));
		act.sendKeys(element,"tejo@gmail.com")
		.doubleClick()
		.contextClick()
		.build()
		.perform();
		
		driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("HCL text1");
		driver.findElement(By.name("username")).sendKeys("HCL text2");
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("HCL text3");
		
	}

}
