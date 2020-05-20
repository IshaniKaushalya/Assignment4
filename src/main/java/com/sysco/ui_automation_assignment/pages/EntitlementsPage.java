package com.sysco.ui_automation_assignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class EntitlementsPage extends PageBase{
    private By btnLeave = By.id("menu_leave_viewLeaveModule");
    private By btnEntitlements = By.id("menu_leave_Entitlements");
    private By btnAddEntitlements = By.id("menu_leave_addLeaveEntitlement");
    private By txtEmployeeName = By.id("entitlements_employee_empName");
    private By drpdwnEmployee = By.xpath("//*[@class='ac_results']");
    private By lstEmployeeName = By.xpath("//*[@class='ac_results']/ul/li");
    private By lstLeaveType = By.id("entitlements_leave_type");
    private By txtEntitlement = By.id("entitlements_entitlement");
    private By btnSave = By.id("btnSave");


    public static String getEmployeeName;

    public void clickButtonLeave(){
        syscoLabUI.click(btnLeave);
    }
    public void clickButtonAddEntitlements(){
        syscoLabUI.click(btnEntitlements);
        syscoLabUI.sleep(2);
        syscoLabUI.click(btnAddEntitlements);
    }
    public void selectEmployee(String employeeName ){
        syscoLabUI.sleep(4);
        syscoLabUI.sendKeys(txtEmployeeName,employeeName);
        syscoLabUI.waitTillElementLoaded(drpdwnEmployee);
        List<WebElement> elements = syscoLabUI.findElements(lstEmployeeName);
        System.out.println(elements);
        getEmployeeName = syscoLabUI.getText(elements.get(0));
        syscoLabUI.click(elements.get(0));
    }
    public void selectLeaveType(){
        syscoLabUI.click(lstLeaveType);
        List<WebElement> elements = syscoLabUI.findElements(lstLeaveType);
        Random random = new Random();
        int int_random = random.nextInt(elements.size());
        syscoLabUI.click(elements.get(int_random));
    }
    public void enterEntitlement(String entitlement){
        syscoLabUI.sendKeys(txtEntitlement,entitlement);
    }
    public void clickButtonSave(){
        syscoLabUI.click(btnSave);
        syscoLabUI.sleep(2);
    }

}
