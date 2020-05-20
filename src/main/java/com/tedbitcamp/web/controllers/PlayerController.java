package com.tedbitcamp.web.controllers;

import com.tedbitcamp.web.domains.PlayerDTO;
import com.tedbitcamp.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="*", allowedHeaders = "*")
@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired PlayerService playerService;
    @Autowired PlayerDTO player;

    @GetMapping("")
    public List<PlayerDTO> getList(){ return playerService.retriveAll(); }
    @PostMapping("/{playerId}/access")
    public PlayerDTO login(
            @PathVariable String playerId,
            @RequestBody PlayerDTO parms) {
        System.out.println("뷰와 연결 아이디는:" + playerId);
        System.out.println("뷰와 연결 비밀번호는:" + parms.getBackNo());
        return player;
    }

}