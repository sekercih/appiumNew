package AppiumClassFirst;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

      //  WebDriverManager.chromedriver().setup();
        //desiredCapabilities.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,WebDriverManager.chromedriver().getBrowserPath());
        // ! Yukarıdaki path i kendinize göre ayarlayınız.
        WebDriver driver;
        driver=new RemoteWebDriver(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
      driver.get("http://www.mynet.com");
       // AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);

}}

