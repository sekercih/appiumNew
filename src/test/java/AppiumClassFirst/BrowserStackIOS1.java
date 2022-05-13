package AppiumClassFirst;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;


public class BrowserStackIOS1 {

            public static String userName = "hakansekerli_OZiG7r";
            public static String accessKey = "MGUqB3rrx4xxjPsRFofk";

            public static void main(String args[]) throws MalformedURLException, InterruptedException {

                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", "ios");
                capabilities.setCapability("platformVersion", "14");
                capabilities.setCapability("deviceName", "iPhone 12");
                capabilities.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
                IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);

                IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30).until(
                        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
                textButton.click();
                IOSElement textInput = (IOSElement) new WebDriverWait(driver, 30).until(
                        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
                textInput.sendKeys("APPIUM DERSINE HOSGELDINIZ");

                Thread.sleep(5000);

                IOSElement textOutput = (IOSElement) new WebDriverWait(driver, 30).until(
                        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));

                if(textOutput != null && textOutput.getText().equals("APPIUM DERSINE HOSGELDINIZ"))
                    assert(true);
                else
                    assert(false);

                // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
                driver.quit();
            }
        }



