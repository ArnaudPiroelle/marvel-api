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
import com.arnaudpiroelle.marvel.api.params.name.story.*;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface StoriesAsyncService {

    @GET("/v1/public/stories")
    public void listStory(Callback<DataWrapper<Story>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories")
    public void listStory(@QueryMap Map<ListStorieParamName, String> options, Callback<DataWrapper<Story>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}")
    public void getStory(@Path("storyId") int storyId, Callback<DataWrapper<Story>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/characters")
    public void getStoryCharacters(@Path("storyId") int storyId, Callback<DataWrapper<Character>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/characters")
    public void getStoryCharacters(@Path("storyId") int storyId, @QueryMap Map<GetStoryCharactersParamName, String> options, Callback<DataWrapper<Character>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/comics")
    public void getStoryComics(@Path("storyId") int storyId, Callback<DataWrapper<Comic>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/comics")
    public void getStoryComics(@Path("storyId") int storyId, @QueryMap Map<GetStoryComicsParamName, String> options, Callback<DataWrapper<Comic>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/creators")
    public void getStoryCreators(@Path("storyId") int storyId, Callback<DataWrapper<Creator>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/creators")
    public void getStoryCreators(@Path("storyId") int storyId, @QueryMap Map<GetStoryCreatorsParamName, String> options, Callback<DataWrapper<Creator>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/events")
    public void getStoryEvents(@Path("storyId") int storyId, Callback<DataWrapper<Event>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/events")
    public void getStoryEvents(@Path("storyId") int storyId, @QueryMap Map<GetStoryEventsParamName, String> options, Callback<DataWrapper<Event>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/series")
    public void getStorySeries(@Path("storyId") int storyId, Callback<DataWrapper<Series>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/series")
    public void getStorySeries(@Path("storyId") int storyId, @QueryMap Map<GetStorySeriesParamName, String> options, Callback<DataWrapper<Series>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;
}
