package com.fido.qa.Pages;

import com.fido.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
//page factory or object repository  and @FindBy F is capital.
    WebDriver driver;
    @FindBy(xpath="//span[contains(text(),\"SHOP\")]")
    WebElement SHOP;
    @FindBy(xpath="//span[contains(text(),\"Phones\")]")
    WebElement Phones;
    @FindBy(xpath="//img[@alt='Pride Fido Logo Header EN']")
    WebElement FidoLogo;
    @FindBy(xpath="//span[contains(text(),'SUPPORT')]")
    WebElement supportPageLink;

    @FindBy(xpath = "//span[contains(text(),'WHY FIDO')]")
    WebElement whyFido;

    //create constructor and how to initialise element by using init method.
    public HomePage()  {
        this.driver=TestBase.driver;
        PageFactory.initElements(driver,this);}
public String validatePageTitle()
        {
            return driver.getTitle();
        }
        public  boolean validateFidoLogo()
        {
            return FidoLogo.isDisplayed();
        }

        public PhonePage ClickOnShopLink() throws InterruptedException {
            this.SHOP.click();
            Actions actions=new Actions(driver);
            actions.moveToElement(Phones).click().build().perform();
            Thread.sleep(2000);
            return new PhonePage();
        }
        public SupportPage supportPage()
        {
            supportPageLink.click();
            return  new SupportPage();
        }

//    public void scrollpage()
//    {
////        JavascriptExecutor js = (JavascriptExecutor) driver;
//        JavascriptExecutor jse = (JavascriptExecutor) this.driver;
//        jse.executeScript("window.scrollBy(0,100)", "");
//
//
//    }

    //////////////////////////////////////////////////////////////////////
        public WhyFidoPage whyFidoPage() //whyFido is a method is returning type of WhyFidoPage
        {
            whyFido.click();
            return  new WhyFidoPage();
        }

    }

