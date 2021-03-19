package com.facebook.pages;

import com.facebook.genericPage.MasterPage;

public class LoginPage extends MasterPage {

	public LoginPage() throws Exception {
		super();
	}

	// Click Email Or Phone
	public void clickEmailOrPhone() {
		click("EmailOrPhone");
	}

	// Enter Username
	public void enterUsername() {
		sendData("EmailOrPhone", "abc@gmail.com");		
	}

	// Click Password
	public void clickPassword() {
		click("Password");
	}
	
	// Enter Password
	public void enterPassword() {
		sendData("Password", "qgwe6732");
	}
	
	// Click Login Button
	public void clickLoginButton() {
		click("LoginButton");
	}

}
