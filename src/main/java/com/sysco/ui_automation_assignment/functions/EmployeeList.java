package com.sysco.ui_automation_assignment.functions;

import com.sysco.ui_automation_assignment.pages.EmployeeListPage;

public class EmployeeList {
    private static EmployeeListPage employeeListPage = new EmployeeListPage();

    public static String getEmployeeFirstName(){
        return employeeListPage.getEmployeeFirstName();
    }
    public static String getEmployeeMiddleName(){
        return employeeListPage.getEmployeeMiddleName();
    }
    public static String getEmployeeLastName(){
        return employeeListPage.getEmployeeLastName();
    }
}
