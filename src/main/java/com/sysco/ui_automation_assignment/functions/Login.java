package com.sysco.ui_automation_assignment.functions;

import com.sysco.ui_automation_assignment.pages.LoginPage;

public class Login {
    private static LoginPage loginPage = new LoginPage();

    public static void loginToDashBoard(String userName,String password){
        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }
    public static void logoutTheSystem(){
        loginPage.clickButtonLogout();
    }
}
