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
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Mehmet\\Desktop\\mobile_testing\\src\\test\\java\\AppiumClassFirst\\APP\\Duolingo.apk");
        // ! Yukarıdaki path i kendinize göre ayarlayınız.


        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(5000);

        WebElement getStarterd = driver.findElementById("com.duolingo:id/introFlowNewUserButton");
        getStarterd.click();
        Thread.sleep(3000);
        WebElement getGerman = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView");
        getGerman.click();
        Thread.sleep(5000);
        WebElement getOther = driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"other\"]/android.widget.TextView");
        getOther.click();
        Thread.sleep(4000);

        WebElement getReguler = driver.findElementById("com.duolingo:id/xpGoalOptionRegular");
        getReguler.click();
        Thread.sleep(4000);
        WebElement getCont = driver.findElementById("com.duolingo:id/xpGoalContinueButton");
        getCont.click();
        Thread.sleep(4000);
        WebElement getSome = driver.findElementById("com.duolingo:id/placementHeader");
        getSome.click();
        Thread.sleep(4000);
        WebElement getStartTest = driver.findElementById("com.duolingo:id/primaryButton");
        getStartTest.click();

    }
}

