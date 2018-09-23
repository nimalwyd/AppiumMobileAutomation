
/**********************************************************************;
* Project           : Appium Mobile automation front end framework
*
* Program name      : AppiumAutomationFramework
*
* Author            : Nimal krishna
*
* Date created      : 20160816
*
* Purpose           : Simple Appium framework
*
* Revision History  :
*
* Date        Author      Ref    Revision (Date in YYYYMMDD format) 
* 20180818    Nimal      1      added BDD,TDD characters to the framework 
*
|**********************************************************************/

package com.crm.qa.pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.crm.qa.base.TestBase;
import com.crm.qa.testcases.HomePageTest;

import io.appium.java_client.MobileElement;

public class HomePage extends TestBase {
	HomePageTest homePageTest= new HomePageTest();

	public void executeTestHomePage(String textToType) 
	
	{		
		List<MobileElement> elementsOne = driver.findElements(By.xpath("//android.widget.TextView[@text='Wife new']"));
		elementsOne.get(0).click();
		List<MobileElement> elementsTwo = driver.findElements(By.xpath("//android.widget.EditText[@text='Type a message']"));
		elementsTwo.get(0).sendKeys(textToType);

	}
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	

}
