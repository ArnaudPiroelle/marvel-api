package fr.apir.marvel.api.params.value;

/**
 * Created by Piroelle on 05/03/14.
 */
public enum NoVariantsParamValue {
    FALSE("false"),
    TRUE("true");

    private String label;

    private NoVariantsParamValue(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
