package com.eurotech.pages;

import com.eurotech.utility.ConfigReader;
import com.eurotech.utility.Driver;
import com.eurotech.utility.ExcelUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class LoginPage {
    /*
   Page class'lari surekli kullandigimiz locate islemleri ve varsa login gibi kücük islevleri iceren methodlar barindirir.
   Selenium ile locate islemi veya herhangi bir islev gerceklestirmek istedigimizde, WebDriver objesine ihtiyac vardir.

   Pom'da Driver class'inda olusturdugumuz WebDriver driver objesini page class'larina tanimlamak icin PageFactory
   class'indan initElements() kullanilir.

   Pom Design Pattern, Page Object Model
    */
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        /* Bir page class’i olusturdugumuzda ilk isimiz bir constructor olusturup, pageFactory class’indan
        initElements() method’unu kullanmak olmalidir.
        */
        // Bu ayari constructor icine koyma sebebimiz: page sayfalarina obje olusturularak ulasildigi icin,
        // kim page sayfasini kullanmak isterse, page sayfasindan obje olusturmak icin, constructor calisacak ve
        // bu constructor'in icinde bulunan initElements() gerekli ayari yapmis olacak
    }
    //@FindBy notasyonu test class’larinda kullanacagimiz Web Elementlerini Page sayfasinda locate etmek icin kullanilir

    @FindBy(id = "rcc-confirm-button") // cookies'ler icin
    public WebElement confirmButton;
    @FindBy(id = "loginpage-input-email") // email
    public WebElement inputEmail;

    @FindBy(id = "loginpage-form-pw-input") // password
    public WebElement inputPassword;

    @FindBy (id = "loginpage-form-btn") // login Button icin
    public WebElement inputLogin;

    @FindBy(xpath = "//input[@id='loginpage-form-btn']")
    public WebElement loginButton;
    @FindBy (xpath = "//div[text()='Invalid Credentials!']") // uyari yazisi
    public WebElement inputWarnung;

    @FindAll({ // logical OR
            @FindBy(id = "loginpage-input-email"),
            @FindBy(name = "email")
    })
    public WebElement inputEmailFindAll;

    @FindBys({ // logical AND
            @FindBy(id = "loginpage-form-pw-input"),
            @FindBy(xpath = "//input[@name='password']")
    })
    public WebElement inputPasswordFindBys;

    public void loginTeacher(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        confirmButton.click();
        inputEmail.sendKeys(ConfigReader.getProperty("teacherEmail"));
        inputPassword.sendKeys(ConfigReader.getProperty("teacherPassword"));
        inputLogin.click();
    }
    public void loginStudent(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        confirmButton.click();
        inputEmail.sendKeys(ConfigReader.getProperty("studentEmail"));
        inputPassword.sendKeys(ConfigReader.getProperty("studentPassword"));
        inputLogin.click();
    }

    public void login(String loginwith){
        if (loginwith.equals("Teacher")){
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            confirmButton.click();
            inputEmail.sendKeys(ConfigReader.getProperty("teacherEmail"));
            inputPassword.sendKeys(ConfigReader.getProperty("teacherPassword"));
            inputLogin.click();
        }else{
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            confirmButton.click();
            inputEmail.sendKeys(ConfigReader.getProperty("studentEmail"));
            inputPassword.sendKeys(ConfigReader.getProperty("studentPassword"));
            inputLogin.click();
        }
    }

    public void login (String username, String password){
       // Driver.getDriver().get(ConfigReader.getProperty("url"));
        //confirmButton.click();
        inputEmail.sendKeys(username);
        inputPassword.sendKeys(password);
        inputLogin.click();
    }

    public List<Map<String, String>> getDataList(String sheetName){
        ExcelUtil excelUtil = new ExcelUtil("src/test/resources/DevEx.xlsx",sheetName);
        List<Map<String, String>> dataList = excelUtil.getDataList();
        return dataList;
    }

}
