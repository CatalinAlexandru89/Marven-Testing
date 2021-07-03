import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TenthPage extends PageObject {

    private final String typeCardHolderName = "Jack Daniels";
    private final String typeCardNumber = "3547-3321-0897-6589";
    private final String typeCVC = "203";

    @FindBy(xpath = "//*[@id=\"flexRadioButton3\"]") //click Course Option
    private WebElement automationAndManual;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextForth;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHolderName;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardNumber;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement CVC;
    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement monthDropdown;
    @FindBy(xpath = "//*[@id=\"month\"]/option[8]")
    private WebElement pickMonth;
    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement yearDropdown;
    @FindBy(xpath = "//*[@id=\"year\"]/option[11]")
    private WebElement pickYear;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextFifth;

    public void clickAutomationAndManual() {
        this.automationAndManual.click();
    }
    public void clickNextForth() {
        this.nextForth.click();
    }
    public void fillCardHolderName() {
        this.cardHolderName.sendKeys(typeCardHolderName);
    }
    public void fillCardNumber() {
        this.cardNumber.sendKeys(typeCardNumber);
    }
    public void fillCVC() {
        this.CVC.sendKeys(typeCVC);
    }
    public void clickMonthDropdown() {
        this.monthDropdown.click();
    }
    public void clickPickMonth() {
        this.pickMonth.click();
    }
    public void clickYearDropdown() {
        this.yearDropdown.click();
    }
    public void clickPickYear() {
        this.pickYear.click();
    }
    public void clickNextFifth() {
        this.nextFifth.click();
    }

    public TenthPage(WebDriver driver) {
        super(driver);
    }
}
