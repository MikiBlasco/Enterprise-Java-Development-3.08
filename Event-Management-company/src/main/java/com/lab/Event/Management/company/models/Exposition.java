package com.lab.Event.Management.company.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Exposition extends Event {

    public Exposition( String date, int duration, String location, String title) {
        super(date, duration, location, title);
    }

    public Exposition() {
    }


}
