package com.example.demo;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "commenttext", nullable = false)
    private String commenttext;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employeesid", nullable = false)
    private Employee employeesid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tasksid", nullable = false)
    private Task tasksid;

    @Column(name = "commentdate", nullable = false)
    private Instant commentdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommenttext() {
        return commenttext;
    }

    public void setCommenttext(String commenttext) {
        this.commenttext = commenttext;
    }

    public Employee getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(Employee employeesid) {
        this.employeesid = employeesid;
    }

    public Task getTasksid() {
        return tasksid;
    }

    public void setTasksid(Task tasksid) {
        this.tasksid = tasksid;
    }

    public Instant getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Instant commentdate) {
        this.commentdate = commentdate;
    }

}