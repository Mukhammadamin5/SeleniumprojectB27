package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
    public static void main(String[] args) {

        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("lang=en-GB");

        //2- Create instance of the chrome driver
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        //3- Test if driver is working
        driver.get("https://www.google.com/");

        //driver.findElement(By.linkText("English")).click();


    }
}
