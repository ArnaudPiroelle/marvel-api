package fr.apir.marvel.api.services;

import fr.apir.marvel.api.objects.*;
import fr.apir.marvel.api.objects.ref.DataWrapper;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface CreatorsService {

    @GET("/v1/public/creators")
    public DataWrapper<Creator> listCreator();

    @GET("/v1/public/creators")
    public DataWrapper<Creator> listCreator(@QueryMap Map<String, String> options);

    @GET("/v1/public/creators/{creatorId}")
    public DataWrapper<Creator> getCreator(@Path("creatorId") int creatorId);

    @GET("/v1/public/creators/{creatorId}/comics")
    public DataWrapper<Comic> getCreatorComics(@Path("creatorId") int creatorId);

    @GET("/v1/public/creators/{creatorId}/comics")
    public DataWrapper<Comic> getCreatorComics(@Path("creatorId") int creatorId, @QueryMap Map<String, String> options);

    @GET("/v1/public/creators/{creatorId}/events")
    public DataWrapper<Event> getCreatorEvents(@Path("creatorId") int creatorId);

    @GET("/v1/public/creators/{creatorId}/events")
    public DataWrapper<Event> getCreatorEvents(@Path("creatorId") int creatorId, @QueryMap Map<String, String> options);

    @GET("/v1/public/creators/{creatorId}/series")
    public DataWrapper<Series> getCreatorSeries(@Path("creatorId") int creatorId);

    @GET("/v1/public/creators/{creatorId}/series")
    public DataWrapper<Series> getCreatorSeries(@Path("creatorId") int creatorId, @QueryMap Map<String, String> options);

    @GET("/v1/public/creators/{creatorId}/stories")
    public DataWrapper<Story> getCreatorStories(@Path("creatorId") int creatorId);

    @GET("/v1/public/creators/{creatorId}/stories")
    public DataWrapper<Story> getCreatorStories(@Path("creatorId") int creatorId, @QueryMap Map<String, String> options);
}
