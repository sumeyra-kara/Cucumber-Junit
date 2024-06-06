package com.eurotech.step_definitions;

import com.eurotech.pages.AddEducationPage;
import com.eurotech.pages.BasePage;
import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.EditProfilePage;
import com.eurotech.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EditProfiles_StepDefs extends BasePage {
    DashboardPage dashboardPage = new DashboardPage();
    EditProfilePage editProfilePage = new EditProfilePage();

    @When("user clicks on the {string} dashboard menu")
    public void user_clicks_on_the_dashboard_menu(String menuName) {
        dashboardPage.dashboardMenu(menuName).click();
    }

    @When("user enters {string} field as {string}")
    public void user_enters_field_as(String fieldName, String fieldValue) {

        editProfilePage.inputField(fieldName).clear();
        editProfilePage.inputField(fieldName).sendKeys(fieldValue);
    }

    @When("user clicks on the submit button")
    public void user_clicks_on_the_submit_button() {
       editProfilePage.sendenButton.click();
    }

    @Then("verify that user should be able to see {string}")
    public void verifyThatUserShouldBeAbleToSee(String expected) {
        Assert.assertEquals(expected,editProfilePage.alert.getText());
    }

    @And("user clicks in career {string}")
    public void userClicksInCareer(String manager) {
        Select  select = new Select(editProfilePage.studentOrLearning);
        select.selectByVisibleText(manager);
    }

    @And("user clicks years {int}")
    public void userClicksYears(int year) {
       editProfilePage.setYear(year);
    }
}
