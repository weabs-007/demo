package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "questionname", nullable = false)
    private String questionname;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reviewformsid", nullable = false)
    private Reviewform reviewformsid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionname() {
        return questionname;
    }

    public void setQuestionname(String questionname) {
        this.questionname = questionname;
    }

    public Reviewform getReviewformsid() {
        return reviewformsid;
    }

    public void setReviewformsid(Reviewform reviewformsid) {
        this.reviewformsid = reviewformsid;
    }

}