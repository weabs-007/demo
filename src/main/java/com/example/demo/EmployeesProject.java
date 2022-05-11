package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "employees_projects")
public class EmployeesProject {
    @EmbeddedId
    private EmployeesProjectId id;

    @MapsId("employeesid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employeesid", nullable = false)
    private Employee employeesid;

    @MapsId("projectsid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "projectsid", nullable = false)
    private Project projectsid;

    public EmployeesProjectId getId() {
        return id;
    }

    public void setId(EmployeesProjectId id) {
        this.id = id;
    }

    public Employee getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(Employee employeesid) {
        this.employeesid = employeesid;
    }

    public Project getProjectsid() {
        return projectsid;
    }

    public void setProjectsid(Project projectsid) {
        this.projectsid = projectsid;
    }

}