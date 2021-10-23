package test;

import BaseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.aboutcompany.*;

import static wrappers.dropdown.AboutCompanyComponents.*;

public class DropDownTest extends BaseTest {
    @Test
    public void AboutCompanyDropDownTest(){
        HistoryOfDevelopmentPage historyOfDevelopmentPage = (HistoryOfDevelopmentPage) new HomePage(browsersService, true)
                .getAboutCompanyDropDawn()
                .select(THE_HISTORY_OF_DEVELOPMENT);

        String actualTitle = historyOfDevelopmentPage.getTitleText();
        Assert.assertEquals(actualTitle,"ИСТОРИЯ");

        GalleryPage gallery = (GalleryPage) historyOfDevelopmentPage
                .getAboutCompanyDropDawn()
                .select(GALLERY);

         actualTitle = gallery.getTitleText();
        Assert.assertEquals(actualTitle,"ФОТОГАЛЕРЕЯ");

        BrandedTradePage brandedTradePage = (BrandedTradePage) gallery
                .getAboutCompanyDropDawn()
                .select(BRANDED_TRADE);

        actualTitle = brandedTradePage.getTitleText();
        Assert.assertEquals(actualTitle,"ФИРМЕННАЯ ТОРГОВЛЯ");

        CertificatePage certificatePage = (CertificatePage) brandedTradePage
                .getAboutCompanyDropDawn()
                .select(CERTIFICATES);

        actualTitle = certificatePage.getTitleText();
        Assert.assertEquals(actualTitle,"СЕРТИФИКАТЫ");

        AwardsAndDiplomasPage awardsAndDiplomasPage = (AwardsAndDiplomasPage) certificatePage
                .getAboutCompanyDropDawn()
                .select(AWARDS_AND_DIPLOMAS);

        actualTitle = awardsAndDiplomasPage.getTitleText();
        Assert.assertEquals(actualTitle,"НАГРАДЫ");

        SurveyPage surveyPage = (SurveyPage) awardsAndDiplomasPage
                .getAboutCompanyDropDawn()
                .select(SURVEY);

        actualTitle = surveyPage.getTitleText();
        Assert.assertEquals(actualTitle,"ОПРОС");

        IdeologWorkPage ideologWorkPage = (IdeologWorkPage) surveyPage
                .getAboutCompanyDropDawn()
                .select(IDEOLOG_WORK);

        actualTitle = ideologWorkPage.getTitleText();
        Assert.assertEquals(actualTitle,"ИДЕОЛОГИЧЕСКАЯ РАБОТА");
    }
}
