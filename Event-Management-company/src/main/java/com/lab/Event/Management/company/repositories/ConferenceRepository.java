package com.lab.Event.Management.company.repositories;

import com.lab.Event.Management.company.models.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ConferenceRepository extends JpaRepository<Conference, Integer> {
}
