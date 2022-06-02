package com.lab.Event.Management.company.models;

import com.lab.Event.Management.company.enums.Status;

import javax.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Status status;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    public Guest(int id, String name, Status status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Guest() {

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

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
