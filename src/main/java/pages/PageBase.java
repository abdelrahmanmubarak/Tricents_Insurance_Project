package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class PageBase {

    public Select selectMaker;
    protected WebDriver driver;
    public PageBase(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    protected static void clickBtn(WebElement button){
        button.click();

    }


}
