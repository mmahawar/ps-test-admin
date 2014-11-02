package com.ps.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
	
	private WebDriver driver;
	
	public AdminHomePage(WebDriver driver) {
		this.driver = driver;
	}	
	
	public OrderPage searchOrderController(){
		return PageFactory.initElements(driver, OrderPage.class);
	}

	public String getTopResultTitle() {
		return null;
	}

}
