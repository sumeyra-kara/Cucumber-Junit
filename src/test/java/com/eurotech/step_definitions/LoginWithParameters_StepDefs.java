package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithParameters_StepDefs {
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage =new DashboardPage();
    @When("user enters {string} email")
    public void user_enters_email(String email) {
        loginPage.inputEmail.sendKeys(email);

    }
    @When("user enters {string} password")
    public void user_enters_password(String password) {
        loginPage.inputPassword.sendKeys(password);

    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.loginButton.click();

    }
    @Then("verify that user should be able to see {string} text")
    public void verify_that_user_should_be_able_to_see_text(String username) {
        Assert.assertTrue(dashboardPage.welcomeText.getText().contains(username));
    }

    @Then("Example {int}")
    public void example(int number) {
    }


}
