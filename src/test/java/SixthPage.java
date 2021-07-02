import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SixthPage extends PageObject {

    /*@FindBy(xpath = "/html/body/section[2]")
    private WebElement inPersonScroll;
    public void waitInPersonScroll() {
        Utils.scrollToElement(driver, this.inPersonScroll);
        this.inPersonScroll.click();
    }

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement inPersonReadMore;
    public void clickInPersonReadMore() {
        this.inPersonReadMore.click();
    }*/

    @FindBy(xpath = "/html/body/a")
    private WebElement returnInPerson;

    public void clickReturnInPerson() {
        this.returnInPerson.click();
    }

    public SixthPage(WebDriver driver) {
        super(driver);
    }
}
