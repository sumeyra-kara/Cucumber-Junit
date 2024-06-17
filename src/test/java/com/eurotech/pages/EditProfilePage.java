package com.eurotech.pages;

import com.eurotech.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProfilePage extends BasePage{

    public WebElement inputField(String fieldName) {
        String fieldPath = "//*[@name='" + fieldName + "']";
        return Driver.getDriver().findElement(By.xpath(fieldPath));
    }
    @FindBy(xpath= "//input[@id='editprofile-from-addsocial-btn']")
    public WebElement sendenButton;
    @FindBy(xpath= "//div[@class='alert alert-success']")
    public WebElement alert;

    public void setYear (int year){
        int firstYear = Integer.parseInt(inputField("year").getAttribute("value"));
        for (int i = 0; i < firstYear; i++) {
            inputField("year").sendKeys(Keys.ARROW_LEFT);
        }
        int intYear = Integer.parseInt(String.valueOf(year));
        for (int i = 0; i < intYear; i++) {
            inputField("year").sendKeys(Keys.ARROW_RIGHT);
        }
    }

    @FindBy(id= "editprofile-from-status-select")
    public WebElement studentOrLearning;







    @FindBy(id= "slider-input")
    public WebElement howManyYear;

    @FindBy(id= "editprofile-from-company-input")
    public WebElement company;

    @FindBy(id= "editprofile-from-website-input")
    public WebElement website;

    @FindBy(id= "editprofile-from-location-input")
    public WebElement city;

    @FindBy(id= "ceditprofile-from-skills-input")
    public WebElement skills;

    @FindBy(id= "editprofile-from-github-input")
    public WebElement gitHupLink;


    @FindBy(id= "editprofile-from-bio-input")
    public WebElement about;






}
