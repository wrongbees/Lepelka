package wrappers.dropdown;

import BaseEntities.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import pages.aboutcompany.*;

import static wrappers.dropdown.AboutCompanyComponents.*;

public class AboutCompanyDropdown extends Dropdown {
    public AboutCompanyDropdown(BrowsersService browsersService, WebElement webElement) {
        super(browsersService, webElement);
    }

    public BasePage select(AboutCompanyComponents component) {
        switch (component) {

            case THE_HISTORY_OF_DEVELOPMENT:
                selectByText(THE_HISTORY_OF_DEVELOPMENT.getComponent());
                return new HistoryOfDevelopmentPage(browsersService, true);

            case GALLERY:
                selectByText(GALLERY.getComponent());
                return new GalleryPage(browsersService, true);

            case BRANDED_TRADE:
                selectByText(BRANDED_TRADE.getComponent());
                return new BrandedTradePage(browsersService, true);

            case CERTIFICATES:
                selectByText(CERTIFICATES.getComponent());
                return new CertificatePage(browsersService, true);

            case AWARDS_AND_DIPLOMAS:
                selectByText(AWARDS_AND_DIPLOMAS.getComponent());
                return new AwardsAndDiplomasPage(browsersService, true);

            case SURVEY:
                selectByText(SURVEY.getComponent());
                return new SurveyPage(browsersService, true);

            case IDEOLOG_WORK:
                selectByText(IDEOLOG_WORK.getComponent());
                return new IdeologWorkPage(browsersService, true);

            default:
                throw new IllegalArgumentException("Is not found " + component.getComponent());
        }
    }
}
