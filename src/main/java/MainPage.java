import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By HealthServicesButton = By.xpath("//a[@class='header-nav__link'][contains(.,'Медицинские услуги')]");

    public RadiologyPage clickHealthServices (){
      driver.findElement(HealthServicesButton).click();
      return new RadiologyPage(driver);

    }

}
