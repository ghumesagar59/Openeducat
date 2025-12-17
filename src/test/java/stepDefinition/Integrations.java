package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Integrations {
	
	WebDriver driver;
	
	@Given("User is on website home page for integrations automate")
    public void user_is_on_website_home_page_for_integrations_automate() {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://openeducat.org/");
    }

    @And("user click to integrations")
    public void user_click_to_integrations() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement integrations = driver.findElement(By.xpath("(//button[normalize-space()='Integrations'])[1]"));
		integrations.click();
		Thread.sleep(500);
    }

    @And("user click to BigBlueButton and navigate")
    public void user_click_to_bigbluebutton_and_navigate() throws InterruptedException {
    	WebElement bigbluebutton = driver.findElement(By.xpath("(//p[@title='BigBlueButton'])[1]"));
    	bigbluebutton.click();
		Thread.sleep(500);
    }

    @And("user click to Google Meet and navigate")
    public void user_click_to_google_meet_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement integrations = driver.findElement(By.xpath("(//button[normalize-space()='Integrations'])[1]"));
		integrations.click();
		Thread.sleep(500);
		WebElement google_meet = driver.findElement(By.xpath("(//p[@title='Google Meet'])[1]"));
		google_meet.click();
		Thread.sleep(500);
    }

    @And("user click to Microsoft Teams and navigate")
    public void user_click_to_microsoft_teams_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement integrations = driver.findElement(By.xpath("(//button[normalize-space()='Integrations'])[1]"));
		integrations.click();
		Thread.sleep(500);
		WebElement Microsoft = driver.findElement(By.xpath("(//p[@title='Microsoft Teams'])[1]"));
		Microsoft.click();
		Thread.sleep(500);
    }

    @And("user click to Zoom and navigate")
    public void user_click_to_zoom_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement integrations = driver.findElement(By.xpath("(//button[normalize-space()='Integrations'])[1]"));
		integrations.click();
		Thread.sleep(500);
		WebElement zoom = driver.findElement(By.xpath("(//p[@title='Zoom'])[1]"));
		zoom.click();
		Thread.sleep(500);
    }

    @And("user click to Whatsapp and navigate")
    public void user_click_to_whatsapp_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement integrations = driver.findElement(By.xpath("(//button[normalize-space()='Integrations'])[1]"));
		integrations.click();
		Thread.sleep(500);
		WebElement whatsapp = driver.findElement(By.xpath("(//p[@title='Whatsapp'])[1]"));
		whatsapp.click();
		Thread.sleep(500);
    }

    @And("user click to Social Media Marketing Tool and navigate")
    public void user_click_to_social_media_marketing_tool_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement integrations = driver.findElement(By.xpath("(//button[normalize-space()='Integrations'])[1]"));
		integrations.click();
		Thread.sleep(500);
		WebElement social_media_marketing = driver.findElement(By.xpath("(//p[@title='Social Media Marketing Tool'])[1]"));
		social_media_marketing.click();
		Thread.sleep(500);
    }

	
	@Then("close the browser Integrations")
	public void close () throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
