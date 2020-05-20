package com.sysco.ui_automation_assignment.functions;

import com.sysco.ui_automation_assignment.pages.MyLeavePage;

public class MyLeave {
    private static MyLeavePage myLeavePage = new MyLeavePage();

    public static void navigateToApplyLeave(){
        myLeavePage.clickButtonMyLeave();
        myLeavePage.navigateToApply();
    }
    public static void applyLeave(String fromDate,String toDate,String comment){
        myLeavePage.selectMyLeaveType();
        myLeavePage.enterFromDate(fromDate);
        myLeavePage.enterToDate(toDate);
        myLeavePage.enterComment(comment);
        myLeavePage.clickButtonApply();
    }
    public static void navigateToMyLeaveList(){
        myLeavePage.navigateToMyLeaveList();
    }
    public static String getEmployeeName(){
        return myLeavePage.getEmployeeName();
    }
}
