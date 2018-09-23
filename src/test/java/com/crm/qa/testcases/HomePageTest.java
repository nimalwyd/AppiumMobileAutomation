
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

package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	HomePage homePage;

	TestUtil testUtil;
	String sheetName = "Sheet3";

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
	}

	@DataProvider
	public Object[][] getTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
		
	}

	
	@Test(priority = 1,dataProvider= "getTestData" )
	public void HomePageTestcase(String testCaseNo, String toBeExecuted, String text) {

		homePage.executeTestHomePage(text);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
