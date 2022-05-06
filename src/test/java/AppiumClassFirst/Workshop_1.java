package AppiumClassFirst;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Workshop_1 {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");
//        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
      desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Mehmet\\Desktop\\mobile_testing\\src\\test\\java\\AppiumClassFirst\\APP\\Duolingo.apk");
        // yukarıdaki pathi kendinize göre ayarlayın. lütfen.



        AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);

        Thread.sleep(5000);
}}

