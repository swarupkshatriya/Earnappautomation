package HelloAppium;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driverinitialization.ThreadLocalDriver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import testdatareader.TestDataReader;

public class TestRunnerForEarnApp {
	AndroidDriver driver;
	
	public static int counter=0;
	
  @Test(enabled = false)
  public void TestCase1() {
	  try {
		  
		  	ThreadLocalDriver.getInstance().setDriver("99271FFAZ001SV", "13");
		  	driver=ThreadLocalDriver.getInstance().getDriver();
			
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
  
  
  @Test(enabled=false)
  public void TestCase2() {
	  try {
		  
		  	ThreadLocalDriver.getInstance().setDriver("5200167cfea49455", "8");
		  	driver=ThreadLocalDriver.getInstance().getDriver();
			
			 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"OTHER WAYS TO SIGN UP\"]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"Already have an account?\"]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"OTHER WAYS TO SIGN IN\"]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"OTHER WAYS TO SIGN IN\"]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"CONTINUE WITH EMAIL\"]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"CONTINUE WITH EMAIL\"]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
			
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("iamsrk01@outlook.com");
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys("Swar@tcs03");
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 Thread.sleep(5000); 
			 WebElement element= ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"CONTINUE WITH EMAIL\"]"));
			 Actions act=new Actions(ThreadLocalDriver.getInstance().getDriver());
			 act.moveToElement(element).perform();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"CONTINUE WITH EMAIL\"]")).click();
			 Thread.sleep(5000); 
		//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")));
			 List<WebElement> list1=driver.findElements(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]"));
			 if(list1.size()>=1) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")).click();
			 }
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
			 Thread.sleep(5000);
			 List<WebElement> list10=driver.findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
			 }
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]")));
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SPONSORED\"))")); 
			
		//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);")); 
			 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]"));
			 if(!list11.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]")).click();
			 }
			 list1=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.ByAndroidUIAutomator.className("android.view.View"));
			System.out.println(list1.size());
			if(!list1.isEmpty()) {
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
			}
			Thread.sleep(5000);
			List<WebElement>list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
			if(list4.size()>=1) {
				System.out.println("Clicking on Nothanks");
				ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
			}
		
			int i=1;
			while(true) {
				
				System.out.println("I am in round "+i);
				List<WebElement> list7 =ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]"));
				if(!list7.isEmpty()) {
					ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SPONSORED\").instance(0));")).click();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
					System.out.println("Header button "+list4.size());
					if(list4.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
					}
					List<WebElement>list2=driver.findElements(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])"));
					System.out.println("this article size "+ list2.size());
					if(list2.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])")).click();
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
							 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance("+ele+"))")).click();
							 	
						 }else {
							list4= ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button"));
							if(!list4.isEmpty()) {
								ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
							}/*
							list4= driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))"));
							if(!list4.isEmpty()) {
								 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))")).click();
							}*/
						 
					 }
						 
					Thread.sleep(5000);	  
					List<WebElement> list8=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"You've reached your article limit. Try again later today!\"]"));	 
					if(!list8.isEmpty()) {
						List<WebElement>list9=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"News\"]"));
						if(!list9.isEmpty()) {
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button")).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
							Thread.sleep(5000);
							list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
							 if(!list10.isEmpty()) {
								 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
							 }
						}
						 break;
					}
					
				}
				 
				 Dimension size=ThreadLocalDriver.getInstance().getDriver().manage().window().getSize();	
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
			ThreadLocalDriver.getInstance().closeBrowser();
			
	    }catch(Exception e) {}
	  
  }
  
  
  //**********************************iamsrk01@outlook 15 pts Swarup google pixel4*******************************************
  @Test(enabled = false)
  public void TestCase3() {
	  try {
		  
		  	ThreadLocalDriver.getInstance().setDriver("99271FFAZ001SV", "13");
		  	driver=ThreadLocalDriver.getInstance().getDriver();
			 WebDriverWait wait=new WebDriverWait(ThreadLocalDriver.getInstance().getDriver(), Duration.ofSeconds(30));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN UP\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Already have an account?\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			
			 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
			
			// driver.findElement(By.xpath("//*[contains(@text,\"Email\")]")).click();
			 Thread.sleep(5000); 
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 
			 List<WebElement>email=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]"));
			 if(!email.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")).sendKeys("iamsrk01@outlook.com");
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("iamsrk01@outlook.com");
			 }
			 
			 List<WebElement>password=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]"));
			 
			 if(!password.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]")).sendKeys("Swar@tcs03");
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).click();
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys("Swar@tcs03");
			 }
			
			
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 Thread.sleep(10000); 
//			 WebElement element= driver.findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]"));
//			 Actions act=new Actions(driver);
//			 act.moveToElement(element).perform();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			 Thread.sleep(10000); 
		//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")));
			 List<WebElement> list1=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[contains(@text,\"Don’t allow\")]"));
			 if(list1.size()>=1) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Don’t allow\")]")).click();
			 }
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Music\")])[1]")).click();
			 Thread.sleep(10000);
			 List<WebElement> list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]")).click();
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Search artists\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search artists\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"Search Artist\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).sendKeys("Kumar Sanu");
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 //driver.findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Playing Frequently\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Playing Frequently\")]")).click();
			 Thread.sleep(5000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Nostalgic Bollywood 90s by DesiZone Radio\").instance(0));")).click();
			// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Home\")]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"News\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
			 Thread.sleep(5000);
			 list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
				 
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]")));
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SPONSORED\"))")); 
			
		//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);")); 
			 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]"));
			 if(!list11.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]")).click();
			 }
			 list1=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.ByAndroidUIAutomator.className("android.view.View"));
			System.out.println(list1.size());
			if(!list1.isEmpty()) {
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
			}
			Thread.sleep(5000);
			List<WebElement>list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
			if(list4.size()>=1) {
				System.out.println("Clicking on Nothanks");
				ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
			}
		
			int i=1;
			while(true) {
				
				System.out.println("I am in round "+i);
				List<WebElement> list7 =ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]"));
				if(!list7.isEmpty()) {
					ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SPONSORED\").instance(0));")).click();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
					System.out.println("Header button "+list4.size());
					if(list4.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
					}
					List<WebElement>list2=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])"));
					System.out.println("this article size "+ list2.size());
					if(list2.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])")).click();
					}
					 try {
							Thread.sleep(15000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().xpath('//android.widget.Button'))"));
					 List<WebElement>list3=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.className("android.widget.Button"));
					 System.out.println("Close button instance "+list3.size());
					 int ele=list3.size()-1;
						 if(list3.size()>=1) {
							 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance("+ele+"))")).click();
							 	
						 }else {
							list4= ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button"));
							if(!list4.isEmpty()) {
								ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
							}/*
							list4= driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))"));
							if(!list4.isEmpty()) {
								 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))")).click();
							}*/
						 
					 }
						 
					Thread.sleep(5000);	  
					List<WebElement> list8=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"You've reached your article limit. Try again later today!\"]"));	 
					if(!list8.isEmpty()) {
						List<WebElement>list9=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"News\"]"));
						if(!list9.isEmpty()) {
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button")).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
							Thread.sleep(5000);
							list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
							 if(!list10.isEmpty()) {
								 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
							 }
						}
						 break;
					}
					
				}
				 
				 Dimension size=ThreadLocalDriver.getInstance().getDriver().manage().window().getSize();	
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
					ThreadLocalDriver.getInstance().getDriver().perform(Collections.singletonList(sequence));
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i++;
					
					
			}
			ThreadLocalDriver.getInstance().closeBrowser();
			
	    }catch(Exception e) {}
	  
  }
  
  @Test(enabled = false)
  public void TestCase4() {
	  try {
		  
		  	ThreadLocalDriver.getInstance().setDriver("18161JECB01227", "14");
		  	driver=ThreadLocalDriver.getInstance().getDriver();
			
			 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/otherSignUpOptionsButton\"]")));
			 driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"us.current.android:id/signInTextView\"]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/otherSignInOptionsButton\"]")));
			 driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/otherSignInOptionsButton\"]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/emailSignInButton\"]")));
			 driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"us.current.android:id/emailSignInButton\"]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")));
			 driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")).click();
			 driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")).sendKeys("oygowthamauto@gmail.com");
			 driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]")).click();
			 driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]")).sendKeys("Abcd@1011");
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
  
  
  @Test(enabled = false)
  public void TestCase5() {
	  try {
		  
		  	ThreadLocalDriver.getInstance().setDriver("18161JECB01227", "14");
		  	driver=ThreadLocalDriver.getInstance().getDriver();
			 WebDriverWait wait=new WebDriverWait(ThreadLocalDriver.getInstance().getDriver(), Duration.ofSeconds(30));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN UP\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Already have an account?\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			
			 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
			
			// driver.findElement(By.xpath("//*[contains(@text,\"Email\")]")).click();
			 Thread.sleep(5000); 
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 
			 List<WebElement>email=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]"));
			 if(!email.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")).sendKeys("oygowthamauto@gmail.com");
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("oygowthamauto@gmail.com");
			 }
			 
			 List<WebElement>password=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]"));
			 
			 if(!password.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]")).sendKeys("Abcd@1011");
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).click();
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys("Abcd@1011");
			 }
			
			
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 Thread.sleep(10000); 
			 WebElement element= ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]"));
			 Actions act=new Actions(ThreadLocalDriver.getInstance().getDriver());
			 act.moveToElement(element).perform();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			 Thread.sleep(10000); 
		//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")));
			 List<WebElement> list1=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[contains(@text,\"Don’t allow\")]"));
			 if(list1.size()>=1) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Don’t allow\")]")).click();
			 }
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Music\")])[1]")).click();
			 Thread.sleep(10000);
			 List<WebElement> list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]")).click();
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Search artists\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search artists\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"Search Artist\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).sendKeys("Kumar Sanu");
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 //driver.findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Playing Frequently\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Playing Frequently\")]")).click();
			 Thread.sleep(5000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Nostalgic Bollywood 90s by DesiZone Radio\").instance(0));")).click();
			// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Home\")]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"News\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
			 Thread.sleep(5000);
			 list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
				 
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]")));
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SPONSORED\"))")); 
			
		//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);")); 
			 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]"));
			 if(!list11.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]")).click();
			 }
			 list1=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.ByAndroidUIAutomator.className("android.view.View"));
			System.out.println(list1.size());
			if(!list1.isEmpty()) {
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
			}
			Thread.sleep(5000);
			List<WebElement>list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
			if(list4.size()>=1) {
				System.out.println("Clicking on Nothanks");
				ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
			}
		
			int i=1;
			while(true) {
				
				System.out.println("I am in round "+i);
				List<WebElement> list7 =ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]"));
				if(!list7.isEmpty()) {
					ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SPONSORED\").instance(0));")).click();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
					System.out.println("Header button "+list4.size());
					if(list4.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
					}
					List<WebElement>list2=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])"));
					System.out.println("this article size "+ list2.size());
					if(list2.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])")).click();
					}
					 try {
							Thread.sleep(15000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().xpath('//android.widget.Button'))"));
					 List<WebElement>list3=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.className("android.widget.Button"));
					 System.out.println("Close button instance "+list3.size());
					 int ele=list3.size()-1;
						 if(list3.size()>=1) {
							 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance("+ele+"))")).click();
							 	
						 }else {
							list4= ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button"));
							if(!list4.isEmpty()) {
								ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
							}/*
							list4= driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))"));
							if(!list4.isEmpty()) {
								 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))")).click();
							}*/
						 
					 }
						 
					Thread.sleep(5000);	  
					List<WebElement> list8=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"You've reached your article limit. Try again later today!\"]"));	 
					if(!list8.isEmpty()) {
						List<WebElement>list9=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"News\"]"));
						if(!list9.isEmpty()) {
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button")).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
							Thread.sleep(5000);
							list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
							 if(!list10.isEmpty()) {
								 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
							 }
						}
						 break;
					}
					
				}
				 
				 Dimension size=ThreadLocalDriver.getInstance().getDriver().manage().window().getSize();	
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
					ThreadLocalDriver.getInstance().getDriver().perform(Collections.singletonList(sequence));
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i++;
					
					
			}
			ThreadLocalDriver.getInstance().closeBrowser();
			
	    }catch(Exception e) {}
	  
  }
  
  
  @Test(enabled=false)
  public void TestCase6() {
	  try {
		  
		  	ThreadLocalDriver.getInstance().setDriver("be595d9f", "10");
		  	driver=ThreadLocalDriver.getInstance().getDriver();
			 WebDriverWait wait=new WebDriverWait(ThreadLocalDriver.getInstance().getDriver(), Duration.ofSeconds(30));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN UP\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Already have an account?\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			
			 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
			
			// driver.findElement(By.xpath("//*[contains(@text,\"Email\")]")).click();
			 Thread.sleep(5000); 
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 
			 List<WebElement>email=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]"));
			 if(!email.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")).sendKeys("hemsai2020@gmail.com");
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("hemsai2020@gmail.com");
			 }
			 
			 List<WebElement>password=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]"));
			 
			 if(!password.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]")).sendKeys("Toma@123");
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).click();
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys("Toma@123");
			 }
			
			
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 Thread.sleep(10000); 
			 WebElement element= ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]"));
			 Actions act=new Actions(ThreadLocalDriver.getInstance().getDriver());
			 act.moveToElement(element).perform();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			 Thread.sleep(10000); 
		//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")));
			 List<WebElement> list1=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[contains(@text,\"Don’t allow\")]"));
			 if(list1.size()>=1) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Don’t allow\")]")).click();
			 }
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Music\")])[1]")).click();
			 Thread.sleep(10000);
			 List<WebElement> list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]")).click();
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Search artists\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search artists\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"Search Artist\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).sendKeys("Kumar Sanu");
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 //driver.findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Playing Frequently\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Playing Frequently\")]")).click();
			 Thread.sleep(5000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Nostalgic Bollywood 90s by DesiZone Radio\").instance(0));")).click();
			// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Home\")]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"News\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
			 Thread.sleep(5000);
			 list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
				 
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]")));
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SPONSORED\"))")); 
			
		//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);")); 
			 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]"));
			 if(!list11.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]")).click();
			 }
			 list1=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.ByAndroidUIAutomator.className("android.view.View"));
			System.out.println(list1.size());
			if(!list1.isEmpty()) {
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
			}
			Thread.sleep(5000);
			List<WebElement>list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
			if(list4.size()>=1) {
				System.out.println("Clicking on Nothanks");
				ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
			}
		
			int i=1;
			while(true) {
				
				System.out.println("I am in round "+i);
				List<WebElement> list7 =ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]"));
				if(!list7.isEmpty()) {
					ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SPONSORED\").instance(0));")).click();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
					System.out.println("Header button "+list4.size());
					if(list4.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
					}
					List<WebElement>list2=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])"));
					System.out.println("this article size "+ list2.size());
					if(list2.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])")).click();
					}
					 try {
							Thread.sleep(15000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().xpath('//android.widget.Button'))"));
					 List<WebElement>list3=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.className("android.widget.Button"));
					 System.out.println("Close button instance "+list3.size());
					 int ele=list3.size()-1;
						 if(list3.size()>=1) {
							 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance("+ele+"))")).click();
							 	
						 }else {
							list4= ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button"));
							if(!list4.isEmpty()) {
								ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
							}/*
							list4= driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))"));
							if(!list4.isEmpty()) {
								 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))")).click();
							}*/
						 
					 }
						 
					Thread.sleep(5000);	  
					List<WebElement> list8=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"You've reached your article limit. Try again later today!\"]"));	 
					if(!list8.isEmpty()) {
						List<WebElement>list9=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"News\"]"));
						if(!list9.isEmpty()) {
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button")).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
							Thread.sleep(5000);
							list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
							 if(!list10.isEmpty()) {
								 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
							 }
						}
						 break;
					}
					
				}
				 
				 Dimension size=ThreadLocalDriver.getInstance().getDriver().manage().window().getSize();	
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
					ThreadLocalDriver.getInstance().getDriver().perform(Collections.singletonList(sequence));
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i++;
					
					
			}
			ThreadLocalDriver.getInstance().closeBrowser();
			
	    }catch(Exception e) {}
	  
  }
  
  //**********************************************this is automation savi 3 pts *******************************************************
  
  @Test(enabled=false)
  public void TestCase7() {
	  try {
		  
		  	ThreadLocalDriver.getInstance().setDriver("18161JECB01227", "14");
		  	driver=ThreadLocalDriver.getInstance().getDriver();
			 WebDriverWait wait=new WebDriverWait(ThreadLocalDriver.getInstance().getDriver(), Duration.ofSeconds(30));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN UP\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Already have an account?\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			
			 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
			
			// driver.findElement(By.xpath("//*[contains(@text,\"Email\")]")).click();
			 Thread.sleep(5000); 
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 
			 List<WebElement>email=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]"));
			 if(!email.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")).sendKeys("automationsavi@outlook.com");
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("automationsavi@outlook.com");
			 }
			 
			 List<WebElement>password=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]"));
			 
			 if(!password.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]")).sendKeys("Swar@tcs03");
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).click();
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys("Swar@tcs03");
			 }
			
			
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 Thread.sleep(10000); 
			 WebElement element= ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]"));
			 Actions act=new Actions(ThreadLocalDriver.getInstance().getDriver());
			 act.moveToElement(element).perform();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			 Thread.sleep(10000); 
		//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")));
			 List<WebElement> list1=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[contains(@text,\"Don’t allow\")]"));
			 if(list1.size()>=1) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Don’t allow\")]")).click();
			 }
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Music\")])[1]")).click();
			 Thread.sleep(15000);
			 List<WebElement> list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 System.out.println("I am inside music and close popup");
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]")).click();
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 System.out.println("I am inside music and close popup and checking again popup");
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Search artists\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search artists\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"Search Artist\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).sendKeys("Kumar Sanu");
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 //driver.findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Playing Frequently\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Playing Frequently\")]")).click();
			 Thread.sleep(5000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Nostalgic Bollywood 90s by DesiZone Radio\").instance(0));")).click();
			// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Home\")]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"News\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
			 Thread.sleep(5000);
			 list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
				 
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]")));
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SPONSORED\"))")); 
			
		//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);")); 
			 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]"));
			 if(!list11.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]")).click();
			 }
			 list1=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.ByAndroidUIAutomator.className("android.view.View"));
			System.out.println(list1.size());
			if(!list1.isEmpty()) {
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
			}
			Thread.sleep(5000);
			List<WebElement>list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
			if(list4.size()>=1) {
				System.out.println("Clicking on Nothanks");
				ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
			}
		
			int i=1;
			while(true) {
				
				System.out.println("I am in round "+i);
				List<WebElement> list7 =ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]"));
				if(!list7.isEmpty()) {
					ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SPONSORED\").instance(0));")).click();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
					System.out.println("Header button "+list4.size());
					if(list4.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
					}
					List<WebElement>list2=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])"));
					System.out.println("this article size "+ list2.size());
					if(list2.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])")).click();
					}
					 try {
							Thread.sleep(15000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().xpath('//android.widget.Button'))"));
					 List<WebElement>list3=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.className("android.widget.Button"));
					 System.out.println("Close button instance "+list3.size());
					 int ele=list3.size()-1;
						 if(list3.size()>=1) {
							 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance("+ele+"))")).click();
							 	
						 }else {
							list4= ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button"));
							if(!list4.isEmpty()) {
								ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
							}/*
							list4= driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))"));
							if(!list4.isEmpty()) {
								 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))")).click();
							}*/
						 
					 }
						 
					Thread.sleep(5000);	  
					List<WebElement> list8=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"You've reached your article limit. Try again later today!\"]"));	 
					if(!list8.isEmpty()) {
						List<WebElement>list9=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"News\"]"));
						if(!list9.isEmpty()) {
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button")).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
							Thread.sleep(5000);
							list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
							 if(!list10.isEmpty()) {
								 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
							 }
						}
						 break;
					}
					
				}
				 
				 Dimension size=ThreadLocalDriver.getInstance().getDriver().manage().window().getSize();	
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
					ThreadLocalDriver.getInstance().getDriver().perform(Collections.singletonList(sequence));
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i++;
					
					
			}
			ThreadLocalDriver.getInstance().closeBrowser();
			
	    }catch(Exception e) {}
	  
  }
  
 //********************************************Sid Haal 15 points *********************************************************************
  @Test(enabled = false)
  public void TestCase8() {
	  try {
		  
		  	ThreadLocalDriver.getInstance().setDriver("99271FFAZ001SV", "13");
		  	driver=ThreadLocalDriver.getInstance().getDriver();
			 WebDriverWait wait=new WebDriverWait(ThreadLocalDriver.getInstance().getDriver(), Duration.ofSeconds(30));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN UP\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Already have an account?\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			
			 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
			
			// driver.findElement(By.xpath("//*[contains(@text,\"Email\")]")).click();
			 Thread.sleep(5000); 
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 
			 List<WebElement>email=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]"));
			 if(!email.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")).sendKeys("sidhaalk@outlook.com");
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("sidhaalk@outlook.com");
			 }
			 
			 List<WebElement>password=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]"));
			 
			 if(!password.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]")).sendKeys("sidhaal@K10");
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).click();
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys("sidhaal@K10");
			 }
			
			
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 Thread.sleep(10000); 
			 WebElement element= ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]"));
			 Actions act=new Actions(ThreadLocalDriver.getInstance().getDriver());
			 act.moveToElement(element).perform();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			 Thread.sleep(10000); 
		//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")));
			 List<WebElement> list1=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[contains(@text,\"Don’t allow\")]"));
			 if(list1.size()>=1) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Don’t allow\")]")).click();
			 }
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Music\")])[1]")).click();
			 Thread.sleep(15000);
			 List<WebElement> list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 System.out.println("I am inside music and close popup");
				 Thread.sleep(5000);
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]")).click();
				 Thread.sleep(5000);
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 System.out.println("I am inside music and close popup and checking again popup");
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Search artists\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search artists\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"Search Artist\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).sendKeys("Kumar Sanu");
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 //driver.findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Playing Frequently\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Playing Frequently\")]")).click();
			 Thread.sleep(5000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Nostalgic Bollywood 90s by DesiZone Radio\").instance(0));")).click();
			// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Home\")]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"News\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
			 Thread.sleep(5000);
			 list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
				 
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]")));
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SPONSORED\"))")); 
			
		//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);")); 
			 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]"));
			 if(!list11.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]")).click();
			 }
			 list1=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.ByAndroidUIAutomator.className("android.view.View"));
			System.out.println(list1.size());
			if(!list1.isEmpty()) {
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
			}
			Thread.sleep(5000);
			List<WebElement>list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
			if(list4.size()>=1) {
				System.out.println("Clicking on Nothanks");
				ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
			}
		
			int i=1;
			while(true) {
				
				System.out.println("I am in round "+i);
				List<WebElement> list7 =ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]"));
				if(!list7.isEmpty()) {
					ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SPONSORED\").instance(0));")).click();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
					System.out.println("Header button "+list4.size());
					if(list4.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
					}
					List<WebElement>list2=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])"));
					System.out.println("this article size "+ list2.size());
					if(list2.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])")).click();
					}
					 try {
							Thread.sleep(15000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().xpath('//android.widget.Button'))"));
					 List<WebElement>list3=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.className("android.widget.Button"));
					 System.out.println("Close button instance "+list3.size());
					 int ele=list3.size()-1;
						 if(list3.size()>=1) {
							 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance("+ele+"))")).click();
							 	
						 }else {
							list4= ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button"));
							if(!list4.isEmpty()) {
								ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
							}/*
							list4= driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))"));
							if(!list4.isEmpty()) {
								 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))")).click();
							}*/
						 
					 }
						 
					Thread.sleep(5000);	  
					List<WebElement> list8=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"You've reached your article limit. Try again later today!\"]"));	 
					if(!list8.isEmpty()) {
						List<WebElement>list9=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"News\"]"));
						if(!list9.isEmpty()) {
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button")).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
							Thread.sleep(5000);
							list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
							 if(!list10.isEmpty()) {
								 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
							 }
						}
						 break;
					}
					
				}
				 
				 Dimension size=ThreadLocalDriver.getInstance().getDriver().manage().window().getSize();	
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
					ThreadLocalDriver.getInstance().getDriver().perform(Collections.singletonList(sequence));
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i++;
					
					
			}
			ThreadLocalDriver.getInstance().closeBrowser();
			
	    }catch(Exception e) {}
	  
  }
 //*************************************************** Ravi Bhojpuria 15 pts Swarup Google pixel4*********************************
  @Test(dataProvider = "ObjectDataProvider")
  public void TestCaseEarnApp(String strMobileID,String strAndroidVersion,String strEmailID,String strPassword,String strSinger) {
	  
	  int kk=Rowcounter();
		
		System.out.println("************************Row Number "+kk+"******************************************************************");
		System.out.println("Round Started at time "+ new Date());
		System.out.println("UserName "+strEmailID);
		System.out.println("Password "+strPassword);
		
	  try {
		  TestDataReader read=new TestDataReader();
		  	ThreadLocalDriver.getInstance().setDriver(strMobileID, strAndroidVersion);
		  	driver=ThreadLocalDriver.getInstance().getDriver();
			 WebDriverWait wait=new WebDriverWait(ThreadLocalDriver.getInstance().getDriver(), Duration.ofSeconds(30));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN UP\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Already have an account?\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			
			 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
			
			// driver.findElement(By.xpath("//*[contains(@text,\"Email\")]")).click();
			 Thread.sleep(5000); 
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 
			 List<WebElement>email=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]"));
			 if(!email.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")).sendKeys(strEmailID);
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys(strEmailID);
			 }
			 
			 List<WebElement>password=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]"));
			 
			 if(!password.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]")).sendKeys(strPassword);
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).click();
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys(strPassword);
			 }
			
			 Thread.sleep(5000); 
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 Thread.sleep(10000); 
			 WebElement element= ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]"));
			 Actions act=new Actions(ThreadLocalDriver.getInstance().getDriver());
			 act.moveToElement(element).perform();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			 Thread.sleep(10000); 
		//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")));
			 List<WebElement> list1=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[contains(@text,\"Don’t allow\")]"));
			 if(!list1.isEmpty()) {
				 list1=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[contains(@text,\"Don’t allow\")]"));
				 if(!list1.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Don’t allow\")]")).click();
				 } 
			 }
			 Thread.sleep(15000);
			 
			List<WebElement>list13= ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/half_interstitial_image\"]"));
			//android.widget.ImageView[@resource-id="us.current.android:id/half_interstitial_image"]
			//android.widget.ImageView[@resource-id="us.current.android:id/half_interstitial_image"]
			
			System.out.println("Home page pop up window size "+ list13.size());
			if(!list13.isEmpty()) {
				System.out.println("Inside home page pop up window  ");
				ThreadLocalDriver.getInstance().getDriver().findElement(By.className("android.widget.ImageView")).click();
				
				System.out.println("******clicked on pop up window on home page**********************************");
				//ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/half_interstitial_image\"]")).click();
			}
			 Thread.sleep(15000);
			 List<WebElement>list12=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			//android.widget.ImageView[@content-desc="inapp_close_btn"]
			//android.widget.ImageView[@content-desc="inapp_close_btn"]
			 if(!list12.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]")).click();
			 }
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
			 List<WebElement> list10;

			 /*
			// ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Music\")])[1]")).click();
			 Thread.sleep(15000);
			 list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 System.out.println("I am inside music and close popup");
				 Thread.sleep(5000);
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]")).click();
				 Thread.sleep(5000);
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 System.out.println("I am inside music and close popup and checking again popup");
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			 /*
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Search artists\")]")));
			 
			 Thread.sleep(5000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search artists\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"Search Artist\")]")));
			 Thread.sleep(5000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).sendKeys(strSinger);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 //driver.findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Playing Frequently\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Playing Frequently\")]")).click();
			 Thread.sleep(10000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Nostalgic Bollywood 90s by DesiZone Radio\").instance(0));")).click();
			// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Home\")]")).click();
			*/
			 
			 Thread.sleep(10000);
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"News\")]")));
			// Thread.sleep(10000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
			 Thread.sleep(5000);
			 list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
				 
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]")));
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SPONSORED\"))")); 
			
		//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);")); 
			 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]"));
			 if(!list11.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]")).click();
			 }
			 list1=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.ByAndroidUIAutomator.className("android.view.View"));
			System.out.println(list1.size());
			if(!list1.isEmpty()) {
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
			}
			Thread.sleep(5000);
			List<WebElement>list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
			if(list4.size()>=1) {
				System.out.println("Clicking on Nothanks");
				ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
			}
		
			int i=1;
			while(true) {
				
				System.out.println("I am in round "+i);
				List<WebElement> list7 =ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]"));
				if(!list7.isEmpty()) {
					ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SPONSORED\").instance(0));")).click();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
					System.out.println("Header button "+list4.size());
					if(list4.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
					}
					List<WebElement>list2=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])"));
					System.out.println("this article size "+ list2.size());
					if(list2.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])")).click();
					}
					 try {
							Thread.sleep(15000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().xpath('//android.widget.Button'))"));
					 List<WebElement>list3=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.className("android.widget.Button"));
					 System.out.println("Close button instance "+list3.size());
					 int ele=list3.size()-1;
						 if(list3.size()>=1) {
//							 System.out.println(" I am clicking on close button of articles");
//							 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance("+ele+"))")).click();
							 ThreadLocalDriver.getInstance().getDriver().pressKey(new KeyEvent(AndroidKey.BACK));
							 try {
									Thread.sleep(5000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							 
								List<WebElement> list8=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"You've reached your article limit. Try again later today!\"]"));	 
								if(!list8.isEmpty()) {
									System.out.println("**************************************Reached Maximum Limit******************************");
									List<WebElement>list9=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"News\"]"));
									if(!list9.isEmpty()) {
										ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button")).click();
										wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
//										ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
//										Thread.sleep(5000);
//										list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
//										 if(!list10.isEmpty()) {
//											 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
//										 }
									}
									System.out.println("************************You've reached your article limit. Try again later today!***********");
									
									break;
								}
							 
							 list3=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.className("android.widget.Button"));
							 System.out.println("Close button instance "+list3.size());
							  ele=list3.size()-1;
							  if(!list3.isEmpty()) {
								  List<WebElement> list15=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[contains(@text,\"News\")]"));
								  if(!list15.isEmpty()) {
									  
								  }else {
									  ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance("+ele+"))")).click();
								  }
								  
							  }
							  
						 }else {
//							list4= ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button"));
//							if(!list4.isEmpty()) {
//								System.out.println("if only close button clicking");
//								ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
//							}
//							list4= driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))"));
//							if(!list4.isEmpty()) {
//								System.out.println("I am clicking on close button to avoid to go into loop");
//								 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))")).click();
//							}
							 ThreadLocalDriver.getInstance().getDriver().pressKey(new KeyEvent(AndroidKey.BACK));
							
						 
					 }
						 
					Thread.sleep(5000);	  
					//android.widget.TextView[@text="You've reached your article limit. Try again later today!"]
					List<WebElement> list8=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"You've reached your article limit. Try again later today!\"]"));	 
					if(!list8.isEmpty()) {
						System.out.println("**************************************Reached Maximum Limit******************************");
						List<WebElement>list9=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"News\"]"));
						if(!list9.isEmpty()) {
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button")).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
//							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
//							Thread.sleep(5000);
//							list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
//							 if(!list10.isEmpty()) {
//								 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
//							 }
						}
						System.out.println("************************You've reached your article limit. Try again later today!***********");
						 break;
					}
					
				}
				 
				 Dimension size=ThreadLocalDriver.getInstance().getDriver().manage().window().getSize();	
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
					ThreadLocalDriver.getInstance().getDriver().perform(Collections.singletonList(sequence));
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i++;
					
					
			}
			
			ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/myModeProfile\"]")).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/settingsIcon\"]")));
			ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/settingsIcon\"]")).click();
			ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"us.current.android:id/logout\"))")).click();
			Thread.sleep(5000);
			ThreadLocalDriver.getInstance().closeBrowser();
			
	    }catch(Exception e) {}
	  
	  	System.out.println("***************************************Row Number "+kk+" Ended ***************************************************");
		System.out.println("Round Ended at time " + new Date());
		
	  
  }
  
  
  
  
