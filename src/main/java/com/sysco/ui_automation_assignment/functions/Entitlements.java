package com.sysco.ui_automation_assignment.functions;

import com.sysco.ui_automation_assignment.pages.EntitlementsPage;

public class Entitlements {
    private static EntitlementsPage entitlementsPage =  new EntitlementsPage();

    public static void navigateToLeave(){
        entitlementsPage.clickButtonLeave();
    }

    public static void addLeaveEntitlement(String employeeName,String entitlement){
        entitlementsPage.clickButtonLeave();
        entitlementsPage.clickButtonAddEntitlements();
        entitlementsPage.selectEmployee(employeeName);
        entitlementsPage.selectLeaveType();
        entitlementsPage.enterEntitlement(entitlement);
        entitlementsPage.clickButtonSave();
    }

}
