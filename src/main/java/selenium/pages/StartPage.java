package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.annotation.FieldName;

public class StartPage extends BasePageObject {


    @FindBy(xpath = "//div[@class='headerPersonal gg']/a[@class='headerLogin headerRegister']")
    //@FindBy(css = ".headerPersonal>.headerRegister")
    @FieldName(name = "Регистрация")
    public WebElement registration;


    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "selenium.pages.StartPage");
    }
}
