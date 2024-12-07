package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	WebDriver driver;
@Given("i want launch url {string} in a browser")
public void launchurl(String url) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    
}
@Then("i want check login button")
public void i_want_check_login_button() throws Throwable {
    if (driver.findElement(By.name("Submit")).isDisplayed()) 
    {
    System.out.println("login button displayed");	
	}
    Thread.sleep(3000);
}

@When("i enter usernmame as {string}")
public void i_enter_usernmame_as(String user) {
	driver.findElement(By.name("txtUsername")).sendKeys("user");
    
}

@When("i enter password as {string}")
public void i_enter_password_as(String pass) {
   driver.findElement(By.name("txtPassword")).sendKeys("pass");
}

@When("click login button")
public void click_login_button() {
    driver.findElement(By.name("Submit")).click();
}

@Then("i verify login sucess")
public void i_verify_login_sucess() {
    String Expected = "dashboard";
    String Actual = driver.getCurrentUrl();
    if (Actual.contains(Expected)) 
    {
    	System.out.println("login sucess:::"+Expected+"       "+Actual);
		
	}
    else
    {
    	System.out.println("login Fail:::"+Expected+"       "+Actual);
		
	}
}

@When("i close browser")
public void i_close_browser() {
    driver.quit();
}



}
