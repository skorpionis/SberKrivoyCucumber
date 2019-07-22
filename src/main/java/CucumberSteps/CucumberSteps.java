package CucumberSteps;

import cucumber.api.java.ru.Допустим;
import org.openqa.selenium.WebElement;
import pages.MyWebDriverClass;
import pages.sberPages.MainSberPage;
import pages.sberPages.PersonalityPage;
import pages.sberPages.PolisPageAgreement;


import java.util.List;

/**
 * Created by Ariec on 22.07.2019.
 */
public class CucumberSteps {

    @Допустим("Старт браузера {string}")
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
    @Допустим("Проверить, что все поля заполнены правильно")
    public void ProverkaPoley(List<String> array){
        PersonalityPage personalityPage = new PersonalityPage();
        List<WebElement> necessaryFields = personalityPage.arrElemN();
        personalityPage.poluchenieIzSravnenia(array, necessaryFields);
    }
    @Допустим("Продолжить")
    public void Continue(){
        PersonalityPage personalityPage = new PersonalityPage();
        personalityPage.ClickSaveBtn();
    }
    @Допустим("Проверка сообщения {string}")
    public void ErrorFuncCheck(String string){
        PersonalityPage personalityPage = new PersonalityPage();
        personalityPage.sravnZnachPol();
        MyWebDriverClass.ZakrStranic();
        MyWebDriverClass.getDriver().quit();
    }
}
