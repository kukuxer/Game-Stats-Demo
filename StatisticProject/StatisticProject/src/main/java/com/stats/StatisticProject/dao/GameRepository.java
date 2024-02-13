package com.stats.StatisticProject.dao;

import com.stats.StatisticProject.entity.Game;

import java.util.List;

public interface GameRepository {

    //find
    List<Game> findAll();
    Game findById(Long theId);
    List<Game> findAllFromName(String name);
    List<Game> findAllByResult(String result);
    List<Game> findAllByNameAndResult(String name, String result);

    //create
    void addPlayer(Game game);

    //update
    void updatePlayer(Game game);

    //delete
    void deletePlayerById(Long theId);
}
