package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Resources_Solutions {
	
	WebDriver driver;
	
    @Given("User is on website home page for Resources automate")
    public void user_is_on_home_page_for_resources() {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://openeducat.org/");
    }

    @And("user click to Resources")
    public void user_click_to_resources() throws InterruptedException {
    	WebElement Resources = driver.findElement(By.xpath("(//span[normalize-space()='Resources'])[1]"));
    	Resources.click();
		Thread.sleep(500);
		
    }

    @And("user click to learn and navigate")
    public void user_click_to_learn_and_navigate() throws InterruptedException {
    	WebElement learn = driver.findElement(By.xpath("(//h6[normalize-space()='Learn'])[1]"));
    	learn.click();
		Thread.sleep(500);
    }

    @And("user click to forum and navigate")
    public void user_click_to_forum_and_navigate() throws InterruptedException {
    	WebElement Resources = driver.findElement(By.xpath("(//span[normalize-space()='Resources'])[1]"));
    	Resources.click();
		Thread.sleep(500);
		WebElement forum = driver.findElement(By.xpath("(//h6[normalize-space()='Forum'])[1]"));
		forum.click();
		Thread.sleep(500);
    }

    @And("user click to Blog and navigate")
    public void user_click_to_blog_and_navigate() throws InterruptedException {
    	WebElement Resources = driver.findElement(By.xpath("(//span[normalize-space()='Resources'])[1]"));
    	Resources.click();
		Thread.sleep(500);
		WebElement Blog = driver.findElement(By.xpath("(//h6[normalize-space()='Blog'])[1]"));
		Blog.click();
		Thread.sleep(500);
    }

    @And("user click to Downloads and navigate")
    public void user_click_to_downloads_and_navigate() throws InterruptedException {
    	WebElement Resources = driver.findElement(By.xpath("(//span[normalize-space()='Resources'])[1]"));
    	Resources.click();
		Thread.sleep(500);
		WebElement Downloads = driver.findElement(By.xpath("(//h6[normalize-space()='Downloads'])[1]"));
		Downloads.click();
		Thread.sleep(500);
    }

    @And("user click to Support and navigate")
    public void user_click_to_support_and_navigate() throws InterruptedException {
    	WebElement Resources = driver.findElement(By.xpath("(//span[normalize-space()='Resources'])[1]"));
    	Resources.click();
		Thread.sleep(500);
		WebElement Support = driver.findElement(By.xpath("(//h6[normalize-space()='Support'])[1]"));
		Support.click();
		Thread.sleep(500);
    }

    @And("user click to Compare and navigate")
    public void user_click_to_compare_and_navigate() throws InterruptedException {
    	WebElement Resources = driver.findElement(By.xpath("(//span[normalize-space()='Resources'])[1]"));
    	Resources.click();
		Thread.sleep(500);
		WebElement Compare = driver.findElement(By.xpath("(//h6[normalize-space()='Compare'])[1]"));
		Compare.click();
		Thread.sleep(500);
    }

 

    @Given("User is on website home page for Solutions automate")
    public void user_is_on_home_page_for_solutions() {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://openeducat.org/");
    }

    @And("user click to Solutions")
    public void user_click_to_solutions() throws InterruptedException {
    	WebElement Solutions = driver.findElement(By.xpath("(//span[normalize-space()='Solutions'])[1]"));
    	Solutions.click();
		Thread.sleep(500);
    }

    @And("user click to University Management and navigate")
    public void user_click_to_university_management() throws InterruptedException {
		WebElement University = driver.findElement(By.xpath("(//span[normalize-space()='University Management'])[1]"));
		University.click();
		Thread.sleep(500);
    }

    @And("user click to Highschool Management and navigate")
    public void user_click_to_highschool_management() throws InterruptedException {
    	WebElement Solutions = driver.findElement(By.xpath("(//span[normalize-space()='Solutions'])[1]"));
    	Solutions.click();
		Thread.sleep(500);
		WebElement highschool_management = driver.findElement(By.xpath("(//span[normalize-space()='Highschool Management'])[1]"));
		highschool_management.click();
		Thread.sleep(500);

    }

    @And("user click to College Management and navigate")
    public void user_click_to_college_management() throws InterruptedException {
    	WebElement Solutions = driver.findElement(By.xpath("(//span[normalize-space()='Solutions'])[1]"));
    	Solutions.click();
		Thread.sleep(500);
		WebElement college_management = driver.findElement(By.xpath("(//span[normalize-space()='College Management'])[1]"));
		college_management.click();
		Thread.sleep(500);
    }

    @And("user click to Boot Campus and navigate")
    public void user_click_to_boot_campus() throws InterruptedException {
    	WebElement Solutions = driver.findElement(By.xpath("(//span[normalize-space()='Solutions'])[1]"));
    	Solutions.click();
		Thread.sleep(500);
		WebElement boot_campus = driver.findElement(By.xpath("(//span[normalize-space()='Boot Camps & Summer Schools'])[1]"));
		boot_campus.click();
		Thread.sleep(500);
    }

    @And("user click to Preschool Institutions and navigate")
    public void user_click_to_preschool_institutions() throws InterruptedException {
    	WebElement Solutions = driver.findElement(By.xpath("(//span[normalize-space()='Solutions'])[1]"));
    	Solutions.click();
		Thread.sleep(500);
		WebElement Preschool = driver.findElement(By.xpath("(//span[normalize-space()='Preschool Institutions'])[1]"));
		Preschool.click();
		Thread.sleep(500);
    }

    @And("user click to K-12 School and navigate")
    public void user_click_to_k12_school() throws InterruptedException {
    	WebElement Solutions = driver.findElement(By.xpath("(//span[normalize-space()='Solutions'])[1]"));
    	Solutions.click();
		Thread.sleep(500);
		WebElement k12_school = driver.findElement(By.xpath("(//span[normalize-space()='K-12 Schools'])[1]"));
		k12_school.click();
		Thread.sleep(500);
    }

    @And("user click to Faith based School and navigate")
    public void user_click_to_faith_based_school() throws InterruptedException {
    	WebElement Solutions = driver.findElement(By.xpath("(//span[normalize-space()='Solutions'])[1]"));
    	Solutions.click();
		Thread.sleep(500);
		WebElement faith_based = driver.findElement(By.xpath("(//span[normalize-space()='Faith-Based Schools'])[1]"));
		faith_based.click();
		Thread.sleep(500);
    }

    @And("user click to vocational School and navigate")
    public void user_click_to_vocational_school() throws InterruptedException {
    	WebElement Solutions = driver.findElement(By.xpath("(//span[normalize-space()='Solutions'])[1]"));
    	Solutions.click();
		Thread.sleep(500);
		WebElement vocational_school = driver.findElement(By.xpath("(//span[normalize-space()='Vocational Schools'])[1]"));
		vocational_school.click();
		Thread.sleep(500);
    }

    @And("user click to music School and navigate")
    public void user_click_to_music_school() throws InterruptedException {
    	WebElement Solutions = driver.findElement(By.xpath("(//span[normalize-space()='Solutions'])[1]"));
    	Solutions.click();
		Thread.sleep(500);
		WebElement music_school = driver.findElement(By.xpath("(//span[normalize-space()='Music Schools'])[1]"));
		music_school.click();
		Thread.sleep(500);
    }

	@Then("close the browser")
	public void close () throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
