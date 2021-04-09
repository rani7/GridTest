package selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid{
	
	public static void main(String[] args) throws MalformedURLException {
		
	//def desired capabilties
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	
	//def chrome options
	ChromeOptions options=new ChromeOptions();
	options.merge(cap);
	
	String hubUrl="http://192.168.29.168:4444/wd/hub";
	WebDriver driver=new RemoteWebDriver(new URL(hubUrl),options);
	
	driver.get("https://www.google.co.in");
	System.out.println(driver.getTitle());
	
	//driver.quit();
  }
}

