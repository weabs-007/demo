package com.example.demo;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class JobtitlesReviewformId implements Serializable {
    private static final long serialVersionUID = -3554887750910282130L;
    @Column(name = "jobtitlesid", nullable = false)
    private Integer jobtitlesid;

    @Column(name = "reviewformsid", nullable = false)
    private Integer reviewformsid;

    public Integer getJobtitlesid() {
        return jobtitlesid;
    }

    public void setJobtitlesid(Integer jobtitlesid) {
        this.jobtitlesid = jobtitlesid;
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
        JobtitlesReviewformId entity = (JobtitlesReviewformId) o;
        return Objects.equals(this.reviewformsid, entity.reviewformsid) &&
                Objects.equals(this.jobtitlesid, entity.jobtitlesid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewformsid, jobtitlesid);
    }

}