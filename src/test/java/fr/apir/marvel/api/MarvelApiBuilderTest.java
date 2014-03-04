package fr.apir.marvel.api;

import fr.apir.marvel.api.services.CharactersService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Piroelle on 04/03/14.
 */
public class MarvelApiBuilderTest {
    @Before
    public void setUp() throws Exception {
        MarvelApiBuilder.initMarvelApiBuilder("", "");
    }

    @Test
    public void testApiGetService() throws Exception {
        CharactersService charactersService = MarvelApiBuilder.getService(CharactersService.class);
        Assert.assertNotNull(charactersService);
    }
}
