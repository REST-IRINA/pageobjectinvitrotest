import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GolovyCherepaPage {
    WebDriver driver;


    public GolovyCherepaPage(WebDriver driver) {
        this.driver = driver;
    }

    private By SubmitButton = By.xpath("//a[contains(@data-entity-id,'12912')]");
    private By heading = By.xpath("//h1[contains(.,'Рентген головы')]");

    public AppointmentPage clickSubmit() {
        driver.findElement(SubmitButton).click();
        return new AppointmentPage(driver);
    }

    public String GetHeadingText() {
        return driver.findElement(heading).getText();
    }


}


