package br.com.centroinfo.api.api.dto.zipcodeDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ZipcodeDTO {
    private Long id;
    private String code;

    public ZipcodeDTO(Long id, String code) {
        this.id = id;
        this.code = code;
    }
}
