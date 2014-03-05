package fr.apir.marvel.api.params.value;

/**
 * Created by Piroelle on 05/03/14.
 */
public enum DateDescriptorParamValue {
    LAST_WEEK("lastWeek"),
    THIS_WEEK("thisWeek"),
    NEXT_WEEK("nextWeek"),
    THIS_MONTH("thisMonth");

    private String label;

    private DateDescriptorParamValue(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
