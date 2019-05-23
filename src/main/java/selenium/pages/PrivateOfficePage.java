package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.annotation.FieldName;

public class PrivateOfficePage extends BasePageObject {

    @FindBy(xpath = "//a[@href=\"/personal/orders/index.php\"]")
    @FieldName(name = "Мои заказы")
    public WebElement myOrder;

    @FindBy(xpath = "//a[@title='Отменить заказ']")
    @FieldName(name = "Отменить заказ")
    public WebElement cancelOrder;

    @FindBy(xpath = "//input[@value=\"Отменить заказ\"]")
    @FieldName(name = "Подтвердить отмену")
    public WebElement cancel;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "selenium.pages.PrivateOfficePage");
    }
}
