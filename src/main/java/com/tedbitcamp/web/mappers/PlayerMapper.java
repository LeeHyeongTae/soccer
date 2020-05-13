package com.tedbitcamp.web.mappers;

import com.tedbitcamp.web.domains.PlayerDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerMapper {
    public List<PlayerDTO> selectAll();
}
