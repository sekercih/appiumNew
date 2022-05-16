package apkTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackAndroid_2 {

    public static String userName = "hakansekerli_OZiG7r";
    public static String accessKey = "MGUqB3rrx4xxjPsRFofk";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        // Use Java Client v6.0.0 or above
        // Use Java Client v6.0.0 or above
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("deviceName", "Samsung Galaxy S20");
        capabilities.setCapability("app", "bs://24f20e84431d8c81f14ec1047dc0865444ed99d9");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);

        //curl -u "denemeklazim_ZVRtah:eVYdFLF2M4SjiqKbyzC5" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Mehmet\Desktop\mobile_testing\src\test\java\AppiumClassFirst\APP\Duolingo.apk"




        // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
        driver.quit();
    }
}
