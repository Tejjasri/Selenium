package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void testleaf_dragDrop() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/drag.html");
		WebElement element2=driver.findElement(By.id("draggable"));
		Actions act2 = new Actions(driver);
		act2.dragAndDropBy(element2, 250, 350).build().perform();
		driver.navigate().to("http://leafground.com/pages/drop.html");
		WebElement element3=driver.findElement(By.id("droppable"));
		WebElement element4=driver.findElement(By.id("draggable"));
		act2.dragAndDrop(element4, element3).build().perform();
		driver.quit();
	}

}
