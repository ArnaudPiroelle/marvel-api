package fr.apir.marvel.api.objects;

import fr.apir.marvel.api.objects.ref.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by Arnaud on 04/03/2014.
 */
public class Creator extends Data {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String fullName;
    private Date modified;
    private String resourceURI;
    private List<Url> urls;
    private Image thumbnail;
    private SeriesList series;
    private StoryList stories;
    private ComicList comics;
    private EventList events;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public SeriesList getSeries() {
        return series;
    }

    public void setSeries(SeriesList series) {
        this.series = series;
    }

    public StoryList getStories() {
        return stories;
    }

    public void setStories(StoryList stories) {
        this.stories = stories;
    }

    public ComicList getComics() {
        return comics;
    }

    public void setComics(ComicList comics) {
        this.comics = comics;
    }

    public EventList getEvents() {
        return events;
    }

    public void setEvents(EventList events) {
        this.events = events;
    }
}
