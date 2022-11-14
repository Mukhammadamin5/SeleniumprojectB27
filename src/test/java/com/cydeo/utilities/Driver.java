package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;
public class Driver {
    private static WebDriver webDriver;
    private Driver() {}

    public static WebDriver getDriver() {
        if (webDriver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    webDriver = new ChromeDriver();
                    webDriver.manage().window().maximize();
//                    webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    webDriver = new FirefoxDriver();
                    webDriver.manage().window().maximize();
//                    webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                    break;
            }
//            webDriver.manage().window().maximize();
//            webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }

        return webDriver;
    }

    public static WebDriver driver;

    //private static WebDriver getDriver(){};


    public static void closeDriver(){
        if (driver != null) {
            driver.quit(); // this will kill the session but driver will not be null
        }
    }
}