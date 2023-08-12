package com.fido.qa.Testcases;

import com.fido.qa.Pages.HomePage;
import com.fido.qa.Pages.SupportPage;
import com.fido.qa.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SupportPageTest extends TestBase {

    SupportPage supportPage=new SupportPage();
    HomePage homePage;

    public  SupportPageTest()
    {
        super();
    }
    @BeforeMethod
    public void setUp() {
        initialization();
homePage=new HomePage();
        supportPage = new SupportPage();
       supportPage= homePage.supportPage();
    }

    @Test(priority = 1)
            public void supportPageTitle() {
        String title = supportPage.supportPageTitle();
        Assert.assertEquals(title, "Help & Support - Fido");

    }
    @Test(priority = 2)
            public void gettingBtn() throws InterruptedException {
Thread.sleep(3000);
        supportPage.ClickOngettingBtn();
//        WebDriverWait wait=new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), \"BILLING & PAYMENT\")]")));
    }

    @AfterMethod
            public void tearDown()
    {
        driver.quit();
    }
}
