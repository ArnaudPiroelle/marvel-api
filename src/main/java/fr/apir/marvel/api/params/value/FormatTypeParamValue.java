package fr.apir.marvel.api.params.value;

/**
 * Created by Piroelle on 05/03/14.
 */
public enum FormatTypeParamValue {
    COMIC("comic"),
    COLLECTION("collection");

    private String label;

    private FormatTypeParamValue(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
