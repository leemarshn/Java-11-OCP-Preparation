package com.company.data;

public class Review {
    private Rating rating;
    private String Comments;

    public Review(Rating rating, String comments) {
        this.rating = rating;
        Comments = comments;
    }

    public Rating getRating() {
        return rating;
    }

    public String getComments() {
        return Comments;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rating=" + rating +
                ", Comments='" + Comments + '\'' +
                '}';
    }
}
