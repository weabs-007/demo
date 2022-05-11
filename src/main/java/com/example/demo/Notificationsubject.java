package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "notificationsubjects")
public class Notificationsubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "notificationname", nullable = false)
    private String notificationname;

    @Column(name = "notificationtext", nullable = false)
    private String notificationtext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotificationname() {
        return notificationname;
    }

    public void setNotificationname(String notificationname) {
        this.notificationname = notificationname;
    }

    public String getNotificationtext() {
        return notificationtext;
    }

    public void setNotificationtext(String notificationtext) {
        this.notificationtext = notificationtext;
    }

}