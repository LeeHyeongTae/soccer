package com.tedbitcamp.web.services;

import com.tedbitcamp.web.domains.StadiumDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StadiumService {
  public List<StadiumDTO> retriveAll();
}
