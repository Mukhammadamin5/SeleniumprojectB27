package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        /*
        PageFactory class is a Selenium class that support POM
        It has method called initElements. Once it's calles it will store all elements specified using @FindBy
        annotation with locator and it will give elements to the classes when they called
        initElements method accept 2 arg
        WebDriver instance and Page class instance (this) means current instance of this class
         */
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "inputEmail")
    public WebElement inputUserName;

    @FindBy (xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button['=Sign in']")
    public WebElement signInButton;

    @FindBy (xpath = "//div[.='This field is required.']")
    public WebElement fieldRequirementErrorMsg;

    @FindBy (xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterInvalidEmailMsg;

    @FindBy (xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordErrorMsg;



}
