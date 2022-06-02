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

    public Exposition(int id, Date date, int duration, String location, String title, Set<Guest> guests, int id1) {
        super(id, date, duration, location, title, guests);
    }

    public Exposition() {
    }


}
