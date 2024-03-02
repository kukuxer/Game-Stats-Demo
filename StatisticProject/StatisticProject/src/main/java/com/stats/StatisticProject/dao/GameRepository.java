package com.stats.StatisticProject.dao;

import com.stats.StatisticProject.entity.Game;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository {

    //find
    List<Game> findAll();
    Game findById(Long theId);
    List<Game> findAllFromName(String name);
    List<Game> findAllByResult(String result);
    List<Game> findAllByNameAndResult(String name, String result);
    List<Game> findByDate(String date);
    List<Game> findByDateBetween(String startDate, String endDate);
    List<Game> findAllByNameByDateBetween(String name, String startDate, String endDate);
    List<Game> findAllByResultByDateBetween(String result, String startDate, String endDate);
    List<Game> findAllByNameAndResultByDateBetween(String name, String result, String startDate, String endDate);
    List<Game> findAllBetweenPlayers(String name, String opponent);
    List<Game> findAllBetweenPlayersByResult(String name, String opponent, String result);
    List<Game> findAllBetweenPlayersByDateBetween(String name, String opponent, String startDate, String endDate);
    List<Game> findAllBetweenPlayersByResultByDateBetween(String name, String opponent, String result, String startDate, String endDate);
    //create
    void addPlayer(Game game);

    //update
    void updatePlayer(Game game);

    //delete
    void deletePlayerById(Long theId);
}
