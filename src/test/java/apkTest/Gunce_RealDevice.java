package apkTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Gunce_RealDevice {
    @Test
    public void realmobilGunceTestsamsungJ7proTest() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-J730F");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "520055ecb834453b");
        desiredCapabilities.setCapability("fullreset", "true");
        //? noReset, true olarak ayarlanırsa, bu oturum başlamadan önce uygulama verileri SİLİNMEZ.
        //? fullReset true olarak ayarlanırsa uygulama kaldırılır ve tüm veriler temizlenir.
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gunceproapp.GunceCloud");
        //desiredCapabilities.setCapability("appPackage", " com.gunceproapp.GunceCloud");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "crc645e33510600e34ad5.MainActivity");
        //desiredCapabilities.setCapability("appActivity", "crc645e33510600e34ad5.MainActivity");
        // ! Yukarıdaki path i kendinize göre ayarlayınız.


        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
        //  long timeLimitInSeconds = 10;
        //  WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
        //  wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//android.widget.TextView[@content-desc=\"CreateAccountLbl\"]")));
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Thread.sleep(5000);
        //WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
        WebDriverWait wait = new WebDriverWait(driver, 40);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"CreateAccountLbl\"]")));

        WebElement hesapCreate = driver.findElementByAccessibilityId("CreateAccountLbl");
        hesapCreate.click();
        Thread.sleep(5000);
        WebElement paket = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"LicenceProductTypeInputlayout\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
        paket.click();
        Thread.sleep(10000);
        WebElement bireysel = driver.findElementByAccessibilityId("HeaderLabel");
        bireysel.click();
        Thread.sleep(5000);
        WebElement isim = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"NameInputLayout\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");

        isim.click();
        Thread.sleep(5000);
        isim.sendKeys("Fark");

        Thread.sleep(5000);
        WebElement soyAd = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"SurnameInputLayout\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
        soyAd.click();
        Thread.sleep(5000);
        soyAd.sendKeys("TestAdam");

        WebElement telefon = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"PhoneInputLayout\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
        telefon.sendKeys("+905554443322");

        WebElement eposta = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"EmailInputLayout\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
        eposta.sendKeys("denemeklazim01@gmail.com");

        WebElement kurumAdi = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"CompanyNameInputLayout\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
        kurumAdi.sendKeys("Appium Sevenler Derneği");

        WebElement kvkk = driver.findElementByAccessibilityId("KVKKCheckbox");
        kvkk.click();

        WebElement hSozlesme = driver.findElementByAccessibilityId("TermsOfServiceCheckbox");
        hSozlesme.click();

        WebElement smsCheckbox = driver.findElementByAccessibilityId("SMSApproveCheckbox");
        WebElement epostaCheckbox = driver.findElementByAccessibilityId("EmailApproveCheckbox");
        WebElement telefonCheckbox = driver.findElementByAccessibilityId("PhoneApproveCheckbox");
        smsCheckbox.click();
        epostaCheckbox.click();
        telefonCheckbox.click();

        WebElement hesapOlustur = driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"SignUpButton\"])[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");
        hesapOlustur.click();


    }
}
