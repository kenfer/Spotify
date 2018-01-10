package com.example.kenneth.spotify;

/**
 * Created by khent on 12/19/2017.
 */

public class Songs {

    private String title, shortdesc;



    public Songs(String title, String shortdesc) {
        this.title = title;
        this.shortdesc = shortdesc;
    }
    public void setTitle(String title) {

        this.title = title;
    }
    public String getTitle() {

        return title;
    }

    public String getShortdesc() {

        return shortdesc;
    }
}
