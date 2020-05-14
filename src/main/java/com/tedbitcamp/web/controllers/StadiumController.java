package com.tedbitcamp.web.controllers;

import com.tedbitcamp.web.domains.StadiumDTO;
import com.tedbitcamp.web.services.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stadiums")
public class StadiumController {
    @Autowired
    StadiumService stadiumService;

    @GetMapping("")
    public List<StadiumDTO> list(){
        return stadiumService.retriveAll();
    }
}
