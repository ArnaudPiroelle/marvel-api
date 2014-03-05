package fr.apir.marvel.api.params.value;

/**
 * Created by Piroelle on 05/03/14.
 */
public enum ContainstParamValue {
    COMIC("comic"),
    MAGAZINE("magazine"),
    TRADE_PAPERBACK("trade paperback"),
    HARDCOVER("hardcover"),
    DIGEST("digest"),
    GRAPHIC_NOVEL("graphic novel"),
    DIGITAL_COMIC("digital comic"),
    INFINITE_COMIC("infinite comic");

    private String label;

    private ContainstParamValue(String value) {
        this.label = value;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
