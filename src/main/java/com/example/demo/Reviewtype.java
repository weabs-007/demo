package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "reviewtypes")
public class Reviewtype {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "reviewtypename", nullable = false)
    private String reviewtypename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReviewtypename() {
        return reviewtypename;
    }

    public void setReviewtypename(String reviewtypename) {
        this.reviewtypename = reviewtypename;
    }

}