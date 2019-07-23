package pages.sberPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CORE.BasePageClass;

import java.util.ArrayList;
import java.util.List;

public class PersonalityPage extends BasePageClass {

    @FindBy(xpath = "//input[@name='insured0_surname']")
    private WebElement inNSurname;
    @FindBy(xpath = "//input[@name='insured0_name']")
    private WebElement inName;
    @FindBy(xpath = "//input[@name='insured0_birthDate']")
    private WebElement inData;
    @FindBy(xpath = "//input[@name='surname']")
    private WebElement surname;
    @FindBy(xpath = "//input[@name='name']")
    private WebElement name;
    @FindBy(xpath = "//input[@name='middlename']")
    private WebElement middleName;
    @FindBy(xpath = "//input[@name='birthDate']")
    private WebElement data;
    @FindBy(xpath = "//input[@ng-model='formdata.insurer.documentList[0].DOCSERIES']")
    private WebElement passportSeries;
    @FindBy(xpath = "//input[@ng-model='formdata.insurer.documentList[0].DOCNUMBER']")
    private WebElement passportNumber;
    @FindBy(xpath = "//*[contains(text(), 'Дата выдачи')]")
    private WebElement passportData;
    @FindBy(xpath = "//textarea[@name='issuePlace']")
    private WebElement passportIssue;
    @FindBy(xpath = "//span[@ng-click='save()'][text()='Продолжить']")
    private WebElement saveBtn;
    @FindBy(xpath = "//div[@ng-show='tryNext && myForm.$invalid']")
    private WebElement errorTextField;

    public List<WebElement> arrElemN(){
        List<WebElement> arrElem = new ArrayList<>();
        arrElem.add(inNSurname);
        arrElem.add(inName);
        arrElem.add(inData);
        arrElem.add(surname);
        arrElem.add(name);
        arrElem.add(middleName);
        arrElem.add(data);
        arrElem.add(passportSeries);
        arrElem.add(passportNumber);
        arrElem.add(passportData);
        arrElem.add(passportIssue);
        return arrElem;
    }

    public WebElement InNSurname(){
        return inNSurname;
    }
    public WebElement InName(){
        return inName ;
    }
    public WebElement InData(){
        return inData;
    }
    public WebElement Surname(){
        return surname;
    }
    public WebElement Name(){
        return name ;
    }
    public WebElement MiddleName(){
        return  middleName;
    }
    public WebElement Data(){
        return data ;
    }
    public WebElement  PassportSeries(){
        return  passportSeries;
    }
    public WebElement PassportNumber(){
        return  passportNumber;
    }
    public WebElement PassportData(){
        return  passportData;
    }
    public WebElement PassportIssue(){
        return  passportIssue;
    }
    public WebElement ErrorTextField(){
        return errorTextField;
    }


    public void sravnZnachPol(String s){
        sravnFunc(s,ErrorTextField());
    }



    public WebElement ClickSaveBtn(){
        return saveBtn;
    }
    public void SaveBtn(){
        ClickableElement(ClickSaveBtn());
    }


}


