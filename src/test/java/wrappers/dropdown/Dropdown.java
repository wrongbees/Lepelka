package wrappers.dropdown;

import BaseEntities.BasePage;
import core.BrowsersService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import wrappers.UIElement;

public abstract class Dropdown {
    protected BrowsersService browsersService;
    protected WebElement parent;
    protected String element_for_search ="//nobr[contains(text(),'%s')]/ancestor::a";

    public Dropdown(BrowsersService browsersService, WebElement webElement){
        this.browsersService = browsersService;
        this.parent = webElement;

    }

    private void displayDropdown(){
        Actions action = new Actions(browsersService.getDriver());
        action
                .moveToElement(parent)
                .perform();
    }

    public void selectByText(String text){
        By by_element = By.xpath(String.format(element_for_search,text));
        UIElement element = new UIElement(browsersService, by_element);
        element.click();
    }
}
