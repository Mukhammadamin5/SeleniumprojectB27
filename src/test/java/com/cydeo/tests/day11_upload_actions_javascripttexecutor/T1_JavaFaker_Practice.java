package com.cydeo.tests.day11_upload_actions_javascripttexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class T1_JavaFaker_Practice {

    @Test
    public void registration_form(){

        // driver --> Driver.getDriver()
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker = new Faker();

        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());

        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        // only using faker is giving me this way --> rasario.murphy
        // we have to use logic to change the way of returning
        String userName = faker.name().username().replace(".", "");
        username.sendKeys(userName);







        List<WebElement> genders = Driver.getDriver().findElements(By.xpath("//input[@type='radio']"));
        //for(int i = 1 ; i <= 3; i++) {
            genders.get(faker.number().numberBetween(1, 3)).click();
        //}


        WebElement dataOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        dataOfBirth.sendKeys("03/10/2012");

        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1, 9));



    }
}
