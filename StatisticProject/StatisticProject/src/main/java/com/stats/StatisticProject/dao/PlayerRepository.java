package com.stats.StatisticProject.dao;

import com.stats.StatisticProject.entity.Player;

import java.util.List;

public interface PlayerRepository {

    //find
    List<Player> findAll();
    Player findById(Long theId);
    List<Player> findAllFromName(String name);
    List<Player> findAllByResult(String result);
    List<Player> findAllByNameAndResult(String name, String result);

    //create
    void addPlayer(Player player);

    //update
    void updatePlayer(Player player);

    //delete
    void deletePlayerById(Long theId);
}
