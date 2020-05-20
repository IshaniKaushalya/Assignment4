package com.sysco.ui_automation_assignment.pages;

import org.openqa.selenium.By;

public class LeaveEntitlementsListPage extends PageBase{
    private By txtEntitledEmployeeName = By.id("entitlements_employee_empName");

    public String getEntitledEmployeeName(){
        syscoLabUI.sleep(2);
        return syscoLabUI.getValue(txtEntitledEmployeeName);
    }

}
