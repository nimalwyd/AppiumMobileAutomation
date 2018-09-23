
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
package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.crm.qa.testcases.HomePageTest;
import com.crm.qa.util.TestUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestBase {

	public static AppiumDriver<MobileElement> driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;

	public static HomePageTest homePageTest;
	public static TestUtil testUtil;
	public static int currentTestCase = 0;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/crm" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() throws MalformedURLException {

		String phoneOS = prop.getProperty("platformName");

		if (phoneOS.equals("android")) {

			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "My Phone");
			caps.setCapability("udid", prop.getProperty("udid")); // Give Device ID of your mobile phone
			caps.setCapability("platformName", prop.getProperty("platformName"));
			caps.setCapability("platformVersion", prop.getProperty("platformVersion"));
			caps.setCapability("appPackage", prop.getProperty("appPackage"));
			caps.setCapability("appActivity", prop.getProperty("appActivity"));
			caps.setCapability("noReset", "true");
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			
			/*driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			File classpathRoot = new File(System.getProperty("user.dir")); File appDir =
			 new File(classpathRoot, "/Apps/"); File app = new File(appDir,
			  "selendroid-test-app-0.17.0.apk");
			  DesiredCapabilities capabilities = new DesiredCapabilities();
			  capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			  capabilities.setCapability("deviceName", "My phone");
			  capabilities.setCapability("platformVersion", "6.0");
			  capabilities.setCapability("platformName", "Android");
			  capabilities.setCapability("app", app.getAbsolutePath());
			  capabilities.setCapability("appPackage", "io.selendroid.testapp");
			 capabilities.setCapability("appActivity",
			  "io.selendroid.testapp.HomeScreenActivity"); AndroidDriver driver; driver =
			  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			  driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);*/
			 
		} else if (phoneOS.equals("windows")) {

		} else if (phoneOS.equals("ios")) {

		}


	}

}
