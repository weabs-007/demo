package com.example.demo;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmployeesProjectId implements Serializable {
    private static final long serialVersionUID = -750416875955985870L;
    @Column(name = "employeesid", nullable = false)
    private Integer employeesid;

    @Column(name = "projectsid", nullable = false)
    private Integer projectsid;

    public Integer getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(Integer employeesid) {
        this.employeesid = employeesid;
    }

    public Integer getProjectsid() {
        return projectsid;
    }

    public void setProjectsid(Integer projectsid) {
        this.projectsid = projectsid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeesProjectId entity = (EmployeesProjectId) o;
        return Objects.equals(this.projectsid, entity.projectsid) &&
                Objects.equals(this.employeesid, entity.employeesid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectsid, employeesid);
    }

}