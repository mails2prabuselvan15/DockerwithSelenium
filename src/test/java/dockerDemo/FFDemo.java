package dockerDemo;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FFDemo {
	
	@Test
	public void FireFoxExecution() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4546/wd/hub"),cap);
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Learn Docker");
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	
}
