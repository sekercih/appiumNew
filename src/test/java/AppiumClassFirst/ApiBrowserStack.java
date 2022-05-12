package AppiumClassFirst;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ApiBrowserStack {

    public static String userName = "denemeklazim_ZVRtah";
    public static String accessKey = "eVYdFLF2M4SjiqKbyzC5";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("browserName","Android");
        caps.setCapability("os_version", "7.0");
        caps.setCapability("project", "Bulut");
        caps.setCapability("build", "Galaxy8");
        caps.setCapability("name", "ApiDemosTest");
        caps.setCapability("app", "bs://ba9232ebab1ecaca3f13f7271b6a165939a4e2cd");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

        WebElement preference = driver.findElementByAccessibilityId("Preference");
        preference.click();

        Thread.sleep(2000);
        WebElement preferenceDependencies = driver.findElementByAccessibilityId("3. Preference dependencies");
        preferenceDependencies.click();

        WebElement checkBox = driver.findElementById("android:id/checkbox");
        checkBox.click();

        Thread.sleep(2000);

        WebElement wifiSetting = driver.findElement(By.xpath("(//*[@class='android.widget.RelativeLayout'])[2]"));
        wifiSetting.click();

        WebElement inputBox = driver.findElementById("android:id/edit");

        inputBox.sendKeys("appiumTest");

        WebElement okButton = driver.findElementById("android:id/button1");

        Assert.assertEquals("appiumTest",inputBox.getText());

        okButton.click();



        driver.quit();
    }
}



//curl -u "denemeklazim_ZVRtah:eVYdFLF2M4SjiqKbyzC5" -X POST "https://api-cloud.browserstack.com/app-automate/upload" -F "file=@C:\Users\Mehmet\Desktop\mobile_testing\src\test\java\AppiumClassFirst\APP\apidemos.apk"