import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentgenPage {

    WebDriver driver;

    public RentgenPage(WebDriver driver) {
        this.driver = driver;
    }
    private By RentgenGolovyLink = By.xpath("//a[@class='result-list__subtitle'][contains(.,'Рентген головы')]");
    public GolovyCherepaPage clickRentgenGolovy() {
        driver.findElement(RentgenGolovyLink).click();
        return new GolovyCherepaPage(driver);
    }
}
