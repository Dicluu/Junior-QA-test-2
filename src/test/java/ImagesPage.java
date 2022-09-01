import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$$x;

/**
 * Вкладка с изображениями результата поиска.
 */
public class ImagesPage {

    private static final ElementsCollection ARTICLES = $$x("/html/body/div[2]/c-wiz/div[3]/div[1]/div/div[1]/div/div[1]/div[1]/span/div[1]/div[1]/div");

    /**
     * Нажатие на 3-ий элемент из списка для получение ссылки на страницу с фотографией.
     */
    public ImagePage openImagePage() {
            ARTICLES.get(2).$x("a[1]").click();
            Selenide.open(ARTICLES.get(2).$x("a[1]").getAttribute("href"));
            return new ImagePage();
    }
}