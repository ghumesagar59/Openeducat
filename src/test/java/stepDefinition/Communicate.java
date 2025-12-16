package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Communicate {
	
	WebDriver driver;
	
	@Given("User is on website home page for communicate automate")
    public void user_is_on_website_home_page_for_communicate_automate() {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://openeducat.org/");
    }

    @And("user click to communicate")
    public void user_click_to_communicate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement communicate = driver.findElement(By.xpath("(//button[normalize-space()='Communicate'])[1]"));
		communicate.click();
		Thread.sleep(500);
    }

    @And("user click to Blog and navigate")
    public void user_click_to_blog_and_navigate() throws InterruptedException {
    	WebElement Blog = driver.findElement(By.xpath("(//p[@title='Blog'])[1]"));
    	Blog.click();
		Thread.sleep(500);
    }

    @And("user click to Discussion and navigate")
    public void user_click_to_discussion_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement communicate = driver.findElement(By.xpath("(//button[normalize-space()='Communicate'])[1]"));
		communicate.click();
		Thread.sleep(500);
		WebElement Discussion = driver.findElement(By.xpath("(//p[@title='Discussion'])[1]"));
		Discussion.click();
		Thread.sleep(500);
    }

    @And("user click to Forum and navigate")
    public void user_click_to_forum_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement communicate = driver.findElement(By.xpath("(//button[normalize-space()='Communicate'])[1]"));
		communicate.click();
		Thread.sleep(500);
		WebElement Forum = driver.findElement(By.xpath("(//p[@title='Forum'])[1]"));
		Forum.click();
		Thread.sleep(500);
    }

    @And("user click to Grievance and navigate")
    public void user_click_to_grievance_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement communicate = driver.findElement(By.xpath("(//button[normalize-space()='Communicate'])[1]"));
		communicate.click();
		Thread.sleep(500);
		WebElement Grievance = driver.findElement(By.xpath("(//a[@title='Grievance'][normalize-space()='Grievance'])[1]"));
		Grievance.click();
		Thread.sleep(500);
    }

    @And("user click to Helpdesk and navigate")
    public void user_click_to_helpdesk_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement communicate = driver.findElement(By.xpath("(//button[normalize-space()='Communicate'])[1]"));
		communicate.click();
		Thread.sleep(500);
		WebElement Helpdesk = driver.findElement(By.xpath("(//p[@title='Helpdesk'])[1]"));
		Helpdesk.click();
		Thread.sleep(500);
    }

    @And("user click to News-portal and navigate")
    public void user_click_to_news_portal_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement communicate = driver.findElement(By.xpath("(//button[normalize-space()='Communicate'])[1]"));
		communicate.click();
		Thread.sleep(500);
		WebElement news_portal = driver.findElement(By.xpath("(//p[@title='News-portal'])[1]"));
		news_portal.click();
		Thread.sleep(500);
    }

    @And("user click to Notice Board and navigate")
    public void user_click_to_notice_board_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement communicate = driver.findElement(By.xpath("(//button[normalize-space()='Communicate'])[1]"));
		communicate.click();
		Thread.sleep(500);
		WebElement notice_board = driver.findElement(By.xpath("(//p[@title='Notice Board'])[1]"));
		notice_board.click();
		Thread.sleep(500);
    }

    @And("user click to Online Appointment and navigate")
    public void user_click_to_online_appointment_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement communicate = driver.findElement(By.xpath("(//button[normalize-space()='Communicate'])[1]"));
		communicate.click();
		Thread.sleep(500);
		WebElement online_appointment = driver.findElement(By.xpath("(//p[@title='Online Appointment'])[1]"));
		online_appointment.click();
		Thread.sleep(500);
    }

    @And("user click to Poll and navigate")
    public void user_click_to_poll_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement communicate = driver.findElement(By.xpath("(//button[normalize-space()='Communicate'])[1]"));
		communicate.click();
		Thread.sleep(500);
		WebElement Poll = driver.findElement(By.xpath("(//p[@title='Poll'])[1]"));
		Poll.click();
		Thread.sleep(500);
    }

    @And("user click to Secure and navigate")
    public void user_click_to_secure_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement communicate = driver.findElement(By.xpath("(//button[normalize-space()='Communicate'])[1]"));
		communicate.click();
		Thread.sleep(500);
		WebElement Secure = driver.findElement(By.xpath("(//p[@title='Secure Transcript'])[1]"));
		Secure.click();
		Thread.sleep(500);
    }

    @And("user click to Survey and navigate")
    public void user_click_to_survey_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement communicate = driver.findElement(By.xpath("(//button[normalize-space()='Communicate'])[1]"));
		communicate.click();
		Thread.sleep(500);
		WebElement Survey = driver.findElement(By.xpath("(//p[@title='Survey'])[1]"));
		Survey.click();
		Thread.sleep(500);
    }
	
	@Then("close the browser")
	public void close () throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
