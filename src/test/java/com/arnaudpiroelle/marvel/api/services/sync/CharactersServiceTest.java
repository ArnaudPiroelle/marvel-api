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
package com.arnaudpiroelle.marvel.api.services.sync;

import com.arnaudpiroelle.marvel.api.MarvelApiBuilder;
import com.arnaudpiroelle.marvel.api.services.ref.ApiServiceTest;
import org.junit.Before;
import org.junit.Test;


public class CharactersServiceTest extends ApiServiceTest {

    CharactersService charactersService;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        charactersService = MarvelApiBuilder.getService(CharactersService.class);
    }

    @Test
    public void testListCharacter() throws Exception {
        /*
        DataWrapper<Character> characterDataWrapper = charactersService.listCharacter();
        List<Character> characterList = characterDataWrapper.getData().getResults();
        Assert.assertNotEquals(0, characterList.size());
        */
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