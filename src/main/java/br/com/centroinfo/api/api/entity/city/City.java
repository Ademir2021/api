package br.com.centroinfo.api.api.entity.city;

import br.com.centroinfo.api.api.entity.country.Country;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "cities")
@Entity
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String state;

    @Column(name = "code_ibge")
    private String codeIbge;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
