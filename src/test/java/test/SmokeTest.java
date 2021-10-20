package test;

import BaseEntities.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import wrappers.dropdown.AboutCompanyComponents;
import wrappers.dropdown.AboutCompanyDropdown;

public class SmokeTest extends BaseTest {
    @Test
    public void EntranceTest() throws InterruptedException {
        HomePage homePage = new HomePage(browsersService, true);
        AboutCompanyDropdown dropdown = new AboutCompanyDropdown(browsersService, homePage.getAboutCompany());
        dropdown.select(AboutCompanyComponents.THE_HISTORY_OF_DEVELOPMENT);

//
        Thread.sleep(3000);
        System.out.println(browsersService.getDriver().getCurrentUrl());
        //homePage.aboutCompanyButtonClick();
    }
}
