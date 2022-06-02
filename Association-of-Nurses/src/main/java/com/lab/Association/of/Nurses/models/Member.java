package com.lab.Association.of.Nurses.models;

import javax.persistence.*;
import java.util.Date;

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne
    @JoinColumn(name = "invoice_id")
    private Integer id;
    private String name;
    private Status status;
    private Date renewalDate;

    public Member(){

    }

    public Member(int id, String name, Status status, Date renewalDate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }
}
