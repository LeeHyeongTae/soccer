package com.tedbitcamp.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TeamDTO {
    public String teamId, regionName, teamName, eTeamName, origYyyy, zipCode1, zipCode2, address, ddd, tel, fax,
                    homepage, owner, stadiumId;
}
