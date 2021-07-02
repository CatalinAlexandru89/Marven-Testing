import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForthPage extends PageObject {

    @FindBy(xpath = "/html/body/a")
    private WebElement returnVirtual;

    public void clickReturnVirtual() {
        this.returnVirtual.click();
    }

    public ForthPage(WebDriver driver) {
        super(driver);
    }
}
