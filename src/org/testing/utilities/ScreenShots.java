package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {
	public static void screen_Capture(ChromeDriver driver, String fileWithPath) throws IOException {
		
			//Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			//Move image file to new destination
			File DestFile=new File(fileWithPath);
			//Copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);
			}
		/*File screenshortsrc = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshortsrc, new File(path));*/

	}

	/*
	 * test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+
	 * "Test Failed"); public static String capture(WebDriver driver) throws
	 * IOException { File scrFile = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); File Dest = new
	 * File("src/../BStackImages/" + System.currentTimeMillis() + ".png"); String
	 * errflpath = Dest.getAbsolutePath(); FileUtils.copyFile(scrFile, Dest); return
	 * errflpath; }
	 */