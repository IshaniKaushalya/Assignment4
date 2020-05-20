package com.sysco.ui_automation_assignment.data;

import org.apache.commons.lang.RandomStringUtils;

import java.util.Random;

public class EmployeeData {

    public static String FIRST_NAME = RandomStringUtils.randomAlphabetic(5);;
    public static String MIDDLE_NAME = RandomStringUtils.randomAlphabetic(5);;
    public static String LAST_NAME = RandomStringUtils.randomAlphabetic(5);;
    public static String EMPLOYEE_USER_NAME = FIRST_NAME;
    public static String EMPLOYEE_PASSWORD = FIRST_NAME+"@123";
    public static String CONFIRM_PASSWORD = FIRST_NAME+"@123";
    public static String ENTITLEMENT = "20";
    public static String FROM_DATE = "25-05-2020";
    public static String TO_DATE = "31-05-2020";
    public static String COMMENT = "test comment";

}
