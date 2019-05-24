package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.annotation.FieldName;

public class DeliveryPage extends BasePageObject {

    @FindBy(xpath = "//input[@id=\"phone_code_1\"]")
    @FieldName(name = "Код")
    public WebElement code;

    @FieldName(name = "Номер")
    @FindBy(xpath = "//input[@id=\"phone_number_1\"]")
    public WebElement number;

    @FieldName(name = "Доставка по Москве")
    @FindBy(xpath = "//*[@id=\"delivery-box\"]/div[2]/div/div/div/label")
    //@FindBy(xpath = "//*[@id='delivery-box']//label[contains(text(), 'Доставка по Москве')]")
    public WebElement delivery;

    @FindBy(xpath = "//input[@id=\"metro_dropdown\"]")
    @FieldName(name = "Метро")
    public WebElement metro;

    @FieldName(name = "Улица")
    @FindBy(xpath = "//input[@id=\"ORDER_PROP_5_VALUE\"]")
    public WebElement street;

    @FieldName(name = "Летная")
    //@FindBy(xpath = "/html/body/ul[1]/li[1]/a")
    @FindBy(xpath = "(//ul[@role='listbox'][1]//a)[1]")
    public WebElement let;

    @FieldName(name = "Дом")
    @FindBy(xpath = "//input[@id=\"address_house\"]")
    public WebElement house;

    @FieldName(name = "Строение")
    @FindBy(xpath = "//input[@id=\"address_building\"]")
    public WebElement building;

    @FieldName(name = "Продолжить")
    @FindBy(xpath = "//*[@id=\"order_full_form\"]/div/div[4]/span/input")
    public WebElement next;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "selenium.pages.DeliveryPage");
    }
}
