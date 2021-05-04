import org.junit.Test;
import org.openqa.selenium.OutputType;

import java.io.IOException;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TestYandex extends TestBase {

    @Test
    public void myBeautifulTest() throws IOException {

        $(byAttribute("data-id", "market")).click();

        switchTo().window(1);

        $(byAttribute("placeholder", "Искать товары")).setValue("ноутбук xiaomi redmibook");

        $(byText("Найти")).click();

        $(byTitle("Сначала предложения в моём регионе")).click();

        saveScreen(screenshot(OutputType.BYTES));
    }

}