import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EightPage extends PageObject {

    private final String typeNewsletter = "JackDaniels@gmailcom";

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement newsletter;
    public void fillNewsletter() {
        this.newsletter.sendKeys(typeNewsletter);
    }

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitNewsletter;
    public void clickSubmitNewsletter() {
        this.submitNewsletter.click();
    }

    public EightPage(WebDriver driver) {
        super(driver);
    }
}
