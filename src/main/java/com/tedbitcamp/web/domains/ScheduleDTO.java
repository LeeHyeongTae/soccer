package com.tedbitcamp.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ScheduleDTO {
    public String scheDate, stadiumId, gubun, hometeamId, awayteamId, homeScore, awayScore;
}
