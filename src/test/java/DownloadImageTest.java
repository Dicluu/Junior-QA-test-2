import org.junit.Assert;
import org.junit.Test;

/**
 * Главный класс теста
 */
public class DownloadImageTest extends BaseTest {

    private final String BASE_URL = "https://google.ru";
    private final String SEARCH_TEXT = "Aleksey Morozov";

    @Test
    public void downloadTest() {
        Assert.assertTrue(new MainPage(BASE_URL).search(SEARCH_TEXT).clickImages().openImagePage().copy());
    }
}
