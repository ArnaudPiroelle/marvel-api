package fr.apir.marvel.api.util;

import fr.apir.marvel.api.objects.Image;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Piroelle on 05/03/14.
 */
public class ImageUtilTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetImageUrl() throws Exception {
        Image image = new Image();
        image.setPath("http://i.annihil.us/u/prod/marvel/i/mg/3/40/4bb4680432f73");
        image.setExtension("jpg");

        String urlImage = ImageUtil.getImageUrl(image);
        System.out.println(urlImage);
        Assert.assertEquals(urlImage, "http://i.annihil.us/u/prod/marvel/i/mg/3/40/4bb4680432f73/" + ImageUtil.ImageAspectRatio.STANDARD_XLARGE + ".jpg");

        urlImage = ImageUtil.getImageUrl(image, ImageUtil.ImageAspectRatio.FULL_SIZE);
        System.out.println(urlImage);
        Assert.assertEquals(urlImage, "http://i.annihil.us/u/prod/marvel/i/mg/3/40/4bb4680432f73.jpg");
    }
}
