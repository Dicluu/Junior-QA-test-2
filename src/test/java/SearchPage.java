import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница с результатом поиска.
 */
public class SearchPage {

    private static final SelenideElement IMAGES = $x("/html/body/div[7]/div/div[4]/div/div[1]/div/div[1]/div/div[2]/a");

    /**
     * Переход на вкладку с фотографиями.
     */
    public ImagesPage clickImages() {
        IMAGES.click();
        return new ImagesPage();
    }


}
