package com.example.demo;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReviewsReviewformId implements Serializable {
    private static final long serialVersionUID = -9002625358837354924L;
    @Column(name = "reviewsid", nullable = false)
    private Integer reviewsid;

    @Column(name = "reviewformsid", nullable = false)
    private Integer reviewformsid;

    public Integer getReviewsid() {
        return reviewsid;
    }

    public void setReviewsid(Integer reviewsid) {
        this.reviewsid = reviewsid;
    }

    public Integer getReviewformsid() {
        return reviewformsid;
    }

    public void setReviewformsid(Integer reviewformsid) {
        this.reviewformsid = reviewformsid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReviewsReviewformId entity = (ReviewsReviewformId) o;
        return Objects.equals(this.reviewformsid, entity.reviewformsid) &&
                Objects.equals(this.reviewsid, entity.reviewsid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewformsid, reviewsid);
    }

}