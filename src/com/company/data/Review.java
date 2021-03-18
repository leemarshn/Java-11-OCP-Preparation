package com.company.data;

public class Review  implements Comparable<Review>{
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

    @Override
    public int compareTo(Review other) {
        return other.rating.ordinal() - this.rating.ordinal();
    }
}
