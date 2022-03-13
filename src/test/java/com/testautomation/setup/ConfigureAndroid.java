package com.testautomation.setup;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class ConfigureAndroid {

    public static AppiumDriver driver;


    public static void androidSetup() throws MalformedURLException {
        String androidDeviceIP = "192.168.0.63:5555";
        String androidDeviceref = "";
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "ManishPhone");
            capabilities.setCapability("udId", androidDeviceref);
            capabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("platformVersion", "11"); //11 RP1A.200720.011
            capabilities.setCapability("appWaitForLaunch", "false");
            capabilities.setCapability("appPackage", "com.miui.calculator");
            capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

            driver = new AppiumDriver(url, capabilities);
            System.out.println("Application started");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
