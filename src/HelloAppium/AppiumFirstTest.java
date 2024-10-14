package HelloAppium;


import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;


import io.appium.java_client.android.AndroidDriver;



public class AppiumFirstTest {
	static  AndroidDriver  driver;
	
	public static void main(String args[]) {
	
		
		DesiredCapabilities options = new DesiredCapabilities();
       // options.setCapability("udid", "5200167cfea49455");
		//options.setCapability("appium:udid", "99271FFAZ001SV");
		
		//*********************below code is for pixel4
		options.setCapability("appium:udid", "99271FFAZ001SV");
		//options.setCapability("deviceName", "Pixel 4");
        options.setCapability("appium:appPackage", "us.current.android");//com.mobikwik_new //com.google.android.apps.chromecast.app
        options.setCapability("appium:appActivity", "com.current.android.feature.authentication.signIn.SignInActivity"); //.MobikwikMain //.DiscoveryActivity ///adb shell "cmd package resolve-activity --brief com.myairtelapp | tail -n 1"
        options.setCapability("appium:platformName", "Android");
        options.setCapability("appium:platformVersion", "13");//8.1.0
        options.setCapability("appium:automationName", "UiAutomator2");
        //options.setCapability("noReset", true); 
		
		
		/* below code is for Pixel 6 
		options.setCapability("appium:udid", "26151FDF60093F");
		//options.setCapability("deviceName", "Pixel 4");
        options.setCapability("appium:appPackage", "us.current.android");//com.mobikwik_new //com.google.android.apps.chromecast.app
        options.setCapability("appium:appActivity", "com.current.android.feature.authentication.signIn.SignInActivity"); //.MobikwikMain //.DiscoveryActivity ///adb shell "cmd package resolve-activity --brief com.myairtelapp | tail -n 1"
        options.setCapability("appium:platformName", "Android");
        options.setCapability("appium:platformVersion", "14");//8.1.0
        options.setCapability("appium:automationName", "UiAutomator2");
        //options.setCapability("noReset", true); 
         
         */
		
	    try {
			
			
			 driver = new AndroidDriver (new URL("http://127.0.0.1:4723/"),options);
			 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/otherSignUpOptionsButton\"]")));
			 driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"us.current.android:id/signInTextView\"]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/otherSignInOptionsButton\"]")));
			 driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/otherSignInOptionsButton\"]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/emailSignInButton\"]")));
			 driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/emailSignInButton\"]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")));
			 driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")).click();
			 driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")).sendKeys("automationsavi@outlook.com");
			 driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]")).click();
			 driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]")).sendKeys("Swar@tcs03");
			 driver.hideKeyboard();
			 WebElement element= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/continueButton\"]"));
			 Actions act=new Actions(driver);
			 act.moveToElement(element).perform();
			 driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/continueButton\"]")).click();
			 Thread.sleep(5000); 
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")));
			 List<WebElement> list1=driver.findElements(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]"));
			 if(list1.size()>=1) {
				 driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")).click();
			 }
			 
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
			 driver.findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
			 Thread.sleep(5000);
			 
			 List<WebElement> list10=driver.findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
			 if(!list10.isEmpty()) {
				 driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
			 }
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]")));
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SPONSORED\"))")); 
			
		//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);")); 
			 list1=driver.findElements(AppiumBy.ByAndroidUIAutomator.className("android.view.View"));

			System.out.println(list1.size());
			if(!list1.isEmpty()) {
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
			}
			
			Thread.sleep(5000);
			
			List<WebElement>list4=driver.findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
			
			
			if(list4.size()>=1) {
				System.out.println("Clicking on Nothanks");
				driver.findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
			}
		
			int i=1;
			while(true) {
				
				System.out.println("I am in round "+i);
				List<WebElement> list7 =driver.findElements(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]"));
				
				if(!list7.isEmpty()) {
					driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SPONSORED\").instance(0));")).click();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					list4=driver.findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
					
					System.out.println("Header button "+list4.size());
					
					if(list4.size()>=1) {
						driver.findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
					}
					 
					List<WebElement>list2=driver.findElements(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])"));
					System.out.println("this article size "+ list2.size());
					if(list2.size()>=1) {
						 driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])")).click();
					}
					
					 try {
							Thread.sleep(15000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().xpath('//android.widget.Button'))"));
					 List<WebElement>list3=driver.findElements(AppiumBy.className("android.widget.Button"));
					 System.out.println("Close button instance "+list3.size());
					 int ele=list3.size()-1;
				
						 if(list3.size()>=1) {
								driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance("+ele+"))")).click();
							 	
						 }else {
							list4= driver.findElements(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button"));
							if(!list4.isEmpty()) {
								driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
							}/*
							list4= driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))"));
							if(!list4.isEmpty()) {
								 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))")).click();
							}*/
						 
					 }
						 
					Thread.sleep(5000);	 
						 
					List<WebElement> list8=driver.findElements(By.xpath("//android.widget.TextView[@text=\"You've reached your article limit. Try again later today!\"]"));	 
					
					if(!list8.isEmpty()) {
						
						List<WebElement>list9=driver.findElements(By.xpath("//android.widget.TextView[@text=\"News\"]"));
						
						if(!list9.isEmpty()) {
							driver.findElement(By.xpath("//android.widget.Button")).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
							driver.findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
							Thread.sleep(5000);
							list10=driver.findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
							 if(!list10.isEmpty()) {
								 driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
							 }
							
						}
						 break;
					}
					
				}
				 
				 Dimension size=driver.manage().window().getSize();	
					System.out.println("Size of window is "+size);
					int startX=size.getWidth()/2;
					int startY=size.getHeight()/2;
					
					System.out.println(startX);
					System.out.println(startY);
					int endX=startX;
					int endY=(int)(size.getHeight()*0.25);
					PointerInput finger1=new PointerInput(Kind.TOUCH, "finger1");
					Sequence sequence=new Sequence(finger1, 1)
							.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
							.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
							.addAction(new Pause(finger1, Duration.ofMillis(200)))
							.addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
							.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
					driver.perform(Collections.singletonList(sequence));
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i++;
					
					
			}
			driver.quit();
			
	    }catch(Exception e) {}
	}

	
}
