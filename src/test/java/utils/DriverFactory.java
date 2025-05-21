package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            try {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                caps.setCapability("appPackage", "com.monefy.app.lite");
                caps.setCapability("appActivity", "com.monefy.app.lite/com.monefy.activities.main.MainActivity");
                caps.setCapability("automationName", "UiAutomator2");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }
}