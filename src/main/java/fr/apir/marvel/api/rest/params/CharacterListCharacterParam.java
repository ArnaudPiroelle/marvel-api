package fr.apir.marvel.api.rest.params;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum CharacterListCharacterParam {
    NAME("name"),
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    SERIES("series"),
    EVENTS("events"),
    STORIES("stories"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private CharacterListCharacterParam(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
