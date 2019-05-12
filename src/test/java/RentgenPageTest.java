import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RentgenPageTest {
    private WebDriver driver;
    private RentgenPage rentgenPage;

    @BeforeEach
    void init() {
        System.setProperty("webdriver.gecko.driver", "C:\\Project\\pageobjectinvitrotest\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.invitro.ru/radiology/rentgen");
        rentgenPage = new RentgenPage(driver);
    }
    @Test
    void succeedingTest() {
        GolovyCherepaPage golovyCherepaPage = rentgenPage.clickRentgenGolovy();
        String heading = golovyCherepaPage.GetHeadingText();
        Assert.assertEquals("Рентген головы", heading);
    }

    @AfterEach
    void tearDown(){
       driver.quit();
    }



}
