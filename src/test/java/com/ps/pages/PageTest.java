package com.ps.pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class PageTest {
	protected WebDriver driver;

	@Before
	/**
	 * We need to pass the browser type or set it before running the test.
	 * 
	 * mvn test -Dselenium.browser.type=chrome
	 * we can pass two strings chorme or firefox
	 */
	public void setupSelenium() {
		driver = setupDriver(System.getProperty("selenium.browser.type"));
	}

	private WebDriver setupDriver(String browserType) {
		if (browserType == null) {
			return setupChrome();
		}
		switch (browserType) {
		case "chrome":
			return setupChrome();
		case "firefox":
			return setupFirefox();
		default:
			return setupChrome();
		}
	}

	private ChromeDriver setupChrome() {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriververbose");
		return new ChromeDriver();
	}
	private FirefoxDriver setupFirefox() {
		return new FirefoxDriver();
	}

	@After
	public void closeSelenium() {
		driver.close();
		driver.quit();
	}
}
