package com.tedbitcamp.web.serviceImpls;

import com.tedbitcamp.web.domains.PlayerDTO;
import com.tedbitcamp.web.mappers.PlayerMapper;
import com.tedbitcamp.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    PlayerMapper playerMapper;

    @Override
    public List<PlayerDTO> retriveAll() {
        return playerMapper.selectAll();
    }
}
