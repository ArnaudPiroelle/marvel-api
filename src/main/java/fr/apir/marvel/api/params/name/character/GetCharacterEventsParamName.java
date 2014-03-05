package fr.apir.marvel.api.params.name.character;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetCharacterEventsParamName {
    NAME("name"),
    MODIFIED_SINCE("modifiedSince"),
    CREATORS("creators"),
    SERIES("series"),
    COMICS("comics"),
    STORIES("stories"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetCharacterEventsParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
