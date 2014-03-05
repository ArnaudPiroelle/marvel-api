package fr.apir.marvel.api.params.name.serie;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetSerieStoriesParamName {
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    EVENTS("events"),
    CREATORS("creators"),
    CHARACTERS("characters"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetSerieStoriesParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
