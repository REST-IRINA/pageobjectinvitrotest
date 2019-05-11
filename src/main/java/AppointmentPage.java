import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentPage {
    WebDriver driver;

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    private By UserSurnameField = By.xpath("//input[@name='enrollsurname']");
    private By UserNameField = By.xpath("//input[@name='enrollName']");
    private By DateAndTimeDiagnosticField = By.xpath("//input[@name='dateAndTimeDiagnostic']");
    private By PhoneField = By.xpath("//input[@name='enrollPhone']");
    private By MailField = By.xpath("//input[@name='enrollMail']");
    private By ConsentCheckbox = By.xpath("//label[@for='agree_dc_appoint']//span[@class='checkbox__item']");
    private By SubmitButton = By.xpath("//button[@class='btn-icon btn-icon--fill ripple js-button-submit']");
    private By LegalInfoline = By.xpath("//a[@class='link link--inv'][contains(.,'условиями предоставления услуг')]");

    public AppointmentPage clickConsent() {
        driver.findElement(ConsentCheckbox).click();
        return this;
    }

    public AppointmentPage typeUserSurname(String usersurname) {
        driver.findElement(UserSurnameField).sendKeys(usersurname);
        return this;
    }

    public AppointmentPage typeUserName(String username) {
        driver.findElement(UserNameField).sendKeys(username);
        return this;
    }

    public AppointmentPage typeDateAndTimeDiagnostic(String dateandtimediagnostic) {
        driver.findElement(DateAndTimeDiagnosticField).sendKeys(dateandtimediagnostic);
        return this;
    }

    public AppointmentPage typePhone(String phone) {
        driver.findElement(PhoneField).sendKeys(phone);
        return this;
    }

    public AppointmentPage typeMail(String mail) {
        driver.findElement(MailField).sendKeys(mail);
        return this;
    }

    public SuccessPage clickSubmit() {
        driver.findElement(SubmitButton).click();
        return new SuccessPage(driver);
    }

    public LegalInfoPage LegalInfo() {
        driver.findElement(LegalInfoline).click();
        return new LegalInfoPage(driver);
    }


    public SuccessPage submit(String usersurname, String username, String dateandtimediagnostic, String phone, String mail) {
        this.typeUserSurname(usersurname);
        this.typeUserName(username);
        this.typeDateAndTimeDiagnostic(dateandtimediagnostic);
        this.typePhone(phone);
        this.typeMail(mail);
        this.clickConsent();
        this.clickSubmit();
        return new SuccessPage(driver);
    }
    public AppointmentPage submitWithInvalidCreds(String usersurname, String username, String dateandtimediagnostic, String phone, String mail) {
        this.typeUserSurname(usersurname);
        this.typeUserName(username);
        this.typeDateAndTimeDiagnostic(dateandtimediagnostic);
        this.typePhone(phone);
        this.typeMail(mail);
        this.clickConsent();
        this.clickSubmit();
        return this;
    }

    public AppointmentPage submitWithoutConsent(String usersurname, String username, String dateandtimediagnostic, String phone, String mail) {
        this.typeUserSurname(usersurname);
        this.typeUserName(username);
        this.typeDateAndTimeDiagnostic(dateandtimediagnostic);
        this.typePhone(phone);
        this.typeMail(mail);
        this.clickSubmit();
        return this;
    }

}
