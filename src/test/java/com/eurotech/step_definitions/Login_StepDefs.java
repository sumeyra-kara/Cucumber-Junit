package com.eurotech.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("user is on the logen page");
    }
    @When("user enters teacher username")
    public void user_enters_teacher_username() {
        System.out.println("user enters teacher username");
    }
    @When("user enters teacher password and clicks login button")
    public void user_enters_teacher_password_and_clicks_login_button() {
        System.out.println("user enters teacher password and clicks login button");
    }
    @Then("verify that user should be able to login")
    public void verify_that_user_should_be_able_to_login() {
        System.out.println("verify that user should be able to login");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user entered student username");
    }

    @And("user enters student password and clicks login button")
    public void userEntersStudentPasswordAndClicksLoginButton() {
        System.out.println("user entered student password and clicks login button");
    }
}
