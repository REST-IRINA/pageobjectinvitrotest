import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GolovyCherepaPage {

    WebDriver driver;

    public GolovyCherepaPage(WebDriver driver) {
        this.driver = driver;
    }
    private By AppointmentBlock = By.xpath("//div[@class='popup-block popup-block--pb70']");
    private By UserSurnameField = By.xpath("//input[@name='enrollsurname']");
    private By UserNameField = By.xpath("//input[@name='enrollName']");
    private By DateAndTimeDiagnosticField = By.xpath("//input[@name='dateAndTimeDiagnostic']");
    private By PhoneField = By.xpath("//input[@name='enrollPhone']");
    private By MailField = By.xpath("//input[@name='enrollMail']");
    private By DateAndTimeDiagnosticField = By.xpath("//input[@name='dateAndTimeDiagnostic']");








}
