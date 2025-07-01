package br.com.centroinfo.api.api.dto.personDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchSumaryDTO {
    private Long id;
    private String name;
    public BranchSumaryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
