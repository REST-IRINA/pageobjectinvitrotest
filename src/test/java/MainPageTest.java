import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @BeforeAll
    public void setUp (){
        System.setProperty("webdriver.gecko.driver", "C:\\Project\\testselenium\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.invitro.ru");
        mainPage = new MainPage(driver);
    }

    @Test
    public void HealthServices(){
        RadiologyPage radiologyPage = mainPage.clickHealthServices();
        String heading = radiologyPage.GetHeadingText();
        Assert.assertEquals("Медицинские услуги в Москве", heading);
    }


    @AfterAll
    public void tearDown(){
        driver.quit();
    }


}
