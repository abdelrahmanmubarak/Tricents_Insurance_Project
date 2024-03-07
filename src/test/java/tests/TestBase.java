package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;


public class TestBase {
  public static WebDriver driver;

    @BeforeSuite
  public void startDriver(){
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
  driver.get("https://sampleapp.tricentis.com/101/");
}
 /* @AfterSuite
  public void tearDown(){
      driver.quit();
  }*/

}
