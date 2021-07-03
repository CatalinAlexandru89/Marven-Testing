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
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstName;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userName;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPassword;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement next;

    public void clickStartEnrollment() {
        this.startEnrollment.click();
    }
    public void fillFirstName() {
        this.firstName.sendKeys(typeFirstName);
    }
    public void fillLastName() {
        this.lastName.sendKeys(typeLastName);
    }
    public void fillUserName() {
        this.userName.sendKeys(typeUsername);
    }
    public void fillPassword() {
        this.password.sendKeys(typePassword);
    }
    public void fillConfirmPassword() {
        this.confirmPassword.sendKeys(typeConfirmPassword);
    }
    public void clickNext() {
        this.next.click();
    }

    public void NavigateToThirdPage() {
        fillFirstName();
        fillLastName();
        fillUserName();
        fillPassword();
        fillConfirmPassword();
        Utils.waitForElementToLoad(3);
        clickNext();
    } //--folosit pt testele care am nevoie pt. completare prima pagina enrollment. (test 3 and 10)
    public SecondPage(WebDriver driver) {
        super(driver);
    }
}
