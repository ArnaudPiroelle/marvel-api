package fr.apir.marvel.api.objects;

import java.util.Date;

/**
 * Created by Arnaud on 03/03/2014.
 */
public class ComicDate {
    private String type;
    private Date date;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
