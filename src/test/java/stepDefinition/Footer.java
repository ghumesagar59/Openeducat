package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.*;
import utils.DriverFactory;

public class Footer {
	
	WebDriver driver = DriverFactory.getDriver();

    @Given("User is on website home page for footer automate")
    public void user_is_on_website_home_page_for_footer_automate() throws InterruptedException {

        driver.get("https://openeducat.org/");
        Thread.sleep(5000);
        
    }

    @And("user click to Implementation in the footer")
    public void click_implementation_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Implementation'])[1]")).click();
    }

    @And("user click to Consulting in the footer")
    public void click_consulting_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Consulting'])[1]")).click();
    }

    @And("user click to Integration in the footer")
    public void click_integration_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Integration'])[1]")).click();
    }

    @And("user click to Training in the footer")
    public void click_training_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Training'])[1]")).click();
    }



    @And("user click to Elite in the footer")
    public void click_elite_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Elite'])[1]")).click();
    }

    @And("user click to Premium in the footer")
    public void click_premium_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Premium'])[1]")).click();
    }

    @And("user click to Associate in the footer")
    public void click_associate_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Associate'])[1]")).click();
    }

    @And("user click to Become a Partner in the footer")
    public void click_become_partner_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Become a Partner'])[1]")).click();
    }

    @And("user click to Partners Directory in the footer")
    public void click_partners_directory_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Partners Directory'])[1]")).click();
    }

    @And("user click to OpenEduCat OEM in the footer")
    public void click_openeducat_oem_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='OpenEduCat OEM'])[1]")).click();
    }



    @And("user click to Documentation in the footer")
    public void click_documentation_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Documentation'])[1]")).click(); 
    }

    @And("user click to Compare Edition in the footer")
    public void click_compare_edition_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Compare Edition'])[1]")).click();     
    }

    @And("user click to Forum in the footer")
    public void click_forum_footer() {
        driver.findElement(By.xpath("(//a[@title='Forum'][normalize-space()='Forum'])[2]")).click();     
    }

    @And("user click to Blog in the footer")
    public void click_blog_footer() {
        driver.findElement(By.xpath("(//a[@title='Blog'][normalize-space()='Blog'])[2]")).click();     
    }

    @And("user click to FAQ in the footer")
    public void click_faq_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='FAQ'])[1]")).click();     
    }

    @And("user click to Release Notes in the footer")
    public void click_release_notes_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Release Notes'])[1]")).click();     
    }

    @And("user click to Open Source Licensing Demystified in the footer")
    public void click_open_source_licensing_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Open Source Licensing Demystified'])[1]")).click();     
    }



    @And("user click to Clients in the footer")
    public void click_clients_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Clients'])[1]")).click();     
    }

    @And("user click to Code in the footer")
    public void click_code_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Code'])[1]")).click();     
    }

    @And("user click to Mobile App in the footer")
    public void click_mobile_app_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Mobile App'])[1]")).click();     
    }

    @And("user click to Brand Assets in the footer")
    public void click_brand_assets_footer() {
        driver.findElement(By.xpath("(//a[contains(text(),'Brand')])[1]")).click();     
    }

    @And("user click to Videos in the footer")
    public void click_videos_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Videos'])[1]")).click();     
    }

    @And("user click to Downloads in the footer")
    public void click_downloads_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Downloads'])[1]")).click();     
    }



    @And("user click to About Us in the footer")
    public void click_about_us_footer() {
        driver.findElement(By.xpath("(//a[contains(text(),'About')])[1]")).click();     
    }

    @And("user click to What We Do in the footer")
    public void click_what_we_do_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='What We Do'])[1]")).click();     
    }

    @And("user click to Legal in the footer")
    public void click_legal_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Legal'])[1]")).click();     
    }

    @And("user click to In The News in the footer")
    public void click_in_the_news_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='In The News'])[1]")).click();     
    }

    @And("user click to Events in the footer")
    public void click_events_footer() {
        driver.findElement(By.xpath("(//a[@href='/events'])[1]")).click();     
    }

    @And("user click to Career in the footer")
    public void click_career_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Career'])[1]")).click();     
    }



    @And("user click to General Terms of Sale in the footer")
    public void click_general_terms_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='General Terms Of Sale'])[1]")).click();     
    }

    @And("user click to Return & Refund in the footer")
    public void click_return_refund_footer() {
        driver.findElement(By.xpath("(//a[contains(text(),'Return &')])[1]")).click();     
    }

    @And("user click to Privacy Policy in the footer")
    public void click_privacy_policy_footer() {
        driver.findElement(By.xpath("(//a[contains(text(),'Privacy')])[1]")).click();     
    }

    @And("user click to Disclaimer in the footer")
    public void click_disclaimer_footer() {
        driver.findElement(By.xpath("(//a[normalize-space()='Disclaimer'])[1]")).click();     
    }


    @Then("close the browser footer")
    public void close_the_browser_footer() {
        driver.quit();
    }
	
	
}
