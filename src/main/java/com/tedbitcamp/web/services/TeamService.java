package com.tedbitcamp.web.services;

import com.tedbitcamp.web.domains.TeamDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TeamService {
    List<TeamDTO> retriveAll();
}
