package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AutoMobilePage extends PageBase{
    public AutoMobilePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "make")
    WebElement makeList;


    public void selectMakerList(){
        selectMaker = new Select(makeList);
        selectMaker.selectByValue("Audi");

    }
}
