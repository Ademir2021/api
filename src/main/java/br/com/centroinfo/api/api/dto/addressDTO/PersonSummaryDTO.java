package br.com.centroinfo.api.api.dto.addressDTO;

import lombok.Getter;

@Getter
public class PersonSummaryDTO {
    private Long id;
    private String name;

    public PersonSummaryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
