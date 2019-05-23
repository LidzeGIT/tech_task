package selenium.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.annotation.FieldName;
import selenium.util.DriverManager;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;


public abstract class BasePageObject {
	private WebDriverWait wait  = new WebDriverWait(DriverManager.getDriver(), 60);

	BasePageObject() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}


	public void fillField(String name, String value) throws Exception {
		WebElement element = getField(name);
		fillField(element, value);
	}

	public void click(String name) throws Exception {
		WebElement element = getField(name);
		click(element);
	}

	public void waitTitle(String title){
        WebDriverWait driverWait = new WebDriverWait(DriverManager.getDriver(),15);
        driverWait.until(ExpectedConditions.titleContains(title));
    }

	public abstract WebElement getField(String name) throws Exception;

	WebElement getField(String name, String className) throws Exception {
		Class example = Class.forName(className);
		List<Field> fields = Arrays.asList(example.getFields());
		for (Field field : fields){
			if (field.getAnnotation(FieldName.class).name().equals(name)){
				return DriverManager.getDriver().findElement(By.xpath(field.getAnnotation(FindBy.class).xpath()));
			}
		}
		Assert.fail("Не объявлен элемент с наименованием " + name);
		return null;
	}

	private void fillField(WebElement field, String value){
		field.clear();
		field.sendKeys(value);
		field.sendKeys(Keys.TAB);
	}

    public void fillFieldEnter(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
        field.sendKeys(Keys.ENTER);
    }

    public void fillFieldDown(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
        field.sendKeys(Keys.DOWN);
    }


	public void click(WebElement element){
		wait.until(ExpectedConditions.visibilityOf(element)).click();
        //wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}


}

