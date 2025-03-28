package TestCases;

import org.testng.annotations.Test;

import baseTest.base;
import pageObjects.loginPage;

public class loginTest extends base {

	loginPage loginP;
    
	@Test(description = "verifying login with valid credential")
	public void verify_login_with_valid_credential() {
		loginP = new loginPage(driver);
		loginP.login("Admin", "admin123");
		System.out.println("user successfully logged in application with valid credential");
	}
	
	@Test(description = "verifying login with Invalid credential")
	public void verify_login_with_Invalid_credential() {
		loginP = new loginPage(driver);
		loginP.login("Admi", "admin123");
		System.out.println("verified login with invalid credential");
	}
	
}
