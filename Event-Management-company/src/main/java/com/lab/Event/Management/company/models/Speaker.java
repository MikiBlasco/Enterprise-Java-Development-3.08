package com.lab.Event.Management.company.models;

import javax.persistence.*;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int presentationDuration;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Conference conference;

    public Speaker(int id, String name, int presentationDuration, Conference conference) {
        this.id = id;
        this.name = name;
        this.presentationDuration = presentationDuration;
        this.conference = conference;
    }

    public Speaker(){

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

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }


    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

}
