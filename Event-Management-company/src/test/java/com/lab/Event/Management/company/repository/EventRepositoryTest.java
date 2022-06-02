package com.lab.Event.Management.company.repository;


import com.lab.Event.Management.company.enums.Status;
import com.lab.Event.Management.company.models.Event;
import com.lab.Event.Management.company.models.Guest;
import com.lab.Event.Management.company.repositories.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EventRepositoryTest {

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

        Guest g1 = new Guest("Maik", Status.ATTENDING);
        Guest g2 = new Guest("Maik2", Status.ATTENDING);
        Guest g3 = new Guest("Maik3", Status.NOT_ATTENDING);
        Guest g4 = new Guest("Maik4", Status.NO_RESPONSE);
        Set<Guest> guests = new HashSet<>();
        guests.add(g1);
        guests.add(g2);

        Set<Guest> guests2 = new HashSet<>();
        guests.add(g3);
        guests.add(g4);


        Event e1 = new Event("12-06-2022", 8, "Barcelona", "Super Event", guests);
        Event e2 = new Event("06-08-2022", 10, "Menorca", "Big Event", guests2);

        eventRepository.save(e1);
        eventRepository.save(e2);


        }

        /*@Test
        void testTest(){
        assertEquals(2, eventRepository.findAll().size());
        }

        void testTest2(){
            List<Event> result =  eventRepository.findAll();

            System.out.println(result);



        assertEquals(2, eventRepository.findAll().size());
    }
*/




    }


