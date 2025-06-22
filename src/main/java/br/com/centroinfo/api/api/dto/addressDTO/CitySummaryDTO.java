package br.com.centroinfo.api.api.dto.addressDTO;

import lombok.Getter;

@Getter
public class CitySummaryDTO {
    private Long id;
    private String name;
    private String state;
    private String codeIbge;

    public CitySummaryDTO(Long id, String name, String state, String cIbge) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.codeIbge = cIbge;
    }
}
