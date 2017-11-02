package hu.letscode.pages;

import static junit.framework.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {

	private WebDriver webDriver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		webDriver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		webDriver.close();
	}

	@Test
	public void testHomePageShouldBeDisplayed() {
	    // GIVEN
		// WHEN
		webDriver.get("https://app.letscode.hu");
	    // THEN

	}

}
