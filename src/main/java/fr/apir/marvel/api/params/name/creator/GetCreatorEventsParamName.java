package fr.apir.marvel.api.params.name.creator;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetCreatorEventsParamName {
    NAME("name"),
    MODIFIED_SINCE("modifiedSince"),
    CHARACTERS("characters"),
    SERIES("series"),
    COMICS("comics"),
    STORIES("stories"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetCreatorEventsParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
