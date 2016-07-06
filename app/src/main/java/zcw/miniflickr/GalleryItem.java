package zcw.miniflickr;

import java.io.Serializable;

/**
 * Created by zhuchongwei on 6/15/16.
 */
public class GalleryItem implements Serializable{
    String id;
    String secret;
    String server;
    String farm;

    public GalleryItem(String id, String secret, String server, String farm) {
        this.id = id;
        this.secret = secret;
        this.server = server;
        this.farm = farm;
    }

    public String getId() {
        return this.id;
    }

    public String getUrl() {
        return "http://farm" + farm + ".static.flickr.com/" + server + "/" + id + "_" + secret + ".jpg";
    }
}
