import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    //----------------------------------------------------Test 1
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement questionsNavbar;
    public void clickQuestionsNavbar() {
        this.questionsNavbar.click();
    }

    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement questionOne;
    public void clickQuestionOne() {
        this.questionOne.click();
    }

    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement questionTwo;
    public void clickQuestionTwo() {
        this.questionTwo.click();
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }

    /*public void closePopUp() {
        driver.switchTo().alert().accept();
    }*/   //---close popup, dar nu e valabil in acest test (este pt test 9)
}
