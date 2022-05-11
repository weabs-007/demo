package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "jobtitles_reviewforms")
public class JobtitlesReviewform {
    @EmbeddedId
    private JobtitlesReviewformId id;

    @MapsId("jobtitlesid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "jobtitlesid", nullable = false)
    private Jobtitle jobtitlesid;

    @MapsId("reviewformsid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reviewformsid", nullable = false)
    private Reviewform reviewformsid;

    public JobtitlesReviewformId getId() {
        return id;
    }

    public void setId(JobtitlesReviewformId id) {
        this.id = id;
    }

    public Jobtitle getJobtitlesid() {
        return jobtitlesid;
    }

    public void setJobtitlesid(Jobtitle jobtitlesid) {
        this.jobtitlesid = jobtitlesid;
    }

    public Reviewform getReviewformsid() {
        return reviewformsid;
    }

    public void setReviewformsid(Reviewform reviewformsid) {
        this.reviewformsid = reviewformsid;
    }

}