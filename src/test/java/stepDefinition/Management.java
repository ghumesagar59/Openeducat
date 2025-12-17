package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Management {
	
	WebDriver driver;
	
	 @Given("User is on website home page for Management automate")
	    public void user_is_on_website_home_page_for_management_automate() {
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://openeducat.org/");
	    }

	    @And("user click to Management")
	    public void user_click_to_management() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement Management = driver.findElement(By.xpath("(//button[normalize-space()='Management'])[1]"));
			Management.click();
			Thread.sleep(500);
	    }

	    @And("user click to Canteen and navigate")
	    public void user_click_to_canteen_and_navigate() throws InterruptedException {
	    	WebElement Canteen = driver.findElement(By.xpath("(//p[@title='Canteen'])[1]"));
	    	Canteen.click();
			Thread.sleep(500);
	    }

	    @And("user click to Campus and navigate")
	    public void user_click_to_campus_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement Management = driver.findElement(By.xpath("(//button[normalize-space()='Management'])[1]"));
			Management.click();
			Thread.sleep(500);
			WebElement Campus = driver.findElement(By.xpath("(//p[@title='Campus'])[1]"));
			Campus.click();
			Thread.sleep(500);
	    }

	    @And("user click to Parent-Login and navigate")
	    public void user_click_to_parent_login_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement Management = driver.findElement(By.xpath("(//button[normalize-space()='Management'])[1]"));
			Management.click();
			Thread.sleep(500);
			WebElement parent_login = driver.findElement(By.xpath("(//p[@title='Parent-Login'])[1]"));
			parent_login.click();
			Thread.sleep(500);
	    }

	    @And("user click to Placement and navigate")
	    public void user_click_to_placement_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement Management = driver.findElement(By.xpath("(//button[normalize-space()='Management'])[1]"));
			Management.click();
			Thread.sleep(500);
			WebElement Placement = driver.findElement(By.xpath("(//p[@title='Placement'])[1]"));
			Placement.click();
			Thread.sleep(500);
	    }

	    @And("user click to Transportation and navigate")
	    public void user_click_to_transportation_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement Management = driver.findElement(By.xpath("(//button[normalize-space()='Management'])[1]"));
			Management.click();
			Thread.sleep(500);
			WebElement Transportation = driver.findElement(By.xpath("(//p[@title='Transportation'])[1]"));
			Transportation.click();
			Thread.sleep(500);
	    }

	    @Then("close the browser Management")
	    public void close_the_browser() {
	        driver.quit();
	    }
}
