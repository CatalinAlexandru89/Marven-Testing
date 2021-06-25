import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NinthPage extends PageObject {

    private final String typeNewsletterTwo = "JackDaniels@gmail.com";

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement newsletterTwo;
    public void fillNewsletterTwo() {
        this.newsletterTwo.sendKeys(typeNewsletterTwo);
    }

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitNewsletterTwo;
    public void clickSubmitNewsletterTwo() {
        this.submitNewsletterTwo.click();
    }

    public NinthPage(WebDriver driver) {
        super(driver);
    }

    public void closePopUpTwo() {
        driver.switchTo().alert().accept();
    }
}
