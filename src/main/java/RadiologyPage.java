import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadiologyPage {

    WebDriver driver;

    public RadiologyPage(WebDriver driver) {
        this.driver = driver;

    }
    private By RentgenLink = By.xpath("//a[@class='side-bar-second__link side-bar-second__link--icon side-bar__link--third'][contains(.,'Рентген')]");
    public RentgenPage clickRentgen () {
        driver.findElement(RentgenLink).click();
        return new RentgenPage(driver);
    }

}
