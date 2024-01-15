package pages.backend;

import Base.BasePage;
import org.openqa.selenium.*;
import org.testng.Assert;
import utilities.Browser;

import java.time.Duration;
import java.util.List;

public class Dashboard extends BasePage {
    private final static By LOGOUT_BUTTON = By.xpath("//*[@class='fa fa-sign-out']/ ..");
    private final static By ZOOM_MAP = By.xpath("//*[@class= 'jqvmap-zoomin']");
    private final static By CHECK_SPEC_ORDER = By.className("fa-eye");
    private final static By SEARCH_CUSTOMER_BY_NAME = By.id("input-name");
    private final static By FILTER_SEARCH_USER = By.id("button-filter");
    private final static By CUSTOMER_FILTER = By.className("fa-list");
    private final static By FIND_TEXT = By.xpath("//*[@id='form-customer']/table/tbody/tr[1]/td[2]");

    public static void verifyLogoutButtonIsPresent() {
        verifyWebElementIsPresent(LOGOUT_BUTTON);
    }

    public static void clickOnZoomMapButton() {
        clickOnWebElement(ZOOM_MAP);
    }

    public static void clickOnSpecOrder() {
        clickOnWebElement(CHECK_SPEC_ORDER);
    }

    public static void customerSearchByNameInput(String username) {
        typeInWebElement(SEARCH_CUSTOMER_BY_NAME, username);
    }

    public static void clickFilterSearchUser() {
        clickOnWebElement(FILTER_SEARCH_USER);
    }

    public static void verifyCustomerListIsPresent() {
        verifyWebElementIsPresent(CUSTOMER_FILTER);
    }
    public static void verifyText(String text){
        String name = Browser.getDriver().findElement(By.xpath("//*[@id=\"form-customer\"]/table/tbody/tr[1]/td[2]")).getText();
        Assert.assertEquals(name, text);
    }
}
