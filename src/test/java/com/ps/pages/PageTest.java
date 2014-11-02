package com.ps.pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class PageTest {
	protected WebDriver driver;

	
	@Before
	public void setupSelenium() {
		// TODO this should initialize driver based on a parameter
		// we should be able to pass and initialize the drivers 
		System
		driver = new ChromeDriver();
		
	}

	@After
	public void closeSelenium() {
		driver.close();
		driver.quit();
	}
}
