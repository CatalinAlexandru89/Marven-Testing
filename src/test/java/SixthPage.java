import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SixthPage extends PageObject {

    @FindBy(xpath = "/html/body/a")
    private WebElement returnInPerson;

    public void clickReturnInPerson() {
        this.returnInPerson.click();
    }

    public SixthPage(WebDriver driver) {
        super(driver);
    }
}
