package com.eurotech.step_definitions;

import com.eurotech.pages.AddEducationPage;
import com.eurotech.pages.DashboardPage;
import com.eurotech.utility.BrowserUtils;
import com.eurotech.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AddEducation_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    AddEducationPage addEducationPage = new AddEducationPage();

    @When("clicks on Add Education")
    public void clicks_on_add_education() {
        dashboardPage.addEducationButton.click();
    }
    @When("fill out all fields")
    public void fill_out_all_fields() {
        addEducationPage.schollBootcamp.sendKeys("Darmstadt Uni");
        addEducationPage.degreeorCertificate.sendKeys("OCA");
        addEducationPage.study.sendKeys("Informatik");
        addEducationPage.fromDate.sendKeys("02022012");
        addEducationPage.toDate.sendKeys("03032016");
        addEducationPage.programDescription.sendKeys("Java");
    }
    @When("clicks on submit button")
    public void clicks_on_submit_button() {
        addEducationPage.addEducationButton.click();
    }
    @Then("verify that education info is added under Education Credentials")
    public void verify_that_education_info_is_added_under_education_credentials() {
        Assert.assertEquals("Darmstadt Uni",Driver.getDriver().findElement(By.xpath("//table[@id='dashboard-education-table']//tbody//tr/td")).getText());

    }
}
