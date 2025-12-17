package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Core {
	
	WebDriver driver;
	
	@Given("User is on website home page for core automate")
    public void user_is_on_website_home_page_for_core_automate() {
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://openeducat.org/");
    }

    @And("user click to core")
    public void user_click_to_core() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement core = driver.findElement(By.xpath("(//button[normalize-space()='Core'])[1]"));
    	core.click();
		Thread.sleep(500);
    }

    @And("user click to admission and navigate")
    public void user_click_to_admission_and_navigate() throws InterruptedException {
    	WebElement admission = driver.findElement(By.xpath("(//p[@title='Admission'])[1]"));
    	admission.click();
		Thread.sleep(500);
    }

    @And("user click to course and navigate")
    public void user_click_to_course_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement core = driver.findElement(By.xpath("(//button[normalize-space()='Core'])[1]"));
    	core.click();
		Thread.sleep(500);
		WebElement course = driver.findElement(By.xpath("(//p[@title='Course'])[1]"));
    	course.click();
		Thread.sleep(500);
    }

    @And("user click to exam and navigate")
    public void user_click_to_exam_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement core = driver.findElement(By.xpath("(//button[normalize-space()='Core'])[1]"));
    	core.click();
		Thread.sleep(500);
		WebElement exam = driver.findElement(By.xpath("(//p[@title='Exam'])[1]"));
    	exam.click();
		Thread.sleep(500);
    }

    @And("user click to faculty and navigate")
    public void user_click_to_faculty_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement core = driver.findElement(By.xpath("(//button[normalize-space()='Core'])[1]"));
    	core.click();
		Thread.sleep(500);
		WebElement faculty = driver.findElement(By.xpath("(//p[@title='Faculty'])[1]"));
    	faculty.click();
		Thread.sleep(500);
    }

    @And("user click to financial and navigate")
    public void user_click_to_financial_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement core = driver.findElement(By.xpath("(//button[normalize-space()='Core'])[1]"));
    	core.click();
		Thread.sleep(500);
		WebElement financial = driver.findElement(By.xpath("(//p[@title='Financial'])[1]"));
    	financial.click();
		Thread.sleep(500);
    }

    @And("user click to student and navigate")
    public void user_click_to_student_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement core = driver.findElement(By.xpath("(//button[normalize-space()='Core'])[1]"));
    	core.click();
		Thread.sleep(500);
		WebElement student = driver.findElement(By.xpath("(//p[@title='Students'])[1]"));
    	student.click();
		Thread.sleep(500);
    }

    @Then("close the browser Core")
    public void close_the_browser() {
        driver.quit();
    }
}
