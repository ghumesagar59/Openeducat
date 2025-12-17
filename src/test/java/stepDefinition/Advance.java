package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Advance {
	
	WebDriver driver;
	
	@Given("User is on website home page for advance automate")
	public void homepage () {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://openeducat.org/");
		
	}
	
	@And("user click to advance")
	public void advance () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
	}
	
	@And("user click to advance accounting and navigate")
	public void advance_accounting () throws InterruptedException {
		WebElement advance_accounting = driver.findElement(By.xpath("(//p[@title='Advance Accounting'])[1]"));
		advance_accounting.click();
		Thread.sleep(500);
	}
	
	@And("user click to automated marketing and navigate")
	public void automated_marketing () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement automated_marketing = driver.findElement(By.xpath("(//p[@title='Automated Marketing'])[1]"));
		automated_marketing.click();
		Thread.sleep(500);
	}
	
	@And("user click to asignment annotation and navigate")
	public void assignment () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement assignment = driver.findElement(By.xpath("(//p[@title='Assignment Annotation'])[1]"));
		assignment.click();
		Thread.sleep(500);
	}
	
	@And("user click to biomatric and navigate")
	public void biomatric () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement biomatric = driver.findElement(By.xpath("(//p[@title='Biometric'])[1]"));
		biomatric.click();
		Thread.sleep(500);
	}
	
	@And("user click to dashboard and navigate")
	public void dashboard () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement dashboard = driver.findElement(By.xpath("(//p[@title='Dashboard'])[1]"));
		dashboard.click();
		Thread.sleep(500);
	}
	
	@And("user click to digital library and navigate")
	public void digital_library () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement digital_library = driver.findElement(By.xpath("(//p[@title='Digital Library'])[1]"));
		digital_library.click();
		Thread.sleep(500);
	}
	
	@And("user click to documents and navigate")
	public void documents () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement documents = driver.findElement(By.xpath("(//p[@title='Documents'])[1]"));
		documents.click();
		Thread.sleep(500);
	}
	
	@And("user click to events and navigate")
	public void events () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement events = driver.findElement(By.xpath("(//p[@title='Events'])[1]"));
		events.click();
		Thread.sleep(500);
	}
	
	@And("user click to e-sign and navigate")
	public void e_sign() throws InterruptedException{
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement e_sign = driver.findElement(By.xpath("(//p[@title='E-sign'])[1]"));
		e_sign.click();
		Thread.sleep(500);	
	}
	
	@And("user click to face recognition attendance and navigate")
	public void face () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement face = driver.findElement(By.xpath("(//p[@title='Face Recognition'])[1]"));
		face.click();
		Thread.sleep(500);	
	}
	
	@And("user click to kpi dashboard and navigate")
	public void kpi_dashboard () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement kpi_dashboard = driver.findElement(By.xpath("(//p[@title='KPI Dashboard'])[1]"));
		kpi_dashboard.click();
		Thread.sleep(500);
	}
	
	@And("user click to library and navigate")
	public void library () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement library = driver.findElement(By.xpath("(//p[@title='Library'])[1]"));
		library.click();
		Thread.sleep(500);
	}
	
	@And("user click to live classroom and navigate")
	public void live_classroom () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement live_classroom = driver.findElement(By.xpath("(//p[@title='Live Classroom'])[1]"));
		live_classroom.click();
		Thread.sleep(500);
	}
	
	@And("user click to mobile application and navigate")
	public void mobile_application () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement mobile_application = driver.findElement(By.xpath("(//p[@title='Mobile-application'])[1]"));
		mobile_application.click();
		Thread.sleep(500);
	}
	
	@And("user click to multi approvals and navigate")
	public void multi_approval () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement multi_approval = driver.findElement(By.xpath("(//p[@title='Multi Approvals'])[1]"));
		multi_approval.click();
		Thread.sleep(500);
	}
	
	@And("user click to no code studio and navigate")
	public void no_code_studio () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement no_code_studio = driver.findElement(By.xpath("(//p[@title='No Code studio'])[1]"));
		no_code_studio.click();
		Thread.sleep(500);
	}
	
	@And("user click to omr and navigate")
	public void omr () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement omr = driver.findElement(By.xpath("(//p[@title='OMR'])[1]"));
		omr.click();
		Thread.sleep(500);
	}
	
	@And("user click to quiz anticheating and navigate")
	public void quiz () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement quiz = driver.findElement(By.xpath("(//p[@title='Anti Cheating'])[1]"));
		quiz.click();
		Thread.sleep(500);
	}
	
	@And("user click to reporting and navigate")
	public void reporting () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement reporting = driver.findElement(By.xpath("(//p[@title='Reporting'])[1]"));
		reporting.click();
		Thread.sleep(500);
	}
	
	@And("user click to thesis and navigate")
	public void thesis () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement thesis = driver.findElement(By.xpath("(//p[@title='Thesis'])[1]"));
		thesis.click();
		Thread.sleep(500);
	}
	
	@And("user click to convocation and navigate")
	public void convocation () throws InterruptedException {
		WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement advance = driver.findElement(By.xpath("(//button[normalize-space()='Advance'])[1]"));
		advance.click();
		Thread.sleep(500);
		WebElement convocation = driver.findElement(By.xpath("(//p[@title='Convocation'])[1]"));
		convocation.click();
		Thread.sleep(500);
	}
	
	@Then("close the browser Advance")
	public void close () throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
