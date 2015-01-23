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
package com.arnaudpiroelle.marvel.api.util;

import com.arnaudpiroelle.marvel.api.objects.Image;
import com.arnaudpiroelle.marvel.api.util.ImageUtil.ImageAspectRatio;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.arnaudpiroelle.marvel.api.util.ImageUtil.ImageAspectRatio.*;
import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class ImageUtilTest {

    @Test
    public void should_generate_image_default_aspect_ratio_image_url() {
        Image image = createImage();
        String urlImage = ImageUtil.getImageUrl(image);
        assertThat(urlImage).isEqualTo(image.getPath() + "/" + STANDARD_XLARGE + "." + image.getExtension());
    }

    @Test
    @Parameters(method = "provideImageRatioAspect")
    public void should_generate_image_by_image_aspect_ratio(ImageAspectRatio imageAspectRatio) throws Exception {
        Image image = createImage();

        String urlImage = ImageUtil.getImageUrl(image, imageAspectRatio);
        assertThat(urlImage).isEqualTo(image.getPath() + "/" + imageAspectRatio + "." + image.getExtension());
    }

    private Image createImage() {
        String path = "http://i.annihil.us/u/prod/marvel/i/mg/3/40/4bb4680432f73";
        String extension = "jpg";

        Image image = new Image();
        image.setPath(path);
        image.setExtension(extension);
        return image;
    }

    private ImageAspectRatio[] provideImageRatioAspect() {
        return new ImageAspectRatio[]{
                DETAIL,
                LANDSCAPE_FANTASTIC,
                LANDSCAPE_INCREDIBLE,
                LANDSCAPE_LARGE,
                LANDSCAPE_MEDIUM,
                LANDSCAPE_SMALL,
                LANDSCAPE_XLARGE,
                PORTRAIT_FANTASTIC,
                PORTRAIT_INCREDIBLE,
                PORTRAIT_MEDIUM,
                PORTRAIT_SMALL,
                PORTRAIT_UNCANNY,
                PORTRAIT_XLARGE,
                STANDARD_SMALL,
                STANDARD_AMAZING,
                STANDARD_FANTASTIC,
                STANDARD_LARGE,
                STANDARD_XLARGE,
                STANDARD_MEDIUM
        };
    }

}
