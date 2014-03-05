package fr.apir.marvel.api.params.name.event;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetEventStoriesParamName {
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    SERIES("series"),
    CREATORS("creators"),
    CHARACTERS("characters"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetEventStoriesParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
