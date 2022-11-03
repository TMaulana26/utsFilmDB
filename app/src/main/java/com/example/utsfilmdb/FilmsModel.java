package com.example.utsfilmdb;

public class FilmsModel {

    String rating;
    String title;
    String img;

    public FilmsModel(String rating, String title, String img) {
        this.rating = rating;
        this.title = title;
        this.img = img;
    }

    public FilmsModel() {

    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
