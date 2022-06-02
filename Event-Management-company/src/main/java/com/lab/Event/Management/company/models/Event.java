package com.lab.Event.Management.company.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;
    private int duration;
    private String location;
    private String title;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "event")
    private Set<Guest> guests;

    public Event(String date, int duration, String location, String title, Set<Guest> guests) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guests = guests;
    }

    public Event() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Guest> getGuests() {
        return guests;
    }

    public void setGuests(Set<Guest> guests) {
        this.guests = guests;
    }
}
