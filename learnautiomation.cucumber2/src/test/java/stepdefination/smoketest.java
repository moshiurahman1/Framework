package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smoketest {
	WebDriver driver;
	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://www.facebook.com");
	    
	}

	/*@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
	    
	    driver.findElement(By.name("email")).sendKeys("nayonahameddu2016@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).sendKeys("071506");
	    
	}

	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully() throws Throwable {
	    
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
	}*/
	
	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_and_valid(String uname, String pass) throws Throwable {
		driver.findElement(By.name("email")).sendKeys(uname);
	    driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).sendKeys(pass);   
	}
	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
	}
	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
	    driver.quit();
	     
	}  

}
