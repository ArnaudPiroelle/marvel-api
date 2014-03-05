package fr.apir.marvel.api.params.name.serie;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetSerieCharactersParamName {
    NAME("name"),
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    EVENTS("events"),
    STORIES("stories"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetSerieCharactersParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
