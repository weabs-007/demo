package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "peercollections_employees")
public class PeercollectionsEmployee {
    @EmbeddedId
    private PeercollectionsEmployeeId id;

    @MapsId("peercollectionsid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "peercollectionsid", nullable = false)
    private Peercollection peercollectionsid;

    @MapsId("employeesid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employeesid", nullable = false)
    private Employee employeesid;

    public PeercollectionsEmployeeId getId() {
        return id;
    }

    public void setId(PeercollectionsEmployeeId id) {
        this.id = id;
    }

    public Peercollection getPeercollectionsid() {
        return peercollectionsid;
    }

    public void setPeercollectionsid(Peercollection peercollectionsid) {
        this.peercollectionsid = peercollectionsid;
    }

    public Employee getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(Employee employeesid) {
        this.employeesid = employeesid;
    }

}