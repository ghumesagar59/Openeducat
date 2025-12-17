package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Technical {
	
	WebDriver driver;
	
	@Given("User is on website home page for technical automate")
    public void user_is_on_website_home_page_for_technical_automate() {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://openeducat.org/");
    }

    @And("user click to technical")
    public void user_click_to_technical() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement technical = driver.findElement(By.xpath("(//button[normalize-space()='Technical'])[1]"));
		technical.click();
		Thread.sleep(500);
    }

    @And("user click to Customizable and navigate")
    public void user_click_to_customizable_and_navigate() throws InterruptedException {
    	WebElement Customizable = driver.findElement(By.xpath("(//p[@title='Customizable'])[1]"));
    	Customizable.click();
		Thread.sleep(500);
    }

    @And("user click to Data Import Export and navigate")
    public void user_click_to_data_import_export_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement technical = driver.findElement(By.xpath("(//button[normalize-space()='Technical'])[1]"));
		technical.click();
		Thread.sleep(500);
		WebElement data_import_export = driver.findElement(By.xpath("(//p[@title='Data Import / Export'])[1]"));
		data_import_export.click();
		Thread.sleep(500);
    }

    @And("user click to Full Web Based and navigate")
    public void user_click_to_full_web_based_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement technical = driver.findElement(By.xpath("(//button[normalize-space()='Technical'])[1]"));
		technical.click();
		Thread.sleep(500);
		WebElement full_web_based = driver.findElement(By.xpath("(//p[@title='Full Web Based'])[1]"));
		full_web_based.click();
		Thread.sleep(500);
    }

    @And("user click to Modular and navigate")
    public void user_click_to_modular_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement technical = driver.findElement(By.xpath("(//button[normalize-space()='Technical'])[1]"));
		technical.click();
		Thread.sleep(500);
		WebElement modular = driver.findElement(By.xpath("(//p[@title='Modular'])[1]"));
		modular.click();
		Thread.sleep(500);
    }

    @And("user click to Multi Currency and navigate")
    public void user_click_to_multi_currency_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement technical = driver.findElement(By.xpath("(//button[normalize-space()='Technical'])[1]"));
		technical.click();
		Thread.sleep(500);
		WebElement multi_currency = driver.findElement(By.xpath("(//p[@title='Multi Currency'])[1]"));
		multi_currency.click();
		Thread.sleep(500);
    }

    @And("user click to Multi Lingual and navigate")
    public void user_click_to_multi_lingual_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement technical = driver.findElement(By.xpath("(//button[normalize-space()='Technical'])[1]"));
		technical.click();
		Thread.sleep(500);
		WebElement Multi_Lingual = driver.findElement(By.xpath("(//p[@title='Multi Lingual'])[1]"));
		Multi_Lingual.click();
		Thread.sleep(500);
    }

    @And("user click to Multi Organization Support and navigate")
    public void user_click_to_multi_organization_support_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement technical = driver.findElement(By.xpath("(//button[normalize-space()='Technical'])[1]"));
		technical.click();
		Thread.sleep(500);
		WebElement multi_organization = driver.findElement(By.xpath("(//p[@title='Multi Organization Support'])[1]"));
		multi_organization.click();
		Thread.sleep(500);
    }

    @And("user click to On Cloud On Premise and navigate")
    public void user_click_to_on_cloud_on_premise_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement technical = driver.findElement(By.xpath("(//button[normalize-space()='Technical'])[1]"));
		technical.click();
		Thread.sleep(500);
		WebElement cloud_on_premise = driver.findElement(By.xpath("(//p[@title='On Cloud On Premise'])[1]"));
		cloud_on_premise.click();
		Thread.sleep(500);
    }

    @And("user click to Open Source and navigate")
    public void user_click_to_open_source_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement technical = driver.findElement(By.xpath("(//button[normalize-space()='Technical'])[1]"));
		technical.click();
		Thread.sleep(500);
		WebElement open_source = driver.findElement(By.xpath("(//p[@title='Open Source'])[1]"));
		open_source.click();
		Thread.sleep(500);
    }

    @And("user click to Web Service Enabled and navigate")
    public void user_click_to_web_service_enabled_and_navigate() throws InterruptedException {
    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
    	feature.click();
		Thread.sleep(500);
		WebElement technical = driver.findElement(By.xpath("(//button[normalize-space()='Technical'])[1]"));
		technical.click();
		Thread.sleep(500);
		WebElement web_service_enabled = driver.findElement(By.xpath("(//p[@title='Web Service Enabled'])[1]"));
		web_service_enabled.click();
		Thread.sleep(500);
    }
	
	@Then("close the browser Technical")
	public void close () throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
