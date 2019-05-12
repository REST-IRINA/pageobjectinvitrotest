import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GolovyCherepaPageTest {
    private WebDriver driver;
    private GolovyCherepaPage golovyCherepaPage;

    @BeforeEach
    void init() {
        System.setProperty("webdriver.gecko.driver", "C:\\Project\\pageobjectinvitrotest\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.invitro.ru/radiology/rentgen/golovy-cherepa");
        golovyCherepaPage = new GolovyCherepaPage(driver);

    }
    @Test
    void succeedingTest() {
        AppointmentPage appointmentPage = golovyCherepaPage.clickSubmit();
        String heading = appointmentPage.GetHeadingText();
        Assert.assertEquals("Рентген черепа", heading);
    }

    @AfterEach
    private void tearDown(){
        driver.quit();
    }

}
