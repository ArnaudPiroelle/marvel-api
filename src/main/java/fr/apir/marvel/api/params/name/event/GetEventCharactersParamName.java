package fr.apir.marvel.api.params.name.event;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetEventCharactersParamName {
    NAME("name"),
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    SERIES("series"),
    STORIES("stories"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetEventCharactersParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
