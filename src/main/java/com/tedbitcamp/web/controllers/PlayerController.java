package com.tedbitcamp.web.controllers;

import com.tedbitcamp.web.domains.PlayerDTO;
import com.tedbitcamp.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    PlayerService playerService;
    @Autowired
    PlayerDTO player;

    @GetMapping("")
    public List<PlayerDTO> getList(){
        return playerService.retriveAll();
    }
    @PostMapping("/{playerId}/aceess")
    public PlayerDTO login(
            @PathVariable String playerId,
            @RequestBody PlayerDTO player) {
        System.out.println("뷰와 연결 " + playerId);
        return player;
    }

}