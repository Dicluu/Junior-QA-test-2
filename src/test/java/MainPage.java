import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница google.ru
 */
public class MainPage {

    private static final SelenideElement INPUT_BOX = $x("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");

    public MainPage(String url) {
        Selenide.open(url);
    }

    /**
     * В строку поискового запроса вставляет текст и запускает поиск
     * @param value нужный текст для поиска
     */
    public SearchPage search(String value) {
        INPUT_BOX.setValue(value);
        INPUT_BOX.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
