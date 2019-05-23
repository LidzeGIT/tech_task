package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.annotation.FieldName;

public class MyOrdersPage extends BasePageObject {

    @FieldName(name = "Мои заказы")
    @FindBy(xpath = "//h2[@class='q-orders-header']")
    public WebElement title;

    @FindBy(xpath = "//nav[@id=\"main_menu_container\"]")
    @FieldName(name = "Меню")
    public WebElement menu;

    @FieldName(name = "Поиск")
    @FindBy(xpath = "//input[@id='search_line']")
    public WebElement search;

    @FieldName(name = "Смартфоны и гаджеты")
    @FindBy(xpath = "//*[@id=\"main_menu_container\"]/div/ul/li[4]/a/span[1]")
    public WebElement firstProduct;

    @FieldName(name = "Samsung Galaxy S10")
    @FindBy(xpath = "//div[@class='new-catalog-block__elem']/a[text()='Samsung Galaxy S10']")
    public WebElement sumsung;

    @FieldName(name = "Корзина")
    @FindBy(xpath = "//span[@id='basketCost']")
    public WebElement basket;

    @FindBy(xpath = "(//div[@class=\"item \"]/div[@class=\"buyBox buyBoxCorners\"]//span[@class=\"addToCartCP cartButtonText\"])[1]")
    //@FindBy(css = ".item:nth-of-type(2) a[class='addToCart cartButton jqActive']")
    @FieldName(name = "Добавить в корзину")
    public WebElement pushBasket;

    //button[@data-fl-close="1800"]
    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "selenium.pages.MyOrdersPage");
    }

}
