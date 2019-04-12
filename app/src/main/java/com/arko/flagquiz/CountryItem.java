package com.arko.flagquiz;

public class CountryItem {
    String name;
    int image;

    public CountryItem(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
