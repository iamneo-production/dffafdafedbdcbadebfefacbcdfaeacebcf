package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.examly.springapp.entity.Team;

@Service
public class TeamService {
    private List<Team> teams;

    public TeamService() {
        // Initialize with some hardcoded teams for demonstration purposes
        teams = new ArrayList<>();
        teams.add(new Team(1L, "Team A", 100000));
        teams.add(new Team(2L, "Team B", 90000));
        teams.add(new Team(3L, "Team C", 80000));
    }

    public List<Team> getAllTeams() {
        return teams;
    }
}
