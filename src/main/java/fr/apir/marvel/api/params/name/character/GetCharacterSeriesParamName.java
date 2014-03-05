package fr.apir.marvel.api.params.name.character;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetCharacterSeriesParamName {
    TITLE("title"),
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    STORIES("stories"),
    EVENTS("events"),
    CREATORS("creators"),
    SERIES_TYPE("seriesType"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetCharacterSeriesParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
