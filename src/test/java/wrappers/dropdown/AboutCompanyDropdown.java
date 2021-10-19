package wrappers.dropdown;

import BaseEntities.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import pages.aboutcompany.Galery;
import pages.aboutcompany.HistoryOfDevelopmentPage;

public class AboutCompanyDropdown extends Dropdown {
    public AboutCompanyDropdown(BrowsersService browsersService, WebElement webElement) {
        super(browsersService, webElement);
    }

    public BasePage select(String text) {
        switch (text) {
            case ("История развития"):
                selectByText(text);
                return new HistoryOfDevelopmentPage(browsersService, true);

            case ("Галерея"):
                selectByText(text);
                return new Galery(browsersService, true);


        }
        return null;
    }
}
