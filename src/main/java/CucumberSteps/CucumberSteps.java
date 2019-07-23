package CucumberSteps;

import cucumber.api.java.ru.Допустим;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CORE.MyWebDriverClass;
import pages.rgsPages.DMSFormPage;
import pages.rgsPages.MainRgsPage;
import pages.rgsPages.ReqDmsPage;
import pages.sberPages.MainSberPage;
import pages.sberPages.PersonalityPage;
import pages.sberPages.PolisPageAgreement;


import java.util.List;

/**
 * Created by Ariec on 22.07.2019.
 */
public class CucumberSteps {

    @Допустим("Старт браузераа {string}")
    public void StartBrowser(String Url){
        MyWebDriverClass.StartingBrowse(Url);
    }

    @Допустим("Главная страница")
    public void GlStr(){
        MainSberPage mainSberPage = new MainSberPage();
        mainSberPage.GlStr();
    }
    @Допустим("Путешествие и покупки")
    public void Puteshestvia(){
        MainSberPage mainSberPage = new MainSberPage();
        mainSberPage.Puteshestviya();
    }
    @Допустим("Проверить наличие на странице заголовка – {string}")
    public void checkPuteshestvia(String string){
        MainSberPage mainSberPage = new MainSberPage();
        mainSberPage.CheckStrah();
    }
    @Допустим("Оформить Онлайн")
    public void OformitOnline(){
        MainSberPage mainSberPage = new MainSberPage();
        MyWebDriverClass.perehodNaNovuyuStr(mainSberPage.OnlineClick());
    }
    @Допустим("Допустимая сумма полиса")
    public void Dopustim(){
        PolisPageAgreement polisPage = new PolisPageAgreement();
        polisPage.EnughBtn();
    }
    @Допустим("Оформить")
    public void SaveFunc(){
        PolisPageAgreement polisPage = new PolisPageAgreement();
        polisPage.AcceptBtn();
    }
    @Допустим("Заполнить поля")
    public void Filling(List<String> arrayValues){
        PersonalityPage personalityPage = new PersonalityPage();
        List<WebElement> arrayWithFields = personalityPage.arrElemN();
        personalityPage.zapolnPoley(arrayWithFields,arrayValues);
    }

    @Допустим("Проверить правильность полей")
    public void ProverkaPoley(List<String> array){
        PersonalityPage personalityPage = new PersonalityPage();
        List<WebElement> neobhPolya = personalityPage.arrElemN();
        personalityPage.poluchenieIzSravnenia(array, neobhPolya);
    }
    @Допустим("Продолжить")
    public void Continue(){
        PersonalityPage personalityPage = new PersonalityPage();
        personalityPage.ClickSaveBtn();
    }
    @Допустим("Проверка сообщения {string}")
    public void ErrorFuncCheck(String STR){
        PersonalityPage personalityPage = new PersonalityPage();
        personalityPage.sravnZnachPol(STR);
        MyWebDriverClass.ZakrStranic();
        MyWebDriverClass.getDriver().quit();
    }
//<------------------------------------------------->//
    //RGS!!1
@Допустим("Старт браузера {string}")
public void RGS(String Url){
    MyWebDriverClass.StartingBrowse(Url);
}
    @Допустим("Страхование")
    public void MainRgs(){
        MainRgsPage mainRgsPage = new MainRgsPage();
        mainRgsPage.Strahovanie();
    }

    @Допустим("ДМС")
    public void DMScateg(){
        MainRgsPage mainRgsPage = new MainRgsPage();
        mainRgsPage.DMS();
    }

    @Допустим("Проверить заголовок {string}")
    public void ProverkaZagolovka(String string){
        ReqDmsPage reqDmsPage = new ReqDmsPage();
        reqDmsPage.CheckDMSSentence(string);
    }

    @Допустим("Отправить заявку")
    public void otpZayavku(){
        ReqDmsPage reqDmsPage = new ReqDmsPage();
        reqDmsPage.OtprZayavku();
    }
    @Допустим("Проверка шапки с текстом {string}")
    public void ProverkaShapki(String nazv){
        DMSFormPage dmsFormPage = new DMSFormPage();
        dmsFormPage.ProverkaShapkiSravnenie(nazv);
    }
    @Допустим("Заполнение полей")
    public void Zaplonenie(List<String> arrValues){
        DMSFormPage dmsFormPage = new DMSFormPage();
        List<WebElement> polyaDlyZapolnenia = dmsFormPage.arrWebM();
        dmsFormPage.zapolnPoley(polyaDlyZapolnenia,arrValues);
        dmsFormPage.ChooseCity(5,dmsFormPage.Regions());
        dmsFormPage.AcceptFlag();
    }
    @Допустим("Проверка на заполнение всех полей")
    public void ProverkaNazapolnenieVsehPoley(List<String> arrValues){
        DMSFormPage dmsFormPage = new DMSFormPage();
        List<WebElement> polyaDlyZapolnenia = dmsFormPage.arrWebM();
        Assert.assertEquals("29", dmsFormPage.Regions().get(5).getAttribute("value"));
        dmsFormPage.poluchenieIzSravnenia(arrValues, polyaDlyZapolnenia);
    }
    @Допустим("Отправить")
    public void Otpravitb(){
        DMSFormPage dmsFormPage = new DMSFormPage();
        dmsFormPage.SaveBtn();
    }
    @Допустим("Проверить ошибку у почты поля")
    public void checkNaOshibku(){
        DMSFormPage dmsFormPage = new DMSFormPage();
        dmsFormPage.IncorrectMailError();
        dmsFormPage.Mail("azzaza@gmail.com");
    }
}
