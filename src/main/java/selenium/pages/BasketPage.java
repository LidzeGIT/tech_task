package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.annotation.FieldName;

public class BasketPage extends BasePageObject {

    @FindBy(xpath = "//span[@class='successBttnCP']")
    @FieldName(name = "Оформить заказ")
    public WebElement success;

    @FindBy(xpath = "//span[@class=\"addToCartBig q-checkoutButton cartButton noBorder active disabled\"]/input[@value='Продолжить']")
    @FieldName(name = "Продолжить")
    public WebElement next;

    @FieldName(name = "Москва")
    @FindBy(xpath = "//span[@val='11324']")
    public WebElement mos;

    @FieldName(name = "Доставка по Москве")
    @FindBy(xpath = "//*[@id=\"delivery-box\"]/div[2]/div/div/div/label")
    public WebElement delivery;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "selenium.pages.BasketPage");
    }
}
