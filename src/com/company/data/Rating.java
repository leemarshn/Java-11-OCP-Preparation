package com.company.data;

public enum Rating {
    NOT_RATED("No Rating"),
    ONE_STAR("*"),
    TWO_STAR("**"),
    THREE_STAR("***"),
    FOUR_STAR("****"),
    FIVE_STAR("*****");

    private String stars;

    Rating(String s) {
        this.stars = s;
    }

    public String getStars() {
        return stars;
    }


    @Override
    public String toString() {
        return  stars;
    }
}
