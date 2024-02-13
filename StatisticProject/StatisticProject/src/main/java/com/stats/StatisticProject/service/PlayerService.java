package com.stats.StatisticProject.service;

import com.stats.StatisticProject.dao.PlayerRepository;
import com.stats.StatisticProject.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    //find
    public List<Player> findAll(){
        return playerRepository.findAll();
    }
    public List<Player> findAllByName(String name){
        return playerRepository.findAllFromName(name);
    }
    public List<Player> findAllByResult(String result){
        return  playerRepository.findAllByResult(result);
    }
    public List<Player> findAllByNameAndResult(String name, String result){
        return playerRepository.findAllByNameAndResult(name, result);
    }
    public Player findById(Long theId){
        return playerRepository.findById(theId);
    }

    //create
    @Transactional
    public void save(Player player){
        playerRepository.addPlayer(player);
    }

    //update
    @Transactional
    public void update(Player player){
        playerRepository.updatePlayer(player);
    }

    //delete
    @Transactional
    public void deleteById(Long theId){
        playerRepository.deletePlayerById(theId);
    }
}














