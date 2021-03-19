package com.facebook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;

public class LoginTest{

	@Test
	public void doLoginTest() throws Exception {
		LoginPage lp = new LoginPage();

		lp.clickEmailOrPhone();
		lp.enterUsername();
		lp.clickPassword();
		lp.enterPassword();
		lp.clickLoginButton();
	}

	@AfterClass
	public static void closeLoginPage() {
		MasterPage.driver.close();
	}
}
