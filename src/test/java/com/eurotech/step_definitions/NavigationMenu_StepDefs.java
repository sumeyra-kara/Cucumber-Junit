package com.eurotech.step_definitions;

import com.eurotech.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenu_StepDefs {

    LoginPage loginPage =new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    PostsPage postsPage = new PostsPage();
    DevelopersPage developersPage = new DevelopersPage();
    BasePage basePage = new BasePage();
    @Given("Login as Teacher")
    public void login_as_teacher() {
        loginPage.loginTeacher();
    }
    @When("At first get the text of welcome")
    public void at_first_get_the_text_of_welcome() {
        System.out.println("dashboardPage.welcomeText.getText() = " + dashboardPage.welcomeText.getText());

    }
    @Then("Then go to Developers menu and get the text of Developers")
    public void Then_go_to_developers_menu_and_get_the_text_of_developers() {
        basePage.menuBar("Developers").click();
        System.out.println("developersPage.text.getText() = " + developersPage.developersText.getText());
    }

    @Given("Login as Student")
    public void loginAsStudent() {
        loginPage.loginStudent();
    }

    @When("Get the text of welcome")
    public void getTheTextOfWelcome() {
        System.out.println("dashboardPage.welcomeText.getText() = " + dashboardPage.welcomeText.getText());
    }

    @Then("Then go to All Posts menu and get the text of Posts")
    public void thenGoToAllPostsMenuAndGetTheTextOfPosts() {
         basePage.menuBar("All Posts").click();
        System.out.println("postsPage.postsText.getText() = " + postsPage.postsText.getText());

    }
    @When("Set the text of welcome")
    public void setTheTextOfWelcome() {
        System.out.println("dashboardPage.welcomeText.getText() = " + dashboardPage.welcomeText.getText());
    }

    @Then("Then go to My Account menu and get the text of Dashboard")
    public void thenGoToMyAccountMenuAndGetTheTextOfDashboard() {
        basePage.menuBar("My Account").click();
        System.out.println("dashboardPage.dashboardText.getText() = " + dashboardPage.dashboardText.getText());

    }
}

