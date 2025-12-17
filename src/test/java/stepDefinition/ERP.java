package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class ERP {
	
		WebDriver driver;

	    @Given("User is on website home page for ERP automate")
	    public void user_is_on_website_home_page_for_ERP_automate() {
	    	driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     driver.get("https://openeducat.org/");
	    }

	    @And("user click to ERP")
	    public void user_click_to_ERP() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
	    }

	    @And("user click to Accounting and navigate")
	    public void user_click_to_Accounting_and_navigate() throws InterruptedException {
	    	WebElement Accounting = driver.findElement(By.xpath("(//p[@title='Accounting'])[1]"));
	    	Accounting.click();
			Thread.sleep(500);
	    }

	    @And("user click to Appraisals and navigate")
	    public void user_click_to_Appraisals_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement Appraisals = driver.findElement(By.xpath("(//p[@title='Appraisals'])[1]"));
			Appraisals.click();
			Thread.sleep(500);

	    }

	    @And("user click to Assets Request and navigate")
	    public void user_click_to_Assets_Request_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement Assets_Request = driver.findElement(By.xpath("(//p[@title='Assets Request'])[1]"));
			Assets_Request.click();
			Thread.sleep(500);
	    }

	    @And("user click to CRM and navigate")
	    public void user_click_to_CRM_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement CRM = driver.findElement(By.xpath("(//p[@title='CRM'])[1]"));
			CRM.click();
			Thread.sleep(500);
	    }

	    @And("user click to Ecommerce and navigate")
	    public void user_click_to_Ecommerce_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement Ecommerce = driver.findElement(By.xpath("(//p[@title='Ecommerce'])[1]"));
			Ecommerce.click();
			Thread.sleep(500);
	    }

	    @And("user click to Email-integration and navigate")
	    public void user_click_to_Email_integration_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement Email_integration = driver.findElement(By.xpath("(//a[@class='mb-0'][normalize-space()='E-mail Integration'])[1]"));
			Email_integration.click();
			Thread.sleep(500);
	    }

	    @And("user click to Email-marketing and navigate")
	    public void user_click_to_Email_marketing_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement Email_marketing = driver.findElement(By.xpath("(//p[@title='Email-marketing'])[1]"));
			Email_marketing.click();
			Thread.sleep(500);
	    }

	    @And("user click to Expense and navigate")
	    public void user_click_to_Expense_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement Expense = driver.findElement(By.xpath("(//p[@title='Expense'])[1]"));
			Expense.click();
			Thread.sleep(500);
	    }

	    @And("user click to Payroll and navigate")
	    public void user_click_to_Payroll_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement Payroll = driver.findElement(By.xpath("(//p[@title='Payroll'])[1]"));
			Payroll.click();
			Thread.sleep(500);
	    }

	    @And("user click to Purchase and navigate")
	    public void user_click_to_Purchase_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement Purchase = driver.findElement(By.xpath("(//p[@title='Purchase'])[1]"));
			Purchase.click();
			Thread.sleep(500);
	    }

	    @And("user click to Recruitment and navigate")
	    public void user_click_to_Recruitment_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement Recruitment = driver.findElement(By.xpath("(//a[@class='mb-0'][normalize-space()='Recruitment'])[1]"));
			Recruitment.click();
			Thread.sleep(500);
	    }

	    @And("user click to Sales and navigate")
	    public void user_click_to_Sales_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement Sales = driver.findElement(By.xpath("(//a[@class='mb-0'][normalize-space()='Sales'])[1]"));
			Sales.click();
			Thread.sleep(500);
	    }

	    @And("user click to Stock and navigate")
	    public void user_click_to_Stock_and_navigate() throws InterruptedException {
	    	WebElement feature = driver.findElement(By.xpath("(//span[normalize-space()='Features'])[1]"));
	    	feature.click();
			Thread.sleep(500);
			WebElement ERP = driver.findElement(By.xpath("(//button[normalize-space()='ERP'])[1]"));
			ERP.click();
			Thread.sleep(500);
			WebElement Stock = driver.findElement(By.xpath("(//p[@title='Stock'])[1]"));
			Stock.click();
			Thread.sleep(500);
	    }

	    @Then("close the browser ERP")
	    public void close_the_browser() {
	        driver.quit();
	    }
}
