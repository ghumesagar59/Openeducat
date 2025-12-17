package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Essential {
	
	WebDriver driver;
	
	@Given("User is on website home page for essential automate")
    public void user_is_on_website_home_page_for_essential_automate() {
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://openeducat.org/");
    }

    @And("user click to essential")
    public void user_click_to_essential() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement essential = driver.findElement(By.xpath("(//button[normalize-space()='Essential'])[1]"));
		essential.click();
		Thread.sleep(500);
    }

    @And("user click to application and navigate")
    public void user_click_to_application_and_navigate() throws InterruptedException {
    	WebElement application = driver.findElement(By.xpath("(//p[@title='Application'])[1]"));
    	application.click();
		Thread.sleep(500);
    }

    @And("user click to assignment and navigate")
    public void user_click_to_assignment_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement essential = driver.findElement(By.xpath("(//button[normalize-space()='Essential'])[1]"));
		essential.click();
		Thread.sleep(500);
		WebElement assignment = driver.findElement(By.xpath("(//p[@title='Assignment'])[1]"));
		assignment.click();
		Thread.sleep(500);
    }

    @And("user click to attendance and navigate")
    public void user_click_to_attendance_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement essential = driver.findElement(By.xpath("(//button[normalize-space()='Essential'])[1]"));
		essential.click();
		Thread.sleep(500);
		WebElement attendance = driver.findElement(By.xpath("(//p[@title='Attendance'])[1]"));
		attendance.click();
		Thread.sleep(500);
    }

    @And("user click to classroom and navigate")
    public void user_click_to_classroom_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement essential = driver.findElement(By.xpath("(//button[normalize-space()='Essential'])[1]"));
		essential.click();
		Thread.sleep(500);
		WebElement classroom = driver.findElement(By.xpath("(//p[@title='Class-room'])[1]"));
		classroom.click();
		Thread.sleep(500);
    }

    @And("user click to gradebook and navigate")
    public void user_click_to_gradebook_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement essential = driver.findElement(By.xpath("(//button[normalize-space()='Essential'])[1]"));
		essential.click();
		Thread.sleep(500);
		WebElement gradebook = driver.findElement(By.xpath("(//p[@title='Gradebook'])[1]"));
		gradebook.click();
		Thread.sleep(500);
    }

    @And("user click to leave request and navigate")
    public void user_click_to_leave_request_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement essential = driver.findElement(By.xpath("(//button[normalize-space()='Essential'])[1]"));
		essential.click();
		Thread.sleep(500);
		WebElement leave_request = driver.findElement(By.xpath("(//p[@title='Leave Request'])[1]"));
		leave_request.click();
		Thread.sleep(500);
    }

    @And("user click to payment and navigate")
    public void user_click_to_payment_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement essential = driver.findElement(By.xpath("(//button[normalize-space()='Essential'])[1]"));
		essential.click();
		Thread.sleep(500);
		WebElement payment = driver.findElement(By.xpath("(//p[@title='Payment'])[1]"));
		payment.click();
		Thread.sleep(500);
    }

    @And("user click to time table and navigate")
    public void user_click_to_time_table_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement essential = driver.findElement(By.xpath("(//button[normalize-space()='Essential'])[1]"));
		essential.click();
		Thread.sleep(500);
		WebElement time_table = driver.findElement(By.xpath("(//p[@title='Time-table'])[1]"));
		time_table.click();
		Thread.sleep(500);
    }

    @And("user click to timesheet and navigate")
    public void user_click_to_timesheet_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement essential = driver.findElement(By.xpath("(//button[normalize-space()='Essential'])[1]"));
		essential.click();
		Thread.sleep(500);
		WebElement timesheet = driver.findElement(By.xpath("(//p[@title='Timesheet'])[1]"));
		timesheet.click();
		Thread.sleep(500);
    }

    @Then("close the browser Essential")
    public void close_the_browser() {
        driver.quit();
    }
}
