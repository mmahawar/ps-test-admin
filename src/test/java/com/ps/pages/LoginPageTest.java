package com.ps.pages;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LoginPageTest extends PageTest {

	@Test
	public void login() {
		LoginPage loginPage = LoginPage.navigateTo(driver);
		AdminHomePage adminHopePage = loginPage.login("3paul@outfittery.de", "a");
		assertThat(adminHopePage.getTopResultTitle(), is("xxxxx"));
	}

}
