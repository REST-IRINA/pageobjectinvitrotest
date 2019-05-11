import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LegalInfoPage {
    WebDriver driver;

    public LegalInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//h1[contains(.,'Политика в отношении персональных данных')]");

    public String GetHeadingText() {
        return driver.findElement(heading).getText();
    }
}
