package fr.apir.marvel.api.services;

import fr.apir.marvel.api.objects.Character;
import fr.apir.marvel.api.objects.*;
import fr.apir.marvel.api.objects.ref.DataWrapper;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface SeriesService {

    @GET("/v1/public/series")
    public DataWrapper<Series> listSerie(@Query("apikey") String apiKey, @QueryMap Map<String, String> options);

    @GET("/v1/public/series/{seriesId}")
    public DataWrapper<Series> getSerie(@Query("apikey") String apiKey, @Path("seriesId") int seriesId);

    @GET("/v1/public/series/{seriesId}/characters")
    public DataWrapper<Character> getSerieCharacters(@Query("apikey") String apiKey, @Path("seriesId") int seriesId, @QueryMap Map<String, String> options);

    @GET("/v1/public/series/{seriesId}/comics")
    public DataWrapper<Comic> getSerieComics(@Query("apikey") String apiKey, @Path("seriesId") int seriesId, @QueryMap Map<String, String> options);

    @GET("/v1/public/series/{seriesId}/creators")
    public DataWrapper<Creator> getSerieCreators(@Query("apikey") String apiKey, @Path("seriesId") int seriesId, @QueryMap Map<String, String> options);

    @GET("/v1/public/series/{seriesId}/events")
    public DataWrapper<Event> getSerieEvents(@Query("apikey") String apiKey, @Path("seriesId") int seriesId, @QueryMap Map<String, String> options);

    @GET("/v1/public/series/{seriesId}/stories")
    public DataWrapper<Story> getSerieStories(@Query("apikey") String apiKey, @Path("seriesId") int seriesId, @QueryMap Map<String, String> options);
}
