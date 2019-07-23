package pages.rgsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CORE.BasePageClass;

/**
 * Created by Ariec on 21.07.2019.
 */
public class MainRgsPage extends BasePageClass {
    @FindBy(xpath = "//*[contains(text(), 'Страхование')]")
    private WebElement strahovanie;


    @FindBy(xpath = "//*[contains(text(), 'ДМС')]")
    private WebElement dms;


    public void Strahovanie(){
        ClickableElement(strahovanie);
    }
    public void DMS(){
        ClickableElement(dms);
    }
}
