package ui_automation_assignment.tests;

import com.sysco.ui_automation_assignment.data.EmployeeData;
import com.sysco.ui_automation_assignment.data.LoginData;
import com.sysco.ui_automation_assignment.functions.*;
import com.sysco.ui_automation_assignment.pages.EntitlementsPage;
import com.sysco.ui_automation_assignment.pages.LeaveListPage;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ui_automation_assignment.utils.TestBase;

public class AddEmployeeLeaveTest extends TestBase {
    private SoftAssert softAssert;
    @BeforeClass
    public void initClass(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login");
    }

    @Test(description = "Login to the Dashboard")
    public void testLoginToDashboard(){
        Login.loginToDashBoard(LoginData.USER_NAME,LoginData.PASSWORD);
    }
    @Test(description = "Verify added employee is displayed in employee list grid",dependsOnMethods = "testLoginToDashboard")
    public void testAddEmployee(){
        softAssert = new SoftAssert();
        EmployeeInformation.addEmployee(EmployeeData.FIRST_NAME,EmployeeData.MIDDLE_NAME,EmployeeData.LAST_NAME,EmployeeData.EMPLOYEE_USER_NAME,EmployeeData.EMPLOYEE_PASSWORD,EmployeeData.CONFIRM_PASSWORD);
        softAssert.assertEquals(EmployeeList.getEmployeeFirstName(),EmployeeData.FIRST_NAME,"First name does not match");
        softAssert.assertEquals(EmployeeList.getEmployeeMiddleName(),EmployeeData.MIDDLE_NAME,"Middle name does not match");
        softAssert.assertEquals(EmployeeList.getEmployeeLastName(),EmployeeData.LAST_NAME,"Last name does not match");
        softAssert.assertAll();
    }
    @Test(description = "Verify added leave entitlement displayed in leave entitlement list grid",dependsOnMethods = "testAddEmployee")
    public void testAddLeaveEntitlement(){
        softAssert = new SoftAssert();
        Entitlements.addLeaveEntitlement(EmployeeData.FIRST_NAME,EmployeeData.ENTITLEMENT);
        softAssert.assertEquals(LeaveEntitlementList.getEntitledEmployeeName(), EntitlementsPage.getEmployeeName,"Entitled employee name does not match");
        softAssert.assertAll();
    }
    @Test(description = "Verify adding leaves with newly created user",dependsOnMethods = "testAddLeaveEntitlement")
    public void testAddingLeavesByNewlyCreatedUser(){
        softAssert = new SoftAssert();
        Login.logoutTheSystem();
        Login.loginToDashBoard(EmployeeData.EMPLOYEE_USER_NAME,EmployeeData.EMPLOYEE_PASSWORD);
        MyLeave.navigateToApplyLeave();
        MyLeave.applyLeave(EmployeeData.FROM_DATE,EmployeeData.TO_DATE,EmployeeData.COMMENT);
        MyLeave.navigateToMyLeaveList();
        softAssert.assertEquals(MyLeave.getEmployeeName(),EntitlementsPage.getEmployeeName,"Employee name in My leave list does not match");
        Login.logoutTheSystem();
        softAssert.assertAll();
    }
    @Test(description = "Verify added leave is displayed in admin leave list",dependsOnMethods = "testAddingLeavesByNewlyCreatedUser")
    public void testVerifyLeavesFromAdmin(){
        softAssert = new SoftAssert();
        Login.loginToDashBoard(LoginData.USER_NAME,LoginData.PASSWORD);
        LeaveList.navigateToAdminLeaveList();
        LeaveList.searchEmployee(EmployeeData.FIRST_NAME);
        softAssert.assertEquals(LeaveList.getEmployeeLeaveListName(),LeaveListPage.getEmployeeName,"Employee list name in admin leave list does not match");
        softAssert.assertAll();
    }

}
