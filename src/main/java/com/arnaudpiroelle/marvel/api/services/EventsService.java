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
import com.arnaudpiroelle.marvel.api.params.name.event.*;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface EventsService {

    @GET("/v1/public/events")
    public DataWrapper<Event> listEvent() throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events")
    public DataWrapper<Event> listEvent(@QueryMap Map<ListEventsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}")
    public DataWrapper<Event> getEvent(@Path("eventId") int eventId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/characters")
    public DataWrapper<Character> getEventCharacters(@Path("eventId") int eventId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/characters")
    public DataWrapper<Character> getEventCharacters(@Path("eventId") int eventId, @QueryMap Map<GetEventCharactersParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/comics")
    public DataWrapper<Comic> getEventComics(@Path("eventId") int eventId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/comics")
    public DataWrapper<Comic> getEventComics(@Path("eventId") int eventId, @QueryMap Map<GetEventComicsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/creators")
    public DataWrapper<Creator> getEventCreators(@Path("eventId") int eventId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/creators")
    public DataWrapper<Creator> getEventCreators(@Path("eventId") int eventId, @QueryMap Map<GetEventCreatorsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/series")
    public DataWrapper<Series> getEventSeries(@Path("eventId") int eventId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/series")
    public DataWrapper<Series> getEventSeries(@Path("eventId") int eventId, @QueryMap Map<GetEventSeriesParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/stories")
    public DataWrapper<Story> getEventStories(@Path("eventId") int eventId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/stories")
    public DataWrapper<Story> getEventStories(@Path("eventId") int eventId, @QueryMap Map<GetEventStoriesParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    //Async
    @GET("/v1/public/events")
    public void listEvent(Callback<DataWrapper<Event>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events")
    public void listEvent(@QueryMap Map<ListEventsParamName, String> options, Callback<DataWrapper<Event>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}")
    public void getEvent(@Path("eventId") int eventId, Callback<DataWrapper<Event>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/characters")
    public void getEventCharacters(@Path("eventId") int eventId, Callback<DataWrapper<Character>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/characters")
    public void getEventCharacters(@Path("eventId") int eventId, @QueryMap Map<GetEventCharactersParamName, String> options, Callback<DataWrapper<Character>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/comics")
    public void getEventComics(@Path("eventId") int eventId, Callback<DataWrapper<Comic>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/comics")
    public void getEventComics(@Path("eventId") int eventId, @QueryMap Map<GetEventComicsParamName, String> options, Callback<DataWrapper<Comic>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/creators")
    public void getEventCreators(@Path("eventId") int eventId, Callback<DataWrapper<Creator>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/creators")
    public void getEventCreators(@Path("eventId") int eventId, @QueryMap Map<GetEventCreatorsParamName, String> options, Callback<DataWrapper<Creator>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/series")
    public void getEventSeries(@Path("eventId") int eventId, Callback<DataWrapper<Series>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/series")
    public void getEventSeries(@Path("eventId") int eventId, @QueryMap Map<GetEventSeriesParamName, String> options, Callback<DataWrapper<Series>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/stories")
    public void getEventStories(@Path("eventId") int eventId, Callback<DataWrapper<Story>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/events/{eventId}/stories")
    public void getEventStories(@Path("eventId") int eventId, @QueryMap Map<GetEventStoriesParamName, String> options, Callback<DataWrapper<Story>> callback) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

}
