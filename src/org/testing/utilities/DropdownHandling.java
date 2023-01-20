package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//this utility class call when dropdown with Select tag 
public class DropdownHandling {
	public static void SelectbyValue(WebElement dropdown, String value) {
		Select s=new Select (dropdown);
		s.selectByValue(value);
			
	}
	public static void SelectbyIndex(WebElement dropdown, int index) {
		Select s=new Select (dropdown);
		s.deselectByIndex(index);
			
	}

	public static void SelectbyvisibleText(WebElement dropdown, String visibleText) {
		Select s=new Select (dropdown);
		s.deselectByVisibleText(visibleText);
			
	}
}
