package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	@Given("^I enter  username \"([^\"]*)\"$")
	public void i_enter_username(String arg1) {
		System.out.println("method works");
	}

	@Given("^I enter  password \"([^\"]*)\"$")
	public void i_enter_password(String arg1) {
	}

	@When("^I click the login button$")
	public void i_click_the_login_button() {
	}

	@Then("^I should see the dashboard$")
	public void i_should_see_the_dashboard() {
	}

	@Then("^I click the Accounts tab$")
	public void i_click_the_Accounts_tab() {
	}

	@Then("^I click the new button$")
	public void i_click_the_new_button() {
	}

	@Then("^I should see Account Name field$")
	public void i_should_see_Account_Name_field() {
	}

	@Then("^I should see Account Number field$")
	public void i_should_see_Account_Number_field() {
	}

	@Then("^i should see Type field with different option$")
	public void i_should_see_Type_field_with_different_option() {
	}

	@When("^I click Save button$")
	public void i_click_Save_button() {
	}

	@Then("^I should see the record$")
	public void i_should_see_the_record() {
	}


}
