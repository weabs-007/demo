package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "reviews_reviewforms")
public class ReviewsReviewform {
    @EmbeddedId
    private ReviewsReviewformId id;

    @MapsId("reviewsid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reviewsid", nullable = false)
    private Review reviewsid;

    @MapsId("reviewformsid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reviewformsid", nullable = false)
    private Reviewform reviewformsid;

    public ReviewsReviewformId getId() {
        return id;
    }

    public void setId(ReviewsReviewformId id) {
        this.id = id;
    }

    public Review getReviewsid() {
        return reviewsid;
    }

    public void setReviewsid(Review reviewsid) {
        this.reviewsid = reviewsid;
    }

    public Reviewform getReviewformsid() {
        return reviewformsid;
    }

    public void setReviewformsid(Reviewform reviewformsid) {
        this.reviewformsid = reviewformsid;
    }

}