//*************************************************** Govind Surekha 15 pts Swarup Google pixel4*********************************
  @Test(dataProvider = "ObjectDataProvider")
  public void TestCaseEarnApp2(String strMobileID,String strAndroidVersion,String strEmailID,String strPassword,String strSinger) {
	  
	  int kk=Rowcounter();
		
		System.out.println("************************Row Number "+kk+"******************************************************************");
		System.out.println("Round Started at time "+ new Date());
		System.out.println("UserName "+strEmailID);
		System.out.println("Password "+strPassword);
		
	  try {
		  TestDataReader read=new TestDataReader();
		  	ThreadLocalDriver.getInstance().setDriver(strMobileID, strAndroidVersion);
		  	driver=ThreadLocalDriver.getInstance().getDriver();
			 WebDriverWait wait=new WebDriverWait(ThreadLocalDriver.getInstance().getDriver(), Duration.ofSeconds(30));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN UP\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Already have an account?\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"OTHER WAYS TO SIGN IN\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			
			 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
			
			// driver.findElement(By.xpath("//*[contains(@text,\"Email\")]")).click();
			 Thread.sleep(5000); 
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 
			 List<WebElement>email=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]"));
			 if(!email.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etEmail\"]")).sendKeys(strEmailID);
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys(strEmailID);
			 }
			 
			 List<WebElement>password=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]"));
			 
			 if(!password.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"us.current.android:id/etPassword\"]")).sendKeys(strPassword);
			 }else {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).click();
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys(strPassword);
			 }
			
			 Thread.sleep(5000); 
			 ThreadLocalDriver.getInstance().getDriver().hideKeyboard();
			 Thread.sleep(10000); 
			 WebElement element= ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]"));
			 Actions act=new Actions(ThreadLocalDriver.getInstance().getDriver());
			 act.moveToElement(element).perform();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"CONTINUE WITH EMAIL\")]")).click();
			 Thread.sleep(10000); 
		//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")));
			 List<WebElement> list1=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[contains(@text,\"Don’t allow\")]"));
			 if(!list1.isEmpty()) {
				 list1=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[contains(@text,\"Don’t allow\")]"));
				 if(!list1.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Don’t allow\")]")).click();
				 } 
			 }
			 Thread.sleep(15000);
			 
			List<WebElement>list13= ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/half_interstitial_image\"]"));
			//android.widget.ImageView[@resource-id="us.current.android:id/half_interstitial_image"]
			//android.widget.ImageView[@resource-id="us.current.android:id/half_interstitial_image"]
			
			System.out.println("Home page pop up window size "+ list13.size());
			if(!list13.isEmpty()) {
				System.out.println("Inside home page pop up window  ");
				ThreadLocalDriver.getInstance().getDriver().findElement(By.className("android.widget.ImageView")).click();
				
				System.out.println("******clicked on pop up window on home page**********************************");
				//ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/half_interstitial_image\"]")).click();
			}
			 Thread.sleep(15000);
			 List<WebElement>list12=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			//android.widget.ImageView[@content-desc="inapp_close_btn"]
			//android.widget.ImageView[@content-desc="inapp_close_btn"]
			 if(!list12.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]")).click();
			 }
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
			 List<WebElement> list10;

			 /*
			// ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Music\")])[1]")).click();
			 Thread.sleep(15000);
			 list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 System.out.println("I am inside music and close popup");
				 Thread.sleep(5000);
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]")).click();
				 Thread.sleep(5000);
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 System.out.println("I am inside music and close popup and checking again popup");
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			 /*
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Search artists\")]")));
			 
			 Thread.sleep(5000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search artists\")]")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,\"Search Artist\")]")));
			 Thread.sleep(5000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Search Artist\")]")).sendKeys(strSinger);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 //driver.findElement(By.xpath("(//*[contains(@text,\"Kumar Sanu\")])[2]")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Playing Frequently\")]")));
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Playing Frequently\")]")).click();
			 Thread.sleep(10000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Nostalgic Bollywood 90s by DesiZone Radio\").instance(0));")).click();
			// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")));
			 
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Nostalgic Bollywood 90s by DesiZone Radio\")]")).click();
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[contains(@text,\"Home\")]")).click();
			*/
			 
			 Thread.sleep(10000);
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@text,\"News\")]")));
			// Thread.sleep(10000);
			 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
			 Thread.sleep(5000);
			 list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
			 if(!list10.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"inapp_close_btn\"]"));
				 
				 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
				 if(!list11.isEmpty()) {
					 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
				 }
				
			 }
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]")));
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SPONSORED\"))")); 
			
		//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10);")); 
			 List<WebElement>list11=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]"));
			 if(!list11.isEmpty()) {
				 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button[@content-desc=\"Tutorial continue button\"]")).click();
			 }
			 list1=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.ByAndroidUIAutomator.className("android.view.View"));
			System.out.println(list1.size());
			if(!list1.isEmpty()) {
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
			}
			Thread.sleep(5000);
			List<WebElement>list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
			if(list4.size()>=1) {
				System.out.println("Clicking on Nothanks");
				ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
			}
		
			int i=1;
			while(true) {
				
				System.out.println("I am in round "+i);
				List<WebElement> list7 =ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"SPONSORED\"]"));
				if(!list7.isEmpty()) {
					ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SPONSORED\").instance(0));")).click();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					list4=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']"));
					System.out.println("Header button "+list4.size());
					if(list4.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//*[@resource-id='us.current.android:id/header_button_2']")).click();
					}
					List<WebElement>list2=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])"));
					System.out.println("this article size "+ list2.size());
					if(list2.size()>=1) {
						ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"this article\"])")).click();
					}
					 try {
							Thread.sleep(15000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().xpath('//android.widget.Button'))"));
					 List<WebElement>list3=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.className("android.widget.Button"));
					 System.out.println("Close button instance "+list3.size());
					 int ele=list3.size()-1;
						 if(list3.size()>=1) {
//							 System.out.println(" I am clicking on close button of articles");
//							 ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance("+ele+"))")).click();
							 ThreadLocalDriver.getInstance().getDriver().pressKey(new KeyEvent(AndroidKey.BACK));
							 try {
									Thread.sleep(5000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							 
								List<WebElement> list8=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"You've reached your article limit. Try again later today!\"]"));	 
								if(!list8.isEmpty()) {
									System.out.println("**************************************Reached Maximum Limit******************************");
									List<WebElement>list9=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"News\"]"));
									if(!list9.isEmpty()) {
										ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button")).click();
										wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
//										ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
//										Thread.sleep(5000);
//										list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
//										 if(!list10.isEmpty()) {
//											 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
//										 }
									}
									System.out.println("************************You've reached your article limit. Try again later today!***********");
									
									break;
								}
							 
							 list3=ThreadLocalDriver.getInstance().getDriver().findElements(AppiumBy.className("android.widget.Button"));
							 System.out.println("Close button instance "+list3.size());
							  ele=list3.size()-1;
							  if(!list3.isEmpty()) {
								  List<WebElement> list15=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//*[contains(@text,\"News\")]"));
								  if(!list15.isEmpty()) {
									  
								  }else {
									  ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance("+ele+"))")).click();
								  }
								  
							  }
							  
						 }else {
//							list4= ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button"));
//							if(!list4.isEmpty()) {
//								System.out.println("if only close button clicking");
//								ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
//							}
//							list4= driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))"));
//							if(!list4.isEmpty()) {
//								System.out.println("I am clicking on close button to avoid to go into loop");
//								 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.Button\").instance(0))")).click();
//							}
							 ThreadLocalDriver.getInstance().getDriver().pressKey(new KeyEvent(AndroidKey.BACK));
							
						 
					 }
						 
					Thread.sleep(5000);	  
					//android.widget.TextView[@text="You've reached your article limit. Try again later today!"]
					List<WebElement> list8=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"You've reached your article limit. Try again later today!\"]"));	 
					if(!list8.isEmpty()) {
						System.out.println("**************************************Reached Maximum Limit******************************");
						List<WebElement>list9=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.TextView[@text=\"News\"]"));
						if(!list9.isEmpty()) {
							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.Button")).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"News\"]")));
