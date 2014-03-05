package fr.apir.marvel.api.params.value;

/**
 * Created by Piroelle on 05/03/14.
 */
public enum HasDigitalIssueParamValue {
    FALSE("false"),
    TRUE("true");

    private String label;

    private HasDigitalIssueParamValue(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
