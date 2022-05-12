package AppiumClassFirst;

import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;

class BrowserStackAndroid_3 {

    public static String userName = "denemeklazim_ZVRtah";
    public static String accessKey = "eVYdFLF2M4SjiqKbyzC5";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("os_version", "7.0");
        caps.setCapability("project", "Api Demos");
        caps.setCapability("build", "Galaxy 8");
        caps.setCapability("name", ",One Test");
        caps.setCapability("app", "bs://ba9232ebab1ecaca3f13f7271b6a165939a4e2cd");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

      //  curl -u "denemeklazim_ZVRtah:eVYdFLF2M4SjiqKbyzC5" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Mehmet\Desktop\mobile_testing\src\test\java\AppiumClassFirst\APP\apidemos.apk"

        // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
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
        driver.quit();
    }
}
