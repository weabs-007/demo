package com.example.demo;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "businessunitsid", nullable = false)
    private Businessunit businessunitsid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "jobtitlesid", nullable = false)
    private Jobtitle jobtitlesid;

    @Column(name = "hiredate", nullable = false)
    private Instant hiredate;

    @Column(name = "contractenddate")
    private Instant contractenddate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employmentstatusesid", nullable = false)
    private Employmentstatus employmentstatusesid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "managerid")
    private Employee managerid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "peoplepartnerid")
    private Employee peoplepartnerid;

    @Column(name = "photolink")
    private String photolink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Businessunit getBusinessunitsid() {
        return businessunitsid;
    }

    public void setBusinessunitsid(Businessunit businessunitsid) {
        this.businessunitsid = businessunitsid;
    }

    public Jobtitle getJobtitlesid() {
        return jobtitlesid;
    }

    public void setJobtitlesid(Jobtitle jobtitlesid) {
        this.jobtitlesid = jobtitlesid;
    }

    public Instant getHiredate() {
        return hiredate;
    }

    public void setHiredate(Instant hiredate) {
        this.hiredate = hiredate;
    }

    public Instant getContractenddate() {
        return contractenddate;
    }

    public void setContractenddate(Instant contractenddate) {
        this.contractenddate = contractenddate;
    }

    public Employmentstatus getEmploymentstatusesid() {
        return employmentstatusesid;
    }

    public void setEmploymentstatusesid(Employmentstatus employmentstatusesid) {
        this.employmentstatusesid = employmentstatusesid;
    }

    public Employee getManagerid() {
        return managerid;
    }

    public void setManagerid(Employee managerid) {
        this.managerid = managerid;
    }

    public Employee getPeoplepartnerid() {
        return peoplepartnerid;
    }

    public void setPeoplepartnerid(Employee peoplepartnerid) {
        this.peoplepartnerid = peoplepartnerid;
    }

    public String getPhotolink() {
        return photolink;
    }

    public void setPhotolink(String photolink) {
        this.photolink = photolink;
    }

}