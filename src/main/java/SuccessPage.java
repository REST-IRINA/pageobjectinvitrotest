import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessPage {
    WebDriver driver;

    public SuccessPage(WebDriver driver) {
        this.driver = driver;
    }
    private By Adress = By.xpath("//td[contains(.,'Москва, Каширское шоссе д.68 к.2')]");

    public String GetAdressText() {
        return driver.findElement(Adress).getText();
    }




}
