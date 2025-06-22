package br.com.centroinfo.api.api.dto.addressDTO;

import lombok.Getter;

@Getter
public class CountrySumaryDTO {
    private Long id;
    private String name;
    private String code; // Ex: BR, US, PT

    public CountrySumaryDTO(Long id, String name, String code){
        this.id = id;
        this.name = name;
        this.code = code;
    }

}
