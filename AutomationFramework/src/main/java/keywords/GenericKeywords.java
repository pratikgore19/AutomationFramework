package keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class GenericKeywords {
	public WebDriver driver = null;
	
	public void openBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized", "--disable-infobars");
			options.addArguments("--disable-extensions");
			options.addArguments("--incognito");
			options.addArguments("--disable-extensions");
			options.addArguments("--ignore-certificate-error");
			
			driver = new ChromeDriver(options);
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			
			ProfilesIni profiles = new ProfilesIni();
			FirefoxProfile ffprofile = profiles.getProfile("TestUser");
			
			ffprofile.setPreference("dom.webnotifications.enabled",false);
			ffprofile.setAcceptUntrustedCertificates(true);
			ffprofile.setAssumeUntrustedCertificateIssuer(false);
			
			
			options.setProfile(ffprofile);
			
			driver = new FirefoxDriver(options);
		} else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void launchUrl(String url) {
		driver.get(url);
	}

	public void navigate() {
	}

	public void type() {

	}

	public void select() {

	}

	public void getText() {

	}

	public void acceptAlert() {

	}

	public void dismissAlert() {

	}
}
