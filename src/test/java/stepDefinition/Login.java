package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Login {
	
	WebDriver driver;
	
	@Given("User is on website login page")
	public void login() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://openeducat.org/web/login");
	}
	
	@And("user enters userid")
	public void userid () throws InterruptedException {
		WebElement Email = driver.findElement(By.xpath("(//input[@id='login'])[1]"));
		Email.sendKeys("ghumesagar59@gmail.com");
		Thread.sleep(1000);
	}
	@And("user enters password")
	public void password () throws InterruptedException {
		WebElement Password = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
		Password.sendKeys("Pass@123");
		Thread.sleep(1000);
	}
	
	@And("user clicks on login button")
	public void login_btn() throws InterruptedException {
		WebElement Login_btn = driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]"));
		Login_btn.click();
		Thread.sleep(1000);
	}
	@Then("login should be successful")
	public void login_successful() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	

}
