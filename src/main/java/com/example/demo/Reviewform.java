package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "reviewforms")
public class Reviewform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "reviewformname", nullable = false)
    private String reviewformname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReviewformname() {
        return reviewformname;
    }

    public void setReviewformname(String reviewformname) {
        this.reviewformname = reviewformname;
    }

}