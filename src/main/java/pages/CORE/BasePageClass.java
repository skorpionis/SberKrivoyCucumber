package pages.CORE;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


/**
 * Created by Ariec on 19.07.2019.
 */
public class BasePageClass {

    public BasePageClass(){
        PageFactory.initElements(MyWebDriverClass.getDriver(),this);
    }

    public void ClickableElement(WebElement element){
        MyWebDriverClass.ojidalkaMethod(element).click();
    }

    public void zapTextPoley(WebElement element, String s){
        Actions actions = new Actions(MyWebDriverClass.getDriver());
        actions.moveToElement(element).click().perform();
        element.sendKeys(s);
    }
    public void ChooseCity(int c, List<WebElement> arrValues) {
        ClickableElement(arrValues.get(c));
    }

    public void zapolnPoley(List<WebElement> textMas, List<String> arrStr){
        if (arrStr.size() != textMas.size())
            return;
        if (arrStr.isEmpty() || textMas.isEmpty())
            return;
        for (int i = 0; i < arrStr.size(); i++) {
            zapTextPoley(textMas.get(i),arrStr.get(i));
        }
    }
    public void poluchenieIzSravnenia(List<String> arrStr, List<WebElement> arrStrAct){
        if(arrStr.size() != arrStrAct.size())
            return;
        if(arrStr.isEmpty() || arrStrAct.isEmpty())
            return;
        for (int i = 0; i <arrStr.size() ; i++) {
            Assert.assertEquals(arrStr.get(i), arrStrAct.get(i).getAttribute("value"));
        }
    }
    protected void sravnFunc(String s, WebElement element) {
        Assert.assertEquals(s, MyWebDriverClass.ojidalkaMethod(element).getText());
    }


}
