package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Registration {
	
	WebDriver driver;
	
	@Given("User is on website signup page")
	public void sighup_page () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://openeducat.org/web/signup");
		
	}
	
	@And("user enters name")
	public void name () throws InterruptedException {
		WebElement name = driver.findElement(By.xpath("(//input[@id='name'])[1]"));
		name.sendKeys("Sagar Ghume");
		Thread.sleep(1000);
	}
	
	@And("user enters email")
	public void email () throws InterruptedException {
		WebElement email = driver.findElement(By.xpath("(//input[@id='login'])[1]"));
		email.sendKeys("ghumesagar59@gmail.com");
		Thread.sleep(1000);
	}
	
	@And("user enters organization name")
	public void organization_name () throws InterruptedException {
		WebElement organization = driver.findElement(By.xpath("(//input[@id='organization_name'])[1]"));
		organization.sendKeys("IT Engineer");
		Thread.sleep(1000);
	}
	
	@And("user enters phone")
	public void phone () throws InterruptedException {
		WebElement phone = driver.findElement(By.xpath("(//input[@id='phone_id'])[1]"));
		phone.sendKeys("9284340700");
		Thread.sleep(1000);
	}
	
	@And("user enters password")
	public void password () throws InterruptedException {
		WebElement password = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
		password.sendKeys("Pass@123");
		Thread.sleep(1000);
	}
	
	@And("user enters confirm password")
	public void conform_password () throws InterruptedException {
		WebElement conform_password = driver.findElement(By.xpath("(//input[@id='confirm_password'])[1]"));
		conform_password.sendKeys("Pass@123");
		Thread.sleep(1000);
	}
	
	@And("user enters street")
	public void street () throws InterruptedException {
		WebElement street = driver.findElement(By.xpath("(//input[@id='street_id'])[1]"));
		street.sendKeys("Borsar");
		Thread.sleep(1000);
	}
	
	@And("user enters city")
	public void city () throws InterruptedException {
		WebElement city = driver.findElement(By.xpath("(//input[@id='city_id'])[1]"));
		city.sendKeys("Borsar");
		Thread.sleep(1000);
	}
	
	@And("user enters zip")
	public void zip () throws InterruptedException {
		WebElement zip = driver.findElement(By.xpath("(//input[@id='zip_id'])[1]"));
		zip.sendKeys("423703");
		Thread.sleep(1000);
	}
	
	@And("user enters tax id")
	public void tax_id () throws InterruptedException {
		WebElement tax_id = driver.findElement(By.xpath("(//input[@id='vat_id'])[1]"));
		tax_id.sendKeys("Null");
		Thread.sleep(1000);
	}
	
	@And("user clicks on signup button")
	public void signup_button () throws InterruptedException {
		//WebElement signup_button = driver.findElement(By.xpath("(//button[normalize-space()='Sign up'])[1]"));
		//signup_button.click();
		Thread.sleep(1000);
	}
	
	@Then("signup should be successful")
	public void close () throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	

}
