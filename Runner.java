package stepdefs;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features =  {"classpath:features/title.feature"}
)
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			   System.setProperty("webdriver.chrome.driver","C:\\Users\\amanpreet\\chromedriver.exe");
			   WebDriver driver = new ChromeDriver();
			   driver.get(args[0]);
			   BaseClass bc = new BaseClass();
			   bc.setDriver(driver);
		   }
		   catch(Exception e){
			   e.printStackTrace();
			   
		   }
	     JUnitCore.main(Runner.class.getName());
	}

}
