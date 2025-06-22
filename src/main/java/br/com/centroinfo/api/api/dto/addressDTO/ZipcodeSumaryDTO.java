package br.com.centroinfo.api.api.dto.addressDTO;

import lombok.Getter;

@Getter
public class ZipcodeSumaryDTO {
    private Long id;
    private String code;    
    
    ZipcodeSumaryDTO(Long id, String code){
        this.id = id;
        this.code = code;
    }
}
