package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "employmentstatuses")
public class Employmentstatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "empstatusname", nullable = false)
    private String empstatusname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpstatusname() {
        return empstatusname;
    }

    public void setEmpstatusname(String empstatusname) {
        this.empstatusname = empstatusname;
    }

}