package com.lab.Event.Management.company.repositories;

import com.lab.Event.Management.company.models.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {
}
