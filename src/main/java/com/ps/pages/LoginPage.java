package com.ps.pages;

import static com.ps.constants.PsTestAdminConstants.BASE_URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;

	@FindBy(name = "j_username")
	@CacheLookup
	public WebElement username;

	@FindBy(name = "j_password")
	@CacheLookup
	private WebElement password;

	@FindBy(id = "submit")
	@CacheLookup
	private WebElement login;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public static LoginPage navigateTo(WebDriver driver) {
		driver.get(BASE_URL.getValue());
		return PageFactory.initElements(driver, LoginPage.class);
	}

	public AdminHomePage login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		login.click();
         
        //TODO : Search for errors and then decide the flow
		
		// either return success screen 
		return PageFactory.initElements(driver, AdminHomePage.class);

	}

}
