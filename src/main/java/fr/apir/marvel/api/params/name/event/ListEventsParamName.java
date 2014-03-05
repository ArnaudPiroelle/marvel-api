package fr.apir.marvel.api.params.name.event;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum ListEventsParamName {
    NAME("name"),
    MODIFIED_SINCE("modifiedSince"),
    CREATORS("creators"),
    CHARACTERS("characters"),
    SERIES("series"),
    COMICS("comics"),
    STORIES("stories"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private ListEventsParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
