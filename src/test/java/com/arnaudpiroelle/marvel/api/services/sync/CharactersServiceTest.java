package com.arnaudpiroelle.marvel.api.services.sync;

import com.arnaudpiroelle.marvel.api.MarvelApiBuilder;
import com.arnaudpiroelle.marvel.api.objects.Character;
import com.arnaudpiroelle.marvel.api.objects.ref.DataWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class CharactersServiceTest {

    CharactersService charactersService;

    @Before
    public void setUp() throws Exception {
        MarvelApiBuilder.initMarvelApiBuilder("14a0fffa1ddc817d5121a602e752a3fa", "0305e249db2a6f18015cc60d1768335c081c0d9a");
        charactersService = MarvelApiBuilder.getService(CharactersService.class);
    }

    @Test
    public void testListCharacter() throws Exception {
        DataWrapper<Character> characterDataWrapper = charactersService.listCharacter();
        List<Character> characterList = characterDataWrapper.getData().getResults();
        Character character = characterList.get(0);

        System.out.println(character.getName());
    }

    @Test
    public void testListCharacter1() throws Exception {

    }

    @Test
    public void testGetCharacter() throws Exception {

    }

    @Test
    public void testGetCharacterComics() throws Exception {

    }

    @Test
    public void testGetCharacterComics1() throws Exception {

    }

    @Test
    public void testGetCharacterEvents() throws Exception {

    }

    @Test
    public void testGetCharacterEvents1() throws Exception {

    }

    @Test
    public void testGetCharacterSeries() throws Exception {

    }

    @Test
    public void testGetCharacterSeries1() throws Exception {

    }

    @Test
    public void testGetCharacterStories() throws Exception {

    }

    @Test
    public void testGetCharacterStories1() throws Exception {

    }
}