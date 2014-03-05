package fr.apir.marvel.api.params.name.creator;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetCreatorStoriesParamName {
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    SERIES("series"),
    EVENTS("events"),
    CHARACTERS("characters"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetCreatorStoriesParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
