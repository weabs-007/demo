package com.example.demo;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "taskname", nullable = false)
    private String taskname;

    @Column(name = "progress")
    private Integer progress;

    @Column(name = "deadline")
    private Instant deadline;

    @Column(name = "isapproved", nullable = false)
    private Boolean isapproved = false;

    @Column(name = "isdeclined", nullable = false)
    private Boolean isdeclined = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "statusesid", nullable = false)
    private Status statusesid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_employeesid", nullable = false)
    private Employee authorEmployeesid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewsid")
    private Review reviewsid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Instant getDeadline() {
        return deadline;
    }

    public void setDeadline(Instant deadline) {
        this.deadline = deadline;
    }

    public Boolean getIsapproved() {
        return isapproved;
    }

    public void setIsapproved(Boolean isapproved) {
        this.isapproved = isapproved;
    }

    public Boolean getIsdeclined() {
        return isdeclined;
    }

    public void setIsdeclined(Boolean isdeclined) {
        this.isdeclined = isdeclined;
    }

    public Status getStatusesid() {
        return statusesid;
    }

    public void setStatusesid(Status statusesid) {
        this.statusesid = statusesid;
    }

    public Employee getAuthorEmployeesid() {
        return authorEmployeesid;
    }

    public void setAuthorEmployeesid(Employee authorEmployeesid) {
        this.authorEmployeesid = authorEmployeesid;
    }

    public Review getReviewsid() {
        return reviewsid;
    }

    public void setReviewsid(Review reviewsid) {
        this.reviewsid = reviewsid;
    }

}