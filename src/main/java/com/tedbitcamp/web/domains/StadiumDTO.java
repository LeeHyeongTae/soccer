package com.tedbitcamp.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StadiumDTO {
    public String stadiumId, stadiumName, hometeamId, seatCount, address, ddd, tel;
}
