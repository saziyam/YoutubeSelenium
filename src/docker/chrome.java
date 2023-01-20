package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class chrome {
	@Test 
	public static void demo_grid() throws MalformedURLException
	{
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);
		driver.get("https://www.facebook.com/signin");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	}
}
