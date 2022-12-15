package Khan_academy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Task_all {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void BT() throws MalformedURLException  {
    DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "5eeca162");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"org.khanacademy.android.ui.library.MainActivity");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(enabled = false)
	public void login() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();	
		
		driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")").click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.google.android.gms:id/container")).click();
		Thread.sleep(8000);
		driver.findElementByAndroidUIAutomator("text(\"Select language\")").click();
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("text(\"United States (U.S.)\")").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}

	@Test(enabled = true)
	public void tc2() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		Thread.sleep(3000);
//		driver.findElementByAndroidUIAutomator("text(\"Surprise me!\")").click();
//		Thread.sleep(20000);	
		
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(MobileBy.id("Computing")).click();
		driver.findElements(MobileBy.className("android.view.ViewGroup")).get(2).click();
		driver.findElementByAndroidUIAutomator("text(\"Cryptography!\")").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Randomized algorithms\"))");
		driver.findElementByAndroidUIAutomator("text(\"Fermat's little theorem\")").click();
		Thread.sleep(10000);
		driver.findElementByAndroidUIAutomator("text(\"Transcript\")").click();
		Thread.sleep(10000);
		driver.findElement(MobileBy.AccessibilityId("Dismiss")).click();
		Thread.sleep(10000);
		driver.findElementByAndroidUIAutomator("text(\"Bookmark\")").click();
		Thread.sleep(10000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}
	@Test(enabled = false)
	public void download() {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Download now\"))").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
		
	

}
