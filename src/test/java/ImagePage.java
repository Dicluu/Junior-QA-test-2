import com.codeborne.selenide.SelenideElement;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница с фотографией.
 */
public class ImagePage {

    private static final SelenideElement IMAGE = $x("/html/body/div[2]/c-wiz/div/div[1]/div/div[1]/div/div[3]/div[2]/c-wiz/div/div[1]/div[1]/div[3]/div/a/img");

    /**
     * Копирование фотографии и создание файла формата png.
     */
    public boolean copy() {
        try {
            BufferedImage bufferedImage = ImageIO.read(new URL(IMAGE.getAttribute("src")));
            File outputfile = new File("saved.png");
            ImageIO.write(bufferedImage, "png", outputfile);
        }
        catch (Exception e) {
            System.out.println("Exception catched");
        }
        return true;
    }

}
