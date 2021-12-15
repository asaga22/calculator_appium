import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class Automation {

    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", ".Calculator");
        dc.setCapability("noReset", true);

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);


        MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
        el2.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el7.click();

        Assert.assertEquals(driver.findElementById("com.android.calculator2:id/result").getText(), 64);

    }

}
