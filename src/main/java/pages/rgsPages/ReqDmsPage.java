package pages.rgsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CORE.BasePageClass;

/**
 * Created by Ariec on 21.07.2019.
 */
public class ReqDmsPage extends BasePageClass{

    @FindBy(xpath = "//h1[contains(text(),'добровольное медицинское страхование')]")
    private WebElement checkDMSSentence;

    @FindBy(xpath = "//a[contains(text(), 'Отправить заявку')]")
    private WebElement otprZayavku;

    public void OtprZayavku(){
        ClickableElement(otprZayavku);
    }
    public WebElement DmsTitle(){
        return checkDMSSentence;
    }

    public void CheckDMSSentence(String str){
        sravnFunc(str, DmsTitle());
    }
}
