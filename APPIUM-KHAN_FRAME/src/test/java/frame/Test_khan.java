package frame;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Frame.capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Test_khan extends capabilities {
	@BeforeTest
	public void KillAllProcesses() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(8000);
		
	}
	@Test
	public void tc1() throws IOException, InterruptedException {
		Thread.sleep(3000);
		service = startServer();
		AndroidDriver<AndroidElement> driver= hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);
		
        Thread.sleep(3000);
		
		driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();	
		
		driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")").click();
		driver.findElement(MobileBy.id("f229acf1-a4d0-41ad-9c7f-787660e61754")).click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
	}
}
