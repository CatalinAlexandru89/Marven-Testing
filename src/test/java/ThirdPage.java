import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage extends PageObject{

    private final String typeEmail = "jack_daniels89@gmail.com";
    private final String typeCountry = "Romania";
    private final String typeCity = "Brasov";
    private final String typePostCode = "500789";
    private final String typePhoneNumber = "0799.899.999";
    private final String secondTypePhoneNumber = "0799-222-101";

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement next;
    public void clickNext() {
        this.next.click();
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email;
    public void fillEmail() {
        this.email.sendKeys(typeEmail);
    }

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneNumber;
    public void fillPhoneNumber() {
        this.phoneNumber.sendKeys(typePhoneNumber);
    }

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneNumberTwo;
    public void deletePhoneNumberTwo() {
        this.phoneNumberTwo.clear();
    }

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneNumberThree;
    public void fillPhoneNumberThree() {
        this.phoneNumber.sendKeys(secondTypePhoneNumber);
    }

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement country;
    public void fillCountry() {
        this.country.sendKeys(typeCountry);
    }

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement city;
    public void fillCity() {
        this.city.sendKeys(typeCity);
    }

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postCode;
    public void fillPostCode() {
        this.postCode.sendKeys(typePostCode);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextThree;
    public void clickNextThree() {
        this.nextThree.click();
    }

    public void navigateToForthPage() {
        this.fillEmail();
        this.fillPhoneNumberThree();
        this.fillCountry();
        this.fillCity();
        this.fillPostCode();
        Utils.waitForElementToLoad(3);
        this.clickNextThree();
    }


    public ThirdPage(WebDriver driver) {
        super(driver);
    }
}
