package apkTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class RealMobileTest_Hesap {
    @Test
    public void samsungJ7proTest() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-J730F");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "520055ecb834453b");
        desiredCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        desiredCapabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
        // ! Yukarıdaki path i kendinize göre ayarlayınız.


        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
        WebElement hesapCreate = driver.findElementByAccessibilityId("CreateAccountLbl");
        hesapCreate.click();

        WebElement paket = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"LicenceProductTypeInputlayout\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
        paket.click();

        WebElement bireysel = driver.findElementByAccessibilityId("HeaderLabel");
        bireysel.click();

        WebElement isim = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"NameInputLayout\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
        isim.sendKeys("Hasan");

        WebElement soyAd = driver.findElementByAccessibilityId("SurnameEntry");
        soyAd.sendKeys("TestAdam");

        WebElement telefon = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"PhoneInputLayout\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
        telefon.sendKeys("+905554443322");

        WebElement eposta = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"EmailInputLayout\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
        eposta.sendKeys("denemeklazim01@gmail.com");

        WebElement kurumAdi = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"CompanyNameInputLayout\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
        kurumAdi.sendKeys("Appium Sevenler Derneği");

        WebElement kvkk=driver.findElementByAccessibilityId("KVKKCheckbox");
        kvkk.click();

        WebElement hSozlesme=driver.findElementByAccessibilityId("TermsOfServiceCheckbox");
        hSozlesme.click();

        WebElement smsCheckbox=driver.findElementByAccessibilityId("SMSApproveCheckbox");
        WebElement epostaCheckbox=driver.findElementByAccessibilityId("EmailApproveCheckbox");
        WebElement telefonCheckbox=driver.findElementByAccessibilityId("PhoneApproveCheckbox");
        smsCheckbox.click();
        epostaCheckbox.click();
        telefonCheckbox.click();

        WebElement hesapOlustur=driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"SignUpButton\"])[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");
        hesapOlustur.click();





    }
}
