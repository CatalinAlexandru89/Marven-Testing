import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TenthPage extends PageObject {

    private final String typeCardHolderName = "Jack Daniels";
    private final String typeCardNumber = "3547-3321-0897-6589";
    private final String typeCVC = "203";

    @FindBy(xpath = "//*[@id=\"flexRadioButton3\"]")
    private WebElement automationAndManual;
    public void clickAutomationAndManual() {
        this.automationAndManual.click();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextForth;
    public void clickNextForth() {
        this.nextForth.click();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHolderName;
    public void fillCardHolderName() {
        this.cardHolderName.sendKeys(typeCardHolderName);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardNumber;
    public void fillCardNumber() {
        this.cardNumber.sendKeys(typeCardNumber);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement CVC;
    public void fillCVC() {
        this.CVC.sendKeys(typeCVC);
    }

    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement monthDropdown;
    public void clickMonthDropdown() {
        this.monthDropdown.click();
    }
    @FindBy(xpath = "//*[@id=\"month\"]/option[8]")
    private WebElement pickMonth;
    public void clickPickMonth() {
        this.pickMonth.click();
    }

    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement yearDropdown;
    public void clickYearDropdown() {
        this.yearDropdown.click();
    }
    @FindBy(xpath = "//*[@id=\"year\"]/option[11]")
    private WebElement pickYear;
    public void clickPickYear() {
        this.pickYear.click();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextFifth;
    public void clickNextFifth() {
        this.nextFifth.click();
    }



    public TenthPage(WebDriver driver) {
        super(driver);
    }
}
