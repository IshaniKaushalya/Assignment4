package com.sysco.ui_automation_assignment.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;

import java.util.Random;

public class EmployeeInformationPage extends PageBase{
    private By btnPimModule = By.id("menu_pim_viewPimModule");
    private By btnAdd = By.id("btnAdd");
    private By txtFirstName = By.id("firstName");
    private By txtMiddleName = By.id("middleName");
    private By txtLastName = By.id("lastName");
    private By chkLoginDetails = By.id("chkLogin");
    private By txtEmployeeUserName = By.id("user_name");
    private By txtEmployeePassword = By.id("user_password");
    private By txtConfirmPassword = By.id("re_password");
    private By btnSave = By.id("btnSave");

    public void navigateToPIM(){
        syscoLabUI.click(btnPimModule);
    }
    public void clickButtonAdd(){
        syscoLabUI.click(btnAdd);
    }
    public void enterFirstName(String firstName){
        syscoLabUI.sendKeys(txtFirstName,firstName);
    }
    public void enterMiddleName(String middleName){
        syscoLabUI.sendKeys(txtMiddleName,middleName);
    }
    public void enterLastName(String lastName){
        syscoLabUI.sendKeys(txtLastName,lastName);
    }
    public void enterFullName(String firstName,String middleName,String lastName){
        enterFirstName(firstName);
        enterMiddleName(middleName);
        enterLastName(lastName);
    }
    public void clickLoginDetails(){
        syscoLabUI.click(chkLoginDetails);
    }
    public void enterEmployeeUserName(String employeeUserName){
        syscoLabUI.sendKeys(txtEmployeeUserName,employeeUserName);
    }
    public void enterEmployeePassword(String employeePassword){
        syscoLabUI.sendKeys(txtEmployeePassword,employeePassword);
    }
    public void confirmPassword(String confirmPassword){
        syscoLabUI.sendKeys(txtConfirmPassword,confirmPassword);
    }
    public void enterLoginDetails(String employeeUserName,String employeePassword,String confirmPassword){
        enterEmployeeUserName(employeeUserName);
        enterEmployeePassword(employeePassword);
        confirmPassword(confirmPassword);
    }
    public void clickButtonSave(){
        syscoLabUI.click(btnSave);
        syscoLabUI.sleep(2);
    }

}
