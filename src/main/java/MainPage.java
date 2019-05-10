import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By EysButton = By.xpath("//button[@class='btn btn--narrow city__confirm-btn'][contains(.,'Да, верно')]");
    private By HealthServicesButton = By.xpath("//a[@class='header-nav__link'][contains(.,'Медицинские услуги')]");

    public MainPage clickEys (){
        driver.findElement(EysButton).click();
        return this;
    }

    public RadiologyPage clickHealthServices (){
        driver.findElement(EysButton).click();
        return new RadiologyPage(driver);

    }


}
