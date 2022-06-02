package com.lab.Event.Management.company.repositories;

import com.lab.Event.Management.company.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Integer> {
}
