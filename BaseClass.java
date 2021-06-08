package stepdefs;

import org.openqa.selenium.WebDriver;

public class BaseClass {
static WebDriver driver;
	
	
	public WebDriver getDriver() {
		
	return driver;
}


public void setDriver(WebDriver driver) {
	
	this.driver = driver;
	System.out.println("Set Driver : "+driver);
}	
	
}
