package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MercurySteps {
	
	public String baseUrl = "http://newtours.demoaut.com";
	public String browser = "Firefox";
	public WebDriver driver ;

@Given("Launch firfox and Navigate to URL")
public void launch_firfox_and_Navigate_to_URL() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Webdrivers\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","C:\\Softwares\\Webdrivers\\geckodriver.exe");
	
	
	
	if(browser.equalsIgnoreCase("Firefox")) {
	    driver = new FirefoxDriver();
	} else {
		driver = new ChromeDriver();
	} 
	 Thread.sleep(5000);
	 driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 driver.get(baseUrl);
	 Thread.sleep(5000);
    
    
}

@When("Enter Valid user {string} and password {string}")
public void enter_Valid_user_and_password(String uname,  String pwd ) throws InterruptedException {
	WebElement loginUser  = driver.findElement(By.xpath("//input[contains(@name,'Name') and (@type='text')]"));
	loginUser.click();
	loginUser.sendKeys(uname);
	
	WebElement loginPwd  = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
	loginPwd.click();
	loginPwd.sendKeys(pwd);
	
	WebElement loginbtn  = driver.findElement(By.xpath("//input[contains(@name,'login') or (@type='image')]"));
	loginbtn.click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Home")).click();
	Thread.sleep(1000);	
	
	
}

@Then("User should able to login successfully")
public void user_should_able_to_login_successfully() {
    System.out.println("I am in login successfully");
    System.out.println("adding a new line");
    
}

@Given("app should be in flight details page")
public void app_should_be_in_flight_details_page() {
	 System.out.println("flight details page");
    
}

@When("Select flight data")
public void select_flight_data() {
	 System.out.println("flight data");
    
}

@Then("flight selection page to be opened")
public void flight_selection_page_to_be_opened() {
	 System.out.println("selection page");
    
    
}

}
