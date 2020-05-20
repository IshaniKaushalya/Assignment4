package com.sysco.ui_automation_assignment.functions;

import com.sysco.ui_automation_assignment.pages.LeaveListPage;

public class LeaveList {
    private static LeaveListPage leaveListPage = new LeaveListPage();

    public static void navigateToAdminLeaveList(){
        leaveListPage.navigateToAdminLeaveList();
    }
    public static void searchEmployee(String employeeName){
        leaveListPage.selectEmployee(employeeName);
        leaveListPage.clickButtonSearch();
    }
    public static String getEmployeeLeaveListName(){
        return leaveListPage.getEmployeeNameInLeaveList();
    }
}
