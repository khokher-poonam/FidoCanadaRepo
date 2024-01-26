package com.fido.qa.base;

import com.fido.qa.Utils.TestUtil;
import com.fido.qa.Utils.WebEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//base class of everyclass//
public class TestBase {
  //static is used that this global variables used throughout the class//
    public static  WebDriver driver;
    static Properties prop;
    public  static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
    //create constructor class and constructor name will be the class name//
    public TestBase()  {
try{
         prop=new Properties();
        FileInputStream fip=new FileInputStream("C:\\Users\\poona\\ISP-Automation\\FidoCAFramework_new\\src\\test\\java\\com\\fido\\qa\\Config\\config.properties");
prop.load(fip);

    }
    catch(FileNotFoundException e){
e.printStackTrace();
}
catch(IOException e)
{
    e.printStackTrace();
}
    }

    public static void initialization()  // create method
    {
       String browserName= prop.getProperty("browser");
        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C://Automation//chromedriver.exe");
             driver=new ChromeDriver();
        }
        else if(browserName.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","C://Automation//geckodriver.exe");
             driver=new FirefoxDriver();
        }

        /******************************* for WebEventListener class *********************** */
        e_driver = new EventFiringWebDriver(driver);
        // Now create object of EventListerHandler to register it with EventFiringWebDriver
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;

   driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }



}
