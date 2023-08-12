package com.fido.qa.Pages;

import com.fido.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportPage extends TestBase {
WebDriver driver;

    @FindBy(xpath="//a[@aria-label='Getting started']")
    WebElement gettingStartedBtn;

    public SupportPage()
    {
        this.driver=TestBase.driver;
        PageFactory.initElements(driver,this);
    }

    public String  supportPageTitle()
    {
        return driver.getTitle();
    }

public SupportPage ClickOngettingBtn()
{
    gettingStartedBtn.click();
    return this;
}

}
