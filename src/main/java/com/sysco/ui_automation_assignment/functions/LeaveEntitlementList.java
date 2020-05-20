package com.sysco.ui_automation_assignment.functions;

import com.sysco.ui_automation_assignment.pages.LeaveEntitlementsListPage;

public class LeaveEntitlementList {
    private static LeaveEntitlementsListPage leaveEntitlementsListPage = new LeaveEntitlementsListPage();

    public static String getEntitledEmployeeName(){
        return leaveEntitlementsListPage.getEntitledEmployeeName();
    }
}
