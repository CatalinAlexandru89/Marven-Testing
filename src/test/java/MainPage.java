import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    //----------------------------------------------------Test 1
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement questionsNavbar;
    public void clickQuestionsNavbar() {
        this.questionsNavbar.click();
    }

    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement questionOne;
    public void clickQuestionOne() {
        this.questionOne.click();
    }

    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement questionTwo;
    public void clickQuestionTwo() {
        this.questionTwo.click();
    }


    /*----------------------------------------------------------- Test 2
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

    //----------------------------------------------------------Test 3
    private final String typeFirstName = "Jack";
    private final String typeLastName = "Daniels";
    private final String typePhoneNumber = "0799.899.999";
    private final String secondTypePhoneNumber = "0799-222-101";

    @FindBy(xpath = "//*[@id=\"step1\"]/button")
    private WebElement next;
    public void clickNext() {
        this.next.click();
    }

    @FindBy(xpath = "//*[@id=\"step2\"]/div/input[1]")
    private WebElement firstName;
    public void fillFirstName() {
        this.firstName.sendKeys(typeFirstName);
    }
    @FindBy(xpath = "//*[@id=\"step2\"]/div/input[2]")
    private WebElement lastName;
    public void fillLastName() {
        this.lastName.sendKeys(typeLastName);
    }
    @FindBy(xpath = "//*[@id=\"step2\"]/div/input[3]")
    private WebElement phoneNumber;
    public void fillPhoneNumber() {
        this.phoneNumber.sendKeys(typePhoneNumber);
    }
    @FindBy(xpath = "//*[@id=\"step2\"]/div/input[3]")
    private WebElement phoneNumberTwo;
    public void deletePhoneNumberTwo() {
        this.phoneNumberTwo.clear();
    }
    @FindBy(xpath = "//*[@id=\"step2\"]/div/input[3]")
    private WebElement phoneNumberThree;
    public void fillPhoneNumberThree() {
        this.phoneNumber.sendKeys(secondTypePhoneNumber);
    } ----------------------------------------------------------------*/

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
