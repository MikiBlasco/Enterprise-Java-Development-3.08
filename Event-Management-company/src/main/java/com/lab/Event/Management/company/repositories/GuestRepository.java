package com.lab.Event.Management.company.repositories;

import com.lab.Event.Management.company.models.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {
}
