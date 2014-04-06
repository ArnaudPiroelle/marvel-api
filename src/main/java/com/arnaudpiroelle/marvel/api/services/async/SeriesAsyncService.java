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
package com.arnaudpiroelle.marvel.api.services.async;

import com.arnaudpiroelle.marvel.api.exceptions.AuthorizationException;
import com.arnaudpiroelle.marvel.api.exceptions.EntityNotFoundException;
import com.arnaudpiroelle.marvel.api.exceptions.QueryException;
import com.arnaudpiroelle.marvel.api.exceptions.RateLimitException;
import com.arnaudpiroelle.marvel.api.objects.Character;
import com.arnaudpiroelle.marvel.api.objects.*;
import com.arnaudpiroelle.marvel.api.objects.ref.DataWrapper;
import com.arnaudpiroelle.marvel.api.params.name.serie.*;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface SeriesAsyncService {

    @GET("/v1/public/series")
    public void listSerie(Callback<DataWrapper<Series>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series")
    public void listSerie(@QueryMap Map<ListSerieParamName, String> options, Callback<DataWrapper<Series>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}")
    public void getSerie(@Path("seriesId") int seriesId, Callback<DataWrapper<Series>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/characters")
    public void getSerieCharacters(@Path("seriesId") int seriesId, Callback<DataWrapper<Character>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/characters")
    public void getSerieCharacters(@Path("seriesId") int seriesId, @QueryMap Map<GetSerieCharactersParamName, String> options, Callback<DataWrapper<Character>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/comics")
    public void getSerieComics(@Path("seriesId") int seriesId, Callback<DataWrapper<Comic>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/comics")
    public void getSerieComics(@Path("seriesId") int seriesId, @QueryMap Map<GetSerieComicsParamName, String> options, Callback<DataWrapper<Comic>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/creators")
    public void getSerieCreators(@Path("seriesId") int seriesId, Callback<DataWrapper<Creator>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/creators")
    public void getSerieCreators(@Path("seriesId") int seriesId, @QueryMap Map<GetSerieCreatorsParamName, String> options, Callback<DataWrapper<Creator>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/events")
    public void getSerieEvents(@Path("seriesId") int seriesId, Callback<DataWrapper<Event>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/events")
    public void getSerieEvents(@Path("seriesId") int seriesId, @QueryMap Map<GetSerieEventsParamName, String> options, Callback<DataWrapper<Event>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/stories")
    public void getSerieStories(@Path("seriesId") int seriesId, Callback<DataWrapper<Story>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/stories")
    public void getSerieStories(@Path("seriesId") int seriesId, @QueryMap Map<GetSerieStoriesParamName, String> options, Callback<DataWrapper<Story>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;
}
