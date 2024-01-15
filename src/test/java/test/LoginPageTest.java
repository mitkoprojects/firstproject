package test;

import base.BaseTest;
import components.LeftNavigationMenu;
import org.testng.annotations.Test;
import pages.backend.Dashboard;
import pages.backend.LoginPage;



public class LoginPageTest extends BaseTest {
    @Test
    public void loginTest(){
        LoginPage.goToLoginPage();
        LoginPage.writeIntoUserNameInput("admin");
        LoginPage.writeIntoPasswordInput("parola123!");
        LoginPage.clickOnLoginButton();
        Dashboard.verifyLogoutButtonIsPresent();
        Dashboard.clickOnZoomMapButton();
        Dashboard.clickOnZoomMapButton();
        Dashboard.clickOnZoomMapButton();
        Dashboard.clickOnSpecOrder();
        LeftNavigationMenu.clickOnCustomersButton();
        LeftNavigationMenu.clickOnCustomerSubMenu();
        Dashboard.customerSearchByNameInput("Rositsa Dimitrova");
        Dashboard.clickFilterSearchUser();
        Dashboard.verifyCustomerListIsPresent();
        Dashboard.verifyText("Rositsa Dimitrova");
    }
}
