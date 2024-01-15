package components;

import Base.BasePage;
import org.openqa.selenium.By;

public class LeftNavigationMenu extends BasePage {
    private final static By CUSTOMERS_MENU = By.xpath("//*[@id='menu-customer']/a");
    private final static  By CUSTOMERS_SUB_MENU = By.xpath("//*[@id='collapse5']/li[1]/a");
    public static void clickOnCustomersButton(){
        clickOnWebElement(CUSTOMERS_MENU);
    }
    public static void clickOnCustomerSubMenu(){
        clickOnWebElement(CUSTOMERS_SUB_MENU);
    }
}
