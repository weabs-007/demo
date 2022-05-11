package com.example.demo;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PeercollectionsEmployeeId implements Serializable {
    private static final long serialVersionUID = -6763556811505141573L;
    @Column(name = "peercollectionsid", nullable = false)
    private Integer peercollectionsid;

    @Column(name = "employeesid", nullable = false)
    private Integer employeesid;

    public Integer getPeercollectionsid() {
        return peercollectionsid;
    }

    public void setPeercollectionsid(Integer peercollectionsid) {
        this.peercollectionsid = peercollectionsid;
    }

    public Integer getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(Integer employeesid) {
        this.employeesid = employeesid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PeercollectionsEmployeeId entity = (PeercollectionsEmployeeId) o;
        return Objects.equals(this.peercollectionsid, entity.peercollectionsid) &&
                Objects.equals(this.employeesid, entity.employeesid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peercollectionsid, employeesid);
    }

}