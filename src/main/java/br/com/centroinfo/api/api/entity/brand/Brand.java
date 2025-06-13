package br.com.centroinfo.api.api.entity.brand;

import br.com.centroinfo.api.api.dto.brandDTO.BrandRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "brands")
@Entity
@Getter
@NoArgsConstructor
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Brand(BrandRequestDTO data) {
        this.name = data.name();
    }
}
