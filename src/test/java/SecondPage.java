import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends PageObject {

    private final String typeUsername = "Jack89";
    private final String typeEmail = "jack_daniels89@gmail.com";
    private final String typePassword = "***********";
    private final String typeConfirmPassword = "***********";

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollment;
    public void clickStartEnrollment() {
        this.startEnrollment.click();
    }
    @FindBy(xpath = "//*[@id=\"step1\"]/div/input[1]")
    private WebElement username;
    public void fillUsername() {
        this.username.sendKeys(typeUsername);
    }
    @FindBy(xpath = "//*[@id=\"step1\"]/div/input[2]")
    private WebElement email;
    public void fillEmail() {
        this.email.sendKeys(typeEmail);
    }
    @FindBy(xpath = "//*[@id=\"step1\"]/div/input[3]")
    private WebElement password;
    public void fillPassword() {
        this.password.sendKeys(typePassword);
    }
    @FindBy(xpath = "//*[@id=\"step1\"]/div/input[4]")
    private WebElement confirmPassword;
    public void fillConfirmPassword() {
        this.confirmPassword.sendKeys(typeConfirmPassword);
    }
    @FindBy(xpath = "//*[@id=\"step1\"]/button")
    private WebElement next;
    public void clickNext() {
        this.next.click();
    }


    public SecondPage(WebDriver driver) {
        super(driver);
    }
}
