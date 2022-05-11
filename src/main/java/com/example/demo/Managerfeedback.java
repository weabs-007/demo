package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "managerfeedbacks")
public class Managerfeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "feedbacktext", nullable = false)
    private String feedbacktext;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employeesid", nullable = false)
    private Employee employeesid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeedbacktext() {
        return feedbacktext;
    }

    public void setFeedbacktext(String feedbacktext) {
        this.feedbacktext = feedbacktext;
    }

    public Employee getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(Employee employeesid) {
        this.employeesid = employeesid;
    }

}