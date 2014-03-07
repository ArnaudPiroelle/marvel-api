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
import com.arnaudpiroelle.marvel.api.params.name.story.*;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface StoriesService {

    @GET("/v1/public/stories")
    public DataWrapper<Story> listStory() throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories")
    public DataWrapper<Story> listStory(@QueryMap Map<ListStorieParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}")
    public DataWrapper<Story> getStory(@Path("storyId") int storyId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/characters")
    public DataWrapper<Character> getStoryCharacters(@Path("storyId") int storyId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/characters")
    public DataWrapper<Character> getStoryCharacters(@Path("storyId") int storyId, @QueryMap Map<GetStoryCharactersParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/comics")
    public DataWrapper<Comic> getStoryComics(@Path("storyId") int storyId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/comics")
    public DataWrapper<Comic> getStoryComics(@Path("storyId") int storyId, @QueryMap Map<GetStoryComicsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/creators")
    public DataWrapper<Creator> getStoryCreators(@Path("storyId") int storyId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/creators")
    public DataWrapper<Creator> getStoryCreators(@Path("storyId") int storyId, @QueryMap Map<GetStoryCreatorsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/events")
    public DataWrapper<Event> getStoryEvents(@Path("storyId") int storyId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/events")
    public DataWrapper<Event> getStoryEvents(@Path("storyId") int storyId, @QueryMap Map<GetStoryEventsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/series")
    public DataWrapper<Series> getStorySeries(@Path("storyId") int storyId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/stories/{storyId}/series")
    public DataWrapper<Series> getStorySeries(@Path("storyId") int storyId, @QueryMap Map<GetStorySeriesParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;
}
