package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubeLogOut {
	ChromeDriver driver;
	Properties pr;
	public youtubeLogOut(ChromeDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
		
	}
	public void LogOut() throws InterruptedException{
		Thread.sleep(1000);
		WebElement logout = driver.findElement(By.xpath(pr.getProperty("logout")));
		logout.click();
	}
}
