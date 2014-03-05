package fr.apir.marvel.api.services;

import fr.apir.marvel.api.exceptions.AuthorizationException;
import fr.apir.marvel.api.exceptions.QueryException;
import fr.apir.marvel.api.objects.*;
import fr.apir.marvel.api.objects.ref.DataWrapper;
import fr.apir.marvel.api.params.name.creator.*;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface CreatorsService {

    @GET("/v1/public/creators")
    public DataWrapper<Creator> listCreator() throws AuthorizationException, QueryException;

    @GET("/v1/public/creators")
    public DataWrapper<Creator> listCreator(@QueryMap Map<ListCreatorsParamName, String> options) throws AuthorizationException, QueryException;

    @GET("/v1/public/creators/{creatorId}")
    public DataWrapper<Creator> getCreator(@Path("creatorId") int creatorId) throws AuthorizationException, QueryException;

    @GET("/v1/public/creators/{creatorId}/comics")
    public DataWrapper<Comic> getCreatorComics(@Path("creatorId") int creatorId) throws AuthorizationException, QueryException;

    @GET("/v1/public/creators/{creatorId}/comics")
    public DataWrapper<Comic> getCreatorComics(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorComicsParamName, String> options) throws AuthorizationException, QueryException;

    @GET("/v1/public/creators/{creatorId}/events")
    public DataWrapper<Event> getCreatorEvents(@Path("creatorId") int creatorId) throws AuthorizationException, QueryException;

    @GET("/v1/public/creators/{creatorId}/events")
    public DataWrapper<Event> getCreatorEvents(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorEventsParamName, String> options) throws AuthorizationException, QueryException;

    @GET("/v1/public/creators/{creatorId}/series")
    public DataWrapper<Series> getCreatorSeries(@Path("creatorId") int creatorId) throws AuthorizationException, QueryException;

    @GET("/v1/public/creators/{creatorId}/series")
    public DataWrapper<Series> getCreatorSeries(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorSeriesParamName, String> options) throws AuthorizationException, QueryException;

    @GET("/v1/public/creators/{creatorId}/stories")
    public DataWrapper<Story> getCreatorStories(@Path("creatorId") int creatorId) throws AuthorizationException, QueryException;

    @GET("/v1/public/creators/{creatorId}/stories")
    public DataWrapper<Story> getCreatorStories(@Path("creatorId") int creatorId, @QueryMap Map<GetCreatorStoriesParamName, String> options) throws AuthorizationException, QueryException;
}
