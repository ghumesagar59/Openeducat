package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Demo_Pricing {
	
	WebDriver driver;
	
	 @Given("User is on website home page for demo, pricing automate")
	    public void user_is_on_website_home_page_for_demo_pricing_automate() {
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://openeducat.org/");
	    }

	    @And("user click to Demo and navigate")
	    public void user_click_to_demo_and_navigate() throws InterruptedException {
	        driver.findElement(By.xpath("(//span[normalize-space()='Demo'])[1]")).click();
	        Thread.sleep(5000);
	    }

	    @And("user click to pricing")
	    public void user_click_to_pricing() throws InterruptedException {
	        driver.findElement(By.xpath("(//span[normalize-space()='Pricing'])[1]")).click();
	        Thread.sleep(3000);
	    }

	    @And("user click to On cloud")
	    public void user_click_to_on_cloud() throws InterruptedException {
	        driver.findElement(By.xpath("(//button[@class='btn btn-primary mt24 px-4 text-white'][normalize-space()='Get Pricing'])[1]")).click();
	        Thread.sleep(20000);
	    }

	    @And("user click to Pre school and next")
	    public void user_click_to_pre_school_and_next() throws InterruptedException {
	        driver.findElement(By.xpath("(//div[@title='Pre School'])[1]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//a[normalize-space()='Next'])[1]")).click();
	        Thread.sleep(2000);
	    }

	    @And("user click to openeducate, online admission and digital library and next")
	    public void user_click_to_openeducate_online_admission_digital_library_and_next() throws InterruptedException {
	        driver.findElement(By.xpath("(//div[@title='OpenEduCat Core'])[1]")).click();
	        Thread.sleep(500);
	        driver.findElement(By.xpath("(//div[@title='Online Admission'])[1]")).click();
	        Thread.sleep(500);
	        driver.findElement(By.xpath("(//div[@title='Digital Library'])[1]")).click();
	        Thread.sleep(500);
	        driver.findElement(By.xpath("(//a[normalize-space()='Next'])[1]")).click();
	        Thread.sleep(200);
	    }

	    @And("user click to invoice, point of sale, recruitement and next")
	    public void user_click_to_invoice_pos_recruitement_and_next() throws InterruptedException {
	        driver.findElement(By.xpath("(//div[@title='Invoice'])[1]")).click();
	        Thread.sleep(500);
	        driver.findElement(By.xpath("(//div[@title='Point Of Sale'])[1]")).click();
	        Thread.sleep(500);
	        driver.findElement(By.xpath("(//div[@title='Recruitment'])[1]")).click();
	        Thread.sleep(500);
	        driver.findElement(By.xpath("(//a[normalize-space()='Next'])[1]")).click();
	        Thread.sleep(200);
	    }

	    @And("user click to social media and next")
	    public void user_click_to_social_media_and_next() throws InterruptedException {
	        driver.findElement(By.xpath("(//div[@title='Social Media Integrations'])[1]")).click();
	        Thread.sleep(500);
	        driver.findElement(By.xpath("(//a[normalize-space()='Next'])[1]")).click();
	        Thread.sleep(200);
	    }

	    @And("user click to '25' user and next")
	    public void user_click_to_25_user_and_next() throws InterruptedException {
	        driver.findElement(By.xpath("(//div[@title='25 Users'])[1]")).click();
	        Thread.sleep(500);
	        driver.findElement(By.xpath("(//a[normalize-space()='Next'])[1]")).click();
	        Thread.sleep(200);
	    }

	    @And("user click to android and next")
	    public void user_click_to_android_and_next() throws InterruptedException {
	        driver.findElement(By.xpath("(//div[@title='Android App'])[1]")).click();
	        Thread.sleep(500);
	        driver.findElement(By.xpath("(//a[normalize-space()='Next'])[1]")).click();
	        Thread.sleep(200);
	    }

	    @And("user click to 25 hours and get quote")
	    public void user_click_to_25_hours_and_get_quote() throws InterruptedException {
	        driver.findElement(By.xpath("(//div[@title='25 Hours'])[1]")).click();
	        Thread.sleep(500);
	        driver.findElement(By.xpath("(//a[@id='enterprise_track_btn'])[1]")).click();
	        Thread.sleep(200);
	    }
	@Then("close the browser")
	public void close () throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
