package com.stats.StatisticProject.dao;

import com.stats.StatisticProject.entity.Player;
import com.stats.StatisticProject.service.PlayerService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerRepositoryImpl implements PlayerRepository{

    private EntityManager entityManager;

    @Autowired
    public PlayerRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Player> findAll() {

        TypedQuery<Player> theQuery = entityManager.createQuery("FROM Player", Player.class);

        List<Player> players = theQuery.getResultList();

        return players;
    }

    @Override
    public Player findById(Long theId) {
        return entityManager.find(Player.class, theId);
    }

    @Override
    public List<Player> findAllFromName(String name) {

        TypedQuery<Player> query = entityManager.createQuery(
                "FROM Player WHERE person = :name", Player.class);
        query.setParameter("name", name);

        return query.getResultList();
    }

    @Override
    public List<Player> findAllByResult(String result) {

        TypedQuery<Player> query = entityManager.createQuery(
                "FROM Player WHERE winOrLose = :result", Player.class);
        query.setParameter("result", result);

        return query.getResultList();
    }

    @Override
    public List<Player> findAllByNameAndResult(String name, String result) {

        TypedQuery<Player> query = entityManager.createQuery(
                "FROM Player WHERE winOrLose = :result AND person = :name", Player.class);
        query.setParameter("result", result);
        query.setParameter("name", name);

        return query.getResultList();
    }

    @Override
    public void addPlayer(Player player) {
        entityManager.persist(player);
    }

    @Override
    public void updatePlayer(Player player) {
        entityManager.merge(player);
    }

    @Override
    public void deletePlayerById(Long theId) {

        Player player = entityManager.find(Player.class, theId);

        entityManager.remove(player);
    }
}
