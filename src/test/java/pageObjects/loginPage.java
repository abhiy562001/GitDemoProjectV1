package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	public WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"username\"]")
	private WebElement username;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement login;

	public void login(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		login.click();

	}
}
