package com.stats.StatisticProject.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "person")
    public String person;

    @Column(name = "result")
    public String winOrLose;

    @Column(name = "score")
    public String score;

    @Column(name = "timer")
    public String date;

    public Player() {
    }

    public Player(String person, String winOrLose, String score, String date) {
        this.person = person;
        this.winOrLose = winOrLose;
        this.score = score;
        this.date = date;
    }

    public Player(Long id, String person, String winOrLose, String score, String date) {
        this.id = id;
        this.person = person;
        this.winOrLose = winOrLose;
        this.score = score;
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

    public String getWinOrLose() {
        return winOrLose;
    }

    public void setWinOrLose(String winOrLose) {
        this.winOrLose = winOrLose;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", person='" + person + '\'' +
                ", winOrLose='" + winOrLose + '\'' +
                ", score='" + score + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
