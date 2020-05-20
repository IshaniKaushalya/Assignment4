package com.sysco.ui_automation_assignment.pages;

import org.openqa.selenium.By;

public class EmployeeListPage extends PageBase{
    public By txtEmpFirstName = By.id("personal_txtEmpFirstName");
    public By txtEmpMiddleName = By.id("personal_txtEmpMiddleName");
    public By txtEmpLastName = By.id("personal_txtEmpLastName");

    public String getEmployeeFirstName(){
        return syscoLabUI.getValue(txtEmpFirstName);
    }
    public String getEmployeeMiddleName() {
        return syscoLabUI.getValue(txtEmpMiddleName);
    }
    public String getEmployeeLastName(){
        return syscoLabUI.getValue(txtEmpLastName);
    }
}
