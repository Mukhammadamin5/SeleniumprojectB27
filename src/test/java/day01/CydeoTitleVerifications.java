package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerifications {
    public static void main(String[] args) {
        // 1. setup web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. opening on empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cydeo.com");

        String expectedTitle = "Cydeo";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED");
        } else{
            System.out.println("Title verification is Failed");
        }

        driver.quit();




    }
}
