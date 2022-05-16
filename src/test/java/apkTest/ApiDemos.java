package apkTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApiDemos {

    @Test
    public void Touch() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Mehmet\\Desktop\\mobile_testing\\src\\test\\java\\AppiumClassFirst\\APP\\lifeVson.apk");
        // ! Yukarıdaki path i kendinize göre ayarlayınız.
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
/*
        WebElement views = driver.findElementByAccessibilityId("Views");
        views.click();
        Thread.sleep(5000);

        WebElement expan = driver.findElementByAccessibilityId("Expandable Lists");
        expan.click();
        Thread.sleep(5000);

        WebElement custom = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]");
        custom.click();
        Thread.sleep(5000);

        WebElement people = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]");


        TouchAction touc = new TouchAction(driver);
        touc.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(people)).withDuration(Duration.ofSeconds(3))).perform();
        Thread.sleep(5000);
        WebElement sample = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        sample.click();


    }
    @Test
    public void scroll() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Mehmet\\Desktop\\mobile_testing\\src\\test\\java\\AppiumClassFirst\\APP\\apidemos.apk");
        // ! Yukarıdaki path i kendinize göre ayarlayınız.
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);


        WebElement views = driver.findElementByAccessibilityId("Views");
        views.click();
        Thread.sleep(5000);
        driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"));");
        WebElement tabs=driver.findElementByAccessibilityId("Tabs");
        tabs.click();  */

    }



}
