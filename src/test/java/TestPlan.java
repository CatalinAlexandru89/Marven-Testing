import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
        Assert.assertEquals(testUnu.checkTextTestOne(), "Frequently Asked Questions");
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
        Assert.assertEquals(testDoi.checkTextContactInformation(), "Contact information");
        Utils.waitForElementToLoad(2);
    }

    //-----------------------------------------------Test 3 (codul e in ThirdPage)

    @Test(testName = "Contact information page")
    public static void goToThirdPage() {
        driver.get(Utils.SECOND_URL);
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
        Assert.assertEquals(testTrei.checkTextCourseOptions(), "Course options");
        Utils.waitForElementToLoad(3);
    }

    //--------------------------------------------------------Test 4(codul este in ForthPage + MainPage)

    @Test(testName = "Check Virtual read more")
    public static void testVirtualReadMore() {
        driver.get(Utils.BASE_URL);
        MainPage testPatru = new MainPage(driver);
        testPatru.waitVirtualScroll();
        testPatru.clickVirtualReadMore();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.FORTH_URL);
        ForthPage testPatruDoi = new ForthPage(driver);
        testPatruDoi.clickReturnVirtual();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(testPatru.checkTextTestFour(), "Virtual");
    }

    //------------------------------------------------------Test 5(codul este in FifthPage + MainPage)

    @Test(testName = "Check hybrid read more")
    public static void testHybridReadMore() {
        driver.get(Utils.BASE_URL);
        MainPage testCinci = new MainPage(driver);
        testCinci.waitHybridScroll();
        testCinci.clickHybridReadMore();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.FIFTH_URL);
        FifthPage testCinciDoi = new FifthPage(driver);
        testCinciDoi.clickReturnHybrid();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(testCinci.checkTextTestFive(), "Hybrid");
    }

    //------------------------------------------------------Test 6(codul este in SixthPage + MainPage)

    @Test(testName = "Check In Person read more")
    public static void testInPersonReadMore() {
        driver.get(Utils.BASE_URL);
        MainPage testSase = new MainPage(driver);
        testSase.waitInPersonScroll();
        testSase.clickInPersonReadMore();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.SIXTH_URL);
        SixthPage testSaseDoi = new SixthPage(driver);
        testSaseDoi.clickReturnInPerson();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(testSase.checkTextTestSix(), "In Person");
    }

    //------------------------------------------------------Test 7(codul este in MainPage)

    @Test(testName = "Check facebook Jane Doe")
    public static void testFacebookJaneDoe() {
        driver.get(Utils.BASE_URL);
        MainPage testSapte = new MainPage(driver);
        testSapte.clickInstructorsNavBar();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(testSapte.checkTextTestSeventh(), "Our Instructors");
        testSapte.clickFacebookJaneDoe();
        Utils.waitForElementToLoad(3);

        driver.get(Utils.FACEBOOK_URL);
        testSapte.back();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(testSapte.checkTextTestSeventh(), "Our Instructors");

        driver.get(Utils.BASE_URL);
        testSapte.clickLinkedInJaneDoe();
        Utils.waitForElementToLoad(3);

        driver.get(Utils.LINKEDIN_URL);
        testSapte.back();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(testSapte.checkTextTestSeventh(), "Our Instructors");

        driver.get(Utils.BASE_URL);
        testSapte.clickInstagramJaneDoe();
        Utils.waitForElementToLoad(3);

        driver.get(Utils.INSTAGRAM_URL);
        testSapte.back();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(testSapte.checkTextTestSeventh(), "Our Instructors");
    }

    //-------------------------------------------------Test 8(codul este in MainPage)

    @Test(testName = "Check unhappy flow newsletter")
    public static void testUnhappyNewsletter() {
        driver.get(Utils.BASE_URL);
        MainPage testOpt = new MainPage(driver);
        testOpt.fillNewsletter();
        testOpt.clickSubmitNewsletter();
        Utils.waitForElementToLoad(5);
    }

    //-------------------------------------------------Test 9(codul este in MainPage)

    @Test(testName = "Check happy flow newsletter")
    public static void testHappyNewsletter() {
        driver.get(Utils.BASE_URL);
        MainPage testNoua = new MainPage(driver);
        testNoua.fillNewsletterTwo();
        Utils.waitForElementToLoad(2);
        testNoua.clickSubmitNewsletterTwo();
        Utils.waitForElementToLoad(3);
        testNoua.closePopUpTwo();
        Utils.waitForElementToLoad(2);
    }

    //--------------------------------------------------------------Test 10(codul este in TenthPage)

    @Test(testName = "Check course option and payment information")
    public static void testCourseOptionAndPaymentInformation() {
        driver.get(Utils.SECOND_URL);
        SecondPage second = new SecondPage(driver);
        second.NavigateToThirdPage();
        Utils.waitForElementToLoad(3);

        ThirdPage third = new ThirdPage(driver);
        third.navigateToForthPage();

        TenthPage testZece = new TenthPage(driver);
        testZece.clickAutomationAndManual();
        Utils.waitForElementToLoad(3);
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
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(testZece.checkTextSuccess(), "Success!");
        Utils.waitForElementToLoad(3);
    }

    //---------------------------------------------------------------Test 11 (back-up)

    @Test(testName = "Navigate back to top")
    public static void testBackToTopButton() {
        driver.get(Utils.BASE_URL);
        MainPage testUnsprezece = new MainPage(driver);
        testUnsprezece.waitFooterScroll();
        Utils.waitForElementToLoad(2);
        testUnsprezece.clickArrowTop();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(testUnsprezece.verifyTextHeaderDoi(), "Certified Software Tester"); //--verifica textul din "..."
        Utils.waitForElementToLoad(1);
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
