package fr.apir.marvel.api.objects;

import fr.apir.marvel.api.objects.ref.Summary;

/**
 * Created by Arnaud on 03/03/2014.
 */
public class CharacterSummary extends Summary {
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
