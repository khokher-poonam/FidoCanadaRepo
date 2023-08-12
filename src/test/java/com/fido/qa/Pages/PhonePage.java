package com.fido.qa.Pages;

import com.fido.qa.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonePage extends TestBase {
WebDriver driver;
    @FindBy(xpath="//div[@id=\"samsung-label-container\"]")
    WebElement samsungCheckBtn;
    @FindBy(xpath="//div[@id=\"apple-label-container\"]")
    WebElement appleCheckBtn;
@FindBy(id = "smartphone-label-container")
    WebElement smartPhoneCheckBtn;
@FindBy(xpath="//a[contains(@title,'View Details - Samsung Galaxy Z Flip5')]")
WebElement viewBtn;
    @FindBy(xpath="//button[contains(@title,'Get started')]/span")
    WebElement getStartedBtn;
    @FindBy(xpath="//span[@id=\"ds-radio-input-id-0-label\"]")
    WebElement colorSelect;
    @FindBy(xpath="//button[@title=\"View details\"]")
    WebElement viewDetails;
    @FindBy(xpath="//button[@title=\"Build your plan\"]")
    WebElement ClickShipBtn;
    @FindBy(xpath = "//button[@title=\"Continue\"]")
    WebElement ClickContinueBtn;
    @FindBy(xpath = "//div[@class='dsa-layout container']//div[@class='d-flex flex-row justify-content-end ng-star-inserted']//button")
    WebElement ClickContinue2Btn;
    @FindBy(xpath = "//div[@class=\"d-flex flex-row-reverse mt-16 ng-star-inserted\"]//button")
    WebElement ClickContinue3Btn;
    @FindBy(xpath="//button[@title=\"Continue without device protection\"]")
    WebElement ClickAlertOptionBtn;
    @FindBy(xpath = "//div[@id=\"staticCTA\"]//span[contains(text(), \" Proceed to Checkout \")]")
    WebElement ClickProceedCheckout;

    @FindBy(xpath = "//input[@id='ds-form-input-id-6']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='ds-form-input-id-7']")
    WebElement confirmEmail;
    @FindBy(xpath = "//input[@id='ds-form-input-id-8']")
    WebElement first_Name;
    @FindBy(xpath = "//input[@id='ds-form-input-id-9']")
    WebElement last_Name;
    @FindBy(xpath = "//input[@id='ds-form-input-id-11']")
    WebElement contactNo;
    @FindBy(xpath = "//input[@id='ds-form-input-id-10']")
    WebElement billingaddress;
    @FindBy(xpath = "//textarea[@id='ds-form-input-id-8']")
    WebElement additionalComment;

public PhonePage()
{
    this.driver=TestBase.driver;
    PageFactory.initElements(driver,this);
}

    public String  phonePageTitle()
    {
        return driver.getTitle();
    }
public PhonePage ClickSamsungCheckBtn() {
    samsungCheckBtn.click();
    return this;
}
public PhonePage ClickAppleChcekBtn() {
    appleCheckBtn.click();
    return this;
}
public  PhonePage ClickSmartPhoneBtn() {
    smartPhoneCheckBtn.click();
    return this;
}

public PhonePage ClickViewBtnClick()
{
    viewBtn.click();
    return this;
}
public  PhonePage ClickGetStartedBtn()
{
    getStartedBtn.click();
    return this;
}
public PhonePage SelectColor()
{
    colorSelect.click();
    return this;
}
public PhonePage ClickViewDetails()
{
    viewDetails.click();
    return this;
}
public PhonePage ClickShipBtn()
{
    ClickShipBtn.click();
    return this;
}
public PhonePage ClickContinueBtn()
{
    ClickContinueBtn.click();
    return this;
}
public PhonePage ClickContinue2Btn()
{
    ClickContinue2Btn.click();
    return this;
}
public PhonePage ClickContinue3Btn()
{
    ClickContinue3Btn.click();
    return this;
}
public  PhonePage ClickAlertOptionBtn()
{
    ClickAlertOptionBtn.click();
    return this;
}
public PhonePage ClickProceedCheckout()
{
    ClickProceedCheckout.click();
    return this;
}
public PhonePage emailField(String ef)
{
    emailField.sendKeys(ef);
    return this;
}
    public PhonePage confirmEmail(String cf)
    {
        confirmEmail.sendKeys(cf);
        return this;
    }
    public PhonePage first_Name(String fn)
    {
        this.first_Name.sendKeys(fn);
        return this;
    }
    public PhonePage Last_Name(String ln)
    {
        this.last_Name.sendKeys(ln);
        return this;
    }
    public PhonePage contact_no(Object cn)
    {
        this.contactNo.sendKeys(String.valueOf(cn));
        return this;
    }
    public PhonePage billing(String ba)
    {
//        Select select=new Select(billingaddress);
//        select.selectByVisibleText("22 Hillson Crt - Brampton, ON, L6P 1C4");
        this.billingaddress.sendKeys(ba);
        this.billingaddress.click();
//        Actions act=new Actions(driver);
//        act.moveToElement(driver.findElement(By.xpath("//ul//li[@class='ng-star-inserted']"))).click().build().perform();
//        this.billingaddress.sendKeys(ba.trim());

//billingaddress.sendKeys(Keys.DOWN);
//billingaddress.sendKeys(Keys.ENTER);

        return this;
    }
    public PhonePage additionalComment(String ai)
    {
        this.additionalComment.sendKeys(ai);
        return this;
    }
}

