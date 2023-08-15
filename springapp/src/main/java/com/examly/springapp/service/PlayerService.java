package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.entity.PlayerDetails;
import com.examly.springapp.repository.Playerrepo;

@Service
public class PlayerService {

@Autowired
private Playerrepo repo;

public com.examly.springapp.entity.PlayerDetails addPlayer(com.examly.springapp.entity.PlayerDetails player)
{
    return repo.save(player);
}


public List <PlayerDetails> getallPlayers()
{
    return repo.findAll();
}


public PlayerDetails update(PlayerDetails player,int id){
    return repo.save(player);
 }


public boolean deletePlayer(int id)
{
    try{
        repo.deleteById(id);
        return true;
    }catch(Exception e)
    {
        return false;
    }
}
}