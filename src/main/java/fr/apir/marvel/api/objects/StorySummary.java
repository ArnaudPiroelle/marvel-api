package fr.apir.marvel.api.objects;

import fr.apir.marvel.api.objects.ref.Summary;

/**
 * Created by Arnaud on 03/03/2014.
 */
public class StorySummary extends Summary{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
