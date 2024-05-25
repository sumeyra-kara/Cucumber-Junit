package com.eurotech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenu_StepDefs {
    @Given("Login as Teacher")
    public void login_as_teacher() {
        System.out.println("Login as Teacher");
    }
    @When("At first get the text of welcome")
    public void at_first_get_the_text_of_welcome() {
        System.out.println("At first get the text of welcome");
    }
    @Then("Then go to Developers menu and get the text of Developers")
    public void hen_go_to_developers_menu_and_get_the_text_of_developers() {
        System.out.println("Then go to Developers menu and get the text of Developers");
    }

    @Given("Login as Student")
    public void loginAsStudent() {
        System.out.println("Login as Student");
    }

    @When("Get the text of welcome")
    public void getTheTextOfWelcome() {
        System.out.println("Get the text of welcome");
    }

    @Then("Then go to All Posts menu and get the text of Posts")
    public void thenGoToAllPostsMenuAndGetTheTextOfPosts() {
        System.out.println("Get the text of welcome");
    }
    @When("Set the text of welcome")
    public void setTheTextOfWelcome() {
        System.out.println("Set the text of welcome");
    }

    @Then("Then go to My Account menu and get the text of Dashboard")
    public void thenGoToMyAccountMenuAndGetTheTextOfDashboard() {
        System.out.println("Then go to My Account menu and get the text of Dashboard");
    }
}

