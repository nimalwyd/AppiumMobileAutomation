package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fulltestStepDefinitionsWithTablesMap {
// DataTable with Maps	
WebDriver driver;
	
	@Given("^home page is loaded with origin and destination_ok$")
	public void home_page_is_loaded_with_origin_and_destination_ok(DataTable arg1) throws Throwable {
		for( Map<String,String> data:  arg1.asMaps(String.class, String.class)) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nimal\\eclipse-workspace\\NimalAutomationFramework\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("https://www.ca.kayak.com/flights");
		Thread.sleep(1000);
		List<WebElement> fromPlace = driver.findElements(By.xpath("//*[contains(@id,'-origin-airport-display-inner')]"));
		fromPlace.get(0).click();
		Thread.sleep(1000);

		List<WebElement> fromPlaceTextBox = driver.findElements(By.xpath("//*[contains(@id,'-origin-airport-smarty-wrapper')]//*[contains(@id,'-origin-airport')]"));
		fromPlaceTextBox.get(0).sendKeys(data.get("origin")); //0th row 0th column		
		
	    throw new PendingException();
		}
	}


@When("^homepage title is verified ok$")
public void homepage_title_is_verified_ok() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^round trip journey is selected ok$")
public void round_trip_journey_is_selected_ok() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^one adult is selected ok$")
public void one_adult_is_selected_ok() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^economy is selected ok$")
public void economy_is_selected_ok() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^origin is entered as YYZ ok$")
public void origin_is_entered_as_YYZ_ok() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^destination is entered as BLR ok$")
public void destination_is_entered_as_BLR_ok() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^departure date is selcted ok$")
public void departure_date_is_selcted_ok() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Arrival date is selected ok$")
public void arrival_date_is_selected_ok() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Search button is clicked ok$")
public void search_button_is_clicked_ok() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


}