package fr.apir.marvel.api.objects.ref;

import fr.apir.marvel.api.objects.ComicSummary;

import java.util.List;

/**
 * Created by Arnaud on 03/03/2014.
 */
public class ObjectList<T extends Summary> {
    protected int available;
    protected int returned;
    protected String collectionURI;
    protected List<T> items;

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getReturned() {
        return returned;
    }

    public void setReturned(int returned) {
        this.returned = returned;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
