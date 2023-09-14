package com.WhizTraining.driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManagerTL {

    static WebDriver driver;
    public static final ThreadLocal<WebDriver> tl = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return tl.get();
    }

    public static void setDriver(WebDriver driver){
        tl.set(driver);
    }

    public static void unload(){
        tl.remove();
    }

    public static void init(){
        // TODO #1 create dynamic logic here for diff browsers.
        if(getDriver()==null) {
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            options.addArguments("--start-maximized");
            setDriver(new ChromeDriver());
        }
    }

    public static void tearDown(){
        if(getDriver()!=null)
            getDriver().quit();
    }

}
