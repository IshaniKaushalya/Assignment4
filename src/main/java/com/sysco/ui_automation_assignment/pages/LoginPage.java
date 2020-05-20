package com.sysco.ui_automation_assignment.pages;

import org.openqa.selenium.By;

public class LoginPage extends PageBase{
    private By txtUserName = By.id("txtUsername");
    private By txtPassword = By.id("txtPassword");
    private By btnLogin = By.id("btnLogin");
    private By btnWelcome = By.id("welcome");
    private By btnLogout = By.xpath("//li/a[text()='Logout']");

    public void enterUserName(String userName){
        syscoLabUI.sendKeys(txtUserName,userName);
    }
    public void enterPassword(String password){
        syscoLabUI.sendKeys(txtPassword,password);
    }
    public void clickLoginButton(){
        syscoLabUI.click(btnLogin);
        syscoLabUI.sleep(2);
    }
    public void clickButtonLogout(){
        syscoLabUI.click(btnWelcome);
        syscoLabUI.sleep(1);
        syscoLabUI.click(btnLogout);
        syscoLabUI.sleep(3);
    }
}
