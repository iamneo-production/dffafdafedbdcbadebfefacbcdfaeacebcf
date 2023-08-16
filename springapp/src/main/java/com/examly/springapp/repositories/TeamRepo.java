package com.examly.springapp.repositories;

import com.examly.springapp.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends JpaRepository<Teams, Long> {
    // Custom query methods (if required)
}

