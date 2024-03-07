package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "nav_automobile")
    WebElement autoMobileBtn;


    public void clickOnAutoMobile(){
        clickBtn(autoMobileBtn);
    }


}
