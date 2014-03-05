package fr.apir.marvel.api.params.name.creator;

/**
 * Created by Arnaud on 04/03/2014.
 */
public enum GetCreatorComicsParamName {
    FORMAT("format"),
    FORMAT_TYPE("formatType"),
    NO_VARIANTS("noVariants"),
    DATE_DESCRIPTOR("dateDescriptor"),
    DATE_RANGE("dateRange"),
    HAS_DIGITAL_ISSUE("hasDigitalIssue"),
    MODIFIED_SINCE("modifiedSince"),
    CREATORS("creators"),
    CHARACTERS("characters"),
    SERIES("series"),
    EVENTS("events"),
    STORIES("stories"),
    SHARED_APPEARANCES("sharedAppearances"),
    COLLABORATORS("collaborators"),
    ORDER_BY("orderBy"),
    LIMIT("limit"),
    OFFSET("offset");

    private String label;

    private GetCreatorComicsParamName(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
