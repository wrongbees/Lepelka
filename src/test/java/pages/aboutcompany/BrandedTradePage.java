package pages.aboutcompany;

import core.BrowsersService;
import core.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pages.HeadOfPage;

public class BrandedTradePage extends HeadOfPage {
    private final static String ENDPOINT = "/firmennaya-torgovlya/";
    private final static By TITLE = By.xpath("//span[@class='elipse']//b");

    public BrandedTradePage(BrowsersService browsersService, boolean openPageByURL) {
        super(browsersService, openPageByURL);
    }
    @Override
    protected void openPage() {
        browsersService.getDriver().get(ReadProperties.getInstance().getURL()+ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        try{
            return getTitle().isDisplayed();
        }catch (NoSuchElementException ex){
            return false;
        }
    }

    private WebElement getTitle(){ return browsersService.getDriver().findElement(TITLE);}

    public String getTitleText(){
        return getTitle().getText();
    }
}
