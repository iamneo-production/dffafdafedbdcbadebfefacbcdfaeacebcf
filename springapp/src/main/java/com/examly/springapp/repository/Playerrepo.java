package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.entity.PlayerDetails;

@Repository
public interface Playerrepo extends JpaRepository<PlayerDetails,Integer>
{
    
}
