import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadiologyPage {

    WebDriver driver;

    public RadiologyPage(WebDriver driver) {
        this.driver = driver;

    }
    private By rentgenLink = By.xpath("//a[@class='side-bar-second__link side-bar-second__link--icon side-bar__link--third'][contains(.,'Рентген')]");
    private By heading = By.xpath("//h1[contains(.,'Медицинские услуги в Москве')]");


    public RentgenPage clickRentgen () {
        driver.findElement(rentgenLink).click();
        return new RentgenPage(driver);
    }

    public String GetHeadingText() {
        return driver.findElement(heading).getText();
    }



}
