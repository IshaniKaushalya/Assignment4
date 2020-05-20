package com.sysco.ui_automation_assignment.functions;

import com.sysco.ui_automation_assignment.pages.EmployeeInformationPage;

public class EmployeeInformation {
    private static EmployeeInformationPage employeeInformationPage = new EmployeeInformationPage();

    public static void addEmployee(String firstName, String middleName, String lastName, String employeeUserName, String employeePassword, String confirmPassword) {
        employeeInformationPage.navigateToPIM();
        employeeInformationPage.clickButtonAdd();
        employeeInformationPage.enterFullName(firstName, middleName, lastName);
        employeeInformationPage.clickLoginDetails();
        employeeInformationPage.enterLoginDetails(employeeUserName, employeePassword, confirmPassword);
        employeeInformationPage.clickButtonSave();
    }
}
