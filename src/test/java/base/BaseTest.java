package base;

import org.testng.annotations.BeforeMethod;
import utilities.Browser;

public class BaseTest {
    @BeforeMethod
    public void setupDriver(){
        Browser.setup();
    }
}
