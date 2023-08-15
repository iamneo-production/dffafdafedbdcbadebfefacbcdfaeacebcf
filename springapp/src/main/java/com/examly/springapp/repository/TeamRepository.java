package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    // Custom query methods (if required)
}
