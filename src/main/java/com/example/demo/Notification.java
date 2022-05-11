package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "to_employeesid", nullable = false)
    private Employee toEmployeesid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "notificationsubjectsid", nullable = false)
    private Notificationsubject notificationsubjectsid;

    @Column(name = "isread", nullable = false)
    private Boolean isread = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getToEmployeesid() {
        return toEmployeesid;
    }

    public void setToEmployeesid(Employee toEmployeesid) {
        this.toEmployeesid = toEmployeesid;
    }

    public Notificationsubject getNotificationsubjectsid() {
        return notificationsubjectsid;
    }

    public void setNotificationsubjectsid(Notificationsubject notificationsubjectsid) {
        this.notificationsubjectsid = notificationsubjectsid;
    }

    public Boolean getIsread() {
        return isread;
    }

    public void setIsread(Boolean isread) {
        this.isread = isread;
    }

}