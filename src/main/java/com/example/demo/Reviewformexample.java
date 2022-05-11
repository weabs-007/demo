package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "reviewformexamples")
public class Reviewformexample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "exampletext", nullable = false)
    private String exampletext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExampletext() {
        return exampletext;
    }

    public void setExampletext(String exampletext) {
        this.exampletext = exampletext;
    }

}