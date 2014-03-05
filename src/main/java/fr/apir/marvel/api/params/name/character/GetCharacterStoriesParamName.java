package fr.apir.marvel.api.params.name.character;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetCharacterStoriesParamName {
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    SERIES("series"),
    EVENTS("events"),
    CREATORS("creators"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetCharacterStoriesParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
