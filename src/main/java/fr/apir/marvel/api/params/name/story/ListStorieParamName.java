package fr.apir.marvel.api.params.name.story;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum ListStorieParamName {
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    SERIES("series"),
    EVENTS("events"),
    CREATORS("creators"),
    CHARACTERS("characters"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private ListStorieParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
