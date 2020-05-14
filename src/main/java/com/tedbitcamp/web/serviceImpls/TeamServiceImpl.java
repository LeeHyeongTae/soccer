package com.tedbitcamp.web.serviceImpls;

import com.tedbitcamp.web.domains.TeamDTO;
import com.tedbitcamp.web.mappers.TeamMapper;
import com.tedbitcamp.web.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamMapper teamMapper;
    @Override
    public List<TeamDTO> retriveAll() {
        return teamMapper.selectAll();
    }
}
