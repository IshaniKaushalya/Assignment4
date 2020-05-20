package com.sysco.ui_automation_assignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LeaveListPage extends PageBase{
    private By btnLeaveList = By.xpath("//a/span[text()='Leave List']");
    private By txtLeaveListEmployeeName = By.id("leaveList_txtEmployee_empName");
    private By drpDwnEmployee = By.xpath("//*[@class='ac_results']");
    private By lstEmployeeName = By.xpath("//*[@class='ac_results']/ul/li");
    private By btnSearch = By.id("btnSearch");
    private By txtEmployeeListName = By.xpath("//*[@class='odd']/td[2]/a");

    public static String getEmployeeName;

    public void navigateToAdminLeaveList(){
        syscoLabUI.click(btnLeaveList);
    }
    public void selectEmployee(String employeeName ){
        syscoLabUI.sleep(4);
        syscoLabUI.sendKeys(txtLeaveListEmployeeName,employeeName);
        syscoLabUI.waitTillElementLoaded(drpDwnEmployee);
        List<WebElement> elements = syscoLabUI.findElements(lstEmployeeName);
        getEmployeeName = syscoLabUI.getText(elements.get(0));
        syscoLabUI.click(elements.get(0));
    }
    public void clickButtonSearch(){
        syscoLabUI.click(btnSearch);
    }
    public String getEmployeeNameInLeaveList(){
        return syscoLabUI.getText(txtEmployeeListName);
    }

}
