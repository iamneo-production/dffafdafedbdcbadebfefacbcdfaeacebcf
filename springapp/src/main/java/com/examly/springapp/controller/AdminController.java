package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.entity.Team;
import com.examly.springapp.service.AdminService;
import com.examly.springapp.service.TeamService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    //private final PlayerService playerService;
    @Autowired
    private TeamService teamService;


@GetMapping("/Welcome")  
public String hello()   
{  
return "Welcome to SpringProject";  
}  

    // @GetMapping("/players")
    // public List<Player> getAllPlayers() {
    //     return playerService.getAllPlayers();
    // }

    // @Autowired
    // public AdminController(AdminService adminService, PlayerService playerService, TeamService teamService) {
    //     this.adminService = adminService;
    //     this.playerService = playerService;
    //     this.teamService = teamService;
    // }

    // @PreAuthorize("hasRole('ADMIN')") // Only users with 'ADMIN' role can access
    // this endpoint
    @PostMapping("/teams")
    public Team createTeam(@RequestBody Team team) {
        return adminService.createTeam(team);
    }

    @GetMapping("/JpaTeams")
    public List<Team> getAllTeamsJPA()
    {
        return adminService.getAllTeamsJPA();
    }

    @GetMapping("/teams")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    // Endpoint to update an existing team
    @PutMapping("/teams/{id}")
    public Team updateTeam(@RequestBody Team updatedTeam, @PathVariable int id) {
        return adminService.updateTeam(updatedTeam, id);
    }

    // Endpoint to delete a team by its ID
    @DeleteMapping("/teams/{teamId}")
    public ResponseEntity<String> deleteTeam(@PathVariable Long teamId) {
        adminService.deleteTeam(teamId);
        return ResponseEntity.ok("Team deleted successfully");
    }

    // // Endpoint to create a new player
    // @PostMapping("/players")
    // public Player createPlayer(@RequestBody Player player) {
    //     return adminService.createPlayer(player);
    // }

    // Endpoint to update an existing player
    // @PutMapping("/players")
    // public Player updatePlayer(@RequestBody Player updatedPlayer) {
    //     return adminService.updatePlayer(updatedPlayer);
    // }

    // // Endpoint to delete a player by its ID
    // @DeleteMapping("/players/{playerId}")
    // public ResponseEntity<String> deletePlayer(@PathVariable Long playerId) {
    //     adminService.deletePlayer(playerId);
    //     return ResponseEntity.ok("Player deleted successfully");
    // }
}
