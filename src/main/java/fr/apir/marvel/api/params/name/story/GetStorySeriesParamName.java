package fr.apir.marvel.api.params.name.story;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetStorySeriesParamName {
    TITLE("title"),
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    CREATORS("creators"),
    CHARACTERS("characters"),
    EVENTS("events"),
    SERIES_TYPE("seriesType"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetStorySeriesParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
