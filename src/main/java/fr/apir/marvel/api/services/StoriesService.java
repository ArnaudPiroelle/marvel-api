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
public interface StoriesService {

    @GET("/v1/public/stories")
    public DataWrapper<Story> listStory(@QueryMap Map<String, String> options);

    @GET("/v1/public/stories/{storyId}")
    public DataWrapper<Story> getStory(@Path("storyId") int storyId);

    @GET("/v1/public/stories/{storyId}/characters")
    public DataWrapper<Character> getStoryCharacters(@Path("storyId") int storyId, @QueryMap Map<String, String> options);

    @GET("/v1/public/stories/{storyId}/comics")
    public DataWrapper<Comic> getStoryComics(@Path("storyId") int storyId, @QueryMap Map<String, String> options);

    @GET("/v1/public/stories/{storyId}/creators")
    public DataWrapper<Creator> getStoryCreators(@Path("storyId") int storyId, @QueryMap Map<String, String> options);

    @GET("/v1/public/stories/{storyId}/events")
    public DataWrapper<Event> getStoryEvents(@Path("storyId") int storyId, @QueryMap Map<String, String> options);

    @GET("/v1/public/stories/{storyId}/series")
    public DataWrapper<Series> getStorySeries(@Path("storyId") int storyId, @QueryMap Map<String, String> options);
}
