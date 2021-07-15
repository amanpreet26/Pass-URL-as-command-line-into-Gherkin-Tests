package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TitleSteps {
	
	public static	WebDriver driver;
	BaseClass bc;
	//BaseClass bc= new BaseClass(); 
	public TitleSteps(BaseClass bc) {
		this.bc = bc;	
		driver=bc.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@Given("I launched the browser")
	public void i_launched_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("I opened the AUT")
	public void i_opened_the_AUT() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getCurrentUrl());
	}

	@Then("I validate the title of the page")
	public void i_validate_the_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		String ActualTitle= driver.getTitle();
		System.out.println("Tile:"+ActualTitle);
		Assert.assertEquals("Expected of the AUT", ActualTitle);
	}

	@Then("close the AUT")
	public void close_the_AUT() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}
}
