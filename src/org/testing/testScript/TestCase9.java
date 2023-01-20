package org.testing.testScript;

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

//comment on any video
public class TestCase9 extends BaseChrome {
	@Test
	// login for comment
	public void comment_vedio_TC9() throws InterruptedException {
		youtubeLoginPage login=new youtubeLoginPage(driver, pr);
		login.Login("dummytest649@gmail.com","dummytest@2022");
		Thread.sleep(10000);
		//login.Menu_OptionClick();
		HomePage comment=new HomePage(driver, pr);
		comment.youtube_list_vedio();
		comment.comment_click();
		/*
		 * HomePage.Profile_click();
		 * 
		 * youtubeLogOut logout=new youtubeLogOut(driver, pr); logout.LogOut();
		 */

	}

}
