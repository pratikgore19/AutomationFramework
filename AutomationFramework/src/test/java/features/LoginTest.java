package features;

import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class LoginTest extends ApplicationKeywords {
	ApplicationKeywords app = new ApplicationKeywords();
	
	@Test
	public void loginTest() {
		app.openBrowser("chrome");
		app.launchUrl("https://www.selenium.dev/downloads/");
		app.closeBrowser();
	}
}
