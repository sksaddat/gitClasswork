package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseClass;

public class LoginTest extends BaseClass {
	
	@Given("^I open chrome browser$")
	public void i_open_chrome_browser() {
		openBrowser();
	}

	@Given("^I enter  username \"([^\"]*)\"$")
	public void i_enter_username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("^I enter  password \"([^\"]*)\"$")
	public void i_enter_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^I click the login button$")
	public void i_click_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}

	@Then("^I should see the dashboard$")
	public void i_should_see_the_dashboard() {
		Assert.assertTrue(driver.findElement(By.linkText("Accounts")).isDisplayed());
		driver.findElement(By.linkText("Accounts")).click(); 
	}

	@Then("^I click the Accounts tab$")
	public void i_click_the_Accounts_tab() {
		driver.findElement(By.linkText("Accounts")).click();
	}

	@Then("^I click the new button$")
	public void i_click_the_new_button() {
		driver.findElement(By.name("new")).click();
	}

	@Then("^I should see Account Name field$")
	public void i_should_see_Account_Name_field() {
		driver.findElement(By.id("acc2")).sendKeys("Salwa ");

	}
	@Then("^I should see Account Number field\\(\"([^\"]*)\"\\)$")
	public void i_should_see_Account_Number_field(String AccountNumber) {
		driver.findElement(By.id("acc5")).sendKeys(AccountNumber);
	}

	@Then("^i should see Type field with different option$")
	public void i_should_see_Type_field_with_different_option(String value) {
			WebElement typesel=driver.findElement(By.id("acc6"));
			Select type=new Select(typesel);
			type.selectByVisibleText(value);
	}

	@When("^I click Save button$")
	public void i_click_Save_button() {
	}

	@Then("^I should see the record$")
	public void i_should_see_the_record() {
	
	}




}
