package com.tedbitcamp.web.services;

import com.tedbitcamp.web.domains.PlayerDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PlayerService {
    public List<PlayerDTO> retriveAll();

    public PlayerDTO login(PlayerDTO parms);
}
