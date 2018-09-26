package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	public static WebElement element;
	
	public static  WebElement Reguistertextcheck(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font"));
		return element;
		}

	public static  WebElement Register_username(WebDriver driver){
		element = driver.findElement(By.id("email"));
		return element;
		}
	
	public static  WebElement Register_password(WebDriver driver){
		element = driver.findElement(By.name("password"));
		return element;
		}
	
	public static  WebElement Register_cpassword(WebDriver driver){
		element = driver.findElement(By.name("confirmPassword"));
		return element;
		}
	
	public static  WebElement Register_SubmitButton(WebDriver driver){
		element = driver.findElement(By.name("register"));
		return element;
		}
	
	

}
