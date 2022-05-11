package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "summary")
public class Summary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "ppsummary", nullable = false)
    private String ppsummary;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employeesid", nullable = false)
    private Employee employeesid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPpsummary() {
        return ppsummary;
    }

    public void setPpsummary(String ppsummary) {
        this.ppsummary = ppsummary;
    }

    public Employee getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(Employee employeesid) {
        this.employeesid = employeesid;
    }

}