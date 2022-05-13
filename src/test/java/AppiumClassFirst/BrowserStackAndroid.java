package AppiumClassFirst;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserStackAndroid {

    public static String userName = "hakansekerli_OZiG7r";
    public static String accessKey = "MGUqB3rrx4xxjPsRFofk";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
       /* DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "android");
        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("os_version", "7.0");
        caps.setCapability("project", "My First Project");
        caps.setCapability("build", "My First Build");
        caps.setCapability("name", "Bstack-[Java] Sample Test");
        caps.setCapability("app", "bs://5e05a9db8e9f6c7b6a718fa21f68a2a6646e1fd1"); */

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("deviceName", "Samsung Galaxy Note 20");
        capabilities.setCapability("app", "bs://24f20e84431d8c81f14ec1047dc0865444ed99d9");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);
/*
        AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Search Wikipedia")));
        searchElement.click();
        AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
        insertTextElement.sendKeys("BrowserStack");
        Thread.sleep(5000);

        List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
        assert(allProductsName.size() > 0);*/

        // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
        driver.quit();

        //curl -u "hakkekerci_zMaN3P:aiYT2gsJHAUSSpb4S1CF" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Mehmet\Desktop\mobile_testing\src\test\java\AppiumClassFirst\APP\Duolingo.apk"




    }
}
