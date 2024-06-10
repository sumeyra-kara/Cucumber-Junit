package com.eurotech.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){} // baska classlardan obje olusturulmasin diye
    private static InheritableThreadLocal <WebDriver> driverPool = new InheritableThreadLocal<>(); // classname ile cagirmam icin static yapiyoruz
    // encapsülation kullanmak istedigimden private oluyor
    public static WebDriver getDriver(){
        String browser = ConfigReader.getProperty("browser");

        if (driverPool.get()==null){
            if (System.getProperty("BROWSER")==null) {
                browser = ConfigReader.getProperty("browser");
            }else {
                browser = System.getProperty("BROWSER");
            }

            switch (browser.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver(new FirefoxOptions().setHeadless(true)));
                    break;
                case "edge":
                    if (System.getProperty("os.name").contains("MAC")){ // mac'de edge calismadigi icin
                        throw new WebDriverException("Your Operating System does not support");
                    }
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new EdgeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    break;
                case "ie":
                    if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new WebDriverException("Your operating system does not support the requested browser");
                    }
                    WebDriverManager.iedriver().setup();
                    driverPool.set(new InternetExplorerDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    break;
                case "safari" :
                    if (System.getProperty("os.name").contains("WINDOWS")){
                        throw new WebDriverException("Your Operating System does not support");
                    }
                    WebDriverManager.safaridriver().setup();
                    driverPool.set(new SafariDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    break;

                case "remote-chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setCapability("platform", Platform.ANY);
                    try {
                        driverPool.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions));
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    break;
                case "remote-firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setCapability("platform", Platform.ANY);
                    try {
                        driverPool.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxOptions));
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    break;
                default:
                    System.out.println("Invalid driver");
            }
        }
        return driverPool.get();
    }
    public static void closeDriver(){
        if (driverPool.get()!=null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
