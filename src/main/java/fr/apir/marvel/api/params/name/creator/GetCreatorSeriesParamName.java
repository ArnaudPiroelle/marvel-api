package fr.apir.marvel.api.params.name.creator;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetCreatorSeriesParamName {
    TITLE("title"),
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    STORIES("stories"),
    EVENTS("events"),
    CHARACTERS("characters"),
    SERIES_TYPE("seriesType"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetCreatorSeriesParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
