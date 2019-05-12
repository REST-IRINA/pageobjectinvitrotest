import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RadiologyPageTest {
    private WebDriver driver;
    private RadiologyPage radiologyPage;

    @BeforeEach
    void init() {
        System.setProperty("webdriver.gecko.driver", "C:\\Project\\pageobjectinvitrotest\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();;
        driver.get("https://www.invitro.ru/radiology");
        radiologyPage = new RadiologyPage(driver);
    }

    @Test
    void succeedingTest () {
        RentgenPage rentgenPage = radiologyPage.clickRentgen();
        String heading = rentgenPage.GetHeadingText();
        Assert.assertEquals("Рентген", heading);
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }


}
