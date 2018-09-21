/*package stepDefinitions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.base.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import com.crm.qa.testcases.HomePageTest;
public class fulltestStepDefinitions {
	
WebDriver driver;


@Before
public void setUp()
{

	System.out.println("initial setup..");
	
}

@After
public void tearDown()
{
	System.out.println("final  setup..");

	
}


@Given("^home page is loaded with \"(.*)\" and \"(.*)\"$")	
public void HomePageTitleIsVerfied(String fromPlacename, String toPlacename) throws IOException, InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nimal\\eclipse-workspace\\NimalAutomationFramework\\chromedriver.exe");	
	driver = new ChromeDriver(); 
	driver.get("https://www.ca.kayak.com/flights");
	Thread.sleep(1000);
	List<WebElement> fromPlace = driver.findElements(By.xpath("//*[contains(@id,'-origin-airport-display-inner')]"));
	fromPlace.get(0).click();
	Thread.sleep(1000);

	List<WebElement> fromPlaceTextBox = driver.findElements(By.xpath("//*[contains(@id,'-origin-airport-smarty-wrapper')]//*[contains(@id,'-origin-airport')]"));
	fromPlaceTextBox.get(0).sendKeys(fromPlacename);				
	}
	
@When("^homepage title is verified$")
public void homepage_title_is_verified() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^round trip journey is selected$")
public void round_trip_journey_is_selected() {
    // Write code here that turns the phrase above into concrete actions
}

@Then("^one adult is selected$")
public void one_adult_is_selected() {
    // Write code here that turns the phrase above into concrete actions
}

@Then("^economy is selected$")
public void economy_is_selected()  {
    // Write code here that turns the phrase above into concrete actions
}

@Then("^origin is entered as YYZ$")
public void origin_is_entered_as_YYZ() {
    // Write code here that turns the phrase above into concrete actions
}

@Then("^destination is entered as BLR$")
public void destination_is_entered_as_BLR()  {
    // Write code here that turns the phrase above into concrete actions
}

@Then("^departure date is selcted$")
public void departure_date_is_selcted() {
    // Write code here that turns the phrase above into concrete actions
}

@Then("^Arrival date is selected$")
public void arrival_date_is_selected()  {
    // Write code here that turns the phrase above into concrete actions
}

@Then("^Search button is clicked$")
public void search_button_is_clicked() {
    // Write code here that turns the phrase above into concrete actions
}
}
*/