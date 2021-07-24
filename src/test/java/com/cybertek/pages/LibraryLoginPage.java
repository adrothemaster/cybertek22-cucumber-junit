package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signIn;

    /**
     * login method with only one specific username
     */
    public void login(){
        emailInput.sendKeys("username");
        passwordInput.sendKeys("password");
        signIn.click();
    }

    /**
     * login with admin
     */
    public void loginWithAdmin(){
        emailInput.sendKeys("admin");
        passwordInput.sendKeys("password");
        signIn.click();
    }

    /**
     * login with ConfigurationReader
     */
    public void loginWithConfig(){
        emailInput.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        signIn.click();
    }

    /**
     * this method accepts arguments directly from the method
     * @param username
     * @param password
     */
    public void login(String username, String password){
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signIn.click();
    }

}
