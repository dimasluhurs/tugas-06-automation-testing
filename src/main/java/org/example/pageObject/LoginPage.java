package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver webDriver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[.='Sauce Labs Backpack']")
    private WebElement validatingDashboard;

    @FindBy(css = "h3")
    private WebElement errMsg;

    public void setUserName(String userName){
        username.sendKeys(userName);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickButtonLogin(){
        loginButton.click();
    }

    public boolean loginIsSuccessfull(){
        return validatingDashboard.isDisplayed();
    }

    public boolean verifyOnLoginPage(){
        return username.isDisplayed();
    }

    public String loginIsError(){
        return errMsg.getText();
    }
}
