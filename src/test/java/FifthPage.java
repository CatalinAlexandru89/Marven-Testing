import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FifthPage extends PageObject {

    @FindBy(xpath = "/html/body/a")
    private WebElement returnHybrid;

    public void clickReturnHybrid() {
        this.returnHybrid.click();
    }

    public FifthPage(WebDriver driver) {
        super(driver);
    }
}
