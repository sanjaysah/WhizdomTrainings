package com.WhizTraining.testCase;

import com.WhizTraining.utils.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {

    ExtentReports reports;
    ExtentTest test;
    @BeforeMethod
    public void init(){
        reports = ExtentManager.getReports();
        test = reports.createTest("LoginTest");
    }

    @AfterMethod
    public void tearDown(){
        reports.flush();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login with valid credentials")
    @Test(groups = {"P0","positive"},priority=2,enabled = true)
    public void testLoginVWO_Positive(){
        test.log(Status.INFO,"Open VWO Website");
        test.log(Status.INFO, "Enter valid credentials");
        test.log(Status.INFO, "Verifying valid Login");
        test.log(Status.PASS, "Valid Login verified");
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login with valid credentials")
    @Test(groups = {"P0","positive"},priority=2,enabled = true)
    public void testLoginVWO_Negative(){
        test.log(Status.INFO,"Open VWO Website");
        test.log(Status.INFO, "Enter invalid credentials");
        test.log(Status.INFO, "Verifying proper message with no Login");
        //Assert.fail("Invalid Login Detected");
        test.log(Status.FAIL, "Invalid Login detected and no login verified");
    }
}
