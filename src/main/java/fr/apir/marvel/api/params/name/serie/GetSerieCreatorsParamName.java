package fr.apir.marvel.api.params.name.serie;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetSerieCreatorsParamName {
    FIRSTNAME("firstname"),
    MIDDLENAME("middlename"),
    LASTNAME("lastname"),
    SUFFIX("suffix"),
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    EVENTS("events"),
    STORIES("stories"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetSerieCreatorsParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
