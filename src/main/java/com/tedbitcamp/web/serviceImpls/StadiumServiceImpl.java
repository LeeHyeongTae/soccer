package com.tedbitcamp.web.serviceImpls;

import com.tedbitcamp.web.domains.StadiumDTO;
import com.tedbitcamp.web.mappers.StadiumMapper;
import com.tedbitcamp.web.services.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadiumServiceImpl implements StadiumService {
    @Autowired
    StadiumMapper stadiumMapper;
    @Override
    public List<StadiumDTO> retriveAll() {
        return stadiumMapper.selectAll();
    }
}
