package fr.apir.marvel.api.services;

import fr.apir.marvel.api.objects.Character;
import fr.apir.marvel.api.objects.*;
import fr.apir.marvel.api.objects.ref.DataWrapper;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface EventsService {

    @GET("/v1/public/events")
    public DataWrapper<Event> listEvent();

    @GET("/v1/public/events")
    public DataWrapper<Event> listEvent(@QueryMap Map<String, String> options);

    @GET("/v1/public/events/{eventId}")
    public DataWrapper<Event> getEvent(@Path("eventId") int eventId);

    @GET("/v1/public/events/{eventId}/characters")
    public DataWrapper<Character> getEventCharacters(@Path("eventId") int eventId);

    @GET("/v1/public/events/{eventId}/characters")
    public DataWrapper<Character> getEventCharacters(@Path("eventId") int eventId, @QueryMap Map<String, String> options);

    @GET("/v1/public/events/{eventId}/comics")
    public DataWrapper<Comic> getEventComics(@Path("eventId") int eventId);

    @GET("/v1/public/events/{eventId}/comics")
    public DataWrapper<Comic> getEventComics(@Path("eventId") int eventId, @QueryMap Map<String, String> options);

    @GET("/v1/public/events/{eventId}/creators")
    public DataWrapper<Creator> getEventCreators(@Path("eventId") int eventId);

    @GET("/v1/public/events/{eventId}/creators")
    public DataWrapper<Creator> getEventCreators(@Path("eventId") int eventId, @QueryMap Map<String, String> options);

    @GET("/v1/public/events/{eventId}/series")
    public DataWrapper<Series> getEventSeries(@Path("eventId") int eventId);

    @GET("/v1/public/events/{eventId}/series")
    public DataWrapper<Series> getEventSeries(@Path("eventId") int eventId, @QueryMap Map<String, String> options);

    @GET("/v1/public/events/{eventId}/stories")
    public DataWrapper<Story> getEventStories(@Path("eventId") int eventId);

    @GET("/v1/public/events/{eventId}/stories")
    public DataWrapper<Story> getEventStories(@Path("eventId") int eventId, @QueryMap Map<String, String> options);

}
