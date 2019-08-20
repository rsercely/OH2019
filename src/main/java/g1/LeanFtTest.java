package g1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {
        Browser browser = BrowserFactory.launch(BrowserType.CHROME);

        browser.navigate("http://advantageonlineshopping.com/");

        Link speakersCategoryTxtLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("SPEAKERS")
                .tagName("SPAN").build());
        speakersCategoryTxtLink.click();

        WebElement boseSoundlinkBluetoothSpeakerIIIWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("Bose Soundlink Bluetooth Speaker III")
                .tagName("A").build());
        boseSoundlinkBluetoothSpeakerIIIWebElement.click();

        WebElement webElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("plus")
                .innerText("")
                .tagName("DIV").build());
        webElement.click();

        browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("ADD TO CART")
                .tagName("BUTTON").build()).click();

        WebElement menuCartWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .accessibilityName("")
                .id("menuCart")
                .innerText("")
                .tagName("svg").build());
        menuCartWebElement.click();

        Button checkOutBtnButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name(new RegExpProperty("CHECKOUT \\(\\$\\d+.*")).build());

        checkOutBtnButton.click();

        Link hOMELink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("HOME")
                .tagName("A").build());
 //       hOMELink.click();

    }

}