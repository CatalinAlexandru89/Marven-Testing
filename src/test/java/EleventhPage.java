import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EleventhPage extends PageObject {

    @FindBy(xpath = "/html/body/footer")
    private WebElement footerScroll;
    public void waitFooterScroll() {
        Utils.scrollToElement(driver, this.footerScroll);
        this.footerScroll.click();
    }

    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement arrowTop;
    public void clickArrowTop() {
        this.arrowTop.click();
    }

    public EleventhPage(WebDriver driver) {
        super(driver);
    }
}
