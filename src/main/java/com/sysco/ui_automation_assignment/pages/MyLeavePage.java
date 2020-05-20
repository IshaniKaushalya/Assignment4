package com.sysco.ui_automation_assignment.pages;

import org.openqa.selenium.By;

public class MyLeavePage extends PageBase{
    private By btnMyLeave = By.xpath("//a/span[text()='My Leave']");
    private By btnApply = By.id("menu_leave_applyLeave");
    private By drpDwnLeaveType = By.id("applyleave_txtLeaveType");
    private By optionLeaveType = By.xpath("//*[@id='applyleave_txtLeaveType']/option[@value='2']");
    private By txtFromDate = By.id("applyleave_txtFromDate");
    private By txtToDate = By.id("applyleave_txtToDate");
    private By txtComment = By.id("applyleave_txtComment");
    private By btnSave = By.xpath("//input[@id='applyBtn']");
    private By btnMyLeaveList = By.id("menu_leave_viewMyLeaveList");
    private By txtEmployeeListName = By.xpath("//*[@class='odd']/td[2]/a");

    public void clickButtonMyLeave(){
        syscoLabUI.click(btnMyLeave);
    }
    public void navigateToApply(){
        syscoLabUI.click(btnApply);
    }
    public void selectMyLeaveType(){
        syscoLabUI.click(drpDwnLeaveType);
        syscoLabUI.click(optionLeaveType);
    }
    public void enterFromDate(String fromDate){
        syscoLabUI.sendKeys(txtFromDate,fromDate);
    }
    public void enterToDate(String toDate){
        syscoLabUI.sendKeys(txtToDate,toDate);
    }
    public void enterComment(String comment){
        syscoLabUI.sendKeys(txtComment,comment);
    }
    public void clickButtonApply(){
        syscoLabUI.scrollToElement(btnSave);
        syscoLabUI.click(btnSave);
        syscoLabUI.sleep(10);
    }
    public void navigateToMyLeaveList(){
        syscoLabUI.sleep(4);
        syscoLabUI.click(btnMyLeaveList);
    }
    public String getEmployeeName(){
        syscoLabUI.sleep(2);
        return syscoLabUI.getText(txtEmployeeListName);
    }


}
