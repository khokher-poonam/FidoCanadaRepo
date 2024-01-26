package com.fido.qa.Testcases;

import com.fido.qa.Pages.HomePage;
import com.fido.qa.Pages.PhonePage;
import com.fido.qa.Pages.SupportPage;
import com.fido.qa.Pages.WhyFidoPage;
import com.fido.qa.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest extends TestBase {
 HomePage homepage = new HomePage();
PhonePage phonepage;
SupportPage supportPage;
WhyFidoPage whyFidoPage;
    public HomePageTest()  {
        super();
    }


    @BeforeClass
    public void setUp()  {
        initialization();
        homepage=new HomePage();
    }

    @Test(priority = 1)
    public void homePageTitleTest() {
       String title= homepage.validatePageTitle();
        Assert.assertEquals(title,"Phones, Plans and More - Go Get It - Fido", "Home page title not matched");
    }


    @Test(priority = 2)
    public void fidoLogoTest() {
        boolean flag= homepage.validateFidoLogo();
        Assert.assertTrue(flag);
    }



    @Test(priority = 3)
    public void shopPageClick() throws InterruptedException {
        phonepage = homepage.ClickOnShopLink();
    }
@Test(priority = 4)
public void supportPage()
{
    supportPage=homepage.supportPage();
}





@Test(priority = 5)
public void whyFidoPage()
{
    //homepage.scrollpage();
    whyFidoPage=homepage.whyFidoPage();
}



    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
