package br.com.centroinfo.api.api.dto.personDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSumaryDTO {
    private Long id;
    private String login;
    public UserSumaryDTO(Long id, String login) {
        this.id = id;
        this.login = login;
    }
}

