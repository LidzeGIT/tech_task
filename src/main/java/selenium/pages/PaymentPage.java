package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.annotation.FieldName;

public class PaymentPage extends BasePageObject {


    @FindBy(xpath = "//*[@id=\"delivery_radio_1-styler\"]/span")
    @FieldName(name = "Наличный расчет")
    public WebElement cash;

    @FieldName(name = "Продолжить")
    @FindBy(xpath = "//*[@id=\"order_full_form\"]/div/div[3]/span/input")
    public WebElement next;

    @FindBy(xpath = "//input[@value='Подтвердить заказ']")
    @FieldName(name = "Подтвердить заказ")
    public WebElement valide;

    @FindBy(xpath = "//a[@href=\"/personal\"]")
    @FieldName(name = "Личный кабинет")
    public WebElement mainLogo;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "selenium.pages.PaymentPage");
    }
}
