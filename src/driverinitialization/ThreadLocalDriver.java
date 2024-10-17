
package driverinitialization;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ThreadLocalDriver {

    ThreadLocal<AndroidDriver> driver=new ThreadLocal<AndroidDriver>();
    public static final String USERNAME="swarupkshatriya_gruMHw";
    public static final String AUTOMATE_KEY="XwxmsBfziFcFzvK8yJKY";
    public static final String URL="https://"+USERNAME+":"+AUTOMATE_KEY+"@hub-cloud.browserstack.com/wd/hub";
    public static final String remoteURL="http://localhost:4445";
    public static final String remoteAWSEC2URL="http://13.233.62.46:4445";
    public static final String remoteAppiumMobileURL="http://127.0.0.1:4723/";
    private ThreadLocalDriver(){}

    private static ThreadLocalDriver instance= new ThreadLocalDriver();

    public static ThreadLocalDriver getInstance(){
        return instance;
    }

    public  AndroidDriver getDriver(){
        return driver.get();
    }
    public synchronized void setDriver(String udid,String version) throws MalformedURLException {
     
            //    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\DriverFolder\\chromedriver.exe");
         		try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                DesiredCapabilities options = new DesiredCapabilities();
                options.setCapability("appium:udid", udid);
        		//options.setCapability("deviceName", "Pixel 4");
                options.setCapability("appium:appPackage", "us.current.android");//com.mobikwik_new //com.google.android.apps.chromecast.app
                options.setCapability("appium:appActivity", "com.current.android.feature.authentication.signIn.SignInActivity"); //.MobikwikMain //.DiscoveryActivity ///adb shell "cmd package resolve-activity --brief com.myairtelapp | tail -n 1"
                options.setCapability("appium:platformName", "Android");
                options.setCapability("appium:platformVersion", version);//8.1.0
                options.setCapability("appium:automationName", "UiAutomator2");
                    	// driver = new AndroidDriver (new URL(remoteAppiumMobileURL),options);
                driver.set(new AndroidDriver(new URL(remoteAppiumMobileURL),options));
                 

    }
    public void closeBrowser(){
        if(driver.get()!=null){
            driver.get().quit();
            driver.remove();

        }

    }
}

