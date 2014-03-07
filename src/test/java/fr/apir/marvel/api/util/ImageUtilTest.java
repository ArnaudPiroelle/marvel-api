/**
 * Copyright (C) 2014 Arnaud Piroelle (contact@arnaudpiroelle.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
