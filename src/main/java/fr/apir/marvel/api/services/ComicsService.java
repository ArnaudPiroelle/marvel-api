package fr.apir.marvel.api.services;

import fr.apir.marvel.api.exceptions.AuthorizationException;
import fr.apir.marvel.api.exceptions.EntityNotFoundException;
import fr.apir.marvel.api.exceptions.QueryException;
import fr.apir.marvel.api.exceptions.RateLimitException;
import fr.apir.marvel.api.objects.Character;
import fr.apir.marvel.api.objects.*;
import fr.apir.marvel.api.objects.ref.DataWrapper;
import fr.apir.marvel.api.params.name.comic.*;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface ComicsService {

    @GET("/v1/public/comics")
    public DataWrapper<Comic> listComic() throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics")
    public DataWrapper<Comic> listComic(@QueryMap Map<ListComicParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}")
    public DataWrapper<Comic> getComic(@Path("comicId") int comicId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/characters")
    public DataWrapper<Character> getComicCharacters(@Path("comicId") int comicId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/characters")
    public DataWrapper<Character> getComicCharacters(@Path("comicId") int comicId, @QueryMap Map<GetComicCharactersParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/creators")
    public DataWrapper<Creator> getComicCreators(@Path("comicId") int comicId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/creators")
    public DataWrapper<Creator> getComicCreators(@Path("comicId") int comicId, @QueryMap Map<GetComicCreatorsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/events")
    public DataWrapper<Event> getComicEvents(@Path("comicId") int comicId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/events")
    public DataWrapper<Event> getComicEvents(@Path("comicId") int comicId, @QueryMap Map<GetComicEventsParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/stories")
    public DataWrapper<Story> getComicStories(@Path("comicId") int comicId) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;

    @GET("/v1/public/comics/{comicId}/stories")
    public DataWrapper<Story> getComicStories(@Path("comicId") int comicId, @QueryMap Map<GetComicStoriesParamName, String> options) throws AuthorizationException, QueryException, RateLimitException, EntityNotFoundException;
}
