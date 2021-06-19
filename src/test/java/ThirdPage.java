import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage extends PageObject{

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
    }
    @FindBy(xpath = "//*[@id=\"step2\"]/button[2]")
    private WebElement nextThree;
    public void clickNextThree() {
        this.nextThree.click();
    }


    public ThirdPage(WebDriver driver) {
        super(driver);
    }
}
