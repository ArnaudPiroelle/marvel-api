package fr.apir.marvel.api.params.name.serie;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetSerieEventsParamName {
    NAME("name"),
    MODIFIED_SINCE("modifiedSince"),
    CREATORS("creators"),
    CHARACTERS("characters"),
    COMICS("comics"),
    STORIES("stories"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetSerieEventsParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
