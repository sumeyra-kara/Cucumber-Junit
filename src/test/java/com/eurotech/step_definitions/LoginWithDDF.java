package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utility.ExcelUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginWithDDF {
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    @When("user enters {string} sheet name and {int}")
    public void user_enters_sheet_name_and(String sheetName, int rowNumber) {
       // ExcelUtil excelUtil = new ExcelUtil("src/test/resources/DevEx.xlsx",sheetName);
       //List<Map<String, String>> dataList = excelUtil.getDataList();
       // loginPage.login(dataList.get(rowNumber).get("Username"),dataList.get(rowNumber).get("Password"));
        loginPage.login(loginPage.getDataList(sheetName).get(rowNumber).get("Username"),loginPage.getDataList(sheetName).get(rowNumber).get("Password"));
        // bu kisa dinamik method ile de yapilabilir
    }
    @Then("verify that welcome message contains {string} {int} in excel")
    public void verify_that_welcome_message_contains_in_excel(String sheetName, int rowNumber) {
        //ExcelUtil excelUtil = new ExcelUtil("src/test/resources/DevEx.xlsx",sheetName);
        //List<Map<String, String>> dataList = excelUtil.getDataList();
        //Assert.assertTrue(dashboardPage.welcomeText.getText().contains(dataList.get(rowNumber).get("Name")));
        Assert.assertTrue(dashboardPage.welcomeText.getText().contains(loginPage.getDataList(sheetName).get(rowNumber).get("Name")));
    }
}
