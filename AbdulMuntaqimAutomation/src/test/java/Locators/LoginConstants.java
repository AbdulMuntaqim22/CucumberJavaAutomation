package Locators;

import org.openqa.selenium.By;

public class LoginConstants {
	public LoginConstants(){
		
	}
public By  userNameTxt = By.id("user-name");
public By  passwordTxt = By.id("password");
public By  loginBtn = By.id("login-button");
public By mainPageLogo = By.xpath("//*[@class='header_label']//div[text()='Swag Labs']");
}
