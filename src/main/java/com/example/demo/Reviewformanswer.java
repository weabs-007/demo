package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "reviewformanswers")
public class Reviewformanswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "questionsid", nullable = false)
    private Question questionsid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "answersid", nullable = false)
    private Answer answersid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employeesid", nullable = false)
    private Employee employeesid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reviewsid", nullable = false)
    private Review reviewsid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewformexamplesid")
    private Reviewformexample reviewformexamplesid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Question getQuestionsid() {
        return questionsid;
    }

    public void setQuestionsid(Question questionsid) {
        this.questionsid = questionsid;
    }

    public Answer getAnswersid() {
        return answersid;
    }

    public void setAnswersid(Answer answersid) {
        this.answersid = answersid;
    }

    public Employee getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(Employee employeesid) {
        this.employeesid = employeesid;
    }

    public Review getReviewsid() {
        return reviewsid;
    }

    public void setReviewsid(Review reviewsid) {
        this.reviewsid = reviewsid;
    }

    public Reviewformexample getReviewformexamplesid() {
        return reviewformexamplesid;
    }

    public void setReviewformexamplesid(Reviewformexample reviewformexamplesid) {
        this.reviewformexamplesid = reviewformexamplesid;
    }

}