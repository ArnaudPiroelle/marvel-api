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
package com.arnaudpiroelle.marvel.api.services;

import com.arnaudpiroelle.marvel.api.exceptions.AuthorizationException;
import com.arnaudpiroelle.marvel.api.exceptions.EntityNotFoundException;
import com.arnaudpiroelle.marvel.api.exceptions.QueryException;
import com.arnaudpiroelle.marvel.api.exceptions.RateLimitException;
import com.arnaudpiroelle.marvel.api.objects.*;
import com.arnaudpiroelle.marvel.api.objects.Character;
import com.arnaudpiroelle.marvel.api.objects.ref.DataWrapper;
import com.arnaudpiroelle.marvel.api.params.name.character.*;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface CharactersService {

    @GET("/v1/public/characters")
    public DataWrapper<Character> listCharacter() throws AuthorizationException, QueryException;

    @GET("/v1/public/characters")
    public DataWrapper<Character> listCharacter(@QueryMap Map<ListCharacterParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/characters/{characterId}")
    public DataWrapper<Character> getCharacter(@Path("characterId") int characterId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/characters/{characterId}/comics")
    public DataWrapper<Comic> getCharacterComics(@Path("characterId") int characterId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/characters/{characterId}/comics")
    public DataWrapper<Comic> getCharacterComics(@Path("characterId") int characterId, @QueryMap Map<GetCharacterComicsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/characters/{characterId}/events")
    public DataWrapper<Event> getCharacterEvents(@Path("characterId") int characterId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/characters/{characterId}/events")
    public DataWrapper<Event> getCharacterEvents(@Path("characterId") int characterId, @QueryMap Map<GetCharacterEventsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/characters/{characterId}/series")
    public DataWrapper<Series> getCharacterSeries(@Path("characterId") int characterId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/characters/{characterId}/series")
    public DataWrapper<Series> getCharacterSeries(@Path("characterId") int characterId, @QueryMap Map<GetCharacterSeriesParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/characters/{characterId}/stories")
    public DataWrapper<Story> getCharacterStories(@Path("characterId") int characterId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/characters/{characterId}/stories")
    public DataWrapper<Story> getCharacterStories(@Path("characterId") int characterId, @QueryMap Map<GetCharacterStoriesParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

}
