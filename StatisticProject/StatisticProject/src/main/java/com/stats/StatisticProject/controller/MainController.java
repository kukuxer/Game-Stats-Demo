package com.stats.StatisticProject.controller;

import com.stats.StatisticProject.entity.Player;
import com.stats.StatisticProject.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class MainController {

    private PlayerService playerService;

    @Autowired
    public MainController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/home")
    public String home(Model model){
        return "home-page";
    }

    @PostMapping("/list")
    public String list(Model model, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "winOrLose", required = false) String result){

        List<Player> players = playerService.findAll();

        if(("Everything".equals(result)) && ("Everyone".equals(name))){
            players = playerService.findAll();
        }else if("Everything".equals(result)){
            players = playerService.findAllByName(name);
        }else if("Everyone".equals(name)){
            players = playerService.findAllByResult(result);
        }else{
            players = playerService.findAllByNameAndResult(name, result);
        }


        model.addAttribute("players", players);

        return "list-page";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){

        Player player = new Player();

        model.addAttribute("player", player);

        return "add-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("player") Player player){

//        Player player1 = new Player("aboba", "win", "7:3", "today");

        playerService.save(player);

        return "redirect:/showFormForAdd";
    }

    //delete
    @GetMapping("/delete")
    public String delete(@RequestParam("playerId") Long theId){

        playerService.deleteById(theId);

        return "redirect:/home";
    }
}