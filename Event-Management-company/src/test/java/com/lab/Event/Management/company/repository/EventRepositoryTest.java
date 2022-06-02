package com.lab.Event.Management.company.repository;


import com.lab.Event.Management.company.enums.Status;
import com.lab.Event.Management.company.models.*;
import com.lab.Event.Management.company.repositories.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

  @SpringBootTest
 public class EventRepositoryTest{

    @Autowired
    GuestRepository guestRepository;
    @Autowired
    EventRepository eventRepository;
    @Autowired
    ConferenceRepository conferenceRepository;
    @Autowired
    ExpositionRepository expositionRepository;
    @Autowired
    SpeakerRepository speakerRepository;


       // public Event(int id, Date date, int duration, String location, String title, Set<Guest> guests)


    @BeforeEach

    void init() {

        Event e1 = new Event("12-06-2022", 8, "Barcelona", "Super Event");
        Event e2 = new Event("06-08-2022", 10, "Menorca", "Big Event");

        Guest g1 = new Guest("Maik", Status.ATTENDING, e1);
        Guest g2 = new Guest("Maik2", Status.ATTENDING, e1);
        Guest g3 = new Guest("Maik3", Status.NOT_ATTENDING, e2);
        Guest g4 = new Guest("Maik4", Status.NO_RESPONSE, e2);


        Set<Guest> guests = new HashSet<>();
        guests.add(g1);
        guests.add(g2);

        Set<Guest> guests2 = new HashSet<>();
        guests.add(g3);
        guests.add(g4);

        e1.setGuests(guests);
        e2.setGuests(guests2);

        Exposition ex1 = new Exposition("04-08-2022", 20, "Ibiza", "Big Expo");
        Exposition ex2 = new Exposition("02-08-2026", 30, "Berlin", "Nice Expo");

        ex1.setGuests(guests);
        ex2.setGuests(guests2);

        Set<Speaker> speakers = new HashSet<>();

        Conference c1 = new Conference("05-10-2022", 10, "Madrid", "Super Conference", speakers);
        Conference c2 = new Conference("05-10-2022", 115, "Boston", "Conference Nice", speakers);

        c1.setGuests(guests);
        c2.setGuests(guests2);

        Speaker s1 = new Speaker("Conference1", 8, c1);
        Speaker s2 = new Speaker("Conference2", 20, c2);

        speakers.add(s1);
        speakers.add(s2);

        eventRepository.save(e1);
        eventRepository.save(e2);

        conferenceRepository.save(c1);
        conferenceRepository.save(c2);

        expositionRepository.save(ex1);
        expositionRepository.save(ex2);

        speakerRepository.save(s1);
        speakerRepository.save(s2);

        guestRepository.save(g1);
        guestRepository.save(g2);
        guestRepository.save(g3);
        guestRepository.save(g4);


        }

        @Test
        void eventsCreation(){

            assertEquals(6, eventRepository.findAll().size());
        }


    }


