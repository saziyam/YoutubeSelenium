package org.testing.testScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Browser.BaseChrome;
import org.testing.Pages.HomePage;
import org.testing.Pages.youtubeLogOut;
import org.testing.Pages.youtubeLoginPage;
import org.testing.utilities.Assertions;
import org.testing.utilities.LogCapture;
import org.testing.utilities.ScreenShots;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase1 extends BaseChrome {
	public static ExtentTest test;

	@Test
	public void login_Tending() throws InterruptedException, IOException {
		test = report.startTest("trending_Click_TC1", "Trending Click is OK ");
		
		//Validate title
		test.log(LogStatus.INFO, "validate Title ");
		System.out.println(driver.getTitle());
		String ExpectedURL = "YouTube";
		//hard
		//Assert.assertEquals(driver.getTitle(), ExpectedURL);
		//soft
		Assertions.assertion(driver.getTitle(),ExpectedURL);
		test.log(LogStatus.PASS, "validate Title successfully");
		LogCapture.capture_log("TestCase1", " validate title is succesfully");

		// validate login
		youtubeLoginPage login = new youtubeLoginPage(driver, pr);
		test.log(LogStatus.INFO, "validate login details ");
		login.Login("dummytest649@gmail.com", "dummytest@2022");
		test.log(LogStatus.PASS, "Enter Password and Usename  succesfully");
		String  tital=driver.getTitle();
		System.out.println(tital);
		test.log(LogStatus.PASS, tital);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// HomePage.Menu_OptionClick();

		
		// Captured log
		LogCapture.capture_log("TestCase1", "Login succesfully");

		// logging
		test.log(LogStatus.INFO, "validate Trending Click");
		HomePage Trending = new HomePage(driver, pr);
		Trending.trending_Click();
	
		LogCapture.capture_log("TestCase1", " Click on Trending succesfully");
		ScreenShots.screen_Capture(driver, "../YTFramwork/Screensshots/Trending.jpg");
	
		test.log(LogStatus.PASS, "validate Trending successfully");
		test.addScreenCapture("../YTFramwork/Screensshots/Trending.png");
		//test.log(LogStatus.PASS, test.addScreenCapture(ScreenShots.screen_Capture(driver,"Trending Click Pass")));
		test.log(LogStatus.PASS, test.addScreenCapture("/Users/saziya/eclipse-workspace/YTFramwork/Screensshots/Trending.jpg"));
		// taken Screenshot
		//ScreenShots.screen_Capture(driver, "../YTFramwork/Screensshots/trending.png");

		// logging out
		LogCapture.capture_log("TestCase1", "Navigate to Logout using Profile ");
		test.log(LogStatus.INFO, "validate logout");
		HomePage.Profile_click();
		youtubeLogOut logout = new youtubeLogOut(driver, pr);
		logout.LogOut();
		test.log(LogStatus.PASS, "logout Succesfully");
		LogCapture.capture_log("TestCase1", "Logout Succefully");

		report.endTest(test);
		report.flush();
	}
}
