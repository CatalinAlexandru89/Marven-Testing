import jdk.jshell.execution.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    //----------------------------------------Test 1 (codul e in MainPage)

    @Test(testName = "Click Questions Navbar")
    public static void clickButtonOne() {
        driver.get(Utils.BASE_URL);
        MainPage testUnu = new MainPage(driver);

        testUnu.clickQuestionsNavbar();
        Utils.waitForElementToLoad(3);
        testUnu.clickQuestionOne();
        Utils.waitForElementToLoad(2);
        testUnu.clickQuestionTwo();
        Utils.waitForElementToLoad(2);
    }

    //---------------------------------------------------------------------Test 2 (codul e in SecondPage)

    @Test(testName = "Click start enrollment and Personal Information Page")
    public static void clickButtonTwo() {
        driver.get(Utils.BASE_URL);
        SecondPage testDoi = new SecondPage(driver);

        testDoi.clickStartEnrollment();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.SECOND_URL);
        testDoi.fillFirstName();
        testDoi.fillLastName();
        testDoi.fillUserName();
        testDoi.fillPassword();
        testDoi.fillConfirmPassword();
        Utils.waitForElementToLoad(3);
        testDoi.clickNext();
        Utils.waitForElementToLoad(1);
    }

    //-----------------------------------------------Test 3 (codul e in ThirdPage)

    @Test(testName = "Contact information page")
    public static void goToThirdPage() {
        driver.get(Utils.THIRD_URL);
        SecondPage second = new SecondPage(driver);
        second.NavigateToThirdPage();

        ThirdPage testTrei = new ThirdPage(driver);
        Utils.waitForElementToLoad(1);
        testTrei.fillEmail();
        testTrei.fillPhoneNumber();
        Utils.waitForElementToLoad(2);
        testTrei.deletePhoneNumberTwo();
        Utils.waitForElementToLoad(1);
        testTrei.fillPhoneNumberThree();
        testTrei.fillCountry();
        testTrei.fillCity();
        testTrei.fillPostCode();
        Utils.waitForElementToLoad(1);
        testTrei.clickNextThree();
        Utils.waitForElementToLoad(2);
    }

    //--------------------------------------------------------Test 4

    @Test(testName = "Check Virtual read more")
    public static void testVirtualReadMore() {
        driver.get(Utils.BASE_URL);
        ForthPage testPatru = new ForthPage(driver);

        testPatru.waitVirtualScroll();
        testPatru.clickVirtualReadMore();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.FORTH_URL);

        testPatru.clickReturnVirtual();
        Utils.waitForElementToLoad(2);
    }

    //------------------------------------------------------Test 5

    @Test(testName = "Check hybrid read more")
    public static void testHybridReadMore() {
        driver.get(Utils.BASE_URL);
        FifthPage testCinci = new FifthPage(driver);

        testCinci.waitHybridScroll();
        testCinci.clickHybridReadMore();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.FIFTH_URL);

        testCinci.clickReturnHybrid();
        Utils.waitForElementToLoad(2);

    }

    //------------------------------------------------------Test 6

    @Test(testName = "Check In Person read more")
    public static void testInPersonReadMore() {
        driver.get(Utils.BASE_URL);
        SixthPage testSase = new SixthPage(driver);

        testSase.waitInPersonScroll();
        testSase.clickInPersonReadMore();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.SIXTH_URL);

        testSase.clickReturnInPerson();
        Utils.waitForElementToLoad(2);
    }

    //------------------------------------------------------Test 7

    @Test(testName = "Check facebook Jane Doe")
    public static void testFacebookJaneDoe() {
        driver.get(Utils.BASE_URL);
        SeventhPage testSapte = new SeventhPage(driver);

        testSapte.clickInstructorsNavBar();
        Utils.waitForElementToLoad(2);
        testSapte.clickFacebookJaneDoe();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.FACEBOOK_URL);
        testSapte.back();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.BASE_URL);
        testSapte.clickLinkedInJaneDoe();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.LINKEDIN_URL);
        testSapte.back();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.BASE_URL);
        testSapte.clickInstagramJaneDoe();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.INSTAGRAM_URL);
        testSapte.back();
        Utils.waitForElementToLoad(2);
    }

    //-------------------------------------------------Test 8

    @Test(testName = "CHeck unhappy flow newsletter")
    public static void testUnhappyNewsletter() {
        driver.get(Utils.BASE_URL);
        EightPage testOpt = new EightPage(driver);

        testOpt.fillNewsletter();
        testOpt.clickSubmitNewsletter();
        Utils.waitForElementToLoad(5);
    }

    //-------------------------------------------------Test 9

    @Test(testName = "CHeck happy flow newsletter")
    public static void testHappyNewsletter() {
        driver.get(Utils.BASE_URL);
        NinthPage testNoua = new NinthPage(driver);

        testNoua.fillNewsletterTwo();
        Utils.waitForElementToLoad(2);
        testNoua.clickSubmitNewsletterTwo();
        Utils.waitForElementToLoad(2);
        testNoua.closePopUpTwo();
        Utils.waitForElementToLoad(3);
    }

    //-------------------------------------------------Test 10

    @Test(testName = "Check payment information")
    public static void testPaymentInformation() {
        driver.get(Utils.SECOND_URL);
        SecondPage second = new SecondPage(driver);
        second.NavigateToThirdPage();

        ThirdPage third = new ThirdPage(driver);
        third.navigateToForthPage();

        TenthPage testZece = new TenthPage(driver);
        testZece.clickAutomationAndManual();
        testZece.clickNextForth();
        Utils.waitForElementToLoad(3);
        testZece.fillCardHolderName();
        testZece.fillCardNumber();
        testZece.fillCVC();
        Utils.waitForElementToLoad(2);
        testZece.clickMonthDropdown();
        Utils.waitForElementToLoad(3);
        testZece.clickPickMonth();
        Utils.waitForElementToLoad(2);
        testZece.clickYearDropdown();
        Utils.waitForElementToLoad(3);
        testZece.clickPickYear();
        Utils.waitForElementToLoad(2);
        testZece.clickNextFifth();
        Utils.waitForElementToLoad(5);
    }


    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
