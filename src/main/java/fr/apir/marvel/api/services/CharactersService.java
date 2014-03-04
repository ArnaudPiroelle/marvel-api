package fr.apir.marvel.api.services;

import fr.apir.marvel.api.exceptions.AuthorizationException;
import fr.apir.marvel.api.exceptions.QueryException;
import fr.apir.marvel.api.objects.Character;
import fr.apir.marvel.api.objects.*;
import fr.apir.marvel.api.objects.ref.DataWrapper;
import fr.apir.marvel.api.rest.params.CharacterListCharacterParam;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.util.Map;

/**
 * Created by Arnaud on 03/03/2014.
 */
public interface CharactersService {

    @GET("/v1/public/characters")
    public DataWrapper<Character> listCharacter() throws AuthorizationException, QueryException;

    @GET("/v1/public/characters")
    public DataWrapper<Character> listCharacter(@QueryMap Map<CharacterListCharacterParam, String> options) throws AuthorizationException, QueryException;

    @GET("/v1/public/characters/{characterId}")
    public DataWrapper<Character> getCharacter(@Path("characterId") int characterId) throws AuthorizationException, QueryException;

    @GET("/v1/public/characters/{characterId}/comics")
    public DataWrapper<Comic> getCharacterComics(@Path("characterId") int characterId) throws AuthorizationException, QueryException;

    @GET("/v1/public/characters/{characterId}/comics")
    public DataWrapper<Comic> getCharacterComics(@Path("characterId") int characterId, @QueryMap Map<String, String> options) throws AuthorizationException, QueryException;

    @GET("/v1/public/characters/{characterId}/events")
    public DataWrapper<Event> getCharacterEvents(@Path("characterId") int characterId) throws AuthorizationException, QueryException;

    @GET("/v1/public/characters/{characterId}/events")
    public DataWrapper<Event> getCharacterEvents(@Path("characterId") int characterId, @QueryMap Map<String, String> options) throws AuthorizationException, QueryException;

    @GET("/v1/public/characters/{characterId}/series")
    public DataWrapper<Series> getCharacterSeries(@Path("characterId") int characterId) throws AuthorizationException, QueryException;

    @GET("/v1/public/characters/{characterId}/series")
    public DataWrapper<Series> getCharacterSeries(@Path("characterId") int characterId, @QueryMap Map<String, String> options) throws AuthorizationException, QueryException;

    @GET("/v1/public/characters/{characterId}/stories")
    public DataWrapper<Story> getCharacterStories(@Path("characterId") int characterId) throws AuthorizationException, QueryException;

    @GET("/v1/public/characters/{characterId}/stories")
    public DataWrapper<Story> getCharacterStories(@Path("characterId") int characterId, @QueryMap Map<String, String> options) throws AuthorizationException, QueryException;

}
