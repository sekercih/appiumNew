package AppiumClassFirst;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

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
        caps.setCapability("project", "My First Project");
        caps.setCapability("build", "Galaxy 8");
        caps.setCapability("name", ",Four Test");
        caps.setCapability("app", "bs://5f14dc4566c4b0378be9d5dd9280010bf1170171");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

      //  curl -u "denemeklazim_ZVRtah:eVYdFLF2M4SjiqKbyzC5" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\\Users\\Mehmet\\Desktop\\mobile_testing\\src\\test\\java\\AppiumClassFirst\\APP\\SpotifyPremium.apk"

        // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
        driver.quit();
    }
}
