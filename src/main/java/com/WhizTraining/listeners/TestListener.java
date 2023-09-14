package com.WhizTraining.listeners;

import com.WhizTraining.driver.DriverManagerTL;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        File srcFile = ((TakesScreenshot) DriverManagerTL.getDriver()).getScreenshotAs(OutputType.FILE);
        Date d = new Date();
        String reportFolderPath = System.getProperty("user.dir")+"/target/Reports/"+d.toString().replace(":","-")+"/";
        String ScreenshotFolderPath = reportFolderPath+"screenshots/";
        try {
            FileUtils.copyFile(srcFile,new File(ScreenshotFolderPath+result.getName()+".jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
