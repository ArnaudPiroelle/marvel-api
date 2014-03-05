package fr.apir.marvel.api.params.name.comic;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetComicCreatorsParamName {
    FIRSTNAME("firstname"),
    MIDDLENAME("middlename"),
    LASTNAME("lastname"),
    SUFFIX("suffix"),
    MODIFIED_SINCE("modifiedSince"),
    COMICS("comics"),
    SERIES("series"),
    STORIES("stories"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetComicCreatorsParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
