package pages.backend;

import Base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private final static String LOGIN_PAGE_URL = "https://shop.pragmatic.bg/admin";
    private final static By USERNAME_INPUT_FIELD = By.id("input-username");
    private final static By PASSWORD_INPUT_FIELD = By.id("input-password");
    private final static By LOGIN_BUTTON = By.className("btn-primary");

    public static void goToLoginPage(){
        goTo(LOGIN_PAGE_URL);
    }
    public static void writeIntoUserNameInput(String username){
        typeInWebElement(USERNAME_INPUT_FIELD, username);
    }
    public static void writeIntoPasswordInput(String password){
        typeInWebElement(PASSWORD_INPUT_FIELD, password);
    }
    public static void clickOnLoginButton(){
        clickOnWebElement(LOGIN_BUTTON);
    }
}
