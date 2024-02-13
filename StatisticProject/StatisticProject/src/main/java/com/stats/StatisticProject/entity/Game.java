package com.stats.StatisticProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "person")
    public String person;

    @Column(name = "played_against")
    public String opponent;

    @Column(name = "result")
    public String winOrLose;

    @Column(name = "my_score")
    public int myScore;

    @Column(name = "opponent_score")
    public int opponentScore;

    @Column(name = "timer")
    public String date;

    public Game() {
    }

    public Game(String person, String opponent, String winOrLose, int myScore, int opponentScore, String date) {
        this.person = person;
        this.opponent = opponent;
        this.winOrLose = winOrLose;
        this.myScore = myScore;
        this.opponentScore = opponentScore;
        this.date = date;
    }

    public Game(Long id, String person, String opponent, String winOrLose, int myScore, int opponentScore, String date) {
        this.id = id;
        this.person = person;
        this.opponent = opponent;
        this.winOrLose = winOrLose;
        this.myScore = myScore;
        this.opponentScore = opponentScore;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public String getWinOrLose() {
        return winOrLose;
    }

    public void setWinOrLose(String winOrLose) {
        this.winOrLose = winOrLose;
    }

    public int getMyScore() {
        return myScore;
    }

    public void setMyScore(int myScore) {
        this.myScore = myScore;
    }

    public int getOpponentScore() {
        return opponentScore;
    }

    public void setOpponentScore(int opponentScore) {
        this.opponentScore = opponentScore;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
