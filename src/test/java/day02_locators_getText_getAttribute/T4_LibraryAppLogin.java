package day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T4_LibraryAppLogin {
    public static void main(String[] args) throws InterruptedException {

        //1. open Chrome browser:
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to: http://library2.cydeo.com/login.html
        driver.get("http://library2.cydeo.com/login.html");

        //3. Enter username: "incorrect@gmail.com"
        WebElement userNameInput = driver.findElement(By.id("inputEmail"));
        userNameInput.sendKeys("incorrect@gmail.com");


        //4. Enter password: "incorrect password"
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        //5. Click to Sign in button
        WebElement signInBtn = driver.findElement(By.tagName("button"));
        signInBtn.click();

        //6. Verify: visually "Sorry, Wrong Email or Password" displayed
        String expectedMessage = "Sorry, Wrong Email or Password";
        String actualMessage = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/div[2]/div"))).getAttribute("innerHTML");
        if (expectedMessage.equals(actualMessage)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
    }
}
