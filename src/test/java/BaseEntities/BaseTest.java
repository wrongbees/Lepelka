package BaseEntities;

import core.BrowsersService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public abstract class BaseTest {
    public BrowsersService browsersService;

    @BeforeMethod
    public void startBrowser() throws MalformedURLException {
        browsersService = new BrowsersService();
    }

    @AfterMethod
    public void closeBrowser() {
        browsersService.getDriver().quit();
        browsersService = null;
    }
}
