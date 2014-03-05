package fr.apir.marvel.api.params.name.comic;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetComicStoriesParamName {
    MODIFIED_SINCE("modifiedSince"),
    SERIES("series"),
    EVENTS("events"),
    CREATORS("creators"),
    CHARACTERS("characters"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetComicStoriesParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
