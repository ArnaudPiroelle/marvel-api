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
package fr.apir.marvel.api.services;

import fr.apir.marvel.api.exceptions.AuthorizationException;
import fr.apir.marvel.api.exceptions.EntityNotFoundException;
import fr.apir.marvel.api.exceptions.QueryException;
import fr.apir.marvel.api.exceptions.RateLimitException;
import fr.apir.marvel.api.objects.Character;
import fr.apir.marvel.api.objects.*;
import fr.apir.marvel.api.objects.ref.DataWrapper;
import fr.apir.marvel.api.params.name.serie.*;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface SeriesService {

    @GET("/v1/public/series")
    public DataWrapper<Series> listSerie() throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series")
    public DataWrapper<Series> listSerie(@QueryMap Map<ListSerieParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}")
    public DataWrapper<Series> getSerie(@Path("seriesId") int seriesId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/characters")
    public DataWrapper<Character> getSerieCharacters(@Path("seriesId") int seriesId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/characters")
    public DataWrapper<Character> getSerieCharacters(@Path("seriesId") int seriesId, @QueryMap Map<GetSerieCharactersParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/comics")
    public DataWrapper<Comic> getSerieComics(@Path("seriesId") int seriesId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/comics")
    public DataWrapper<Comic> getSerieComics(@Path("seriesId") int seriesId, @QueryMap Map<GetSerieComicsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/creators")
    public DataWrapper<Creator> getSerieCreators(@Path("seriesId") int seriesId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/creators")
    public DataWrapper<Creator> getSerieCreators(@Path("seriesId") int seriesId, @QueryMap Map<GetSerieCreatorsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/events")
    public DataWrapper<Event> getSerieEvents(@Path("seriesId") int seriesId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/events")
    public DataWrapper<Event> getSerieEvents(@Path("seriesId") int seriesId, @QueryMap Map<GetSerieEventsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/stories")
    public DataWrapper<Story> getSerieStories(@Path("seriesId") int seriesId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/series/{seriesId}/stories")
    public DataWrapper<Story> getSerieStories(@Path("seriesId") int seriesId, @QueryMap Map<GetSerieStoriesParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;
}
