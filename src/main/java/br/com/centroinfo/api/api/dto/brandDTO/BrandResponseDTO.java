package br.com.centroinfo.api.api.dto.brandDTO;

import br.com.centroinfo.api.api.entity.brand.Brand;

public record BrandResponseDTO(Long id, String name) {
    public BrandResponseDTO(Brand brand){
        this(brand.getId(), brand.getName());
    }
}
