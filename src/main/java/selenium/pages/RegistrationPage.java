package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.annotation.FieldName;

public class RegistrationPage extends BasePageObject {

    @FindBy(xpath = "//input[@id='NEW_EMAIL']")
    @FieldName(name = "Email")
    public WebElement email;

    @FieldName(name = "Имя")
    @FindBy(xpath = "//input[@id='NEW_NAME']")
    public WebElement name;

    @FieldName(name = "Отчество")
    @FindBy(xpath = "//input[@id='NEW_SECOND_NAME']")
    public WebElement secondName;

    @FieldName(name = "Фамилия")
    @FindBy(xpath = "//input[@id='NEW_LAST_NAME']")
    public WebElement lastName;

    @FieldName(name = "Дата Рождения")
    @FindBy(xpath = "//input[@id='NEW_BIRTHDAY']")
    public WebElement dateOfBirth;

    @FieldName(name = "Телефон")
    @FindBy(xpath = "//input[@id='NEW_PHONE']")
    public WebElement phone;

    @FieldName(name = "Пароль")
    @FindBy(xpath = "//div[@class='regInputWrap regPasswordWrap']/input[@type='password']")
    //@FindBy(css = ".regPasswordWrap>input[type='password']")
    public WebElement pass;

    @FieldName(name = "Зарегистрироваться")
    @FindBy(xpath = "//a[@class='regInputSubmit q-reg-button no-mobile']")
    public WebElement registr;

    //сделать метод закрывающий окно
    @FindBy(xpath = "//div[@class='popup popupRegFinalCustom closerPaddingT closerPaddingR noLeftMargin']/a[@class='close']")
    //@FindBy(css = ".popupRegFinalCustom>.close ")
    public WebElement close;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "selenium.pages.RegistrationPage");
    }
}
