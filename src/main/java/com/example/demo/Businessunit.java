package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "businessunits")
public class Businessunit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "buname", nullable = false)
    private Integer buname;

    @Column(name = "bumid", nullable = false)
    private Integer bumid;

    @Column(name = "ppid", nullable = false)
    private Integer ppid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuname() {
        return buname;
    }

    public void setBuname(Integer buname) {
        this.buname = buname;
    }

    public Integer getBumid() {
        return bumid;
    }

    public void setBumid(Integer bumid) {
        this.bumid = bumid;
    }

    public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

}