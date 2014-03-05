package fr.apir.marvel.api.params.name.story;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetStoryCreatorsParamName {
    FIRSTNAME("firstname"),
    MIDDLENAME("middlename"),
    LASTNAME("lastname"),
    SUFFIX("suffix"),
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    SERIES("series"),
    EVENTS("events"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetStoryCreatorsParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
