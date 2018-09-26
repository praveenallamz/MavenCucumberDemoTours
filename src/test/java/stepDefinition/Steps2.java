package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.HomePage;
import pageObjects.RegisterPage;



public class Steps2 {
	
	public static WebDriver driver;
	
	@Given("^user is on demo tours page$")
	public void user_is_on_demo_tours_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\JarFiles\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");
		  driver.manage().window().maximize();
	    
	}

	@When("^user cliks the register link$")
	public void user_cliks_the_register_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.RegisterLink(driver).click();
	     
	}

	@Then("^user should see registration page$")
	public void user_should_see_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String RegCheck =RegisterPage.Reguistertextcheck(driver).getText();
		
		if (RegCheck.equals("Contact Information"))
		{
		System.out.println("User Is On Registration Page");	
		}
	    
	}
	
	@Given("^User is on Register page$")
	public void user_is_on_Register_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	     System.out.println("Registration page- For User Data Entry");
	}

	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and_and(String Usnm, String pwd, String cpwd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RegisterPage.Register_username(driver).sendKeys(Usnm);
		RegisterPage.Register_password(driver).sendKeys(pwd);
		RegisterPage.Register_cpassword(driver).sendKeys(cpwd);
	}

	@When("^Clicks the login button$")
	public void clicks_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RegisterPage.Register_SubmitButton(driver).click();
	    
	}

	@Then("^User landed on the home page$")
	public void user_landed_on_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//String Rsuccss= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")).getText();
		System.out.println("User Registed");
		HomePage.RegisterLink(driver).click();
	}
	
	
}
