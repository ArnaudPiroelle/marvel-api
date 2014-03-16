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
import com.arnaudpiroelle.marvel.api.objects.Character;
import com.arnaudpiroelle.marvel.api.objects.*;
import com.arnaudpiroelle.marvel.api.objects.ref.DataWrapper;
import com.arnaudpiroelle.marvel.api.params.name.comic.*;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface ComicsService {

    //Sync
    @GET("/v1/public/comics")
    public DataWrapper<Comic> listComic() throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics")
    public DataWrapper<Comic> listComic(@QueryMap Map<ListComicParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}")
    public DataWrapper<Comic> getComic(@Path("comicId") int comicId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/characters")
    public DataWrapper<Character> getComicCharacters(@Path("comicId") int comicId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/characters")
    public DataWrapper<Character> getComicCharacters(@Path("comicId") int comicId, @QueryMap Map<GetComicCharactersParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/creators")
    public DataWrapper<Creator> getComicCreators(@Path("comicId") int comicId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/creators")
    public DataWrapper<Creator> getComicCreators(@Path("comicId") int comicId, @QueryMap Map<GetComicCreatorsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/events")
    public DataWrapper<Event> getComicEvents(@Path("comicId") int comicId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/events")
    public DataWrapper<Event> getComicEvents(@Path("comicId") int comicId, @QueryMap Map<GetComicEventsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/stories")
    public DataWrapper<Story> getComicStories(@Path("comicId") int comicId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/stories")
    public DataWrapper<Story> getComicStories(@Path("comicId") int comicId, @QueryMap Map<GetComicStoriesParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    //Async
    @GET("/v1/public/comics")
    public void listComic(Callback<DataWrapper<Comic>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics")
    public void listComic(@QueryMap Map<ListComicParamName, String> options, Callback<DataWrapper<Comic>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}")
    public void getComic(@Path("comicId") int comicId, Callback<DataWrapper<Comic>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/characters")
    public void getComicCharacters(@Path("comicId") int comicId, Callback<DataWrapper<Character>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/characters")
    public void getComicCharacters(@Path("comicId") int comicId, @QueryMap Map<GetComicCharactersParamName, String> options, Callback<DataWrapper<Character>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/creators")
    public void getComicCreators(@Path("comicId") int comicId, Callback<DataWrapper<Creator>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/creators")
    public void getComicCreators(@Path("comicId") int comicId, @QueryMap Map<GetComicCreatorsParamName, String> options, Callback<DataWrapper<Creator>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/events")
    public void getComicEvents(@Path("comicId") int comicId, Callback<DataWrapper<Event>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/events")
    public void getComicEvents(@Path("comicId") int comicId, @QueryMap Map<GetComicEventsParamName, String> options, Callback<DataWrapper<Event>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/stories")
    public void getComicStories(@Path("comicId") int comicId, Callback<DataWrapper<Story>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/stories")
    public void getComicStories(@Path("comicId") int comicId, @QueryMap Map<GetComicStoriesParamName, String> options, Callback<DataWrapper<Story>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;
}
