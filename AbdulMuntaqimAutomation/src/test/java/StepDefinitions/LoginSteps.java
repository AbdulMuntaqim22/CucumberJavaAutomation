package StepDefinitions;

import Locators.LoginConstants;
import SeleniumDriver.DriverManager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginConstants obj;
	WebDriver driver;
	public LoginSteps(){
		obj = new LoginConstants();
		driver = DriverManager.driver;
	}
	@Given("The user navigate to this URL: {string}")
	public void the_user_navigate_to_this_url_https_www_saucedemo_com(String url) {
	    driver.get(url);
	}
	@Given("The user is on Login Page")
	public void the_user_is_on_login_page() {
		Assert.assertTrue(driver.findElement(obj.userNameTxt).isDisplayed());
	}
	@When("The user enters {string} and {string}")
	public void the_user_enters_and(String username, String password) {
		driver.findElement(obj.userNameTxt).sendKeys(username);
		driver.findElement(obj.passwordTxt).sendKeys(password);
	}	

	@And("The user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		driver.findElement(obj.loginBtn).click();
	}
	@Then("the user is navigated to Dashboard")
	public void the_user_is_navigated_to_dashboard() {
		Assert.assertTrue(driver.findElement(obj.mainPageLogo).isDisplayed());
	}
	@Then("The following validation is displayed: {}")
	public void the_following_validation_is_displayed(String validation) {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(driver.findElement(By.xpath("//h3[@data-test='error' and text()='"+validation+"']")).isDisplayed());
	}
}
