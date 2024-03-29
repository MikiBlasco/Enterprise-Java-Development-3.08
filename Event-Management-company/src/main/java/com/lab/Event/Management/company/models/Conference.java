package com.lab.Event.Management.company.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Conference extends Event {
    @OneToMany(fetch = FetchType.EAGER,  mappedBy = "conference")
    private Set<Speaker> speakers;

    public Conference(String date, int duration, String location, String title, Set<Speaker> speakers) {
        super(date, duration, location, title);
        this.speakers = speakers;
    }

    public Conference() {

    }


    public Set<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Set<Speaker> speakers) {
        this.speakers = speakers;
    }
}
