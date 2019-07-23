package pages.sberPages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CORE.BasePageClass;

/**
 * Created by Ariec on 19.07.2019.
 */
public class MainSberPage extends BasePageClass{
    @FindBy(xpath = "//span[contains(text(), 'Страхование')]/parent::*")
    private WebElement glStr;
    @FindBy(xpath = "//span[contains(text(), 'Страхование')]/parent::*/following::*[contains(text(), 'Путешествия и покупки')][1]")
    private WebElement puteshestviya;
    @FindBy(xpath = "//a[contains(text(), 'Оформить онлайн')]")
    private WebElement onlinePurchase;
    @FindBy(xpath = "//*[contains(text(),'Страхование путешественников')]")
    private WebElement  checkStrah;


    public void GlStr(){
        ClickableElement(glStr);
    }

    public void Puteshestviya(){
        ClickableElement(puteshestviya);
    }
    public void CheckStrah(){
        Assert.assertEquals("\n Отсутствует поле с ",
                "Страхование путешественников",checkStrah.getText());
    }

    public void OnlinePurchase(){
        ClickableElement(onlinePurchase);
    }

    public  WebElement OnlineClick(){
        return onlinePurchase;
    }
}
