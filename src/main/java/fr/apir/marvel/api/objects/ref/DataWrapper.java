package fr.apir.marvel.api.objects.ref;

/**
 * Created by Arnaud on 03/03/2014.
 */
public class DataWrapper<T extends Data> {

    private int code;
    private String status;
    private DataContainer data;
    private String etag;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataContainer<T> getData() {
        return data;
    }

    public void setData(DataContainer<T> data) {
        this.data = data;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }
}
