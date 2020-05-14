package com.tedbitcamp.web.mappers;

import com.tedbitcamp.web.domains.TeamDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamMapper {
    List<TeamDTO> selectAll();
}
