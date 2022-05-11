package com.example.demo;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "planneddate")
    private Instant planneddate;

    @Column(name = "ispeerschosen", nullable = false)
    private Boolean ispeerschosen = false;

    @Column(name = "isapproved", nullable = false)
    private Boolean isapproved = false;

    @Column(name = "isdeclined", nullable = false)
    private Boolean isdeclined = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "statusesid", nullable = false)
    private Status statusesid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reviewtypesid", nullable = false)
    private Reviewtype reviewtypesid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employeesid", nullable = false)
    private Employee employeesid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "managerfeedbacksid")
    private Managerfeedback managerfeedbacksid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "summaryid")
    private Summary summaryid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "peercollectionsid", nullable = false)
    private Peercollection peercollectionsid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getPlanneddate() {
        return planneddate;
    }

    public void setPlanneddate(Instant planneddate) {
        this.planneddate = planneddate;
    }

    public Boolean getIspeerschosen() {
        return ispeerschosen;
    }

    public void setIspeerschosen(Boolean ispeerschosen) {
        this.ispeerschosen = ispeerschosen;
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

    public Reviewtype getReviewtypesid() {
        return reviewtypesid;
    }

    public void setReviewtypesid(Reviewtype reviewtypesid) {
        this.reviewtypesid = reviewtypesid;
    }

    public Employee getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(Employee employeesid) {
        this.employeesid = employeesid;
    }

    public Managerfeedback getManagerfeedbacksid() {
        return managerfeedbacksid;
    }

    public void setManagerfeedbacksid(Managerfeedback managerfeedbacksid) {
        this.managerfeedbacksid = managerfeedbacksid;
    }

    public Summary getSummaryid() {
        return summaryid;
    }

    public void setSummaryid(Summary summaryid) {
        this.summaryid = summaryid;
    }

    public Peercollection getPeercollectionsid() {
        return peercollectionsid;
    }

    public void setPeercollectionsid(Peercollection peercollectionsid) {
        this.peercollectionsid = peercollectionsid;
    }

}