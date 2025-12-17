package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LMS {
	
	WebDriver driver;
	
	@Given("User is on website home page for LMS automate")
    public void user_is_on_website_home_page_for_LMS_automate() {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://openeducat.org/");
    }

    @And("user click to LMS")
    public void user_click_to_LMS() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement LMS = driver.findElement(By.xpath("(//button[normalize-space()='LMS'])[1]"));
		LMS.click();
		Thread.sleep(500);
    }

    @And("user click to LMS and navigate")
    public void user_click_to_LMS_and_navigate() throws InterruptedException {
    	WebElement LMS1 = driver.findElement(By.xpath("(//p[@title='LMS'])[1]"));
    	LMS1.click();
		Thread.sleep(500);
    }

    @And("user click to Quiz Meet and navigate")
    public void user_click_to_quiz_meet_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement LMS = driver.findElement(By.xpath("(//button[normalize-space()='LMS'])[1]"));
		LMS.click();
		Thread.sleep(500);
		WebElement Quiz = driver.findElement(By.xpath("(//p[@title='uiz'])[1]"));
		Quiz.click();
		Thread.sleep(500);
    }

	
	@Then("close the browser LMS")
	public void close () throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
