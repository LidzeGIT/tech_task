package selenium.steps;

import cucumber.api.java.en.When;
import selenium.pages.BasePageObject;
import selenium.pages.MyOrdersPage;
import selenium.pages.RegistrationPage;




public class ScenarioSteps {


    private RegistrationPage registrationPage = new RegistrationPage();
    private static String currentPageName;

    @When("загружена страница \"(.*)\"")
    public void stepPageLoaded(String pageName){
        currentPageName = pageName;
    }

    @When("Переход на страницу \"(.*)\" выполнен, элемент \"(.*)\" доступен")
    public void stepPage(String pageName, String title) throws Exception {
        currentPageName = pageName;
        Class example = Class.forName("selenium.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        page.waitTitle(title);

    }

    @When("поле \"(.*)\" заполняется значением \"(.*)\"")
    public void fillField(String name, String value) throws Exception {
        Class example = Class.forName("selenium.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        page.fillField(name, value);
    }

    @When("выполнить поиск \"(.*)\"")
    public void fillFieldEnter(String value){
        MyOrdersPage page = new MyOrdersPage();
        page.fillFieldEnter(page.search, value);
    }

    @When("^закрыто всплывающее окно$")
    public void closeBunner() {
        registrationPage.click(registrationPage.close);
    }


    @When("нажать на \"(.*)\"")
    public void click(String name) throws Exception {
        Class example = Class.forName("selenium.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        page.click(name);
    }
}
