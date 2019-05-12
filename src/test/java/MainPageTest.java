
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private static FirefoxDriver driver;
    private static MainPage mainPage;


   @BeforeAll
   static void initAll() {
       System.setProperty("webdriver.gecko.driver", "C:\\Project\\pageobjectinvitrotest\\Drivers\\geckodriver.exe");
       driver = new FirefoxDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.get("https://www.invitro.ru");
       mainPage = new MainPage(driver);

   }

    @Test
    void succeedingTest () {
        RadiologyPage radiologyPage = mainPage.clickHealthServices();
        String heading = radiologyPage.GetHeadingText();
        Assert.assertEquals("Медицинские услуги в Москве", heading);



    }

    @AfterEach
    void tearDown() {
       driver.quit();
    }








}
