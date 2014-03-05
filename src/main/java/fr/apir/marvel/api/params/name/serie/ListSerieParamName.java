package fr.apir.marvel.api.params.name.serie;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum ListSerieParamName {
    TITLE("title"),
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    STORIES("stories"),
    SERIES("series"),
    EVENTS("events"),
    CREATORS("creators"),
    CHARACTERS("characters"),
    SERIES_TYPE("seriesType"),
    CONTAINS("contains"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private ListSerieParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
