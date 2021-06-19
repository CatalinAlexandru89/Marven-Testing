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

    //Test 1 (codul e in MainPage)

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

    //Test 2 (codul e in SecondPage)

    @Test(testName = "Click start enrollment")
    public static void clickButtonTwo() {
        driver.get(Utils.BASE_URL);
        SecondPage testDoi = new SecondPage(driver);

        testDoi.clickStartEnrollment();
        Utils.waitForElementToLoad(2);

        driver.get(Utils.SECOND_URL);
        testDoi.fillUsername();
        testDoi.fillEmail();
        testDoi.fillPassword();
        testDoi.fillConfirmPassword();
        Utils.waitForElementToLoad(3);
        testDoi.clickNext();
        Utils.waitForElementToLoad(1);
    }

    //Test 3 (codul e in ThirdPage)

    @Test(testName = "Personal Information Page")
    public static void goToThirdPage() {
        driver.get(Utils.THIRD_URL);
        ThirdPage testTrei = new ThirdPage(driver);


        testTrei.clickNext();
        testTrei.fillFirstName();
        testTrei.fillLastName();
        testTrei.fillPhoneNumber();
        Utils.waitForElementToLoad(2);
        testTrei.deletePhoneNumberTwo();
        Utils.waitForElementToLoad(1);
        testTrei.fillPhoneNumberThree();
        testTrei.clickNextThree();
        Utils.waitForElementToLoad(2);

    }


    /*----------------Ruleaza tot dintr-o bucata (tot codul e in MainPage Test 2 si 3)

    @Test(testName = "Click start enrollment")
    public static void clickButtonTwo() {
        driver.get(Utils.BASE_URL);
        MainPage testDoi = new MainPage(driver);

        testDoi.clickStartEnrollment();
        Utils.waitForElementToLoad(3);

        driver.get(Utils.SECOND_URL);
        testDoi.fillUsername();
        testDoi.fillEmail();
        testDoi.fillPassword();
        testDoi.fillConfirmPassword();
        Utils.waitForElementToLoad(3);
        testDoi.clickNext();

        testDoi.fillFirstName();
        testDoi.fillLastName();
        testDoi.fillPhoneNumber();
        Utils.waitForElementToLoad(3);
        testDoi.deletePhoneNumberTwo();
        Utils.waitForElementToLoad(3);
        testDoi.fillPhoneNumberThree();
        Utils.waitForElementToLoad(3);
    }------------------------------------------------------*/

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


    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
