package fr.apir.marvel.api.params.name.event;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetEventSeriesParamName {
    TITLE("title"),
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    STORIES("stories"),
    CREATORS("creators"),
    CHARACTERS("characters"),
    SERIES_TYPE("seriesType"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetEventSeriesParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
