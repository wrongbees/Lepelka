package pages;

import BaseEntities.BasePage;
import core.BrowsersService;
import core.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class HomePage extends HeadOfPage {
    private final static String ENDPOINT = "";

    private final static By HOME_CONTAINER = By.className("container");

    public HomePage(BrowsersService browsersService, boolean openPageByUrl) {
        super(browsersService, openPageByUrl);
    }

    @Override
    protected void openPage() {
        browsersService.getDriver().get(ReadProperties.getInstance().getURL() + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        try {
            return getHomeContainer().isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

   private WebElement getHomeContainer(){ return browsersService.getDriver().findElement(HOME_CONTAINER);}


}
