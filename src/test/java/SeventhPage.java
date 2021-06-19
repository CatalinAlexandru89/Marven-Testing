import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeventhPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorsNavBar;
    public void clickInstructorsNavBar() {
        this.instructorsNavBar.click();
    }
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[2]/div/div/a[2]/i")
    private WebElement facebookJaneDoe;
    public void clickFacebookJaneDoe() {
        this.facebookJaneDoe.click();
    }
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[2]/div/div/a[3]/i")
    private WebElement linkedInJaneDoe;
    public void clickLinkedInJaneDoe() {
        this.linkedInJaneDoe.click();
    }
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[2]/div/div/a[4]/i")
    private WebElement instagramJaneDoe;
    public void clickInstagramJaneDoe() {
        this.instagramJaneDoe.click();
    }

    public void back() {
        Utils.navigateBack(driver);
    }


    public SeventhPage(WebDriver driver) {
        super(driver);
    }
}
