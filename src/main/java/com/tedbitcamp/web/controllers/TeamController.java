package com.tedbitcamp.web.controllers;

import com.tedbitcamp.web.domains.TeamDTO;
import com.tedbitcamp.web.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    @Autowired
    TeamService teamService;
    @GetMapping("")
    public List<TeamDTO> list(){
        return teamService.retriveAll();
    }
}
