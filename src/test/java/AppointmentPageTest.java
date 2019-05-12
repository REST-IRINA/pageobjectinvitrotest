import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AppointmentPageTest {
    private WebDriver driver;
    private AppointmentPage appointmentPage;
    private GolovyCherepaPage golovyCherepaPage;
    private LegalInfoPage legalInfoPage;
    private SuccessPage successPage;

    @BeforeEach
    void init() {
        System.setProperty("webdriver.gecko.driver", "C:\\Project\\pageobjectinvitrotest\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.invitro.ru/radiology/rentgen/golovy-cherepa");
        appointmentPage = new AppointmentPage(driver);
        AppointmentPage appointmentPage = golovyCherepaPage.clickSubmit();

    }
    @Test
    void succeedingTest1() {
        AppointmentPage legalInfoPage = appointmentPage.clickConsent();
        String heading = legalInfoPage.GetHeadingText();
        Assert.assertEquals("Политика в отношении персональных данных", heading);
    }
    @Test
    void succeedingTest2() {
        SuccessPage successPage = appointmentPage.submit("Ардрюшечкин","Кирилл","Сергеевич", "Null", "9033255678", "Kiryscha@mail.ru");
        String Adress = successPage.GetAdressText();
        Assert.assertEquals("Москва, Каширское шоссе д.68 к.2'", Adress);

    }



    @AfterEach
    void tearDown(){
        driver.quit();
    }

}
