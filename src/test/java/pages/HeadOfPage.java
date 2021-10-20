package pages;

import BaseEntities.BasePage;
import core.BrowsersService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import wrappers.Button;

public class HeadOfPage extends BasePage {
     public final By about_company = By.id("navbardrop");

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    public HeadOfPage(BrowsersService browsersService, boolean openPageByURL) { super(browsersService,openPageByURL);}

    private Button aboutCompanyButton(){ return new Button(browsersService, about_company);}

    // action
    public WebElement getAboutCompany(){ return browsersService.getDriver().findElement(about_company);}
    public void aboutCompanyButtonClick(){ aboutCompanyButton().click();}
//    protected WebElement getAboutCompany(){ return browsersService.getDriver().findElement(about_company);}
//    public void clickAboutCompany(){getAboutCompany().click();}
}
