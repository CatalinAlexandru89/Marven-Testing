import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends PageObject {

    private final String typeFirstName = "Jack";
    private final String typeLastName = "Daniels";
    private final String typeUsername = "Jack89";
    private final String typePassword = "***********";
    private final String typeConfirmPassword = "***********";

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollment;
    public void clickStartEnrollment() {
        this.startEnrollment.click();
    }
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstName;
    public void fillFirstName() {
        this.firstName.sendKeys(typeFirstName);
    }
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;
    public void fillLastName() {
        this.lastName.sendKeys(typeLastName);
    }
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userName;
    public void fillUserName() {
        this.userName.sendKeys(typeUsername);
    }

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;
    public void fillPassword() {
        this.password.sendKeys(typePassword);
    }
    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPassword;
    public void fillConfirmPassword() {
        this.confirmPassword.sendKeys(typeConfirmPassword);
    }
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement next;
    public void clickNext() {
        this.next.click();
    }

    public void NavigateToThirdPage() {
        fillFirstName();
        fillLastName();
        fillUserName();
        fillPassword();
        fillConfirmPassword();
        clickNext();
    }


    public SecondPage(WebDriver driver) {
        super(driver);
    }
}
