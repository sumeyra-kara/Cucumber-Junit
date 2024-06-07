package com.eurotech.step_definitions;

import com.eurotech.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigationMenuWithParameters_StepDefs {
    LoginPage loginPage=new LoginPage();
    BasePage basePage = new BasePage();
    PostsPage postsPage = new PostsPage();
    DashboardPage dashboardPage = new DashboardPage();
    DevelopersPage developersPage = new DevelopersPage();

    @Given("Login as {string}")
    public void login_as(String loginWith) {
      loginPage.login(loginWith);
    }

    @Then("Then go to {string} menu")
    public void then_go_to_menu(String menuName) {
        basePage.menuBar(menuName).click();
    }
    @Then("get the text of Developers")
    public void get_the_text_of_developers() {
        System.out.println("developersPage.text.getText() = " + developersPage.developersText.getText());
    }

    @Then("get the text of All Posts")
    public void get_the_text_of_all_posts() {
        System.out.println("postsPage.postsText.getText() = " + postsPage.postsText.getText());
    }

    @Then("get the text of Dashboard")
    public void get_the_text_of_dashboard() {
        System.out.println("dashboardPage.dashboardText.getText() = " + dashboardPage.dashboardText.getText());
    }


    @Then("verify that user should be able to {string} header")
    public void verifyThatUserShouldBeAbleToHeader(String header) {
        Assert.assertEquals(header,basePage.pageHeader.getText());
    }

    @Then("get the text of {string}")
    public void getTheTextOf(String menuName) {
        System.out.println("basePage.pageHeader.getText() = " + basePage.pageHeader.getText());
    }

    @Then("user clicks on the {string} menu")
    public void user_clicks_on_the_menu(String menuName) {
        postsPage.menuBar(menuName).click();
    }
    @Then("verify that user should be able to see {string} header")
    public void verify_that_user_should_be_able_to_header(String header) {
        Assert.assertNotEquals(header,postsPage.pageHeader.getText());

    }
}
