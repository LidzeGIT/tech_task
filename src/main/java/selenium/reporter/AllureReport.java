package selenium.reporter;

import gherkin.formatter.model.Result;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import selenium.util.DriverManager;

public class AllureReport extends io.qameta.allure.cucumberjvm.AllureCucumberJvm {

    @Attachment(type = "image/png", value = "Скриншот на момент ошибки")
    private static byte[] takeScreenshot() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void result(Result result) {
        if (!result.getStatus().equals("passed") && !result.getStatus().equals("skipped")) {
            takeScreenshot();
        }
        super.result(result);
    }
}
