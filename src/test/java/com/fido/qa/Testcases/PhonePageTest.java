package com.fido.qa.Testcases;

import com.fido.qa.Data.ExcelData;
import com.fido.qa.Pages.HomePage;
import com.fido.qa.Pages.PhonePage;
import com.fido.qa.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Iterator;

public class PhonePageTest extends TestBase {
PhonePage phonePage=new PhonePage();
HomePage homepage;
    public PhonePageTest()
    {
        super();
    }
    @BeforeClass
    public void setUp() throws InterruptedException {
initialization();
        phonePage=new PhonePage();
homepage=new HomePage();
        phonePage=homepage.ClickOnShopLink();
    }

    @Test(priority = 1)
    public void phonePageTitle()
    {
        String title=phonePage.phonePageTitle();
        Assert.assertEquals(title,"Cell Phones & Mobile Devices - Shop iPhone, Samsung, Pixel - Fido");
    }


    @Test(dataProvider = "fido_dataProvider" ,dataProviderClass = ExcelData.class)
    public void ClickSidebarChkBtn(Object[] data) throws InterruptedException {
        Thread.sleep(2000);
        phonePage.ClickSamsungCheckBtn();
        phonePage.ClickAppleChcekBtn();
        phonePage.ClickSmartPhoneBtn();
        phonePage.ClickViewBtnClick();
        phonePage.ClickGetStartedBtn();
        phonePage.SelectColor();
        phonePage.ClickViewDetails();
        phonePage.ClickShipBtn();
        phonePage.ClickContinueBtn();
        phonePage.ClickContinue2Btn();
        phonePage.ClickContinue3Btn();
        phonePage.ClickAlertOptionBtn();
        phonePage.ClickProceedCheckout();
        phonePage.emailField((String)data[0]);
        phonePage.confirmEmail((String)data[1]);
        phonePage.first_Name((String)data[2]);
        phonePage.Last_Name((String)data[3]);
        phonePage.contact_no(data[4]);
        phonePage.billing((String)data[5]);
       // phonePage.additionalComment((String)data[6]);
Thread.sleep(3000);
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
