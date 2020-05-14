package com.tedbitcamp.web.mappers;

import com.tedbitcamp.web.domains.StadiumDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StadiumMapper {
    List<StadiumDTO> selectAll();
}
