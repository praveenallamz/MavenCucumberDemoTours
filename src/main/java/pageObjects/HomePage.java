package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
public static WebElement element;
	
	public static  WebElement RegisterLink(WebDriver driver){
	element = driver.findElement(By.xpath("//*[contains(@href,'mercuryregister.php')]"));
	return element;
	}

}
