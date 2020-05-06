package com.shar.event.information.repository;

import com.shar.event.information.entity.EventInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventInformationRepository extends JpaRepository<EventInformation, Integer> {}
