package org.testing.testScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Browser.BaseChrome;
import org.testing.Pages.HomePage;
import org.testing.Pages.youtubeLogOut;
import org.testing.Pages.youtubeLoginPage;
import org.testng.annotations.Test;

//your video tab 
public class TestCase6 extends BaseChrome {
	@Test
	//login for your vedio
	public void your_vedios_TC6() throws InterruptedException {
		youtubeLoginPage login=new youtubeLoginPage(driver, pr);
		login.Login("dummytest649@gmail.com","dummytest@2022");
		Thread.sleep(5000);
	//	login.Menu_OptionClick();
		
		HomePage yourvedio=new HomePage(driver, pr);
		yourvedio.your_Vedios();
		HomePage.Profile_click();

		youtubeLogOut logout=new youtubeLogOut(driver, pr);
		logout.LogOut();
		System.out.println("second tab closed");

	}
}
