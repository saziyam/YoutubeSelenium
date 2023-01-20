package org.testing.testScript;

import java.util.List;

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

//chanel subsribe
public class TestCase8 extends BaseChrome {

	@Test
	//login for subscribe
	public void subscribevedio_TC8() throws InterruptedException {
		youtubeLoginPage login=new youtubeLoginPage(driver, pr);
		login.Login("dummytest649@gmail.com","dummytest@2022");
		Thread.sleep(5000);
		//login.Menu_OptionClick();
		Thread.sleep(50000);
		
		HomePage subscribe=new HomePage(driver, pr);
		subscribe.youtube_list_vedio();
		subscribe.subscribe_vedio();
		HomePage.Profile_click();

		youtubeLogOut logout=new youtubeLogOut(driver, pr);
		logout.LogOut();

	}

}
