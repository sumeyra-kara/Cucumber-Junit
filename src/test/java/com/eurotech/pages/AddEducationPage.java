package com.eurotech.pages;

import com.eurotech.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddEducationPage extends BasePage {

    @FindBy(id = "addecutaion-form-addschool-btn")
    public WebElement schollBootcamp;
    @FindBy(id = "addecutaion-form-adddegree-btn")
    public WebElement degreeorCertificate;

    @FindBy(id = "addecutaion-form-addfield-btn")
    public WebElement study;
    @FindBy(id = "addecutaion-form-adddate-btn")
    public WebElement fromDate;
    @FindBy(name = "to")
    public WebElement toDate;
    @FindBy(name = "description")
    public WebElement programDescription;
    @FindBy(xpath = "//input[@class='btn btn-primary my-1']")
    public WebElement addEducationButton;






}
