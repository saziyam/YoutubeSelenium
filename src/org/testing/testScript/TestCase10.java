package org.testing.testScript;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testing.Browser.BaseChrome;
import org.testing.Pages.HomePage;
import org.testing.Pages.youtubeLogOut;
import org.testing.Pages.youtubeLoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//autosuggestion on youtube
public class TestCase10 extends BaseChrome {

	@Test
	// login for search
	public void search_vedio_TC10() throws InterruptedException {
		youtubeLoginPage login=new youtubeLoginPage(driver, pr);
		login.Login("dummytest649@gmail.com","dummytest@2022");
		Thread.sleep(5000);
		//login.Menu_OptionClick();
		Thread.sleep(50000);
		
		HomePage search=new HomePage(driver, pr);
		search.search_box();
		HomePage.Profile_click();

		youtubeLogOut logout=new youtubeLogOut(driver, pr);
		logout.LogOut();

	}
}
