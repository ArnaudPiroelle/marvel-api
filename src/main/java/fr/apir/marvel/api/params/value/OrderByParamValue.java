package fr.apir.marvel.api.params.value;

/**
 * Created by Piroelle on 05/03/14.
 */
public enum OrderByParamValue {
    ID_ASC("id"),
    NAME_ASC("name"),
    MODIFIED_ASC("modified"),
    FOC_DATE_ASC("focDate"),
    ONSALE_DATE_ASC("onsaleDate"),
    TITLE_ASC("title"),
    ISSUE_NUMBER_ASC("issueNumber"),
    START_DATE_ASC("startDate"),
    START_YEAR_ASC("startYear"),
    LASTNAME_ASC("lastname"),
    FIRSTNAME_ASC("firstname"),
    MIDDLENAME_ASC("middlename"),
    SUFFIX_ASC("suffix"),

    ID_DESC("-id"),
    NAME_DESC("-name"),
    MODIFIED_DESC("-modified"),
    FOC_DATE_DESC("-focDate"),
    ONSALE_DATE_DESC("-onsaleDate"),
    TITLE_DESC("-title"),
    ISSUE_NUMBER_DESC("-issueNumber"),
    START_DATE_DESC("-startDate"),
    START_YEAR_DESC("-startYear"),
    LASTNAME_DESC("-lastname"),
    FIRSTNAME_DESC("-firstname"),
    MIDDLENAME_DESC("-middlename"),
    SUFFIX_DESC("-suffix"),;

    private String label;

    private OrderByParamValue(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
