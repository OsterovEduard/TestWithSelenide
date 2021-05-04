import com.codeborne.selenide.Configuration;
import org.junit.Before;

import java.io.FileOutputStream;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @Before
    public void setUp() {
        openBrowser(new BrowserProperty("Chrome", "https://wwww.yandex.ru/", true));
    }

    private void openBrowser(BrowserProperty browserProperty) {
        Configuration.browser = browserProperty.getBrowser();
        Configuration.startMaximized = browserProperty.isMaximized();
        open(browserProperty.getUrl());
    }

    void saveScreen(byte[] bytes) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/test/java/screen.png");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
