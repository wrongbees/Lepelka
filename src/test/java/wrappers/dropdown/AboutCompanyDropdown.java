package wrappers.dropdown;

import BaseEntities.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import pages.aboutcompany.Galery;
import pages.aboutcompany.HistoryOfDevelopmentPage;

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
                return new Galery(browsersService, true);

            default: throw new IllegalArgumentException("Is not found "+component.getComponent());
        }
    }
}
