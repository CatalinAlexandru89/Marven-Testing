import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FifthPage extends PageObject {

    @FindBy(xpath = "/html/body/section[2]")
    private WebElement hybridScroll;
    public void waitHybridScroll() {
        Utils.scrollToElement(driver, this.hybridScroll);
        this.hybridScroll.click();
    }
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridReadMore;
    public void clickHybridReadMore() {
        this.hybridReadMore.click();
    }
    @FindBy(xpath = "/html/body/a")
    private WebElement returnHybrid;
    public void clickReturnHybrid() {
        this.returnHybrid.click();
    }


    public FifthPage(WebDriver driver) {
        super(driver);
    }
}
