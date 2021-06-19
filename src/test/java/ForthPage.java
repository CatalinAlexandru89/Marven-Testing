import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForthPage extends PageObject {

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMore;
    public void clickVirtualReadMore() {
        this.virtualReadMore.click();
    }
    @FindBy(xpath = "/html/body/a")
    private WebElement returnVirtual;
    public void clickReturnVirtual() {
        this.returnVirtual.click();
    }
    @FindBy(xpath = "/html/body/section[2]")
    private WebElement virtualScroll;
    public void waitVirtualScroll() {
        Utils.scrollToElement(driver, this.virtualScroll);
        this.virtualScroll.click();
    }

    public ForthPage(WebDriver driver) {
        super(driver);
    }
}
