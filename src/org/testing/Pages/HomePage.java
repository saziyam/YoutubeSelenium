package org.testing.Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	public static ChromeDriver driver;
	public static Properties pr;
	private static WebDriverWait wait;

	public HomePage(ChromeDriver driver, Properties pr) {
		HomePage.driver = driver;
		HomePage.pr = pr;
		HomePage.wait = new WebDriverWait(driver, 100);

	}

	/*
	 * public static void clickElement(String prop) throws InterruptedException {
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.
	 * getProperty(prop)))); WebElement e = driver.findElement(By.xpath(prop));
	 * e.click(); }
	 */
	// for refresh
	public static void Menu_OptionClick() throws InterruptedException {
		
		WebElement menu = driver.findElement(By.xpath(pr.getProperty("menu")));
		menu.click();
	}
	// Click on profile
	public static void Profile_click() throws InterruptedException {

		// Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("profile"))));
		WebElement profile = driver.findElement(By.xpath(pr.getProperty("profile")));
		profile.click();
	}

	// Click for Trending
	public void trending_Click() throws InterruptedException {

		// Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("trending"))));
		WebElement trending = driver.findElement(By.xpath(pr.getProperty("trending")));
		trending.click();

		// HomePage.clickElement("trending");
	}

	// Click for History Option
	public void History_Click() throws InterruptedException {
		// Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("history"))));
		WebElement history = driver.findElement(By.xpath(pr.getProperty("history")));
		history.click();

	}

	// Click for Subscribe Button
	public void subscribe() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("Subscrib"))));
		WebElement Subscrib = driver.findElement(By.xpath(pr.getProperty("Subscrib")));
		Subscrib.click();
		// Thread.sleep(5000);
	}

	// Click for Library option
	public void library_button() throws InterruptedException {
		Thread.sleep(3000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("library"))));
		WebElement library = driver.findElement(By.xpath(pr.getProperty("library")));
		library.click();

	}

	// Click for Watch later
	public void watch_later() throws InterruptedException {
		Thread.sleep(1000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("watch_later"))));
		WebElement watch_later = driver.findElement(By.xpath(pr.getProperty("watch_later")));
		watch_later.click();

	}

	// click on your _vedios
	public void your_Vedios() throws InterruptedException {
		String maintab = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("yourVedio"))));
		WebElement yourVedio = driver.findElement(By.xpath(pr.getProperty("yourVedio")));
		yourVedio.click();
		// String secondtab=driver.getCurrentUrl();
		// System.out.println(secondtab);
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow.size());
		Iterator<String> iterator = allwindow.iterator();

		Thread.sleep(1000);
		while (iterator.hasNext()) {
			String secondtab = iterator.next();
			if (!maintab.equalsIgnoreCase(secondtab)) {
				driver.switchTo().window(secondtab);
				// driver.switchTo().window(maintab);
				System.out.println(driver.getCurrentUrl());

			}
		}
	}

	// List of youtube webelements
	public void youtube_list_vedio() throws InterruptedException {
		Thread.sleep(1000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("allvideos"))));
		List<WebElement> allvideos = driver.findElements(By.xpath(pr.getProperty("allvideos")));
		System.out.println(allvideos.size());
		allvideos.get(4).click();
		System.out.println(driver.getCurrentUrl());

	}

	// click on like option
	public void like_vedio() throws InterruptedException {
		Thread.sleep(1000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("like"))));
		WebElement like = driver.findElement(By.xpath(pr.getProperty("like")));
		like.click();
		driver.navigate().back();
	}

	// click on subscribe
	public void subscribe_vedio() throws InterruptedException {
		Thread.sleep(1000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("subscribe"))));
		WebElement subscribe = driver.findElement(By.xpath(pr.getProperty("subscribe")));
		subscribe.click();

	}

	// comment click
	public void comment_click() throws InterruptedException {
		Thread.sleep(10000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		System.out.println("Scrolldown");
		Thread.sleep(10000);
		WebElement comment = driver.findElement(By.xpath(pr.getProperty("comment")));
		comment.click();
		System.out.println("text");
		Thread.sleep(3000);
		WebElement addcomment = driver.findElement(By.xpath(pr.getProperty("addcomment")));
		addcomment.sendKeys("test");

		System.out.println("add comment");

		System.out.println("comment is very nice");
		/*
		 * // WebElement postcomment = //
		 * driver.findElement(By.xpath("//button[@aria-label='comment...']"));
		 * 
		 * ac.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).keyUp(Keys.CONTROL).build().
		 * perform();
		 */
	}

	// search box
	public void search_box() throws InterruptedException {
		Thread.sleep(1000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("searchbox"))));
		WebElement searchbox = driver.findElement(By.xpath(pr.getProperty("searchbox")));
		searchbox.click();
		searchbox.sendKeys("cocomelon nursery rhymes");

		Actions selectsearch = new Actions(driver);
		selectsearch.sendKeys(Keys.ENTER).perform();

		/*
		 * WebElement play= driver.findElement(By.xpath("")); play.click();
		 */

		Thread.sleep(5000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("items"))));
		List<WebElement> items = driver.findElements(By.xpath(pr.getProperty("items")));

		System.out.println(items.size());
		items.get(2).click();
	}

}
