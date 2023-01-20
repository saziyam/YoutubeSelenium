package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubeLoginPage {

	public ChromeDriver driver;
	public Properties pr;
	
	public youtubeLoginPage(ChromeDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	public void Login(String user_name, String pass_word) throws InterruptedException {
		
	WebElement username= driver.findElement(By.xpath(pr.getProperty("username")));
	username.sendKeys(user_name);
	WebElement nextbutton = driver.findElement(By.xpath(pr.getProperty("nextbutton")));
	nextbutton.click();
	Thread.sleep(10000);
	WebElement password = driver.findElement(By.xpath(pr.getProperty("password")));
	password.sendKeys(pass_word);
	WebElement passwordnextbutton = driver.findElement(By.xpath(pr.getProperty("passwordnextbutton")));
	passwordnextbutton.click();
	}
	
}
//dummytest649@gmail.com
//dummytest@2022