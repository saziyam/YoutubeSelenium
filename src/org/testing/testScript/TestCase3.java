package org.testing.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Browser.BaseChrome;
import org.testing.Pages.HomePage;
import org.testing.Pages.youtubeLogOut;
import org.testing.Pages.youtubeLoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 extends BaseChrome {

	@Test
	// login fot Subscribtion
	
		public void subscribe_click_TC3() throws InterruptedException {
			youtubeLoginPage login=new youtubeLoginPage(driver, pr);
			login.Login("dummytest649@gmail.com","dummytest@2022");
			Thread.sleep(5000);
			//login.Menu_OptionClick();
			
			HomePage Subsrib =new HomePage(driver, pr);
			Subsrib.History_Click();;
			HomePage.Profile_click();
			
			youtubeLogOut logout=new youtubeLogOut(driver, pr);
			logout.LogOut();
		}


}
