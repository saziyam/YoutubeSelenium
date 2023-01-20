package org.testing.Browser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.utilities.ExtentReportt;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseChrome {
	public static ChromeDriver driver;
	public static Properties pr;
	public static ExtentReports report;
	public static ChromeOptions option ;
	
	@BeforeMethod
	public void browselaunch() throws InterruptedException, IOException {
		
		// for report generation  
		report = ExtentReportt.reports();
				
		System.setProperty("webdriver.chrome.driver",
				"/Users/saziya/eclipse-workspace/SeleniumPractice/drivers/chromedriver 2");
		
		// disable notification
		option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		// browser open
		driver = new ChromeDriver(option);
		driver.get("https://www.youtube.com/signin");
		Options op = driver.manage();
		Window w = op.window();
		w.maximize();
		
		// properties file read and load which contain element of website
		File propertiesfile = new File("../YTFramwork/youtubeElements.properties");
		FileReader fr = new FileReader(propertiesfile);
		pr = new Properties();
		pr.load(fr);
	}

	@AfterMethod
	public void BrowserClose() {
		driver.close();
		driver.quit();
	}

}
