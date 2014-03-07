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
import fr.apir.marvel.api.objects.*;
import fr.apir.marvel.api.objects.ref.DataWrapper;
import fr.apir.marvel.api.params.name.creator.*;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface CreatorsService {

    @GET("/v1/public/creators")
    public DataWrapper<Creator> listCreator() throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators")
    public DataWrapper<Creator> listCreator(@QueryMap Map<ListCreatorsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}")
    public DataWrapper<Creator> getCreator(@Path("creatorId") int creatorId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/comics")
    public DataWrapper<Comic> getCreatorComics(@Path("creatorId") int creatorId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/comics")
    public DataWrapper<Comic> getCreatorComics(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorComicsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/events")
    public DataWrapper<Event> getCreatorEvents(@Path("creatorId") int creatorId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/events")
    public DataWrapper<Event> getCreatorEvents(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorEventsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/series")
    public DataWrapper<Series> getCreatorSeries(@Path("creatorId") int creatorId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/series")
    public DataWrapper<Series> getCreatorSeries(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorSeriesParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/stories")
    public DataWrapper<Story> getCreatorStories(@Path("creatorId") int creatorId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/stories")
    public DataWrapper<Story> getCreatorStories(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorStoriesParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;
}
