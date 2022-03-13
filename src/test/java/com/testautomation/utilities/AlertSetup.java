package com.testautomation.utilities;

import com.testautomation.setup.ConfigureAndroid;
import org.openqa.selenium.Alert;

public class AlertSetup extends ConfigureAndroid {
    //AppiumDriver driver;

    public static void alert(String action) {
        Alert alert = driver.switchTo().alert();
        switch (action) {
            case "accept":
                alert.accept();
                break;
            case "dismiss":
                alert.dismiss();
                break;

        }
    }


}
