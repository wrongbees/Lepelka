package pages;

import BaseEntities.BasePage;
import core.BrowsersService;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import wrappers.Button;
import wrappers.dropdown.AboutCompanyDropdown;

public class HeadOfPage extends BasePage {
    private final By about_company = By.id("navbardrop");
    private final By TITLE_LEPELKA = By.xpath("//img[@class ='img-fluid' and @alt='Лепелька']");

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        try {
            return getTitleLepelka().isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }

    }

    public HeadOfPage(BrowsersService browsersService, boolean openPageByURL) {
        super(browsersService, openPageByURL);
    }

    private Button aboutCompanyButton() {
        return new Button(browsersService, about_company);
    }

    // action
    private WebElement getAboutCompany() {
        return browsersService.getDriver().findElement(about_company);
    }

    private WebElement getTitleLepelka() {
        return browsersService.getDriver().findElement(TITLE_LEPELKA);
    }

    public void aboutCompanyButtonClick() {
        aboutCompanyButton().click();
    }

    public AboutCompanyDropdown getAboutCompanyDropDawn() {
        return new AboutCompanyDropdown(browsersService, getAboutCompany());
    }


    public void clickAboutCompany() {
        getAboutCompany().click();
    }

}
