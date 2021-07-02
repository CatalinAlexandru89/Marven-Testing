import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    //----------------------------------------------------------Test 1
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement questionsNavbar;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement questionOne;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement questionTwo;

    public void clickQuestionsNavbar() {
        this.questionsNavbar.click();
    }
    public void clickQuestionOne() {
        this.questionOne.click();
    }
    public void clickQuestionTwo() {
        this.questionTwo.click();
    }

    //-------------------------------------------------------------------Test 4

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMore;
    @FindBy(xpath = "/html/body/section[2]")
    private WebElement virtualScroll;

    public void clickVirtualReadMore() {
        this.virtualReadMore.click();
    }
    public void waitVirtualScroll() {
        Utils.scrollToElement(driver, this.virtualScroll);
        this.virtualScroll.click();
    }

    //---------------------------------------------------------------------Test 5

    @FindBy(xpath = "/html/body/section[2]")
    private WebElement hybridScroll;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridReadMore;

    public void waitHybridScroll() {
        Utils.scrollToElement(driver, this.hybridScroll);
        this.hybridScroll.click();
    }
    public void clickHybridReadMore() {
        this.hybridReadMore.click();
    }

    //-----------------------------------------------------------------------Test 6

    @FindBy(xpath = "/html/body/section[2]")
    private WebElement inPersonScroll;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement inPersonReadMore;

    public void waitInPersonScroll() {
        Utils.scrollToElement(driver, this.inPersonScroll);
        this.inPersonScroll.click();
    }
    public void clickInPersonReadMore() {
        this.inPersonReadMore.click();
    }

    //------------------------------------------------------------------------Test 7

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorsNavBar;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[2]/div/div/a[2]/i")
    private WebElement facebookJaneDoe;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[2]/div/div/a[4]/i")
    private WebElement instagramJaneDoe;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[2]/div/div/a[3]/i")
    private WebElement linkedInJaneDoe;

    public void clickInstructorsNavBar() {
        this.instructorsNavBar.click();
    }
    public void clickFacebookJaneDoe() {
        this.facebookJaneDoe.click();
    }
    public void clickLinkedInJaneDoe() {
        this.linkedInJaneDoe.click();
    }
    public void clickInstagramJaneDoe() {
        this.instagramJaneDoe.click();
    }
    public void back() {
        Utils.navigateBack(driver);
    }

    //--------------------------------------------------------------------------Test 8

    private final String typeNewsletter = "JackDaniels@gmailcom";

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement newsletter;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitNewsletter;
    public void fillNewsletter() {
        this.newsletter.sendKeys(typeNewsletter);
    }
    public void clickSubmitNewsletter() {
        this.submitNewsletter.click();
    }

    //---------------------------------------------------------------------------Test 9

    private final String typeNewsletterTwo = "JackDaniels@gmail.com";

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement newsletterTwo;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitNewsletterTwo;

    public void fillNewsletterTwo() {
        this.newsletterTwo.sendKeys(typeNewsletterTwo);
    }
    public void clickSubmitNewsletterTwo() {
        this.submitNewsletterTwo.click();
    }
    public void closePopUpTwo() {
        driver.switchTo().alert().accept();
    } //---close popup

    //-------------------------------------------------------------------------------------Test 11

    @FindBy(xpath = "/html/body/footer")
    private WebElement footerScroll;
    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement arrowTop;

    public void waitFooterScroll() {
        Utils.scrollToElement(driver, this.footerScroll);
        this.footerScroll.click();
    }
    public void clickArrowTop() {
        this.arrowTop.click();
    }


    public MainPage(WebDriver driver) {
        super(driver);
    } //----Parte din cod general
}
