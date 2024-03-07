package tests;


import org.testng.annotations.Test;
import pages.AutoMobilePage;
import pages.HomePage;

public class AutoMobileTest extends TestBase{

    HomePage homeObject;
    AutoMobilePage autoMobileObject;

    @Test(priority = 1)
    public void userCanAddDataForAutoMobile(){
        homeObject = new HomePage(driver);
        homeObject.clickOnAutoMobile();
        driver.manage().timeouts().getImplicitWaitTimeout();
    }
    @Test(priority = 2)
    public void selectFromMakerList(){
        autoMobileObject = new AutoMobilePage(driver);
        autoMobileObject.selectMakerList();
    }

}
