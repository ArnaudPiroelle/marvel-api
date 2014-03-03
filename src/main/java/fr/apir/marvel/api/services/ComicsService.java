package fr.apir.marvel.api.services;

import fr.apir.marvel.api.objects.*;
import fr.apir.marvel.api.objects.Character;
import fr.apir.marvel.api.objects.ref.DataWrapper;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface ComicsService {

    @GET("/v1/public/comics")
    public DataWrapper<Comic> listComic(@QueryMap Map<String, String> options);

    @GET("/v1/public/comics/{comicId}")
    public DataWrapper<Comic> getComic(@Path("comicId") int comicId);

    @GET("/v1/public/comics/{comicId}/characters")
    public DataWrapper<Character> getComicCharacters(@Path("comicId") int comicId, @QueryMap Map<String, String> options);

    @GET("/v1/public/comics/{comicId}/creators")
    public DataWrapper<Creator> getComicCreators(@Path("comicId") int comicId, @QueryMap Map<String, String> options);

    @GET("/v1/public/comics/{comicId}/events")
    public DataWrapper<Event> getComicEvents(@Path("comicId") int comicId, @QueryMap Map<String, String> options);

    @GET("/v1/public/comics/{comicId}/stories")
    public DataWrapper<Story> getComicStories(@Path("comicId") int comicId, @QueryMap Map<String, String> options);
}
