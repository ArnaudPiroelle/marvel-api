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
import com.arnaudpiroelle.marvel.api.objects.*;
import com.arnaudpiroelle.marvel.api.objects.ref.DataWrapper;
import com.arnaudpiroelle.marvel.api.params.name.creator.*;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface CreatorsAsyncService {

    @GET("/v1/public/creators")
    public void listCreator(Callback<DataWrapper<Creator>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators")
    public void listCreator(@QueryMap Map<ListCreatorsParamName, String> options, Callback<DataWrapper<Creator>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}")
    public void getCreator(@Path("creatorId") int creatorId, Callback<DataWrapper<Creator>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/comics")
    public void getCreatorComics(@Path("creatorId") int creatorId, Callback<DataWrapper<Comic>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/comics")
    public void getCreatorComics(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorComicsParamName, String> options, Callback<DataWrapper<Comic>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/events")
    public void getCreatorEvents(@Path("creatorId") int creatorId, Callback<DataWrapper<Event>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/events")
    public void getCreatorEvents(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorEventsParamName, String> options, Callback<DataWrapper<Event>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/series")
    public void getCreatorSeries(@Path("creatorId") int creatorId, Callback<DataWrapper<Series>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/series")
    public void getCreatorSeries(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorSeriesParamName, String> options, Callback<DataWrapper<Series>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/stories")
    public void getCreatorStories(@Path("creatorId") int creatorId, Callback<DataWrapper<Story>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/creators/{creatorId}/stories")
    public void getCreatorStories(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorStoriesParamName, String> options, Callback<DataWrapper<Story>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;
}