//							ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"News\"]")).click();
//							Thread.sleep(5000);
//							list10=ThreadLocalDriver.getInstance().getDriver().findElements(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]"));
//							 if(!list10.isEmpty()) {
//								 ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/ivClose\"]")).click();
//							 }
						}
						System.out.println("************************You've reached your article limit. Try again later today!***********");
						 break;
					}
					
				}
				 
				 Dimension size=ThreadLocalDriver.getInstance().getDriver().manage().window().getSize();	
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
					ThreadLocalDriver.getInstance().getDriver().perform(Collections.singletonList(sequence));
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i++;
					
					
			}
			
			ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/myModeProfile\"]")).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/settingsIcon\"]")));
			ThreadLocalDriver.getInstance().getDriver().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"us.current.android:id/settingsIcon\"]")).click();
			ThreadLocalDriver.getInstance().getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"us.current.android:id/logout\"))")).click();
			Thread.sleep(5000);
			ThreadLocalDriver.getInstance().closeBrowser();
			
	    }catch(Exception e) {}
	  
	  	System.out.println("***************************************Row Number "+kk+" Ended ***************************************************");
		System.out.println("Round Ended at time " + new Date());
		
	  
  }
  
  
  @DataProvider(name="ObjectDataProvider")
  public Object[][] getDataObjectDataProvider(Method method) throws IOException {
      Object[][] arrayobject=null;
      TestDataReader reader1=new TestDataReader();
      switch (method.getName()){
          case "TestCaseEarnApp":
                  arrayobject=reader1.getDataProviderData("Credentials");
                  break;
          case "TestCaseEarnApp2":
              arrayobject=reader1.getDataProviderData("RandomUsers");
              break; 
          default:
        	  
      }
      return  arrayobject;
  }
  
  public int Rowcounter() {
	  
	 
	  counter=counter+1;
	  return counter;
	  
  }
  
  
}
