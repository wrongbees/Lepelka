package test;

import BaseEntities.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;

public class SmokeTest extends BaseTest {
    @Test
    public void EntranceTest() throws InterruptedException {
        HomePage homePage = new HomePage(browsersService, true);


//        Actions action = new Actions(browsersService.getDriver());
//        action
//                .moveToElement(browsersService.getDriver().findElement(homePage.about_company))
//                .perform();

        Thread.sleep(3000);
        System.out.println(browsersService.getDriver().getCurrentUrl());
        //homePage.aboutCompanyButtonClick();
    }
}
