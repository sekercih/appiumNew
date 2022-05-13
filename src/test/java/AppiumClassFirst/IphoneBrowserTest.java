package AppiumClassFirst;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IphoneBrowserTest {
    public static String userName = "hakkekerci_zMaN3P";
    public static String accessKey = "aiYT2gsJHAUSSpb4S1CF";
    public static final String URL = "https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void iphone12pro() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("platformVersion", "14");
        capabilities.setCapability("deviceName", "iPhone 12 Pro");
        capabilities.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
        IOSDriver<IOSElement> driver=new IOSDriver<IOSElement>(new URL(URL),capabilities);
       //curl -u "hakkekerci_zMaN3P:aiYT2gsJHAUSSpb4S1CF" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Mehmet\Desktop\mobile_testing\src\test\java\AppiumClassFirst\APP\BStackSampleApp.ipa"



    }
}
